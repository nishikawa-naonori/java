import java.util.Scanner; 

class A014 {
  public static void main(String[] args) {
      
    Scanner scanner = new Scanner(System.in);
    
    String input = "あいうえお";
    
    System.out.println("入力した値:" + input);
    
    char scan = scanner.next().charAt(0);
 
    System.out.println("取得する値:" + scan);

    scanner.close();
  }
}