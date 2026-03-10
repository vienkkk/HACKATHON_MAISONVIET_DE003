import java.util.Scanner;

public class sapxepmangc2 {
    Scanner sc = new Scanner(System.in);
    int count;

    public sapxepmangc2(int count) {
        this.count = count;
    }

    public void sapxepmang(){
        int []arr = new int[count];
        for (int i=0;i<count;i++){
            arr[i]=sc.nextInt();
        }
        for (int i =0;i<=count;i++){
            for (int j=i+1;j<=count;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        int right = count;
        int left =0;
        int []temp = arr;
        for (int i=0;i<=count;i++){
            if(arr[i]%2!=0){
                temp[left]=arr[i];
                left ++;
            }
            else {
                temp[right]=arr[i];
                right--;
            }
        }
        for (int i=0;i<=count;i++){
            System.out.println(temp[i]);
        }
    }
}
