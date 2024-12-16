import java.util.Scanner;

public class RangesumQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	
	 System.out.println("Enter the L");

        int L = sc.nextInt();
	
	 System.out.println("Enter the R");

        int R = sc.nextInt();
        int[] arr = new int[]{2, 4, 6, 8, 10};
        int[] ps = new int[arr.length];
        
        
        ps[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ps[i] = ps[i - 1] + arr[i];
        }
        
        
        int range;
        if (L > 0) {
            range = ps[R] - ps[L - 1];
        } else {
            range = ps[R];
        }
        
        System.out.println(range);
        
    }
}
