
class Student {
  String name;

  public double calculateAvg(double[] data) {
    double sum = 0;
    for ( int i=0; i < data.length; i++ ) {
             sum += data[i];
           }
    double avg = sum/data.length;
    return avg;
  }

  public String judge(double avg) {
    String result;
    if( avg >= 60 ) {
      result = "passed";
    } else {
      result = "failed";
    }
    return result;
  }
}

public class Lesson14_01{
  public static void main(String[] args){
    Student a001 = new Student();
    a001.name = "sato";
    double[] data = { 70 , 65, 50, 90, 30};

    double avg = a001.calculateAvg(data);
    String result = a001.judge(avg);

    System.out.println(avg);
    System.out.println(a001.name + " " + result);
  }
}


// javaが用意しているメソッド
// println

// メソッドの定義
//アクセス修飾子
// public     他のクラスからアクセス可能
// protected(プロテクテッド)  同一パッケージ・サブクラスからアクセス可能
// 指定なし     protectedと同じ
// private    同一クラスからアクセス可能

//その他の修飾子

//static  クラスから直接呼び出し可能
//abstract  インスタンス不可
//final     上書き可能

//戻り地の方
// void 戻り値なし
// int   数値型
// String 文字列型

//メソッド名

// main javaのコードに必ず必要

// 引数の型
// (String[] args)が一般的
