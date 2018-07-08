public class trycatch {
    public static void main ( String[] args) {
        int arg1 =0;
        if (args.length >0 ) {
            
            try {
                arg1 = Integer.parseInt(args[0]);
                
            }
            catch(NumberFormatException e ) {
                System.err.println("Argument "+args[0] + "Not an integer");
                System.exit(1);
            }
            System.out.println(" Number entered " + arg1 );
        }
    }

}