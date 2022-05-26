class topclass {
    int number = 100;
    public void topclasmethd(){
        System.out.println("Outer class method ");
    }

     class inclass {
        int inclassnum = number;
        public void callingTopClassMthd(){
            topclasmethd();
            System.out.println("value topclass var"+number);
        }
    }
}
public class outclass_access {
    public static void main(String[] args){
        topclass topclassobj = new topclass();

        topclass.inclass inclassobj = topclassobj.new inclass();

        topclassobj.topclasmethd();

        inclassobj.callingTopClassMthd();

    }
}
