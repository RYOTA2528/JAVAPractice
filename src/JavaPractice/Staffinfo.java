package JavaPractice;

//【重要】Stringの後のフィールドは文字列、intの後のフィールドは数字
// これでStaffというクラスに、名前・ID・メールアドレスを持つ変数の塊を使える
//【重要】余は、Staffの情報を格納したテンプレート
class Staff {
	String name ;
	int sraffid ;  
	String email;
}



public class Staffinfo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//これはyamadaというインスタンス（格納先のこと）
// スタッフのyamadaと宣言したことでその後new Staffで、『新しくyクラスを生成します』という意味
		/*
		 * 	『クラス　変数名　＝　new クラス名（引数）』
		 * クラス　＝　プログラムの部品のテンプレート
		 * インスタンス　＝　テンプレートから作った実際の部品
		 */
		Staff yamada = new Staff();
// ↓でフィールドに値（nameというフィールドにTaro Yamada）を追加した
		yamada.name = "Taro Yamada";
		
		
		System.out.println(yamada.name);

	}

}
