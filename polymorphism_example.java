class  tree{
    public void growth(){
        System.out.println("Tree grows taller: 10 ft");
    }
}

class pinetree extends tree{
    public void growth(){
        System.out.println("Tree gorws very tall:20 ft");
    }
}

class oaktree extends tree{
    public void growth(){
        System.out.println("This tree grows 15 ft");
    }
}

public class polymorphism_example {
    public static void main(String args[]){
        tree treeobj = new tree();
        pinetree pinetreeobj = new pinetree();
        oaktree oaktreeobj = new oaktree();
        treeobj.growth();
        pinetreeobj.growth();
        oaktreeobj.growth();
    }
}
