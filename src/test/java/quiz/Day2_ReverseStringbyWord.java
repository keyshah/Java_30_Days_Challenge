//Day 2 - Reverse a String in Java word by word

package quiz;

public class Day2_ReverseStringbyWord {

    public static void main(String[] args) {
        reverse_string_by_word("My name is Keyur Shah");
        reverse_string_by_word("East or West Encora QA Team is the best");

    }

public static void reverse_string_by_word ( String s1){
    System.out.println("Before String  " + s1);
        String[] as1 = s1.split(" ");
    String revs1 = "";

    for (int i = as1.length  -1      ; i >= 0; i--) {
        revs1 = revs1 + as1[i] + " ";
    }
    System.out.println("After Reverse String  " + revs1);

}

}
