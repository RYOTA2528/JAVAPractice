package JavaPractice;

//『重要』java.utilというパッケージの中にある『Scaneerクラスを読み込む』
//Scannerクラスは相手に『キーボード入力させられるようになる』！！
import java.util.Scanner;


public class BmiCalc2 {
	
	/* BMI(体格指数)を計算するプログラム
	 * BMI = 体重　/ (身長　+  身長）
	 * 体重kg 身長m
	 */
	
	
	public static void main(String[] args) {
// 【重要】これは、身長・体重をdouble型で宣言しているという意味。
		double weight,height,bmi;
		
//		weight = 71;
//		height = 1.8; で行えば下記のまま計算OK　これを代入演算子で考えると
//		height = 180;

		//『重要』Scannerクラスで読み込んだ値（stdInという格納インスタンス）を生成.
		// 今回はScannerクラスを生成するため、new Scanner(System.in)とする
		// (System.in)はSystemのinputを使いますよ。という引数のこと
		Scanner stdIn = new Scanner(System.in);
		//システムストリームに文字列を表示する
		System.out.println("体重は？(kg):");
		//double型であったためintではなくnextDoubleというメソッドになる
		weight = stdIn.nextDouble();
		//システムストリームに文字列を表示する
		System.out.println("身長は？(cm):");	
		//double型であったためintではなくnextDoubleというメソッドになる
		height = stdIn.nextDouble();
		
		height  /= 100;
		/*height = height / 100 と同じ意味（代入演算子）。
		 * これでcm計算されるぞ。
		 */
		
		bmi = weight / (height * height);

		//ここで最後にbmiの値を出力する		
		System.out.println("BMI: " + bmi + " です。");		
		
	}
	
	

}
