class Parent1 {
    void show() {
        System.out.println("Parent's show method");
    }
}

class Child extends Parent1 {
    @Override
    void show() {
        System.out.println("Child's show method");
    }
}

public class DynamicDispatchDemo {
    public static void main(String[] args) {

        Parent1 obj = new Child();
        obj.show();
    }
}
