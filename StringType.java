
package ds.project;

import java.util.List;

/**
 *
 * @dzxky_
 */
public class StringType extends ValueFields {

    private String value;

    public StringType(Object value) {
        super(value, STRING);
    }

    @Override
    public void setValue(Object value) {
        if (value instanceof String) {
            this.value = (String) value;
        } else {
            throw new IllegalArgumentException("Invalid value type. Expected String.");
        }
    }

    @Override
    public Class<?> getClassType() {
        return String.class;
    }

    @Override
    public List<?> getListValue() {
        throw new UnsupportedOperationException("Unavailable"); //To change body of generated methods, choose Tools | Templates.
    }

}
