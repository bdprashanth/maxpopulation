package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Person> personRegister = new HashSet<>();

        personRegister.add(new Person(1600,1680));
        personRegister.add(new Person(1620,1730));
        personRegister.add(new Person(1700,1750));
        personRegister.add(new Person(1610,1680));
        personRegister.add(new Person(1690,1720));
        personRegister.add(new Person(1600,1693));
        personRegister.add(new Person(1680,1720));
        personRegister.add(new Person(1720,1725));
        personRegister.add(new Person(1720,1765));
        personRegister.add(new Person(1720,1775));

        //Assuming that the interested period is 1000AD - 3000AD which I believe is reasonable
        //The program to work for next 1000 years
        //Making a compromise on space to improve the time
        //Time complexity O(n + m ) , n - number of people
        // m -> span of the person register

        int[] population = new int[2000];
        int minYear=0;
        int maxYear=0;

        for (Person p: personRegister)
        {
            ++population[p.getBirthYear() - 1000];
            --population[p.getDeathYear() - 1000];

            minYear = minYear > p.getBirthYear() || minYear ==0 ? p.getBirthYear() : minYear;
            maxYear = maxYear < p.getDeathYear() ? p.getDeathYear() : maxYear;
        }

        int yearWithMaxPopulation = minYear;
        int maxPopulation = 0;
        int countPopulation =0;

        for( int i = minYear - 1000; i<= maxYear - 1000; i++)
        {
            countPopulation += population[i];
            if(countPopulation > maxPopulation )
            {
                maxPopulation = countPopulation;
                yearWithMaxPopulation = i+1000;
            }
        }

        System.out.println("The year with maximum population is " + yearWithMaxPopulation);
    }
}
