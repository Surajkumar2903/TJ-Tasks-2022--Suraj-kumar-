import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class testing {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a=sc.nextInt();
        String numberString = Integer.toString(a);

        for (int i = 0; i < numberString.length(); i++){
            char c = numberString.charAt(i);
            if(c=='6') { // check if the digit is 6 or not, if 6 is present then change it to 9
                numberString = numberString.substring(0, i) + '9' + numberString.substring(i + 1);
                break; // break the loop if 6 is changed to 9
            }
        }
        System.out.println("Largest Number is : "+numberString);
    }


}
