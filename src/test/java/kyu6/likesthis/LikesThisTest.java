package kyu6.likesthis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Luke.Garrigan
 * @since 27/06/2019
 */
class LikesThisTest {

    @Test
    public void staticTests() {
        assertEquals("no one likes this", LikesThis.whoLikesIt());
        assertEquals("Peter likes this", LikesThis.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", LikesThis.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", LikesThis.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", LikesThis.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}