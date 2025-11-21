package pgdp.expedition;

public class Entdeckuin {
    private String name;
    private int age;
    private Backpack backpack;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }

    public Entdeckuin(String name, int age, Backpack backpack) {
        this.name = name;
        this.age = age;
        this.backpack = backpack;
    }
    @Override
    public String toString() {
        return "Entdeckuin " + name + "(" + age + ")";
    }
    public static void main(String[] args) {
		/*
		 * TODO: Remove the comment symbols and run the main-method for testing. You can
		 * change this method however you like!
		 */

//		Entdeckuin antonia = new Entdeckuin("Antonia", 5, "salmon", "salted");
//
//		antonia.addProvisions(new Fish("salmon", "salted"));
//		antonia.usePickaxe();
//		antonia.findScepter();
//		antonia.eat();
	}
}
