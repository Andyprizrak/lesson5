package ru.geekbrains.home_task_Level1_5_2;

public class Main {

    public static void main(String[] args) {
        // Ограничения по действию (дистанция бега, высота прыжка) присутствуют во всех классах наследниках
        // посчитал оптимальным для данной задачи сразу при создании экземрляра задать эти ограничения
        // на всякий случай написал сеттер для изменения предельной дистанции бега


        Dog dogTuzik = new Dog("Tuzik", 2,"Black",500, 0.5);
        Dog dogBarbos = new Dog("Barbos", 1,"Broun",400, 0.5);
        Horse horseLaila = new Horse("Laila",5,"Grey",1500,3);
        Eagle proud = new Eagle("Proud", 2, "Multi-colored",5,0.2);
        Cat maki = new Cat("Maki",7,"Smoky", 200,2);

        dogBarbos.setRunLimit(700);
        System.out.println("Теперь " + dogBarbos.name + " может пробежать " + dogBarbos.runLimit + " метров");

        System.out.println (dogTuzik.name + dogTuzik.run(700));
        System.out.println (dogBarbos.name + dogBarbos.swim(12));
        System.out.println (horseLaila.name + horseLaila.jump(1.2));
        System.out.println (proud.name + proud.jump(0.1));
        System.out.println (maki.name + maki.jump(1.5));

    }
}
