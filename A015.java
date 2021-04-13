import java.util.Scanner;  // パッケージをインポート
 
class A015 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // スキャナーオブジェクトの生成
    System.out.println("ユーザーネームを入力してください。");
 
    String userName = myObj.nextLine();  // userNameを読み込む。
    System.out.println("ユーザー名:" + userName);  // userNameを出力。

    myObj.close();
  }
}