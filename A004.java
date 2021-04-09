import java.util.Scanner;

public class A004 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String inputStr = scan.next();

    System.out.println("コンソールに入力された文字は、「" + inputStr + "」です。");

    scan.close();
  }

}