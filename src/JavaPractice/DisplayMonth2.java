package JavaPractice;

public class DisplayMonth2 {

	public static void main(String[] args) {
		// 始めての配列作成！
		String[]month = {"January","February","March","April","May","June","July","August","September","Octorbar","November","December"};
		// 【重要】(int i = 0;i < 12;i++という方法でiは0から12までとなる。++1とforで12まで一つずつ増やす		
		for (int i = 0;i < 12;i++){
			System.out.println(month[i]);
		}
			
	}
	
}