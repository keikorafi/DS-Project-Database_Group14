package ds.project;

import java.lang.reflect.Array;

/**
 *
 * @dzxky_
 */
public class HashList {

    private int[] array;
    private int size;

    public HashList() {
        array = new int[1];
        size = 0;
    }

    public void add(int element) {
        if (size == array.length) {
            resizeArray();
        }
        array[size++] = element;
    }

    public boolean remove(int item) {
        for (int i = 0; i < size; i++) {
            if (array[i] == item) {
                System.arraycopy(array, i + 1, array, i, size - i - 1);
                size--;
                return true;
            }
        }
        return false;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        return array;
    }

    private void resizeArray() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

}
