package Java.week_3;

public class Main {
    public static void main(String[] args) {
        ContactManagement contactManagement = new ContactManagement();

        //adding new contacts
        contactManagement.addNewContact("Asi", "12345", "asi@gmail.com");
        contactManagement.addNewContact("Nadia", "12345", "asi@gmail.com");
        contactManagement.addNewContact("Alex", "54321", "alex@mail.ru");
        contactManagement.addNewContact("John", "678910", "john@gmail.com");
        contactManagement.addNewContact("Anna", "109876", "anna@yahoo.com");
        System.out.println("----------------------------------------------------");
        System.out.println("Display all newly created contacts: \n"
                + contactManagement.displayAllContacts());
        System.out.println("----------------------------------------------------");

        //remove contact by name
        contactManagement.removeContact("Asi");
        System.out.println("Display all after removing contact named Asi: \n"
                + contactManagement.displayAllContacts());
        System.out.println("----------------------------------------------------");

        //Fast Look Up of phoneNumber by name
        System.out.println("Fast Phone Number look up by Name: \n"+
                "Phone Number of Contact with Name: John -> "
                + contactManagement.phoneLookUpByName("John"));
        System.out.println("----------------------------------------------------");


        //display all domains
        System.out.println("Displaying all email domains: \n" +
                contactManagement.displayAllEmailDomains());
    }
}
