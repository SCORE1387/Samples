package tk.sekol.spring.samples.injection;

/**
 * @author kolesnikov
 */
public class Contact {
    private PhoneNumber phoneNumber;

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
            "phoneNumber=" + phoneNumber +
            '}';
    }
}
