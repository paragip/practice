public class Practice {

    public static void main(String[] args) {
        System.out.println("Even or not? " + isEvenNumber(2));
    }

    public static boolean isEvenNumber (int number) {
        if (number % 2 == 0 && number != 0) {
            return true;
        }
        return false;
    }

}
