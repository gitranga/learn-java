public class convert_cel_fah
{
    public static  void  main(String args[]){
        float fah=90;
        // (f - 32) * 5/9
        float cel =(  fah - 32 ) * 5/9;
        System.out.println("converted value in cel: " + cel);
    }
}
