import java.util.Scanner;



public class InputCalculator {
    public static void main(String[] args) {
        System.out.println();

        Scanner sc = new Scanner(System.in);



        int sum = 0;

        double average = 0;

        int counter = 0;

        long newAverage = 0;



        while(true)

        {

            int order = counter + 1;

            boolean isAnInt = sc.hasNextInt();

            if(isAnInt)

            {

                int number = sc.nextInt();

                sum += number;

                double s = sum;

                average = s/order;

                newAverage = Math.round(average);

                counter++;

            }

            else

            {

                break;

            }

            sc.nextLine();

        }

        System.out.println("SUM = "+sum+" AVG = "+newAverage);

        sc.close();

    }

}