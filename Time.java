import java.util.Scanner;
class Time {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System. in);

    int a, vary, minutes, hour;
    String str;
    a= sc. nextInt();

    vary =a;
    minutes = vary%100;
    vary = vary/100;

    if (vary > 12 && vary <= 24) {
       str = "pm";
    } else {
       str = "am";
    }

    hour =vary/2;
    System.out.println( a + " >>>"+ hour + " : " + minutes + str);
   }
}
      