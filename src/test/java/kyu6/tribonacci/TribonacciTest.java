package kyu6.tribonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TribonacciTest {


    Tribonacci tribonacci = new Tribonacci();

    private double precision = 1e-10;

    @Test
    public void basicTests() {
        assertArrayEquals(new double []{1,1,1,3,5,9,17,31,57,105}, tribonacci.tribonacci(new double []{1,1,1},10), precision);
        assertArrayEquals(new double []{0,0,1,1,2,4,7,13,24,44}, tribonacci.tribonacci(new double []{0,0,1},10), precision);
        assertArrayEquals(new double []{0,1,1,2,4,7,13,24,44,81}, tribonacci.tribonacci(new double []{0,1,1},10), precision);
        assertArrayEquals(new double []{0,1,1,2,4,7,13,24,44,81}, tribonacci.tribonacci(new double []{15.0, 9.0, 1.0},0), precision);
    }


    @Test
    public void myTests() {
        assertArrayEquals(new double []{1,1,1,3,5,9,17,31,57,105}, tribonacci.tribonacci(new double []{1,1,1},1), precision);
    }

}