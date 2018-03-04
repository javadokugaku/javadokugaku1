public class Main{
	public static void main(String[] args){
		

		//子を作成
		Ko k1 = new Ko();
		k1.tefuda = new int[4];
		k1.setSum(0);
		k1.setDrowTimes ();
		

		//親を作成
		Dealer d1 = new Dealer();
		d1.tefuda = new int[4];
		d1.setSum(0);
		d1.setDrowTimes();
		d1.drow(0);
		

		//場にカードを出す準備
		int[] ba = new int[5];
		int baOpen = new java.util.Random().nextInt(9);
		String line = "1:" + baOpen;
		ba[0] = baOpen;
		

		//5枚のカードを出す
		for(int i=1; i<5; i++){
		
			ba[i] = new java.util.Random().nextInt(9);
			line = line + " " + ( i + 1 ) + ":" + ba[i];

		}
		
		
		System.out.println("");
		System.out.println(d1.tefuda[0]);
		System.out.println("");
		System.out.println(line);
		System.out.println("プレイするカードの番号を入力しエンターを押して下さい");


		int selectNum = 0;


		//カードの番号を受け付ける(1～5が入力されるまで繰り返し)
		do{

			selectNum = new java.util.Scanner(System.in).nextInt();

		}while( !(selectNum>0 && selectNum<6) );


		//選択されたカードを子の手札とする
		k1.tefuda[0] = ba[selectNum - 1];
		k1.setSum(k1.tefuda[0]);


		//子と親がそれぞれカードを引く
		k1.drow(1);
		d1.secoundDrow();
		

		System.out.println("");
		System.out.println(k1.tefuda[0] + " " + k1.tefuda[1] + " :合計" + k1.getSum());
		System.out.println("");


		boolean boo = true;
		int into = 0;


		for(int i=2; i<4; i++){

			//カードを引くか確認
			if(boo){

				into = k1.check();

			}			
			

			//1が入力されたら1枚引く、それ以外は引かない
			if(into == 1){

				k1.drow(i);
				d1.check(i);
				d1.open(i);
				System.out.println("");
				k1.open(i);
				System.out.println("");

			}else{

				boo = false;
			}

		}

		
		//勝ち負けを決める
		d1.game();
		System.out.println("");
		k1.game();
		System.out.println("");

		if(k1.getSum() > d1.getSum()){

			System.out.println("You Win!!");

		}else{

			System.out.println("You Lose");

		}

	}
	

}