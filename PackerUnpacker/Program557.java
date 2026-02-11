import java.io.*;
import java.util.*;

class Program557
{
    public static void main(String A[]) throws Exception
    {
      File fobj = new File("Demo.txt");

     boolean bRet = fobj.createNewFile();

     if(bRet == true)
     {
        System.out.println("file gets created successfully");
     }
     else
     {
        System.out.println("Unable to create file");
     }
    }
}