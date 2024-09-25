public class Person {

    // Attribute
    private String name;
    private int age;

    // Referenzen

    // Konstruktor
    public Person(String name, int zahl){
        this.name = name;
        this.age = zahl;
       // halloSagen();
    }

    // Methoden
    public void halloSagen (){
        System.out.println("Hi, mein Name ist "+name+". Ich bin "+age+" Jahre alt.");
    }

}
