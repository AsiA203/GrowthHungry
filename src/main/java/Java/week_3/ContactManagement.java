package Java.week_3;

import java.util.*;

public class ContactManagement {
    protected ArrayList<Contact> contacts = new ArrayList<>();
    protected HashMap<String, String> phoneNumberLookUp = new HashMap<>();
    protected HashSet<String> emailsDomains = new HashSet<>();

    //add new contact - ArrayList, HashMap and also add email domain in HashSet
    public void addNewContact(String name, String phoneNumber, String email) {
        contacts.add(new Contact(name, phoneNumber, email));

        //TODO Ask if the hashmap update should be connected with original ArrayList of contacts.
        // I think that yes, but double check with Damir
        phoneNumberLookUp.put(name, phoneNumber);

        //TODO Ask if the hashset should be connected with original ArraysList of Contacts
        // I think that yes, but double check with Damir
        String[] emailSplit = email.split("@");
        String domain = emailSplit[1];
        emailsDomains.add(domain);
    }


    public String displayAllContacts() {
        //Sort all contacts alphabetically by name
        contacts.sort(Comparator.comparing(Contact :: getName));
        //displayAllContacts in ArrayList
        StringBuilder contactsInfo = new StringBuilder();
        for (Contact contact : contacts) {
            contactsInfo.append("Contact -> Name: ").append(contact.getName()).append(", Phone Number: ")
                    .append(contact.getPhoneNumber()).append(", Email: ").append(contact.getEmail()).append("\n");
        }
        return contactsInfo.toString();
    }

    //remove a contact in ArrayList, HashMap
    public void removeContact(String name) {
        contacts.removeIf(contact -> name.equals(contact.getName()));

        //TODO Ask if the arraylist removal should be connected with HashMap
        phoneNumberLookUp.remove(name);
    }

    //Fast Look up of PhoneNumber by name
    public String phoneLookUpByName(String name){
        return phoneNumberLookUp.get(name);
    }

    //Update phoneNumber by existing contact
    public void updatePhoneNumber(String name, String updatedPhoneNumber) {
        phoneNumberLookUp.put(name, updatedPhoneNumber);

        //TODO Ask if the hashmap update should be connected with original ArrayList of contacts
        //ArrayList update
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contact.setPhoneNumber(updatedPhoneNumber);
            }
        }
    }

    //Display HashSet of email domains to ensure that only unique domains are getting stored
    public String displayAllEmailDomains(){
        StringBuilder domainsInfo = new StringBuilder();
        for (String domain : emailsDomains){
            domainsInfo.append(domain).append(", ");
        }
        return "Domains -> " + domainsInfo;
    }


}
