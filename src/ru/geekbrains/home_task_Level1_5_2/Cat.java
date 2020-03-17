package ru.geekbrains.home_task_Level1_5_2;

public class Cat extends Animals {
    public Cat (String name, int age, String color, double runLimit, double jumpLimit) {
        super(name,age,color,runLimit,jumpLimit);
    }

    @Override
    public String jump (double j) {
        String resaltjump;
        if (j < jumpLimit) {resaltjump = " поймал птичку нв высоте " + Double.toString(j) + " метра"; }
           else {resaltjump = " не допрыгнул " + Double.toString(j-jumpLimit) + " метра";}
        return resaltjump;

    }
}
