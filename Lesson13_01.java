class Student {
  String name = "aaa";

  public void calculateAvg(int math,int english) {
    System.out.println((math + english)/2);
    }
  }

  public class Lesson13_01{
    public static void main(String[] args){
    Student a001 = new Student();  //インスタンス化
    //a001.name = "sato";          //フィールドの値を代入 
  // オブジェクト名.フィールド名
    System.out.println(a001.name);
    a001.calculateAvg(90,80);

    Student a002 = new Student(); 
    a002.name = "suzuki"; 
    System.out.println(a002.name);
    a002.calculateAvg(80,70);
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
