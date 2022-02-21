import java.util.*;

public class Contact implements Comparable<Contact>{
    private String name;
    private long phone;

    public Contact ( String name, long phone){
        this.name=name;
        this.phone=phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name=" + name +
                ", phone=" + phone +
                '}';
    }

    @Override
    public int compareTo(Contact contact) {
        return name.compareTo(contact.getName());

    }

}
