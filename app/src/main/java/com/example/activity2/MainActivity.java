package com.example.activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.activity2.Example;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView id, name, expansion, army, unique_unit, unique_tech, team_bonus, civilization1, civilization2, civilization3;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetDataService_Interface  service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService_Interface.class);


        //Call<List<Pokemon_POJO>> pokes = service.getPokemons();
        Call<Example> civil = service.getExample();

        System.out.println("JSON Response: " + civil);

        civil.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {

                final Example example = response.body();
                System.out.println("JSON Response2: " + example.getId());

//id, name, expansion, army, unique_unit, unique_tech, team_bonus, civilization1, civilization2, civilization3;
                id = findViewById(R.id.id);
                name = findViewById(R.id.name);
                expansion = findViewById(R.id.expansion);
                army = findViewById(R.id.army);
                unique_unit = findViewById(R.id.unique_unit);
                unique_tech = findViewById(R.id.unique_tech);
                team_bonus = findViewById(R.id.team_bonus);

                System.out.println("Civilization: " +example.getCivilizationBonus(0).get(0));


                id.setText("ID: " + example.getId().toString());
                name.setText("Name: " + example.getName());
                expansion.setText("Expansion: " + example.getExpansion());
                army.setText("Army Type: " + example.getArmyType());
                unique_unit.setText("Unique Unit: " + example.getUniqueUnit(0).get(0));
                unique_tech.setText("Unique Tech: " + example.getUniqueTech(0).get(0));
                team_bonus.setText("Team Bonus: " + example.getTeamBonus());
                //civilization1.setText("Civilization1: " + example.getCivilizationBonus(0).get(0));
                //civilization2.setText("Civilization3: " + example.getCivilizationBonus(0).get(1));
                //civilization3.setText("Civilization3: " + example.getCivilizationBonus(0).get(2));


                //example.getId();

                button = findViewById(R.id.button);

                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, ScreenTwo.class);

                        Bundle bundle;

                        intent.putExtra("civil1", example.getCivilizationBonus(0).get(0));
                        intent.putExtra("civil2", example.getCivilizationBonus(0).get(1));
                        intent.putExtra("civil3", example.getCivilizationBonus(0).get(2));
                        startActivity(intent);
                    }
                });

            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {

                Toast.makeText(getApplicationContext(), "Try Again", Toast.LENGTH_LONG).show();


            }
        });

    }
}
