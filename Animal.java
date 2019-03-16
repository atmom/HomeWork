package lesson6;

public abstract class Animal {
    String name;


    public Animal(String name) {
        this.name = name;
    }

    public abstract void run(double distance);

    public abstract void swim (double distance);

    public abstract void jamp (double distance);



}

 class Cat extends Animal {
    String strength;
     final double OPPORTIUNITIES_RUN = 200;
     final double OPPORTIUNITIES_SWIM = 0;
     final double OPPORTIUNITIES_JAMP = 2;

     public Cat(String name, String strength) {
         super(name);
         this.strength = strength;
     }

     @Override
    public void run(double distance) {
        System.out.println("run: " + (distance<= OPPORTIUNITIES_RUN));

    }

    @Override
    public void swim(double distance) {
        System.out.println("swim: " + (distance<= OPPORTIUNITIES_SWIM));
    }

    @Override
    public void jamp(double distance) {
        System.out.println("jamp: " + (distance<= OPPORTIUNITIES_JAMP));
    }


}

class Dog extends Cat {
    final double OPPORTIUNITIES_RUN = 500;
    final double OPPORTIUNITIES_SWIM = 10;
    final double OPPORTIUNITIES_JAMP = 0.5;

    public Dog(String name, String strength) {
        super(name, strength);
    }
}


