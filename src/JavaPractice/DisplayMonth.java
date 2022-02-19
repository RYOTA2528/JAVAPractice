package JavaPractice;

public class DisplayMonth {

	public static void main(String[] args) {
		// 数字を月に変えるプログラム
		int month = 2;  //実践を想定するとここはスマホのタッチした番号など
		switch(month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		default: //【重要】defaultで条件に当てはまるものを表示させる
			break;
		}
	

	}

}
