public class Practice {
    public static void main(String[] args) {
        double numberOne = 20.00;
        double numberTwo = 80.00;
        double numberThree = (numberOne + numberTwo) * 100;
        double remainder = numberThree % 40.00;
        boolean isRemainderOrNot = (remainder == 0) ? true : false;
        System.out.println(isRemainderOrNot);
        if (!isRemainderOrNot) {
            System.out.println("Got some remainder");
        }
    }
}
