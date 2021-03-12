import java.util.Scanner;

public class Traverse{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int [] array = new  int[size];
        for (int i = 0 ; i<size;i++){
            System.out.println("Enter the element ");
            array[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("printing the array");
        for (int i = 0; i <array.length;i++){
            System.out.println(array[i]);
        }
    }
}