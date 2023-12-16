package ds.project;

import ds.project.Types.CharacterType;
import ds.project.Types.CollectionType;
import ds.project.Types.NumeralType;
import ds.project.Types.StringType;
import ds.project.Types.ValueFields;

/**
 *
 * @author USER
 */
public class Database {
    
    private DatabaseMap<String, ValueFields> database;
    
    public Database() {
        database = new DatabaseMap<>();
    }
    
    public void add(String index, ValueFields value) {
        if (!database.containsKey(index)) {
            database.put(index, value);
        } else {
            System.out.println("Already Existed!");
        }
    }
    
    public void delete(String index) {
        if (database.containsKey(index)) {
            database.remove(index);
        } else {
            System.out.println("Index does not exist!");
        }
    }
    
    public ValueFields get(String index) {
        if (database.containsKey(index)) {
            return database.get(index);
        }
        return null;
    }
    
    public boolean set(String index, ValueFields value) {
        if (database.containsKey(index)) {
            database.set(index, value);
            return true;
        } else {
            System.out.println("Index does not exist!");
        }
        return false;
    }
    
    public void display() {
        HashList<ValueFields> valueList = database.getMany();
        for (ValueFields value : valueList) {
            switch (value.getType()) {
                case ValueFields.STRING:
                    StringType type1 = (StringType) value;
                    System.out.println(type1.getValue() + " " + type1.getType());
                    break;
                case ValueFields.CHARACTER:
                    CharacterType type2 = (CharacterType) value;
                    System.out.println(type2.getValue() + " " + type2.getType());
                    break;
                case ValueFields.NUMBER:
                    NumeralType type3 = (NumeralType) value;
                    System.out.println(type3.getValue() + " " + type3.getType());
                    break;
                case ValueFields.COLLECTION:
                    CollectionType type4 = (CollectionType) value;
                    System.out.println(type4.getValue().toString() + " " + type4.getType());
                    break;
            }
        }
    }
    
}
