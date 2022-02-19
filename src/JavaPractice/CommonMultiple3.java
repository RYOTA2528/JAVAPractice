package JavaPractice;

public class CommonMultiple3 {

	public static void main(String[] args) {
		// 2と3の公倍数”以外”を表示する（つまり6の倍数を表示しないということ）
		// 初期値は１。
		int i = 1;
		// 【重要】whileで20までの間という使い方ができる
		while(i < 20) {
	    // !()で式全体をくくる。一つでも複数でOK
			if(!((i%2 == 0) && (i % 3 == 0))){
				//NOT演算子の適応例
		// 両方の条件を満たしたら標準出力にその値を表示する
				System.out.println(i);}
			// 処理を終えたら数を一つずつ増やす(インクリメント演算子)
		    i++;
		}

	}

}
