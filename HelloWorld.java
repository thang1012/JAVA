import java.util.Scanner;
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
	System.out.println("Hello World");
	String s = "";
	s = sc.nextLine();
        System.out.println("Hi "+ s);
    }
    
}
