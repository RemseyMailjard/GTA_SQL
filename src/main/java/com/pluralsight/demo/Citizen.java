package com.pluralsight.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "Citizens", schema = "GTA")
public class Citizen {

    @Id
    @Column(name = "CitizenID")
    private Long citizenId;

    @Column(name = "Name")
    private String name;

    @Column(name = "Alias")
    private String alias;

    @Column(name = "Age")
    private int age;

    @Column(name = "Profession")
    private String profession;

    @Column(name = "WantedLevel")
    private Integer wantedLevel;



    // Getters
    public Long getCitizenId() { return citizenId; }
    public String getName() { return name; }
    public String getAlias() { return alias; }
    public int getAge() { return age; }
    public String getProfession() { return profession; }
    public Integer getWantedLevel() { return wantedLevel; }

    // Setters
    public void setCitizenId(Long citizenId) { this.citizenId = citizenId; }
    public void setName(String name) { this.name = name; }
    public void setAlias(String alias) { this.alias = alias; }
    public void setAge(int age) { this.age = age; }
    public void setProfession(String profession) { this.profession = profession; }
    public void setWantedLevel(int wantedLevel) { this.wantedLevel = wantedLevel; }
}
