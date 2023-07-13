import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class countArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[3];
        int size=arr.length;
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int i=0;i<size;i++){
            if (max == arr[i]) {
                count++;
            }

        }
        System.out.println(size-
                count);

    }
}