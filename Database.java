package ds.project;

import ds.project.Types.CharacterType;
import ds.project.Types.CollectionType;
import ds.project.Types.NumeralType;
import ds.project.Types.StringType;
import ds.project.Types.ValueFields;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

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

    public void clear() {
        database.clear();
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
        HashList<String> keyList = database.getKeys();
        for (String key : keyList) {
            ValueFields value = database.get(key);
            switch (value.getType()) {
                case ValueFields.STRING:
                    StringType type1 = (StringType) value;
                    System.out.println(key + " " + type1.getValue() + " " + type1.getType());
                    break;
                case ValueFields.CHARACTER:
                    CharacterType type2 = (CharacterType) value;
                    System.out.println(key + " " + type2.getValue() + " " + type2.getType());
                    break;
                case ValueFields.NUMBER:
                    NumeralType type3 = (NumeralType) value;
                    System.out.println(key + " " + type3.getValue() + " " + type3.getType());
                    break;
                case ValueFields.COLLECTION:
                    CollectionType type4 = (CollectionType) value;
                    System.out.println(key + " " + type4.getValue().toString() + " " + type4.getType());
                    break;
            }
        }
    }

    public HashList<String> getCSV() {
        HashList<String> keyList = database.getKeys();
        HashList<String> csv = new HashList<>();
        csv.add("Key,Value,Datatype");
        for (String key : keyList) {
            ValueFields value = database.get(key);
            switch (value.getType()) {
                case ValueFields.STRING:
                    StringType type1 = (StringType) value;
                    csv.add(key + "," + type1.getValue() + "," + type1.getType());
                    break;
                case ValueFields.CHARACTER:
                    CharacterType type2 = (CharacterType) value;
                    csv.add(key + "," + type2.getValue() + "," + type2.getType());
                    break;
                case ValueFields.NUMBER:
                    NumeralType type3 = (NumeralType) value;
                    csv.add(key + "," + type3.getValue() + "," + type3.getType());
                    break;
                case ValueFields.COLLECTION:
                    CollectionType type4 = (CollectionType) value;
                    csv.add(key + "," + type4.toString() + "," + type4.getType());
                    break;
            }
        }
        return csv;
    }

    public void toCSV(String name) {
        try {
            PrintWriter out = new PrintWriter(new File(name));
            HashList<String> csv = getCSV();
            for (String s : csv) {
                out.println(s);
            }
            out.close();
        } catch (IOException e) {
            System.out.println("Error");
        }

    }

}
