import java.io.*;

public class java_builtin {
    public static void main(String args[]) throws Exception{

            DataInputStream myDipobj = new DataInputStream(new FileInputStream("\\temp\\1.txt"));
            DataOutputStream outStream = new DataOutputStream( new FileOutputStream("\\temp\\2.txt"));
            int first_number =myDipobj.readInt();
                        outStream.writeInt(first_number);

                        int secInt = myDipobj.readInt();
        outStream.writeInt(secInt);
        for (int i=1;i<=3;i++){
            int nextint = myDipobj.readInt();
            outStream.writeInt(nextint);
        }
        outStream.close();
        myDipobj.close();
    }
}
