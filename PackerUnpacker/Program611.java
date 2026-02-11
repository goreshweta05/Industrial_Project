//Unpacking code

import java.io.*;
import java.util.*;

class Program611
{
public static void main(String A[]) throws Exception
{ 
  int FileSize = 0;
  Scanner sobj = null;
  String FileName = null;
  File fpackobj = null;
  File fobj = null;
  FileInputStream fiobj = null;
  FileOutputStream foobj = null;
  byte bHeader[] = new byte[100];
  byte Buffer[] = null;
  String Header = null;
  String Tokens[] = null;

  sobj = new Scanner(System.in);
  System.out.println("Enter the name of packed file: ");

  FileName = sobj.nextLine();
  fpackobj = new File(FileName);

  if(fpackobj.exists() == false)
  {
    System.out.println("error: There is no such packed file");
    return;
  }  
  fiobj = new FileInputStream(fpackobj);

  //Read the header
  fiobj.read(bHeader,0,100);

  Header = new String(bHeader);

  Header = Header.trim();
  Tokens = Header.split(" ");
  System.out.println("File name: "+Tokens[0]);
  System.out.println("File size: "+Tokens[1]);

  fobj = new File(Tokens[0]);

  fobj.createNewFile();
  foobj = new FileOutputStream(fobj);

 FileSize = Integer.parseInt(Tokens[1]);
  Buffer = new byte[FileSize];

  fiobj.read(Buffer,0,FileSize);
  foobj.write(Buffer,0,FileSize);  
}
}