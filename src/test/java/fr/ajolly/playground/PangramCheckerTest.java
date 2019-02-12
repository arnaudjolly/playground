package fr.ajolly.playground;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PangramCheckerTest {

    private PangramChecker pangramChecker = new PangramChecker();

    @Test
    void pangram_quick_brown_fox_thing() {
        assertTrue(pangramChecker.isPangram("The quick brown fox jumps over the lazy dog"));
    }

    @Test
    void pangram_full_alphabet() {
        assertTrue(pangramChecker.isPangram("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    void pangram_empty() {
        assertFalse(pangramChecker.isPangram(""));
    }

    @Test
    void perfect_pangram_quick_brown_fox_thing() {
        assertFalse(pangramChecker.isPerfectPangram("The quick brown fox jumps over the lazy dog"));
    }

    @Test
    void perfect_pangram_full_alphabet() {
        assertTrue(pangramChecker.isPerfectPangram("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    void perfect_pangram_empty() {
        assertFalse(pangramChecker.isPerfectPangram(""));
    }
}