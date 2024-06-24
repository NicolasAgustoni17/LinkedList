public class Fruit {
    private String name;

    // Costruttore
    public Fruit(String name) {
        this.name = name;
    }

    // Metodo per ottenere il nome del frutto
    public String getName() {
        return name;
    }

    // Metodo toString per una rappresentazione leggibile del frutto
    @Override
    public String toString() {
        return name;
    }
}