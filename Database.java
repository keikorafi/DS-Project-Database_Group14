package ds.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author USER
 */
public class Database {

    private DatabaseMap<String, ValueFields> database;

    public Database() {
        database = new DatabaseMap<>();
    }

    public void add(String index, String type, Object value) {
        if (!database.containsKey(index)) {
            switch (type) {
                case ValueFields.STRING:
                    database.put(index, new StringType(value));
                    break;
                case ValueFields.CHARACTER:
                    database.put(index, new CharacterType(value));
                    break;
                case ValueFields.NUMBER:
                    database.put(index, new NumeralType(value));
                    break;
            }
        } else {
            System.out.println("Already Existed!");
        }
    }
    
    public void addList(String index, List<Object> value) {
        database.put(index, new CollectionsType(value));
    }

    public <T> T get(String index) {
        if (database.containsKey(index)) {
            ValueFields value = database.get(index);
            if (value.getType().equals(ValueFields.COLLECTION)) {
                return (T) value.getListValue();
            } else {
                return (T) value.getValue();
            }
        }
        return null;
    }

    public void display() {
        System.out.println(database.toString());
    }
}
