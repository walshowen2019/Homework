public class Main {

    private static String binaryNumber;
    private static String octalNumber;
    private static String hexNumber;

    public static void main(String[] args) {

        int[] decimals = new int[6];
        decimals[0] = 0;
        decimals[1] = 1;
        decimals[2] = 63;
        decimals[3] = 127;
        decimals[4] = 255;
        decimals[5] = 256;

        System.out.print("0: (Binary) ");
        toBinary(decimals[0]);
        System.out.print("(Octal) ");
        toOctal(decimals[0]);
        System.out.print("(Hex) ");
        toHex(decimals[0]);

        System.out.print("1: (Binary) ");
        toBinary(decimals[1]);
        System.out.print("(Octal) ");
        toOctal(decimals[1]);
        System.out.print("(Hex) ");
        toHex(decimals[1]);

        System.out.print("63: (Binary) ");
        toBinary(decimals[2]);
        System.out.print("(Octal) ");
        toOctal(decimals[2]);
        System.out.print("(Hex) ");
        toHex(decimals[2]);

        System.out.print("127: (Binary) ");
        toBinary(decimals[3]);
        System.out.print("(Octal) ");
        toOctal(decimals[3]);
        System.out.print("(Hex) ");
        toHex(decimals[3]);

        System.out.print("255: (Binary) ");
        toBinary(decimals[4]);
        System.out.print("(Octal) ");
        toOctal(decimals[4]);
        System.out.print("(Hex) ");
        toHex(decimals[4]);

        System.out.print("256: (Binary) ");
        toBinary(decimals[5]);
        System.out.print("(Octal) ");
        toOctal(decimals[5]);
        System.out.print("(Hex) ");
        toHex(decimals[5]);

    }

    public static void toBinary(int decimal) {
        int[] binary = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        if (decimal <= 1) binary[8] = decimal;

        if (decimal > 1) {
            for (int i = binary.length - 1; i >= 0; i--) {
                if (Math.pow(2, i) > decimal) binary[(binary.length - 1) - i] = 0;
                if (Math.pow(2, i) <= decimal) {
                    binary[(binary.length - 1) - i] = 1;
                    decimal -= Math.pow(2, i);
                }
            }
        }

        StringBuilder builder = new StringBuilder();

        for (int string : binary) {
            if (builder.length() > 0);
            builder.append(string);
        }

        String string = builder.toString();
        System.out.print(string + " ");
    }

    public static void toOctal(int decimal) {
        int[] octal = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (decimal <= 8) octal[8] = decimal;
        if (decimal > 8) {
            for (int i = octal.length - 1; i >= 0; i--) {
                octal[i] = decimal % 8;
                decimal /= 8;
            } }

        StringBuilder builder = new StringBuilder();

        for (int string : octal) {
            if (builder.length() > 0);
            builder.append(string);
        }

        String string = builder.toString();
        System.out.print(string + " ");

    }
    public static void toHex(int decimal) {
        int[] hex = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (decimal < 16) hex[8] = decimal;
        if (decimal >= 16) {
            for (int i = hex.length - 1; i >= 0; i--) {
                hex[i] = decimal % 16;
                decimal /= 16;
            } }

        StringBuilder builder = new StringBuilder();

        for (int string : hex) {
            if (builder.length() > 0);
            builder.append(string);
        }

        String string = builder.toString();
        System.out.println(string + " ");

    }


}
