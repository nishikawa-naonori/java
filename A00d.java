class A00b {
  public static void main(String[] args) {
    double rand = Math.random() * 55 + 44;
    int number = (int)rand;
    System.out.println("サイコロの目は" + number + "です");
  }
}

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
