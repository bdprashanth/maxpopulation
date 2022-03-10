package com.company;

public class Person {

    private Integer birthYear;
    private Integer deathYear;

    public Person(Integer birthYear, Integer deathYear) {
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(Integer deathYear) {
        this.deathYear = deathYear;
    }
}
