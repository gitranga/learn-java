public class for_loop {

    public static void main(String args[]){
       int natural_number_set = 5;
        int how_many_times_to_exec = 5;

        for (int counter =1; counter<=how_many_times_to_exec; counter++)
        {
                System.out.println("  loop - set number :" +counter);

            for (int i=1;i<=natural_number_set;i++)
            {
                System.out.println(" Inner loop - set number :" +i);
                if (i==3){
                    break;
                }
            }

        }

    }
}
