package JavaPractice;

public class MathMethod {

	public static void main(String[] args) {
		// 2.0の平方根を求める計算
			double x = Math.sqrt(2.0); //()の中に指定した値の平方根を返す。
			System.out.println("2.0の平方根=" + x);
			
		// 最小値・最大値を求めるメソッド
			double y = Math.min(50.5,20.5);
			System.out.println("2値のうち最小値=" + y);
			
			double z = Math.max(50.5,20.5);
			System.out.println("2値のうち最小値=" + z);
			
		
		// べき乗、aのb乗を返すメソッド
			double a = Math.pow(10,3);
			System.out.println("10の3乗は=" + a);
			
		// 値をランダムに出すメソッド
			double b =Math.random();
			System.out.println("0.0以上で1.0より小さい値をランダムに返します=" + b);
			
		// 絶対値を返すメソッド
			double c = Math.abs(20);
			System.out.println("絶対値は=" + c);
			
		// 最も近いlongの値を返す（四捨五入のメソッド）
			double d = Math.round(104444.67965896);
			System.out.println("四捨五入した結果=" + d);
			
		//(引数に変数・式を使用した例)
			double e =2, f=7;
			double g =Math.pow(e,f+1);   // 2の8乗を計算
			System.out.println("2の8乗は=" + g);
			
		// 式の簡略の仕方
			// double x = Math.pow(2,8);
			// System.out.println(x);
			   //↑の式を一つにまとめると
			System.out.println(Math.pow(2,8));
			
			System.out.println( Math.min(50.5,20.5));
					
			
			
			
	}

}


// sqrtメソッドは値を受け取って、その平方根を計算して返す。　
// double sqrt(double a) ---引数aの平方根を返す。（）の中身が引数で左側のdoubleが戻り値。

//【重要】このような表し方をＡＰＩという。
     //名前：Mathクラスのsqrtメソッド,機能:引数aの平方根を返す。引数:double型の引数が１つある。戻り値型:戻り値はdouble型。