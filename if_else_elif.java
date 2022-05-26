public class if_else_elif {
    public static void main (String args[])
    {
        int i = 10 , j=30, k=30;
        if ( i>j && i>k){
            System.out.println("Largest of three"+i);

        }
        else if(j>i &&  j>k) {
            System.out.println("Largest of three"+j);
       }
        else if(k>i &&  k>j) {
            System.out.println("Largest of three"+k);

        }
        else {
            System.out.println("There is no clear largest number");
        }

    }
}
