public class kansuu {

	// 関数
	
	//戻り値の型　関数名　（引数の型　引数１,・・)　｛
	//処理１;
	//処理２;
	//return 戻り値
	
	public static String hello() {
		return "こんにちは";
	}
	
	// 全ての引数を指定するメソッド 
	public static int totalprice(int fruitprice, double tax, int haiso) { 
		return (int) (fruitprice * tax) + haiso; }
	
	// taxを1.08に固定したメソッド 
	public static int totalprice(int fruitprice) { 
		return totalprice(fruitprice, 1.08, 350); 
		// 配送料もデフォルト値として設定 
		}
	
	
	public static void main(String[] args) {
		System.out.println ("山田さん。" + hello());
		System.out.println("<br>");
		System.out.println ("鈴木さん。"+hello());
		System.out.println("<br>");
		System.out.println ("佐藤さん。"+hello());
		System.out.println("<br>");
		
		System.out.println(totalprice(300) + "<br>");
		System.out.println(totalprice(450) + "<br>");
		System.out.println(totalprice(400) + "<br>");
		System.out.println(totalprice(350) + "<br>");
	}
	
	

}
