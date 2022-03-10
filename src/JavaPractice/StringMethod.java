package JavaPractice;

public class StringMethod {

	public static void main(String[] args) {
		// 文字列のメソッドを各種学んでいきます。
		
		// length（）文字数を数える
		int n = "こんにちは!".length(); // nに６が入る
		System.out.println(n);
		// charAt（）（）の中に指定した番号の文字を取り出す
		char ch = "Hello!".charAt(0);
		System.out.println(ch);

		//各種文字列メソッドの紹介//
		
		String str = "abAB日本語abAB"; //対象文字列	
	
		// indexOf() （）の中に指定した文字の番数を取り出す
		int pos = str.indexOf('日'); 
		System.out.println(pos);
		
		// equals(String str) 文字列が別の文字列strと等しい時trueを返す。
		boolean equ = str.equals("abAB日本語abAB");
		System.out.println(equ);
		
		// repeat(int n)その文字列をn個連結した文字列を返す。
		String rep = str.repeat(3);
		System.out.println(rep);
		
		// replace(String a, String b)文字列内のaをbに置き換えた文字列を返す。
		String repl = str.replace("日本語", "英語");
		System.out.println(repl);
		
		// substring(int s, int e)s番目からe-1を取り出した部分文字列を返す。
		String sub = str.substring(1, 3);
		System.out.println(sub);
		
		//toLowerCase()英字を小文字にした文字列を返す。
		String toL = str.toLowerCase();
		System.out.println(toL);
		
		//toLowerCase()英字を大文字にした文字列を返す。
		String toU = str.toUpperCase();
		System.out.println(toU);
		
		//String trim()先頭と末尾の空白を削除した文字列を返す。
		String tri = str.trim();
		System.out.println(tri);
		
		
		

	}

}

//（考え方）
		//文字列はリテラルではなく、オブジェクトのためデータだけではなくメソッドを内蔵している。
		//オブジェクトが内蔵するメソッドをインスタンスメソッドという。
		//文字列リテラルや変数など、それぞれのオブジェクトをインスタンス（実例）と呼ぶ。
