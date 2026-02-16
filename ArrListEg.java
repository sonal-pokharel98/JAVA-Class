import java.util.ArrayList;

public class ArrListEg {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple ");
        fruits.add("Banana ");
        fruits.add("Cherry");

        System.out.println("Fruits: " + fruits);
        fruits.remove("Banana ");
        System.out.println("After removing banana: " + fruits);

        System.out.println("Size: " + fruits.size());
        System.out.println("Contains Apple? " + fruits.contains("Apple "));
    }
}
