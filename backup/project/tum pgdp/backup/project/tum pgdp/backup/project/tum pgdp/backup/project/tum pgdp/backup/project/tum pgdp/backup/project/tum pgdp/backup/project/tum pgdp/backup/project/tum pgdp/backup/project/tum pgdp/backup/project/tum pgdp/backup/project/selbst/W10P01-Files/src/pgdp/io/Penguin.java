package pgdp.io;

/*
 * This is equivalent to a class with the properties name, age & weight
 * and a constructor that takes these properties as arguments.
 * The class also has getters named name(), age() & weight().
 * The class also has a toString() method that prints the properties.
 */
public record Penguin (String name, int age, double weight) {
    @Override
    public String toString() {
        return "Penguin{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
