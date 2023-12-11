

package ds.project;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @dzxky_
 */
public class Converter<T> {
    private T type;
    private T[] typeList;
    
    public Converter(Object type) {
        this.type = (T) type;
    }
    
    public Converter(T[] typeList) {
        this.typeList = typeList;
    }
    
    public T get() {
        return type;
    }
    
    public List<T> getList() {
        return Arrays.asList(typeList);
    }
}
