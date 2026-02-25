import java.util.Scanner;

public class Substring {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = "Programming is fun";
    String subStr = str.substring(3,14);
    System.out.println("Substring starting from index 3 to 14: " + subStr);
    }
}
