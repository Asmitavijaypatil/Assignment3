import java.util.Scanner;
public class ConvertMilisecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
	long input = sc.nextLong();
       
        long second =  input / 1000;
	long minuts = second / 60;
	long hour   = minuts / 60;

	second = second % 60;
	minuts =  minuts % 60;

     	System.out.println("Output:  "+ hour + ":" + minuts + ":" + second);
    }
}
