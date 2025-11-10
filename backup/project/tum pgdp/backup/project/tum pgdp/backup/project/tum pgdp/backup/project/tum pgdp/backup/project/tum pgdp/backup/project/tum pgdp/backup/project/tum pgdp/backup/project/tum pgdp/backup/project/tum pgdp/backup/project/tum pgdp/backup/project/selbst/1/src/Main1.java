public class Main1 {
    public static void main(String[] args) {
        String firstPersonName = "John";
        int firstPersonBirthYear = 1993;

        String secondPersonName = "Mary";
        int secondPersonBirthYear = 1995;

        String thirdPersonName = "Peter";
        int thirdPersonBirthYear = 1990;

        describePerson(firstPersonName, firstPersonBirthYear);
        describePerson(secondPersonName, secondPersonBirthYear);
        describePerson(thirdPersonName, thirdPersonBirthYear);
    }

    public static void describePerson(String name, int yearOfBirth) {
        int age = 2023 - yearOfBirth;
        System.out.println(name+ " is "+age + " years old.");
    }
}