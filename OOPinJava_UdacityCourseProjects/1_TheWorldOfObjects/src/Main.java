public class Main {
    public static void main(String[] args) {
        ContactManager myContactsManager = new ContactManager();
        Contact contact = new Contact("Raquel", "raquel@email.com", "345827364");
        myContactsManager.addContact(contact);

        Contact contact2 = new Contact("Carlos", "carlos@email.com", "3984754");
        myContactsManager.addContact(contact2);

        Contact search = myContactsManager.searchContact("Carlos");
        System.out.println(search.getPhone());
    }
}
