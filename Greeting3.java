public class Greeting3 {

  public static void main(String[] args) {
    int output = plus(10, 30);
    System.out.println(output);
  }

  /**
   * 引数を渡せるメソッド。
   * aとbを足した結果を返します。
   * @param a
   * @param b
   * @return
   */
  
  private static int plus(int a, int b) {
    return a + b;
  }

}