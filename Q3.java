import java.util.Scanner;

public class Q9 {
    public int arr[];

    Q9(int n) {
        arr = new int[n];
    }

    public void arrayInput() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void result(){
        var c=0;

        for(int i=0;i<arr.length;i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                System.out.println("false");
                c = 1;
                break;
            }
        }
            if(c==0)
                System.out.println("true");


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int x= sc.nextInt();
        Q9 obj =new Q9(x);
        System.out.println("Enter the elements of array");
        obj.arrayInput();
        obj.result();
    }
}
