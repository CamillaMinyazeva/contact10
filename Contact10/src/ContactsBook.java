import java.util.*;


public class ContactsBook <T extends Contact> {
    private Map<Long,T> phones = new HashMap<>();
    private List<T> list =  new ArrayList<>();

    public void add(T contact) {
        phones.put(contact.getPhone(), contact);
    }

    public Contact getByPhone(long phone) {
        T result = null;
            if (phones.containsKey(phone) == false) {
                return result;
            }
            else {
                return phones.get(phone);
        }
    }
    public void removeByPhone (long phone){
        T result = null;
            if (phones.containsKey(phone)) {
                phones.remove(phone);
            }
        else {
            throw new RuntimeException("неверно");
        }

    }

    public void sort(){
        Collections.sort(list);
            System.out.println(list);
        }
}






