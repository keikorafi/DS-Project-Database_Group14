package ds.project;

import java.util.List;

/**
 *
 * @dzxky_
 */
public class CollectionsType extends ValueFields {

    private List<Object> value;

    public CollectionsType(List<Object> value) {
        super(value, COLLECTION);
    }

    @Override
    public void setValue(Object value) {
        if (value instanceof List<?>) {
            this.value = (List<Object>) value;
        } else {
            throw new IllegalArgumentException("Invalid value type. Expected List.");
        }
    }

    @Override
    public Class<?> getClassType() {
        return List.class;
    }

    @Override
    public List<?> getListValue() {
        return value;
    }

}
