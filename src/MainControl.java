public class MainControl {

    //Attribute

    //Referenzen
    private Person person1;
    private Person person2, person3;

    public static void main(String[] args) {
        new MainControl();
    }

    public MainControl() {
        person1 = new Person("Peter", 17);
        person2 = new Person("Olaf", 23);
        //person3 = new Person ("Sabine",15);
        person1.halloSagen();
        //person3.halloSagen();
        System.out.println(person1);
        System.out.println(person3);

    }


}
