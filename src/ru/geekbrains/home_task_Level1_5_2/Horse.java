package ru.geekbrains.home_task_Level1_5_2;

public class Horse extends Animals {
    double swimLimit;
    public Horse (String name, int age, String color, double runLimit, double jumpLimit) {
        super(name,age,color,runLimit,jumpLimit);
        swimLimit = 100;
    }
    public String swim (double sl) {
        String resaltswim;
        if (sl < swimLimit) {resaltswim = " поплыла";}
        else {resaltswim = " поплыла и недоплыла";}
        return resaltswim;
    }
    @Override
    public String jump (double j) {
        String resaltjump;
        if (j < jumpLimit) { resaltjump = " скачет";}
           else {resaltjump = " вернулась назад";}
        return resaltjump;

    }
}
