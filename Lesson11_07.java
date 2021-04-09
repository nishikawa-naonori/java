class Lesson11_07 {

  public static void main(String[] args) {
    int score = 4;//ここは1～5までの数字で自由に変えます。
    String result = null;

    switch (score) {
      case 5://scoreが5の時
        result = "A";
        break;
      case 4://scoreが4の時
        result = "B";
        break;
      case 3://scoreが3の時
        result = "C";
        break;
      case 2://scoreが2の時
        result = "D";
        break;
      case 1://scoreが1の時
        result = "E";
        break;
      default://scoreが上記以外の時
        break;
    }

    if (result != null) {
      System.out.println(result + "評価です。");
    }
  }

}