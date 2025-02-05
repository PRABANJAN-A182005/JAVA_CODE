public class perfectnum {
    public static boolean condition(int nums){
        //logic for to find factor
        int count=0;
        int factor=0;
        for(int i=1;i<nums;i++){//increment for count and sum for factor
            if(nums%i==0){
                count++;
                factor+=i;
            }
        }
        //check the factor
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
