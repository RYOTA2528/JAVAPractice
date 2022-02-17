package JavaPractice;

public class CommonMultiple {

	public static void main(String[] args) {
		// 1から100以下の２と３の公倍数を出力する公倍数を書く
		// 初期値は１。
		int i = 1;
		// 【重要】whileで100までの間という使い方ができる
		while(i < 100) {
			if((i%2 == 0) && (i % 3 == 0)){
				//論理演算子
		// 両方の条件を満たしたら標準出力にその値を表示する
				System.out.println(i);}
			// 処理を終えたら数を一つずつ増やす(インクリメント演算子)
		    i++;
		}

	}

}
