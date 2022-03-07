package JavaPractice;

public class studynote {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}


							//学習メモ//
/*Java言語とは
 * オブジェクト指向の言語。ソースコードはJavaバイトコードにコンパイルされ、JVM（Java仮想マシン）
 * 上で動く。
 * JavaSE,JavaME,JakartaEEの3つのエディションがある。
 * EclipseはIDEでありコンパイルエラーも表示してくれる。
 */

/*一般的な作成手順
 * プロジェクトの作成
 * プロジェクトの中に機能別に複数のパッケージを作成する
 * パッケージの中にクラスファイル（ソースプログラム）を作成する
 * （クラス名は必ず最初を大文字にする）
 * プログラムに具体的な処理を記述する
 */

/*プログラム作成時の注意点
 * 英文字・記号は半角
 * 末尾にセミコロン;を忘れずに
 * コンパイラーエラーがあると赤いマークや波線が表示される
 * マークや波線の箇所にマウスポインタを置くとエラー表示される
 * 訂正したら必ず保存すること。
 */



/*『変数とリテラル（値)』　
 * 	　　変数：データ（リテラル、値）の入れ物（変数）に入れておく
 * 		値の種類に応じて、タイプ（型）を宣言する
 * 		(ex) name=String
 * 
 *	　①Javaの基本型（プリミティブタイプ）について
 *  	整数・実数・文字・真偽値
 *  	（整数型）
 *  		byte(8bit),short(16bit),(※)int(32bit),long(64bit)
 *  	（実数）
 *  		float(32bit),(※)double(64bit) (ex)8進数は0256,16進数は0xBF
 *  	（文字）
 * 			cahr(16bitのサイズ（１文字）)
 * 			(ex)'か'、'3'
 * 			（※）Stringは型ではなくクラス（1文字文のデータを格納）
 * 		（真偽値boolean）
 * 			boolean 8bit(true or false)で状態を表すのに使う
 * 			(ex)Webアプリにログインしてるかどうか？
 *  　②変数にどんな値が入るのか？リテラル（値の導入）について
 *      ＝で変数名と、代入したい値をつなぐ
 *     		(ex)heightという変数と繋ぎ、1.8という実数をいれる
 *      	double height ＝　1.8;
 *  
 *『Javaのコーティング規約』
 *　　　クラス名はSampleApp　のような書き方が正しい。
 *		メソッドメイ・変数メイは『先頭は小文字』getValue
 *		定数名は全て大文字!　FLAG_ON
 *
 *『代入演算子について』
 *　左右は同じ結果という意味（左のほうがシンプル）
 *		(ex) X= X+Y(XにXとYを足した値を代入するという意味)これは　X += Yとすることも可能
 *　　　(ex)同様にX= X-Yなら X -= Y
 *      (ex)同様にX= X*Yなら X *= Y
 *      (ex)同様にX= X%Y(Xを割った余りをXに代入するという意味)ならX %= Y
 *      
 * 『ソースコードではなくキーボードからの入力処理を追加しよう』
 *    (ex)『キーボードからの入力値を元にBMI計算する』
 *   （流れ） System.in（標準入力ストリーム→stdInput(インスタンス）→nextInt()メソッド→heightなどの変数へ格納
 *   	・JDKに含まれてるjava.utilパッケージのScannerクラスを使用。
 *   	・クラスのインポートは、import java.util.Scanner　というパッケージのインポート宣言
 * 『System.out.println』とは？
 *  →『システムストリームに文字列を表示するメソッド!!』
 * 
 * 『インクリメント・デクリメント演算子』
 * 　・１増やす、１減らす
 * 　・【使用用途】回数を数えるプログラムで使用されるぞ
 * 			(ex) ++Xパターン　Y = ++X (これは、Xを１つ増やしてから、YにXを代入)
 * 		   （ex）X++パターン　Y = X++ (これは、YにXを代入してから、Xを一つ増やす)
 * 			(ex) --Xパターン　Y = --X (これは、Xを１つ減らしてから、YにXを代入)
 * 			(ex) X--パターン　Y = X++ (これは、YにXを代入してから、Xを一つ減らす)
 * 
 * 『比較演算子』
 * 　・条件によって処理を分岐したい場合
 * 　・式が成立すればtrue。しなければfalse
 *   （ex）『コンビニレジでアルコール販売』
 *          『２０歳以上ですか？』 if(age >= 20)
 *          yesボタンなら清算、noボタンなら清算できない
 *          
 *   （種類まとめ）
 * 		・X == Y　XとYが等しい
 *  	・X!= Y　 XはYとは異なる
 *  	・X > Y　 XがYより大きい
 *      ・X > = Y Xはと等しいかそれ以上
 *      ・X < Y   XはYより小さい  
 *  
 *  『論理演算子』
 *  　・複数の条件を組み合わせる場合に使用
 *  　（ex）100までの2と3の公倍数（共通の倍数）を表示するプログラムは？
 *  　　　　(ポイント①)(2の倍数かどうか)AND(3の倍数かどうか)
 *  	   （ポイント②）ともにtrue(正しい)なら、条件式はtrue > で表示する
 *  　　つまり、
 *  　　　　(ifi%2 == 0)&&(ifi%3 == 0){
 *              (表示処理)
 *              }
 *      【論理積】        
 *      X & Y と X && Yの違い
 *      	→X & Y の場合は、最初の式(X9も２番目の式(Y)もどちらも行い結果を判定
 *         　　
 *          →X && Yの場合は、最初の式が『正しい場合のみ』２番目の式の計算お行いそれぞれの結果を比較する  
 * 				・true $$ true => true
 * 				・true $$ false => false
 * 				・false $$ true => false
 * 　　　　　　 ・false $$ false => false
 * 
 * 		【論理和】
 * 		X | Y と X || Yの違い
 * 		  →X | Y の場合は、Xの式またはYの式それぞれで判定。
 * 　　　 →X | Y の場合は、ともにfalseの場合のみFalse
 *				・true || true => true
 * 				・true || false => true
 * 				・false || true => true
 * 　　　　　　 ・false || false => false
 * 
 *  『反転（NOT演算子）』
 *  （使用用途）あるオブジェクトに値が入ってるかどうか、ファイルが存在するか、ある条件を満たしたら
 *  	
 *  		!X
 *  		!true => false
 *  		!false => true
 *  
 *  『Switch文について』
 *  　複数の処理に合わせ条件ごとに異なる処理をする
 *  　　　(ex)6と入れるとJuneと表示される
 *  　　　　　switch(条件:6){
 *  			case value1:
 *  			   (処理1)
 *  			  break;
 *  		 	case value2:
 *  			   (処理2):
 *  			  break;
 *       	・・・・
 *       
 *         default:
 *           (あてはまらない場合の処理）
 *           break;
 *        }
 *  
 *  『配列について』
 *  　・複数の値をまとめて扱う
 *  　・宣言の仕方は2種類ある。
 *  　　　①タイプ[］変数名;
 *  	  ②タイプ 変数[］;
 *  		(ex)
 *  			int[］array;
 *    (配列作成手順)
 *     変数名　＝　new 型名[要素数］
 *    　(ex)product_id = new int[20］
 *   
 *    (配列の宣言と生成を同時に)
 *  　①タイプ[］ 変数名 = new 型名[要素数］
 *  　②タイプ 変数名[］= new 型名[要素数］
 *  　　(ex)int[］array = new int[10］ //10個の整数からなる変数の塊
 *  　　（インデックスは0から始まるのでこの場合は0～9個の値が生成される）
 *  
 *    (配列の宣言と値のセットを同時に)
 *    ①タイプ[］ 変数名 = {value1,value2, ・・};
 *    ②タイプ 変数名[］=  {value1,value2, ・・};
 *      (ex)int[］prime_num = {1,3,5,7,9};　//整数型の配列で要素としては1,3,5,7,9という数字が入ってる。
 *     
 *   （↑の配列から値を取り出し方&配列に値を挿入する方法！）
 *   　（取り出し方）
 *  　🌟インデックスといって何番目の値を取り出すのかを配列の後に記載する!!!
 *  		変数 = 配列[インデックス］ 
 *  　　（値の挿入の仕方）
 *  　🌟配列の中のインデックスの値を指定して、その中に入る値をセットする。
 *  　　　　配列[インデックス］= 値；
 *   
 *  
 *  『コレクションフレームワーク』について
 * 		・ネット記事より学習（参考サイト：https://ittoybox.com/archives/206）
 * 		・コレクションとは複数の要素の集まりのことです。その要素の集まりを扱う機能なのでコレクションフレームワークと言います。
 * 　　   コレクションフレームワークでは複数の要素（データ）を扱うための便利機能を提供します
 * 		・List・Map・Setのそれぞれがある。
 * 
 *  
 *  『変数宣言のバリデーション』
 *  	・int,n ,m ,p; のように同じ型なら複数の変数同時に宣言可能。
 *  	・int n = 10; ｎに１０を代入する。宣言と同時に値を代入することも可能。
 *  	・int n=10, m, p; 複数の宣言で、一部の変数のみを初期化できる。
 *  	・変数名ｈじゃ英小文字を使うのが鉄則
 *  	・異なる型を横並びにするのはNG　int a, double b;←×　int a; double b;←○
 *   	・二つ目以降の変数には型名をつけないint,a ,b;
 *   	・型が違っても同じ名前の変数は使えない。 int a;, double a; ←× 
 *   
 */


