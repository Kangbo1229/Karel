import java.util.Scanner;

public class Password {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("First name: ");
        String first = scan.next();
        System.out.print("Middle name: ");
        String middle = scan.next();
        System.out.print("Last name: ");
        String last = scan.next();
        System.out.print("Age: ");
        String age = scan.next();
        System.out.println(" ");
        int mid1 = first.length()/2;
        int mid2 = middle.length()/2;
        int mid3 = last.length()/2;
        first.substring(mid1,mid1+1);
        middle.substring(mid2,mid2+1);
        last.substring(mid3,mid3+1);
        System.out.print("Password :"+first.toUpperCase()+middle.toUpperCase()+last.toUpperCase());




    }
}
