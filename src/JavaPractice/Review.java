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
		
	}

}

