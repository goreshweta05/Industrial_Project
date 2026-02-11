import java.io.*;
import java.util.*;

class Program562
{
  public static void main(String A[]) throws Exception
{
    boolean bRet = false;
    String FileName = null;
    File fobj = null;
    
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the name of file: ");
    FileName = sobj.nextLine();

    FileWriter fwobj = new FileWriter(FileName);
    fwobj.write("Jay ganesh..!");

    fwobj.close();
    sobj.close();
}
}