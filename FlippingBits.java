public class FlippingBits {
    // epic: flip the bits and return base 10
    // input is base 10
    // convert to base 2
    // add leading 0's if needed to make 32 bits
    // flip 0's to 1's and 1's to 0's
    // (return) convert back to base 10

    static long flippingBits(long n) {
        // String binaryString = Long.toBinaryString(n);
        return 0;
    }

    public static void main(String[] args) {
        long n = 5L;
        StringBuilder binaryString = new StringBuilder(Long.toBinaryString(n));
        int length = binaryString.length();
        int zerosNeeded = 32 - length;

        for (int i = 0; i < zerosNeeded; i++) {
            binaryString.insert(0, "0");
        }

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '0')
                binaryString.setCharAt(i, '1');
            else
                binaryString.setCharAt(i, '0');
        }

        // binaryString is a StringBuilder object which we convert to a string with the
        // toString() method
        // valueOf( takes in the string, and the radix) converts it to base 10

        long answer = Long.valueOf(binaryString.toString(), 2);

        System.out.println(answer);
    }
}