public class Main {
    public static void main(String[] args) {
        double[] myList = {1.2,6.3,4.3,5.6};

        for (double element:myList) {
            System.out.println(element);
        }

        double total = 0;

        for (double number:myList) {
            total += number;
        }
        System.out.println("Total of the numbers are: " + total);

        double largestNum = myList[0];

        for (double number:myList) {
            if (largestNum < number) {
                largestNum = number;
            }
        }
        System.out.println("The largest number is: " + largestNum);
    }
}