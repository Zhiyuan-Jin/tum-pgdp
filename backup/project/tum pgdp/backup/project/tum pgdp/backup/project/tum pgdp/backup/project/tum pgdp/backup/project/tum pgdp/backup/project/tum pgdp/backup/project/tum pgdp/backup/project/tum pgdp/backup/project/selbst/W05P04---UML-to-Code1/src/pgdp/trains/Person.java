package pgdp.trains;

public class Person {
    private int weight;//属性Attribug
    private String name;//属性Attribut

    public Person(int weight, String name) {
        this.weight = weight;//属性 Attribut，参数 Parameter
        this.name = name;//属性 Attribut ，参数 Parameter
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
