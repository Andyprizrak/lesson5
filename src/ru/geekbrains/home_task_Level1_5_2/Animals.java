package ru.geekbrains.home_task_Level1_5_2;

public abstract class Animals {
    protected String name;
    protected int age;
    protected String color;
    protected double runLimit;
    protected double jumpLimit;

    public Animals (String name, int age, String color, double runLimit, double jumpLimit) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.runLimit=runLimit;
        this.jumpLimit=jumpLimit;
    }

    public void setRunLimit(double sr) {
        runLimit = sr;
    }

    public String run (double r) {
        String resalt;
        if (r < runLimit) {resalt = " побежал";}
           else {resalt = " не смог добежать";}
       return resalt;
    }
    // Метод jamp можно было расписать и здесь,
    // но поскольку на уроке проходили,
    // то в каждом наследуемом классе в метод вносил изменения
    // на что у меня хватило фантазии
    public abstract String jump (double j);

}
