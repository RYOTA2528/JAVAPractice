package JavaPractice;

public class BmiCalc {
	
	/* BMI(体格指数)を計算するプログラム
	 * BMI = 体重　/ (身長　+  身長）
	 * 体重kg 身長m
	 */
	
	
	public static void main(String[] args) {
		double weight,height,bmi;
		
		weight = 71;
//		height = 1.8; で行えば下記のまま計算OK　これを代入演算子で考えると
		height = 180;
		height  /= 100;
		/*height = height / 100 と同じ意味（代入演算子）,
		 */
		
		bmi = weight / (height * height);

				
		System.out.println(bmi);		
		
	}
	
	

}
