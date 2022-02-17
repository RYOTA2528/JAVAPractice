package JavaPractice;

//【重要】Stringの後のフィールドは文字列、intの後のフィールドは数字
// これでStaffというクラスに、名前・ID・メールアドレスを持つ変数の塊を使える
//【重要】余は、Staffの情報を格納したテンプレート
class Staff {
	String name ;
	int sraffid ;  
	String email;
// sayhelloというメソッドを定義した。
// コンソール処理をclassの中に定義した
//【重要】ここでいうthis=Staffのこと。
	public void sayhello() {
		System.out.println("Hello " + this.name);		
	}
}



public class Staffinfo {
	
//↓がメソッドの定義
	public static void main(String[] args) {
/* 　【アクセス修飾子】
 * public 他のクラスからアクセス可能
 * protected 同一パケット内・継承クラス
 * なし　同一パッケージ（クラス群をまとめたもの。高速化される）のみ
 * 	private 同じクラスないのみ
 * 　【その他修飾子】
 * static クラスから直接呼び出せる（※通常はインスタンスを作成して呼び出すが）
 * abstract 抽象クラス・メソッド
 * final　変更できない・上書きできない
 * 　【返り値のタイプ】
 * 処理結果を返す > 返り値の型を定義 (ex)Stringだと文字列、intだと整数、dubleだと実数
 * 	値を返さない　> 『void』(ex)　”Hello World!!”
 * 　【メソッド名（引数）】
 * メソッドを呼び出すときに、パラメーターを渡す。
 * パラメーター　＝　『引数』(ex)　何らかの数字を渡す。文字列を渡すなど
 * 配列で渡したり、，で区切って渡せば複数渡せる
 * 
 * 　【結論：mainメソッド】
 * 『他のクラスからも呼び出せpublic』『クラスから直接呼び出せstatic』『返り値を持たないvoid』
 * 『argsという配列型の（パラメーター）をもつ』
 */ 
		// TODO 自動生成されたメソッド・スタブ
//これはyamadaというインスタンス（格納先のこと）
// スタッフのyamadaと宣言したことでその後new Staffで、『新しくyクラスを生成します』という意味
		/*
		 * aaa
		 * 	『クラス　変数名　＝　new クラス名（引数）』
		 * クラス　＝　プログラムの部品のテンプレート
		 * インスタンス　＝　テンプレートから作った実際の部品
		 */
		
		//↓でメインのメソッドの中で、Staffクラスの yamadaというオブジェクトを作成した。		
		Staff yamada = new Staff();
// ↓でフィールドに値（nameというフィールドにTaro Yamada）を追加した
		yamada.name = "Taro Yamada";
		
		yamada.sayhello();
		
// 	山田の名前を出力した。
		
//今度はメソッドとしてクラスファイルの中に追加して使用する方法
		// System.out.println(yamada.name);

	}

}
