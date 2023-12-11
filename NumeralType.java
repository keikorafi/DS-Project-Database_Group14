package ds.project;

import java.util.List;

/**
 *
 * @dzxky_
 */
public class NumeralType extends ValueFields {

    private Number value;

    public NumeralType(Object value) {
        super(value, NUMBER);
    }

    @Override
    public void setValue(Object value) {
        if (value instanceof Number) {
            this.value = (Number) value;
        } else {
            throw new IllegalArgumentException("Invalid value type. Expected Numbers.");
        }
    }

    @Override
    public Class<?> getClassType() {
        return Number.class;
    }

    @Override
    public List<?> getListValue() {
        throw new UnsupportedOperationException("Unavailable"); //To change body of generated methods, choose Tools | Templates.
    }

}