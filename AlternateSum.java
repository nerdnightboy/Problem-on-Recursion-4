import java.util.Scanner;

public class AlternateSum {
    static int seriesSum1(int n){
        // no alternate sign
        if(n==0){
            return 0;
        }

        return n + seriesSum1(n-1);
    }

    static int seriesSum2(int n){
        // with alternate sign
        if(n==0) return 0;

        if(n%2 == 0){
            return seriesSum2(n-1)-n;
        }
        else{
            return seriesSum2(n-1)+n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(seriesSum1(n));
        System.out.println(seriesSum2(n));
    }
}
