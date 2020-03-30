public class Java2016SummerQ1 {
import java.util.Scanner;

    public static class Stam{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int[] arr;
            System.out.println("write your array size");
            int sizeArr=input.nextInt();
            while(sizeArr<=0) {
                System.out.println("write your array size, size can be only a positive number");
                sizeArr=input.nextInt();
            }
            arr = new int[sizeArr];
            for (int i=0; i<sizeArr; i++){
                System.out.println("write your integer number for place "+ i + " in your array");
                arr[i]=input.nextInt();
            }
            System.out.println("write your integer number");
            int num=input.nextInt();
            int sumOfAllNumbers=0;
            for (int i=0; i<sizeArr; i++){
                if (arr[i]<num){
                    sumOfAllNumbers+=arr[i];
                }
            }
            System.out.println(sumOfAllNumbers);
        }
    }