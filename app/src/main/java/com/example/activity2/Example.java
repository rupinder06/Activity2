package com.example.activity2;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("expansion")
    @Expose
    private String expansion;
    @SerializedName("army_type")
    @Expose
    private String armyType;
    @SerializedName("unique_unit")
    @Expose
    private List<String> uniqueUnit = null;
    @SerializedName("unique_tech")
    @Expose
    private List<String> uniqueTech = null;
    @SerializedName("team_bonus")
    @Expose
    private String teamBonus;
    @SerializedName("civilization_bonus")
    @Expose
    private List<String> civilizationBonus = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpansion() {
        return expansion;
    }

    public void setExpansion(String expansion) {
        this.expansion = expansion;
    }

    public String getArmyType() {
        return armyType;
    }

    public void setArmyType(String armyType) {
        this.armyType = armyType;
    }

    public List<String> getUniqueUnit(int i) {
        return uniqueUnit;
    }

    public void setUniqueUnit(List<String> uniqueUnit) {
        this.uniqueUnit = uniqueUnit;
    }

    public List<String> getUniqueTech(int i) {
        return uniqueTech;
    }

    public void setUniqueTech(List<String> uniqueTech) {
        this.uniqueTech = uniqueTech;
    }

    public String getTeamBonus() {
        return teamBonus;
    }

    public void setTeamBonus(String teamBonus) {
        this.teamBonus = teamBonus;
    }

    public List<String> getCivilizationBonus(int i) {
        return civilizationBonus;
    }

    public void setCivilizationBonus(List<String> civilizationBonus) {
        this.civilizationBonus = civilizationBonus;
    }

}