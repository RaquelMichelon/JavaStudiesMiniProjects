public class ContactManager {

    Contact[] contacts;
    int numberOfContacts;

    public ContactManager() {
        this.numberOfContacts = 0;
        this.contacts = new Contact[100];
    }

    public void addContact(Contact contact) {
        contacts[numberOfContacts] = contact;
        numberOfContacts++;
    }

    public Contact searchContact(String searchByName) {
        for (Contact contact : contacts) {
            if (searchByName.equals(contact.getName())) {
                return contact;
            }
        }
        return null;
    }

}
