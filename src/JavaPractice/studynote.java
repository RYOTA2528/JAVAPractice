package JavaPractice;

public class studynote {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}


							//学習メモ//
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
 *  反転『NOT演算子』
 *  （使用用途）あるオブジェクトに値が入ってるかどうか、ファイルが存在するか、ある条件を満たしたら
 *  	
 *  		!X
 *  		!true => false
 *  		!false => true
 *  
 *  
 *  『コレクションフレームワーク』について
 * 		・ネット記事より学習（参考サイト：https://ittoybox.com/archives/206）
 * 		・コレクションとは複数の要素の集まりのことです。その要素の集まりを扱う機能なのでコレクションフレームワークと言います。
 * 　　   コレクションフレームワークでは複数の要素（データ）を扱うための便利機能を提供します
 * 		・List・Map・Setのそれぞれがある。
 * 
 *  
 *   
 */


