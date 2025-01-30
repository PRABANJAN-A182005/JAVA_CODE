import java.util.Scanner; 

public class integerArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER:- ");
        int arr[]={6,5,5,6,1};
        
        for (int i=0;i<arr.length;i++){
            int count = 0;
            for (int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
