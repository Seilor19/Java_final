import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Main{
    // Метод, который добавляет номера в книгу
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
    // Метод, который печатает список контактов
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Ivanov", 324, bookPhone);
        addNumber("Ivanov", 768, bookPhone);
        addNumber("Petrov", 566461, bookPhone);
        addNumber("Sidorov", 214213, bookPhone);
        addNumber("Ivanov", 123, bookPhone);
        addNumber("Petrov", 9874, bookPhone);
        printBook(bookPhone);
    }
}