package fr.diginamic.utils;

import junit.framework.TestCase;

public class StringUtilsTest extends TestCase {

    public void testLevenshteinDistance() {
        int res = StringUtils.levenshteinDistance("123p","abc");
        assertEquals(4,res);
    }

    public void testLevenshteinDistanceWhiteSpaces() {
        int res = StringUtils.levenshteinDistance(" aviron ","av io n");
        assertEquals(1,res);
    }

    public void testLevenshteinDistanceNull() {
        int res = StringUtils.levenshteinDistance(null,null);
        assertEquals(0,res);
    }

    public void testLevenshteinDistanceNullOneSide() {
        int res = StringUtils.levenshteinDistance(null,"12s");
        assertEquals(3,res);
    }


}