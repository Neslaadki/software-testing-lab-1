
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TailorFuncTests {


    @DisplayName("Проверка значения функции в точках значения cos(x)=0")
    @ParameterizedTest
    @ValueSource(doubles = {-(Math.PI / 2 + Math.PI) + 0.1, -Math.PI / 2 - 0.1, Math.PI / 2 + 0.1, Math.PI / 2 + Math.PI - 0.1})
    public void if_cos_is_about_zero(double x) {
        double realVal = 1 / Math.cos(x);
        double funcVal = TailorFunc.getSecDecompositionFuncValue(x);
        assert (Math.abs(realVal - funcVal) < 0.001);
    }

    @DisplayName("Проверка значения функции в точках cos(x) = 1")
    @ParameterizedTest
    @ValueSource(doubles = {-Math.PI, 0, Math.PI})
    public void if_x_is_pi_and_zero(double x) {
        double realVal = 1 / Math.cos(x);
        double funcVal = TailorFunc.getSecDecompositionFuncValue(x);
        assert (Math.abs(realVal - funcVal) < 0.001);
    }

    @DisplayName("Проверка значения функции в точках, где cos(x) != 0,1")
    @ParameterizedTest
    @ValueSource(doubles = {Math.PI / 3, 2 * Math.PI / 3, -(Math.PI / 3), -(2 * Math.PI / 3)})
    public void if_x_is_half_of_one(double x) {
        double realVal = 1 / Math.cos(x);
        double funcVal = TailorFunc.getSecDecompositionFuncValue(x);
        assert (Math.abs(realVal - funcVal) < 0.001);
    }


}
