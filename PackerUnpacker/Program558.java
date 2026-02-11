import java.io.*;
import java.util.*;

class Program558
{
    public static void main(String A[]) throws Exception
    {
     String FileName = null;
     
     Scanner sobj = new Scanner(System.in);

     System.out.println("enter the name of file: ");
     FileName = sobj.nextLine();

     File fobj = new File(FileName);

     boolean bRet = fobj.createNewFile();

     if(bRet == true)
     {
       System.out.println("file gets created successfully");
     }
     else
     {
       System.out.println("Unable to create file");
       System.out.println("This file is already exits");
     }
     sobj.close();
    }
}