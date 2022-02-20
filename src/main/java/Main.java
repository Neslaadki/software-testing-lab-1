public class Main {
    public static void main(String[] args) {
        InsertSort sort = new InsertSort();
        System.out.println(TailorFunc.getSecDecompositionFuncValue(2));
        int[] arr = {4, 5, 3, 2, 5, 6, 3, 1};
        sort.sort(arr);
    }
}
