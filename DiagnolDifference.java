import java.util.*;
public class DiagnolDifference {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of n (for nxn matrix) : ");
        int n = scanner.nextInt();
        
        System.out.println("Enter all "+(n*n)+" elements :");

        List<List<Integer>> arr = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(scanner.nextInt());
            }
            arr.add(row);
        }
        scanner.close();
        
        int primary = 0;
        int secondary = 0;
        int size = arr.size();

        for (int i = 0; i < size; i++) {
            primary += arr.get(i).get(i);
            secondary += arr.get(i).get(size - i - 1);
        }
        int result = Math.abs(primary - secondary);
        System.out.println("Result = "+result);
    }

}//class


/*
int sum1 =0;
 * for (i =0 ; i< arr.len ; i++)
 * {
 *  sum1 = sum1 + arr[i][i];
 *  sum2 = sum2 + arr[i][arr.len-1-i];
 * }
 * 
 * ******************
 * ______________________
 * | 0*0 | 0*1 | 0*2 |
 * --------------------
 * | 1*0 | 1*1 | 1*2 |
 * --------------------
 * | 2*0 | 2*1 | 2*2 |
 * __________________
 * 
 * 
 */