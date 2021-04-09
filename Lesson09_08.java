class Lesson09_08 {
  public static void main(String[] args) {
    int x = 8;
    int y = 12;
    int z = 20;


    System.out.println(x += 10); // true
    System.out.println(z += y); // false

    x = 8;
    y = 8;

    x++;
    y--;

    System.out.println(x); // true
    System.out.println(y); // false

  }
}

// 出力結果
// true

