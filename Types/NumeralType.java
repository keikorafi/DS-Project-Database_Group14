package ds.project.Types;

import java.util.List;

/**
 *
 * @dzxky_
 */
public class NumeralType extends ValueFields {

    private Number value;

    public NumeralType(Number value) {
        super(NUMBER);
    }

    @Override
    public void setValue(Object value) {
        if (value instanceof Number) {
            this.value = (Number) value;
        } else {
            throw new IllegalArgumentException("Invalid value type. Expected Numbers.");
        }
    }
    
    public Number getValue() {
        return value;
    }

    @Override
    public Class<?> getClassType() {
        return Number.class;
    }

}