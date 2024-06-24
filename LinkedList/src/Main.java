import java.util.LinkedList;

public class FruitLinkedListExample {
    public static void main(String[] args) {
        LinkedList<Fruit> fruits = new LinkedList<>();

        fruits.add(new Fruit("Apple"));
        fruits.add(new Fruit("Banana"));
        fruits.add(new Fruit("Orange"));

        System.out.println("Lista iniziale:");
        printList(fruits);

        fruits.addFirst(new Fruit("Strawberry"));

        fruits.addLast(new Fruit("Grape"));

        System.out.println("Lista aggiornata:");
        printList(fruits);
    }
    
    private static void printList(LinkedList<Fruit> list) {
        for (Fruit fruit : list) {
            System.out.println(fruit.getName());
        }
    }
}