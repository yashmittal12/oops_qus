import java.sql.SQLOutput;
import java.util.*;
public class abc {
    public int arr[];
    abc(int n){
        arr= new int[n];
    }
    public void array_Input(){
        Scanner sc= new Scanner(System.in);
        for(int i =0;i<arr.length;i++)
            arr[i]=sc.nextInt();
    }

    public void Result(int x) {
        var c=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]== x){
                System.out.println(i);
                c=1;
                break;
            }
        }
        if(c==0)
            System.out.println("-1");
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int a=sc.nextInt();
        abc obj =new abc(a);
        System.out.println("Enter the array");
        obj.array_Input();
        System.out.println("Enter the number to be search");
        int s= sc.nextInt();
        obj.Result(s);
    }
}
