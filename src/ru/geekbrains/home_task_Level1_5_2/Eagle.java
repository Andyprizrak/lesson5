package ru.geekbrains.home_task_Level1_5_2;

public class Eagle extends Animals {

    public Eagle (String name, int age, String color, double runLimit, double jumpLimit) {
        super(name,age,color,runLimit,jumpLimit);
    }

    @Override
    public String jump (double j) {
        String resaltjump;
        if (j < jumpLimit) {resaltjump = " перепрыгнул с запасом " + Double.toString(jumpLimit-j) + " метра";}
           else {resaltjump = " не хватило " + Double.toString(j-jumpLimit) + " метра";}
        return resaltjump;

    }
}
