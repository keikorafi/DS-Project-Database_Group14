

package ds.project;

import java.util.List;

/**
 *
 * @dzxky_
 */
public class CharacterType extends ValueFields {

    private Character value;

    public CharacterType(Object value) {
        super(value, CHARACTER);
    }

    @Override
    public void setValue(Object value) {
        if (value instanceof Character) {
            this.value = (Character) value;
        } else {
            throw new IllegalArgumentException("Invalid value type. Expected Character.");
        }
    }

    @Override
    public Class<?> getClassType() {
        return Character.class;
    }

    @Override
    public List<?> getListValue() {
        throw new UnsupportedOperationException("Unavailable"); //To change body of generated methods, choose Tools | Templates.
    }

}
