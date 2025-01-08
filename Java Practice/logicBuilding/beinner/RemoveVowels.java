package logicBuilding.beinner;

public class RemoveVowels {


    static String remove(String s) {

        StringBuilder result = new StringBuilder();

        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Check if the character is a vowel (case insensitive)
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                    ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                // If not a vowel, add it to the result
                result.append(ch);
            }
        }

        // Return the string after removing vowels
        return result.toString();
    }


    public static void main(String[] args) {
        System.out.println("khanAbdullah");
        System.out.println(remove("khanAbdullah"));
        System.out.println(2 + 2 + "2");

    }
}
