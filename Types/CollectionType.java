package ds.project.Types;

import java.util.List;

/**
 *
 * @dzxky_
 */
public class CollectionType extends ValueFields {

    private List<?> value;

    public CollectionType(List<?> value) {
        super(COLLECTION);
        this.value = value;
    }

    @Override
    public void setValue(Object value) {
        if (value instanceof Character) {
            this.value = (List<?>) value;
        } else {
            throw new IllegalArgumentException("Invalid value type. Expected Character.");
        }
    }

    @Override
    public Class<?> getClassType() {
        return Character.class;
    }
    
    public List<?> getValue() {
        return value;
    }
}
