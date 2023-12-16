package ds.project;

import ds.project.Types.CharacterType;
import ds.project.Types.CollectionType;
import ds.project.Types.NumeralType;
import ds.project.Types.StringType;
import ds.project.Types.ValueFields;
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
        Number[] arr = {23.4, 4.3};
        database.add("One", new StringType("Hisd"));
        database.add("Three", new StringType("Hi"));
        database.add("Four", new StringType("234"));
        database.set("Three", new StringType("Hello"));
        database.add("Two", new CollectionType(listConvert(arr)));
        database.display();
    }

    public static <T> List<T> listConvert(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }

    public static <T> T valueConvert(ValueFields value) {
        switch (value.getType()) {
            case ValueFields.STRING:
                StringType type1 = (StringType) value;
                return (T) type1.getValue();
            case ValueFields.CHARACTER:
                CharacterType type2 = (CharacterType) value;
                return (T) type2.getValue();
            case ValueFields.NUMBER:
                NumeralType type3 = (NumeralType) value;
                return (T) type3.getValue();
            case ValueFields.COLLECTION:
                CollectionType type4 = (CollectionType) value;
                return (T) type4.getValue();
        }
        return null;
    }

}
