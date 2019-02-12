package fr.ajolly.playground;

import java.util.BitSet;

public class PangramChecker {

    private static final int ALPHABET_SIZE = 26;

    public boolean isPangram(String aString) {

        if (aString == null) {
            return false;
        }

        BitSet bs = aString.toLowerCase()
                           .chars()
                           .filter(Character::isLetter)
                           .map(c -> c - 'a')
                           .collect(
                               () -> new BitSet(ALPHABET_SIZE),
                               BitSet::set,
                               BitSet::or
                           );

        return bs.cardinality() == ALPHABET_SIZE;
    }


    public boolean isPerfectPangram(String aString) {

        if (aString == null) {
            return false;
        }

        String cleansedString = aString.toLowerCase()
                                       .replaceAll("[^a-z]", "");

        return cleansedString.length() == ALPHABET_SIZE && isPangram(cleansedString);
    }
}
