package site.nosaj.exceptions.exercise7;


public class Main {
    public static void containsVowels(String text) throws Exception {
        String[] vowels = {"a", "e", "i", "o", "u"} ;
        int i = 0;
        for (String vowel : vowels) {
            if (text.contains(vowel)) {
                i++;
            }
        }
        if (i > 0) {
            System.out.println("The text contains vowels");
        }
        else throw new Exception("The text does not contain vowels");
    }
    public static void main(String[] args) {
        try {
            containsVowels("sprt");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
