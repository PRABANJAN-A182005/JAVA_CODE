public class perfectnum {
    public static boolean condition(int nums){
        int count=0;
        int factor=0;
        for(int i=1;i<nums;i++){
            if(nums%i==0){
                count++;
                factor+=i;
            }
        }
        if(count!=2 && factor==nums){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int nums = 6;
        if(condition(nums)==true){
            System.out.println("its perfect number");
        }
        
    }
}
