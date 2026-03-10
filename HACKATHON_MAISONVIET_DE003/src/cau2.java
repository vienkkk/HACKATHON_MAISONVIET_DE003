import java.util.Scanner;

public class cau2 {
    Scanner sc = new Scanner(System.in);
    int coutArr;

    public cau2(int coutArr) {
        this.coutArr = coutArr;
    }

    public void coupleNumberMax(){
        int []arr = new int[coutArr];
        for (int i=0;i<coutArr;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int before=0;
        int after=0;
        int temp=0;
        for (int i=0;i<arr.length-1;i++){
            temp= arr[i]+arr[i+1];
            if(temp>sum){
                before=arr[i];
                after=arr[i+1];
            }

        }
        System.out.println(before);
        System.out.println(after);
        int result = before + after;
        System.out.println("Tổng "+result);
    }
}
