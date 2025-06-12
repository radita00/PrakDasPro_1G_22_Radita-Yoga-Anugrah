package AlsdPraktikum14;
import java.util.TreeSet;
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();

        fruits.add("Mangga");
        fruits.add("Apel");
        fruits.add("Jeruk");
        fruits.add("jambu");

        for (String temp : fruits) {
            System.out.println(temp);
        }

        System.out.println("First: " + fruits.first());
        System.out.println("Last: " + fruits.last());

        fruits.remove("Jeruk");
        System.out.println("Stetelah remove " + fruits);

        fruits.pollFirst();
        System.out.println("Stetelah poll first " + fruits);

        fruits.pollLast();
        System.out.println("Stetelah poll last " + fruits);
    }
}
