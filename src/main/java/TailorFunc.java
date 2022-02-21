import java.lang.Math;

public class TailorFunc {


    public double getSecDecompositionFuncValue(double x) {
        return 1 / (1 - Math.pow(x, 2) / 2 + Math.pow(x, 4) / 24 - Math.pow(x, 6) / 720 +
                Math.pow(x, 8) / 40320 - Math.pow(x, 10) / 3628800 + Math.pow(x, 12) / 479001600 -
                Math.pow(x, 14) / 87178291200L + Math.pow(x, 16) / 20922789888000L -
                Math.pow(x, 18) / 6402373705728000L);
    }

}
