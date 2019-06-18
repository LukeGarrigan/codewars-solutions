package kyu6.tribonacci;

public class Tribonacci {

    public double[] tribonacci(double[] signature, int n) {

        double[] tribonacciSequence = new double[n];

        for (int i = 0; i < n && i < signature.length; i++) {
            tribonacciSequence[i] = signature[i];
        }

        for (int i = signature.length; i < n; i++) {
            double currentValue = tribonacciSequence[i-1] + tribonacciSequence[i-2] + tribonacciSequence[i-3];
            tribonacciSequence[i] = currentValue;
        }

        return tribonacciSequence;
    }
}
