public class PersonBuilder {
    private String firstName;
    private String lastName;
    private Integer age;
    private String address;


    // Voglio che nome e cognome siano obbligati
    public PersonBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //I getter si scrivono nel modo classico
    //invece sono i setter quelli che cambiano come vengono scritti
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    // //creo setters degli attributi opzionali age e address
    public PersonBuilder SetAge(Integer age) {
        this.age = age;
        return this;
    }

    public PersonBuilder SetAddress(String address) {
        this.address = address;
        return this;
    }

    //metodo per generare gli oggetti Person
    public Person build(){
        return new Person(this);
    }







}
