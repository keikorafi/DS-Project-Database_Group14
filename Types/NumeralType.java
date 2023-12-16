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

    public Number getValue() {
        return value;
    }

    @Override
    public Class<?> getClassType() {
        return Number.class;
    }

}