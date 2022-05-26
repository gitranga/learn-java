public class break_example {
    public static void main(String args[]){
        int count = 100;
        for(int i=1;i<=count;i++){
            System.out.println("Value of index variable"+i);
            if (i==5){
                break;
            }
        }

        System.out.println("I am out of the loop");
        System.out.println("closing out");
    }

}
