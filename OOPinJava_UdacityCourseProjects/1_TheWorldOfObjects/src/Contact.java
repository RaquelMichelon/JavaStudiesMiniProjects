public class Contact {

    private String name;
    private String email;
    private String phoneNumber;

    public Contact(String name, String email, String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.name = name;
    }

    public String getPhone() {
        return this.phoneNumber;
    }

    public String getName() {
        return this.name;
    }

}
