/*
Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
Il costruttore accetterà un Builder in input
Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali)
per costruire l'oggetto Person.
Creare due oggetti Person e stamparli a video


 */
public class Main {
    public static void main(String[] args) {
        // Creo persona usando il builder, passo i 2 parametri obbligati e poi setto solo quelli che voglio
        Person person1 = new PersonBuilder("Mario", "Rossi").SetAge(30).SetAddress("Via Marconi").build();

        /*
        .build() è il metodo responsabile di restituire l'oggetto finale,
        creato combinando tutti i parametri che hai specificato utilizzando i metodi del builder
         */


        // Creo seconda persona provando a togliere un attributo
        Person person2 = new PersonBuilder("Carlo", "Verdi").SetAge(25).build();

        //stampo gli oggetti
        person1.stampaDettagliPerson();
        System.out.println();
        person2.stampaDettagliPerson();

//        PersonBuilder personBuilder = new PersonBuilder("cc", "kk");
//
//
//        Person person3 = new Person(personBuilder);
//
//
//
//       person3.stampaDettagliPerson();

    }
}