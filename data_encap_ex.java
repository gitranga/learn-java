import java.util.Scanner;

public class data_encap_ex {
    private int Number;
    private char charval;

    public void setNumber(int number_input){
        Number = number_input;
    }
    public int getNumber(){
        return Number;
    }

    public void setCharval(char inpu_char) {
        charval = inpu_char;
    }

    public char  getcharval () {
        return  charval;
    }
    public static void main (String args[]){
        data_encap_ex data_encap_obj = new data_encap_ex();
        data_encap_obj.setNumber(100);
        data_encap_obj.setCharval('a');
        int value = data_encap_obj.getNumber();
        System.out.println(data_encap_obj.getcharval());
        System.out.println(value);

    }
}
