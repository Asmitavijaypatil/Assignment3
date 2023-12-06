import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	System.out.println("Enter 3 numbers: ");
   	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();

	if (a > b) {
 	   System.out.println("Output: "+a);
	} else {
	    if (a > c) {
 		System.out.println("Output: "+a);
	    } else {
 		System.out.println("Output: "+c);
            }
        }
    }
}