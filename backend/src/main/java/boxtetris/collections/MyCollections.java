package boxtetris.collections;

import java.util.Comparator;
import boxtetris.datastructures.MyList;

/**
 * Class has a method for sorting MyLists'.
 */
public class MyCollections {

    private MyCollections() {
    }

    /**
     * Sort functions which is currently using quicksort. I may add new sorting
     * algorithms for testing purposes
     * 
     * @param list
     * @param comparator
     */
    public static <T> void sort(MyList<T> list, Comparator<? super T> comparator) {
        Object[] arr = list.toArray();
        Integer low = 0;
        Integer high = list.size() - 1;
        arr = sortQ(arr, low, high, comparator);
        list.clear();
        list.addAll((Object[]) arr);
    }

    /**
     * Recursive sort function for quicksort.
     * 
     * @param arr
     * @param low
     * @param high
     * @param comparator
     * @return Object[]
     */

    private static <T> Object[] sortQ(Object[] arr, int low, int high, Comparator<? super T> comparator) {
        if (low < high) {
            Integer pi = partition(arr, low, high, comparator);
            sortQ(arr, low, pi - 1, comparator);
            sortQ(arr, pi + 1, high, comparator);
        }
        return arr;
    }

    /**
     * Partition function for quicksort. We shift all items smaller than the pivot
     * to its left side. We use the last item in the array as the pivot.
     * 
     * @param arr
     * @param low
     * @param high
     * @param comparator
     * @return Integer
     */
    @SuppressWarnings("unchecked")
    private static <T> Integer partition(Object[] arr, Integer low, Integer high, Comparator<? super T> comparator) {
        T pivot = (T) arr[high];
        Integer i = (low - 1);
        for (int j = low; j < high; j++) {
            if (comparator.compare((T) arr[j], pivot) == 1) {
                i++;
                Object help = arr[i];
                arr[i] = arr[j];
                arr[j] = help;
            }
        }
        Object help = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = help;
        return i + 1;
    }
}
