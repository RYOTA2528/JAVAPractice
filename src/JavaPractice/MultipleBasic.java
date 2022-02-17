package JavaPractice;

public class MultipleBasic {

	public static void main(String[] args) {
		// Q.1から50未満の２の倍数をを出力せよ！
		// 初期値は１。
		int i = 1;
		// 【重要】whileで100までの間という使い方ができる
		while(i < 50) {
			{if(i%2 == 0)
				System.out.println(i);}
			// 処理を終えたら数を一つずつ増やす(インクリメント演算子)
		    i++;
	    }
		
    }


}
