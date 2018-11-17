package liashenko;

public class MyStringUtils implements StringUtilInterface {

    public String reverseString(String input) {
        if (input == null) {
            return null;
        }

        char[] inputChars = input.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = inputChars.length - 1; i >= 0; i--) {
            result.append(inputChars[i]);
        }

        return result.toString();
    }
}
