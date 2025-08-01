import java.util.Scanner;
public class mandahinog {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        int totalNumber = 0;
        int number;

        for (int i = 1; i <= 5 ; i++){
            System.out.println("enter number " + i + ": ");
            number = input.nextInt();
            totalNumber += number;
        }

        System.out.println(" ");
        System.out.println("total number is " + totalNumber);


    }
}
