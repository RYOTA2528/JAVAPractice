package JavaPractice;

//（総括）標準入力（キーボード入力）からif文のよるBMI計算//
	//（作業注意点）Scannerによるキーボード入力のため、数値はコメントアウト

import java.util.Scanner;

public class BmiCalc {
	
	/* BMI(体格指数)を計算するプログラム
	 * BMI = 体重　/ (身長　+  身長）
	 * 体重kg 身長m
	 */
	
	
	public static void main(String[] args) {
		double weight,height,bmi;
		
		//weight = 71;
//		height = 1.8; で行えば下記のまま計算OK　これを代入演算子で考えると
		//height = 180;
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
		/*height = height / 100 と同じ意味（代入演算子）,
		 */
		
		bmi = weight / (height * height);

// BMi指数を出力				
		System.out.println("あなたのBMIは" + bmi + "です。");	
// IF文書き方		
		if (bmi < 18.5) {
			System.out.println("やせ型です");
			
		}else if(bmi < 25) {
			System.out.println("標準です");  
		}else {
			System.out.println("肥満です");
		}
		
	}
	

}
