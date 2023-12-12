
package ds.project.Types;

import java.util.List;

/**
 *
 * @dzxky_
 */
public class StringType extends ValueFields {

    private String value;

    public StringType(String value) {
        super(STRING);
        this.value = value;
    }

    @Override
    public void setValue(Object value) {
        if (value instanceof String) {
            this.value = (String) value;
        } else {
            throw new IllegalArgumentException("Invalid value type. Expected String.");
        }
    }
    
    public String getValue() {
        return value;
    }

    @Override
    public Class<?> getClassType() {
        return String.class;
    }

}
