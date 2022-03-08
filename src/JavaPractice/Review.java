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
		
		int z = 10;
		++z;    // 復習：インクリメント（１だけ増やす）z=z+1と同じ意味
		--z;   // 復習：　デクリメント（１だけ減らす））z=z-1と同じ意味
		System.out.println(z);
		
		int ans, q;
		
		q=10;
//		ans = ++q;　
		ans =q++; //前置と後置の違いとして、後置の場合はqに１を足す前の値がansに代入される。（つまり10を先に返す）
		System.out.println(q);
		System.out.println(ans);
		
		//文字列型の出力での注意点
		String s1 = 3+ 5+ "こんにちは";
		String s2 =  "こんにちは"+3+5;
	    System.out.println(s1);
	    System.out.println(s2);  //文字列が最初にある時点でこんにちは3 となりそこに+5をしてるのでこんにちは35となる。
	    
	    //キャスト演算子について(小数点を切り捨てたいときに使う)
	    int number1 = (int)10.5;  //プログラマの責任で強制的に型を変換できる。これをキャスト演算子という
	    System.out.println("10.5をint型へキャストした値=" + number1);  //この結果、numberには10.5ではなくintの10だけが表示される。
	    
		
	}

}

