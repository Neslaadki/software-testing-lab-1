import javafx.util.Pair;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;


public class InsertSortTests {

    private InsertSort insertSort = new InsertSort();


    @DisplayName("Проверка корректости функции сравнения")
    @ParameterizedTest
    @CsvSource({"-1,-3", "1,-1", "6,1"})
    public void if_first_biggest_than_second(int a, int b) {
        boolean res = insertSort.compare_values(a, b);
        assertFalse(res);
    }

    @DisplayName("Проверка корректости функции сравнения")
    @ParameterizedTest
    @CsvSource({"-1,-1", "0,0", "4,4", "1,-0"})
    public void if_first_equal_second(int a, int b) {
        boolean res = insertSort.compare_values(a, b);
        assertFalse(res);
    }

    @DisplayName("Проверка корректости функции сравнения")
    @ParameterizedTest
    @CsvSource({"-4,-1", "-1,1", "2,5"})
    public void if_first_smallest_than_second(int a, int b) {
        boolean res = insertSort.compare_values(a, b);
        assertTrue(res);
    }

    @DisplayName("Проверка корректости функции обратного обхода")
    @ParameterizedTest
    @MethodSource("array_int_and_int_provider")
    public void if_current_value_not_in_left(int[] array, int i, int value) {
        int[] tr_array = {2, 2, 2, 2};
        Pair<Integer, int[]> p = insertSort.go_back(array, i - 1, value);
        int[] arr = p.getValue();
        System.out.println(Arrays.toString(arr));
        assertArrayEquals(tr_array, arr);
    }

    static Stream<Arguments> array_int_and_int_provider() {

        return Stream.of(
                arguments(new int[]{2, 1, 2, 2}, 1, 1),
                arguments(new int[]{2, 2, 1, 2}, 2, 1),
                arguments(new int[]{2, 2, 2, 1}, 3, 1));
    }

    @DisplayName("Проверка корректости функции обратного обхода")
    @ParameterizedTest
    @MethodSource("array_int_and_int_provider_")
    public void if_current_value_in_left(int[] array, int i, int value) {
        int[] tr_array = {1, 2, 2, 2};
        Pair<Integer, int[]> p = insertSort.go_back(array, i - 1, value);
        int[] arr = p.getValue();
        assertArrayEquals(tr_array, arr);
    }

    static Stream<Arguments> array_int_and_int_provider_() {

        return Stream.of(
                arguments(new int[]{1, 2, 2, 2}, 0, 1));
    }


    @DisplayName("Проверка корректости функции сортировки")
    @ParameterizedTest
    @MethodSource("arrays_example_provider")
    public void if_array_sort_method_is_correct(int[] array) {
        int[] array_tr = {0, 1, 2, 2, 2, 3, 4, 9, 9, 9};
        assertArrayEquals(insertSort.sort(array), array_tr);
    }

    static Stream<Arguments> arrays_example_provider() {
        return Stream.of(
                arguments(new int[]{9, 9, 2, 3, 0, 1, 2, 4, 9, 2}),
                arguments(new int[]{2, 1, 4, 9, 0, 2, 3, 2, 9, 9}),
                arguments(new int[]{9, 9, 9, 4, 3, 2, 2, 2, 1, 0}),
                arguments(new int[]{9, 9, 9, 4, 3, 2, 2, 2, 0, 1}));
    }

    @DisplayName("Проверка корректости функции сортировки")
    @ParameterizedTest
    @MethodSource("all_elements_arrays_is_equal_example_provider")
    public void if_all_elements_in_array_is_equal(int[] array) {
        int[] array_tr = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        assertArrayEquals(insertSort.sort(array), array_tr);
    }

    static Stream<Arguments> all_elements_arrays_is_equal_example_provider() {
        return Stream.of(
                arguments(new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2}));
    }

    @DisplayName("Проверка корректости функции сортировки при пустом массиве")
    @ParameterizedTest
    @MethodSource("arrays_empty_provider")
    public void if_array_is_empty(int[] array) {
        int[] array_tr = {};
        assertArrayEquals(insertSort.sort(array), array_tr);
    }

    static Stream<Arguments> arrays_empty_provider() {
        return Stream.of(
                arguments(new int[]{ }));
    }

    @DisplayName("Проверка корректости функции сортировки при массиве с 1 элементом")
    @ParameterizedTest
    @MethodSource("arrays_one_element_provider")
    public void if_array_is_i_empty(int[] array) {
        int[] array_tr = {1};
        assertArrayEquals(insertSort.sort(array), array_tr);
    }

    static Stream<Arguments> arrays_one_element_provider() {
        return Stream.of(
                arguments(new int[]{1}));
    }


}
