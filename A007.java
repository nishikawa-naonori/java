import java.util.Scanner;

class A007{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("年齢を入力してください");
    int old = scanner.nextInt();

    System.out.println("年齢は" + old + "です");

    scanner.close();
  }
}