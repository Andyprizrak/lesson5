package ru.geekbrains.home_task_Level1_5_2;

   public class Dog extends Animals {
       double swimLimit;
       public Dog (String name, int age, String color, double runLimit, double jumpLimit) {
           super(name,age,color,runLimit,jumpLimit);
           swimLimit = 10;
       }
       public String swim (double sl) {
           String resalt;
           if (sl < swimLimit) {resalt = " поплыл";}
              else {resalt = " поплыл и утонул";}
           return resalt;
       }
       @Override
       public String jump (double j) {
           String resaltjump;
           if (j < jumpLimit) { resaltjump = " перепрыгнул";}
              else {resaltjump = " не допрыгнул";}
              return resaltjump;

       }
   }


