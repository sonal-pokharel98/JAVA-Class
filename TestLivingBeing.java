class LivingBeing {
    void sound() {
        System.out.println("Living being makes a sound");
    }
}

class Dog extends LivingBeing {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends LivingBeing {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class TestLivingBeing {
    public static void main(String[] args) {

        LivingBeing l1 = new Dog();
        LivingBeing l2 = new Cat();

        l1.sound();
        l2.sound();
    }
}
