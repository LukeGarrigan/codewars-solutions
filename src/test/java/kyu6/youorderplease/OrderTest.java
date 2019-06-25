package kyu6.youorderplease;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

        @Test
        public void test1() {
            assertEquals("Thi1s is2 3a T4est", Order.order("is2 Thi1s T4est 3a"));
        }

}