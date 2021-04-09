import java.util.Scanner;

 class A005 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("入力してください > ");

    String input_text = scanner.nextLine();

    System.out.println(input_text + "が入力されました");

    scanner.close();

  }
}
