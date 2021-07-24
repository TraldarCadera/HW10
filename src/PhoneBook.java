import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private Map<String, List<String>> base = new HashMap<>();


    public void add(String surname, String number) {
        List<String> phoneNumbers;
        if (base.containsKey(surname)) {
            phoneNumbers = base.get(surname);
        } else {
            phoneNumbers = new ArrayList<>();
        }
        phoneNumbers.add(number);
        base.put(surname, phoneNumbers);

    }


    public List<String> get(String surname) {
        return base.get(surname);
    }

}
