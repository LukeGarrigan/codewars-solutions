package kyu7.howmanyarguments;

import kyu7.howmanyargument.Arguments;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArgumentsTest {


    @Test
    public void test1Argument() {

        assertEquals(1, Arguments.countArgs("11"));
    }

    @Test
    public void test0Argument() {

        assertEquals(0, Arguments.countArgs());
    }



}