package JavaPractice;

import lib.Input;  //インポート文
public class InputMethod {
	public static void main(String[] args) {
		// inputクラスの使い方(ex9正方形の面積
		double x =Input.getDouble();  //１辺の長さを入力して、xに受け取る,getDoubleとすることで、double型の値を入力できる。
		double s = Math.pow(x, 2);  //xを2乗して面積を計算する
		System.out.println("正方形の面積" + s);
		
		double y = Input.getDouble();
		double z = Math.sqrt(y);
		System.out.println("平方根＝" + z);
		

	}

}


//【重要】inputはScannerクラスと似てる。キーボード入力を可能にする。Scannerクラスの場合は、クラスメソッドがなく直感的な感覚がつかみにくい。
    // インポート文によりlibパッケージからinputクラスを引っ張ってこれてる。
	// クラスメソッドなので使い方はMathクラスと同じで、Input.getDouble()のように、クラス名.メソッド名の形で使える。getDoubleではdouble型の値を入力できる。