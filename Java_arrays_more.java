public class Java_arrays_more
{
    public static void main (String args[]){
        int roll_student[] = new int[10000];
        System.out.println("Length of the Array"+roll_student.length);
        for (int i = 0; i<= roll_student.length-1;i++){
            roll_student[i] = i;
        }


        int j=0;
        while (true){
            System.out.println(roll_student[j]);
            j++;

            if (roll_student.length==j){
                System.out.println(j);
              break;

            }

        }
    }
}
