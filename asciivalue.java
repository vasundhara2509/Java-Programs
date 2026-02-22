public class ASCIIValueCheck {
    public static void main(String[] args) {
        int asciiValue = 97;

        char character = (char) asciiValue;

        System.out.println("ASCII Value: " + asciiValue);
        System.out.println("Corresponding Character: " + character);

        if (asciiValue >= 97 && asciiValue <= 122) {
            System.out.println("It is a lowercase alphabet.");
        } else {
            System.out.println("It is not a lowercase alphabet.");
        }
    }
}
