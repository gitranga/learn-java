public class function_overloading_example {
    public static int add(int intFNumber,int intSNumber){
        return intFNumber+intSNumber;
    }
    public static int add(int intFNumber, int intSNumber , int intTNumber){
        return intFNumber+intSNumber+intTNumber;
    }

    public static void main(String args[]){
       int FirstNum =120,  SecondNum = 100,  ThirdNum = 200;
       int result1=add(FirstNum,SecondNum);
       System.out.println("Added value"+result1);
       int result2 = add(FirstNum,SecondNum,ThirdNum);
       System.out.println("Added value "+result2);
    }

}
