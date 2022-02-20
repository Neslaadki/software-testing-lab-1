import javafx.util.Pair;


public class InsertSort {

    public int[] sort(int[] array) {
        array = go_forward(array);
        return array;
    }

    public int[] go_forward(int[] array) {
        int len = array.length;
        for (int left = 0; left < len; left++) {
            int value = array[left];
            int i = left - 1;
            Pair<Integer, int[]> p = go_back(array, i, value);
            array = p.getValue();
            i = p.getKey();
            array[i + 1] = value;
        }
        return array;
    }

    public Pair<Integer, int[]> go_back(int[] array, int i, int value) {
        for (; i >= 0; i--)
            if (compare_values(value, array[i])) array[i + 1] = array[i];
            else break;
        return new Pair<>(i, array);
    }

    public boolean compare_values(int a, int b) {
        return a < b;
    }


}
