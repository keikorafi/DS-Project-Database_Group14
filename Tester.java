package ds.project;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @dzxky_
 */
public class Tester {

    public static void main(String[] args) {
        Database database = new Database();
        Integer[] arr = {1, 3, 3};
        database.add("One", ValueFields.STRING, "Hello");
        database.addList("Two", listConvert(arr));
        database.add("Three", ValueFields.STRING, "Hi");
        ValueFields value = new CollectionsType(listConvert(arr));
        List<Integer> a = (List<Integer>) value.getListValue();
        System.out.println(a.toString());
    }
    
    public static <T> List<T> listConvert(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }

}
