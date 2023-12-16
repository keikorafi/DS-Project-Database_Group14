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
    public Class<?> getClassType() {
        return Character.class;
    }
    
    public List<?> getValue() {
        return value;
    }
}
