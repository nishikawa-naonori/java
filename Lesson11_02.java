class Lesson11_02 {
  public static void main(String[] args) {
    for(int i = 0; i <= 4; i++){
      if(i==3){  // iが3になったら後続処理はせず、その場で強制終了
        break;
      }
      System.out.println(i);
    }
  } 
}
// 出力結果
// 0
// 1
// 2

