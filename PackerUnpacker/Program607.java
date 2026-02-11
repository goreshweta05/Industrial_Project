//Unpacking code

import java.io.*;
import java.util.*;

class Program607
{
public static void main(String A[]) throws Exception
{ 
  Scanner sobj = null;
  String FileName = null;

  sobj = new Scanner(System.in);
  System.out.println("Enter the nam eof packed file: ");

  FileName = sobj.nextLine();
  File fpackobj = new File(FileName);

  if(fpackobj.exists() == false)
  {
    System.out.println("error: There is no such packed file");
    return;
  }
  


}
}