package Builder;
//Crea una classe Péerson con i campi firstName, lastName, age e address, i getter and i setter
//Il costruttore accetterà un Builder in input
//Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
//Creare due oggetti Person e stamparli a video
public class Main {
    public static void main(String[] args) {
    Builder builder = new Builder();
    builder.setFirstName("Carmen");
    builder.setLastName("Tecchia");
    builder.setAge(29);
    builder.setAddress("Caserta");

    Person person1 = builder.build();
        System.out.println(person1);

        Builder builder2 = new Builder();
        builder.setFirstName("Mario");
        builder.setLastName("Rossi");
        builder.setAge(30);
        builder.setAddress("Napoli");

        Person person2 = builder.build();
        System.out.println(person2);
    }
}
