public class Main {

    public static void main(String[] args) {
        String message = "It is very good";

        // Prints the message
        System.out.println(message);

        // Length of the message
        System.out.println(message.length());

        // 5th element in message
        System.out.println("5. element : " + message.charAt(4));

        // Combine the message with given argument
        System.out.println(message.concat("!"));

        // Returns boolean if the message starts with given argument
        System.out.println(message.startsWith("It"));
        System.out.println(message.startsWith("Bu"));

        // Returns boolean if the message ends with given argument
        System.out.println(message.endsWith("d"));

        // Extracting characters from the message
        char[] characters = new char[5];
        message.getChars(0, 5, characters, 0);
        System.out.println(characters);

        // Returns the index of given argument within the message
        System.out.println(message.indexOf('s'));
        System.out.println(message.lastIndexOf('g'));
    }
}
