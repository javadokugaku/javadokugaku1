public class Main{
	public static void main(String[] args){

		Ko k1 = new Ko();
		k1.tefuda = new int[4];
		k1.setSum(0);
		k1.setDrowTimes ();
		
		Dealer d1 = new Dealer();
		d1.tefuda = new int[4];
		d1.setSum(0);
		d1.setDrowTimes();
		d1.drow(0);

		int[] ba = new int[5];
		int baOpen = new java.util.Random().nextInt(9);
		String line = "1:" + baOpen;
		ba[0] = baOpen;
		
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

		while(selectNum>0 && selectNum<6){
			selectNum = new java.util.Scanner(System.in).nextInt();
		}

		k1.tefuda[0] = ba[selectNum - 1];
		k1.setSum(k1.tefuda[0]);


		k1.drow(1);
		d1.secoundDrow();
		
		System.out.println("");
		System.out.println(k1.tefuda[0] + " " + k1.tefuda[1] + " :合計" + k1.getSum());
		System.out.println("");

		boolean boo = true;
		int into = 0;

		for(int i=2; i<4; i++){

			if(boo){

				into = k1.check();

			}			

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