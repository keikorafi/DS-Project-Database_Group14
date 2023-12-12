package ds.project.Types;

import java.util.List;

/**
 *
 * @dzxky_
 */
public class CharacterType extends ValueFields {

    private char value;

    public CharacterType(char value) {
        super(CHARACTER);
        this.value = value;
    }

    @Override
    public void setValue(Object value) {
        if (value instanceof Character) {
            this.value = (Character) value;
        } else {
            throw new IllegalArgumentException("Invalid value type. Expected Character.");
        }
    }

    public Character getValue() {
        return value;
    }
    
    @Override
    public Class<?> getClassType() {
        return Character.class;
    }

}
