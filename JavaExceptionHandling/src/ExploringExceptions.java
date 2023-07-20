public class ExploringExceptions {

    public static void main(String[] args) {

        String num_strs[] = { "Hello", "Java", null, "Program" };

        for (String str : num_strs) {

            System.out.println(str.charAt(0));
            System.out.println(str.charAt(2));
            System.out.println(str.charAt(4)); // java.lang.StringIndexOutOfBoundsException
        }
    }

//    public static void main(String[] args) {
//
//        String num_strs[] = { "Hello", "Java", null, "Program" };
//
//        for (String str : num_strs) {
//
//            System.out.println(str);
//        }
//
//        num_strs[4] = "Python"; // java.lang.ArrayIndexOutOfBoundsException
//        System.out.println(num_strs[4]);
//    }

//    public static void main(String[] args) {
//
//        String my_strings[] = { "Hello", "Java", null, "Program" };
//
//        for (String str : my_strings) {
//
//            System.out.format("The string %s has a length of %d\n",
//                    str.toUpperCase(), str.length()); // java.lang.NullPointerException
//        }
//    }

//    public static void main(String[] args) {
//
//        String num_strs[] = {"3", "56", "345.34", "1250", "3456"};
//
//        for (String str: num_strs) {
//
//            int varInt = Integer.parseInt(str); // java.lang.NumberFormatException
//
//            System.out.println(varInt);
//        }
//    }

//    public static void main(String[] args) {
//
//        int numerator = 100;
//        int denominator = 5;
//
//        while (denominator >= 0) {
//
//            int result = numerator / denominator; // java.lang.ArithmeticException
//
//            System.out.println(result);
//
//            denominator--;
//        }
//    }
}
