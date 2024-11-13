/**
 *  The challenge consists of multiple problems
 *  We need a function that converts sentences to include numbers instead of certain letters
 *  O = 0, I = 1, E = 3, A = 4, S = 5, T = 7
 *  We also need a function that calculates these numbers in this specific way.
 *  A number followed by another number directly concatenates the numbers.
 *  This means that H34R7 (HEART) becomes : 34 + 7.
 *  But remember, only the last 2 digits are concatenated.
 *  This means that 7457Y (TASTY) becomes : 57
 *  Lone numbers are added normally.
 *  Example 1 5M H3R3 : 1 + 5 + 3 + 3
 *
 *  As usual, get creative.
 *  And try not to use ChatGPT, it's way more fun without it.
 */

public class NumberLock implements ISecurity{

    public String convertLettersToNumbers(String encryptedText) {
        return "";
    }


    public int calculateAmount() {
        return 0;
    }
}
