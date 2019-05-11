package chp01;

public class ArrayUtil {

    /**
     * 找出最大值
     * @param array
     * @return
     */
    double findMax(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    /**
     * 计算平均值
     * @param a
     * @return
     */
    double calculateMean(double[] a) {
        
        int length = a.length;
        double sum = 0.0;
        for (int i = 0; i < length; i++) {
            sum += a[i];
        }
        return sum / length;
    }

    double[] copyArray(double[] a) {
        int length = a.length;
        double[] b = new double[length];
        for (int i = 0; i < length; i++) {
            b[i] = a[i];
        }
        return b;
    }

    

}
