package tudelft.numfinder;

import tudelft.roman.RomanNumeral;

public class NumFinderMain {

    public static void main (String[] args) {
        String numRoman = "VXV";
        RomanNumeral n = new RomanNumeral();
        int i = n.convert(numRoman);
        System.out.printf("%s", i);
    }
}
