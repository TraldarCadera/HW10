import java.util.*;

public class Main {

    public static void main(String[] args) {

        words();
        directory();


    }

    public static void words() {

        String[] comrades = {
                "Сталин", "Брежнев", "Путин", "Берия", "Ленин",
                "Путин", "Медведев", "Сталин", "Горбачев",
                "Хрущев", "Ленин", "Путин", "Обнуленный_Путин", "Андропов",
                "Ленин", "Троцкий", "Медведев", "Ельцин", "Джугашвили"
        };

        Map<String, Integer> comradesMap = new HashMap<>();
        for (String words : comrades) {
            comradesMap.put(words, comradesMap.getOrDefault(words, 0) + 1);
        }

        System.out.println(comradesMap);
        System.out.println(" ");

        Set<String> uniqComrades = new HashSet<>(Arrays.asList(comrades));
        System.out.println(uniqComrades);
        System.out.println(" ");


    }

    public static void directory() {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Маркин", "89851539976");
        phoneBook.add("Лазарев", "89154786614");
        phoneBook.add("Маркин", "84959700770");
        phoneBook.add("Лазарев", "84995152236");
        phoneBook.add("Никишин", "89991452687");
        phoneBook.add("Иванов", "8974562154");
        phoneBook.add("Иванов", "84952147752");

        System.out.println("Маркин - " + phoneBook.get("Маркин"));
        System.out.println("Лазарев - " + phoneBook.get("Лазарев"));
        System.out.println("Иванов - " + phoneBook.get("Иванов"));
        System.out.println("Никишин - " + phoneBook.get("Никишин"));

    }
}