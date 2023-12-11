package ds.project;

import java.util.List;

/**
 *
 * @author USER
 */
public abstract class ValueFields {
    private Object value;
    private String type;
    
    public static final String STRING = "String";
    public static final String NUMBER = "Number";
    public static final String CHARACTER = "Character";
    public static final String COLLECTION = "Collections";

    public ValueFields(Object value, String type) {
        this.value = value;
        this.type = type;
    }
    
    public ValueFields(List<?> value, String type) {
        this.value = value;
        this.type = type;
    }

    public abstract void setValue(Object value);
    public abstract Class<?> getClassType();
    public String getType() {
        return type;
    }
    public Object getValue() {
        return value;
    }
    
    public abstract List<?> getListValue();
    
}
