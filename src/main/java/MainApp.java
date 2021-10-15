public class MainApp {
    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();

        //Create and add an entry in a new phonebook
        phonebook.add("Bob","302-856-9012");

        //add entry to existing person in phonebook
        phonebook.add("Bob","302-980-5645");

        System.out.println(phonebook.getAllContactNames());

        System.out.println(phonebook.lookup("Bob"));

        System.out.println(phonebook.reverseLookup("302-856-9012"));

    }
}
