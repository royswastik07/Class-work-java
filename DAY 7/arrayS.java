import java.util.Scanner;

class arraysum{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array length");
        int a = scan.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter " + a + " numbers:");
        for (int i = 0; i < a; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        System.out.println("The sum : " + sum);

        scan.close();
    }
}