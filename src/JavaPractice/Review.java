package JavaPractice;

public class Review {

	public static void main(String[] args) {
		// printとprintlnの違い
		System.out.println("こんにちは");
		System.out.print("この文章は改行されない");
		System.out.println("この文章は改行されない");
		
		int number;  //必ず変数宣言(型と名前を宣言する)。この場合ｈｓint型変数numberを宣言
		number = 10; //ここがもし小数ならdouble1型でないといけない
		System.out.println(number);
		
		double numbers;
		numbers = 1.1;
		numbers = numbers + 1;
		System.out.println(numbers);
		
		int ken = 10;     //  kenとtanakaとtotalのように複数の値を入れて変数宣言することも可能
		int tanka, total; //　同じ型の変数は１つの宣言文にまとめられる
		
		tanka = 50;
		total = ken * tanka; 
		System.out.println(total);
		
		double x=5, y;
		y = (x + 2) * 3;  //(x + 2.0) * 3.0　のように自動変換機能が設けられる。
		System.out.println(y);
		
		byte byteValue = 120;
		short shortValue;
		int intValue;
		long longValue;
		
		shortValue = byteValue;  
		intValue = shortValue;
		longValue = intValue;
		System.out.println(longValue); //byte→short,short→int,int→longのように『大きな型へは自動変換』される。
		
		char c = 'あ' ; //char型の文字コードは、16ビットなので正の値をのみでかつ範囲は0～65.535です。この範囲の値をいれることができる整数型は『int』と『long』
		
		int n = c;
		long m = c;
		
		double d = c;
		System.out.println(d);
		
		double radius = 12.5;
		double area =  radius * radius * 3.14;
		System.out.print("面積＝");  
		System.out.println(area);   //練習用。円の面積を求める問題。
		
		
	}

}

