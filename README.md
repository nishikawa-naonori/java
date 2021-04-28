# System.out.println     システムプリントライン
  コンソールに値を表示させる。

# public  パブリック
・アクセス修飾子の一つ
・他のクラスからアクセス可能

# protected(プロテクテッド)
・アクセス修飾子の一つ
・同一パッケージ・サブクラスからアクセス可能

# private(プライベート)
・アクセス修飾子の一つ
・同一クラスからアクセス可能


# new
インスタンス化を行う際に使われる

# Scanner
キーボードから入力された文字列や数値を受け取ってプログラムの中で処理するときに使用する

## next
スキャナに接続されている入力ストリームから次の文字列を受けとる。

# nextLine()

# InputMismatchException()

# import
java.time.LocalDate;   → 現在日付の取得
java.util.Scanner;     → 入力した値を取得する

java.io.*;          システム入出力に使うクラス、インターフェース等が提供されているパッケージ。
                    パッケージを利用して、ファイルからのデータ読み込みや、ファイルへの書き出し等の入出力処理を実装する


IOException           入出力処理中の例外を管理するクラス


# for

for( int i = 0 ; i < size ; i++ )

最初に一回目はiは加算しない 二回目から加算
一番上の時にiが3だったら以下の処理はしない



//その他の修飾子

//static  クラスから直接呼び出し可能
          インスタンスを生成しなくても呼び出せるってこと
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
ユーザー新規登録の単体テストコマンド

```ruby
bundle exec rspec spec/models/user_spec.rb
```

## ユーザー新規登録の結合テストコマンド

```ruby
bundle exec rspec spec/system/users_spec.rb
```