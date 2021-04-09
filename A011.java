import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

class A011{
  public static void main(String[] args){
    try{
      File file = new File("sample.txt");
      Scanner scanner = new Scanner(file, "UTF-8");

      while (scanner.hasNextLine()){
        String dat = scanner.nextLine();
        System.out.println(dat);
      }
    }catch(FileNotFoundException e){
      System.out.println(e);
    }
  }
}