import java.io.*;
import java.util.*;

class Program560
{
public static void main(String A[]) throws Exception
{
    boolean bRet = false;
    String FileName = null;
    File fobj = null;
    
    Scanner sobj = new Scanner(System.in);

    System.out.println("enter the name of file: ");
    FileName = sobj.nextLine();

    fobj = new File(FileName);
    
    bRet = fobj.exists();

    if(bRet == true)
    {
      fobj.delete();
      System.out.println("file gets deleted");
    }
    else
    {
      System.out.println("there is no such file");
    }
    sobj.close();
}
}