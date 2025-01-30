public class infinite {
//condition for for loop to be infinte
    public static void forloop(){
        for(;;){
            System.out.println("hi");
        }
    }
//condition for while loop to be infinte
    public static void whileloop(){
       int i=1;
       while(true){
        i++;
        System.out.println(i);
       }
    }
    public static void main(String[] args) {
        forloop();
        whileloop();
    }
}
