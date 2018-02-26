
public class Ko extends Player{

	
	public void open(int turnNum){
	
		this.setCards(String.valueOf(this.tefuda[0]));
		for(int i=1; i<=turnNum; i++){
			this.setCards( this.getCards() + " " + String.valueOf(this.tefuda[i]) );
		}
		System.out.println(this.getCards() + ":合計" + this.getSum());
	}

	int check(){

		System.out.println("1:もう一枚　2:終わり");

		int checkNumber = 0;

		while(checkNumber > 0 && checkNumber < 3){
			new java.util.Scanner(System.in).nextInt();
		}

		return checkNumber;

	}

	void game(){

		int count = this.tefuda[0] + this.tefuda[1];
		this.setCards( String.valueOf(this.tefuda[0]) + " " + String.valueOf(this.tefuda[1]));

		for(int i=2; i<4; i++){

			if(count == this.getSum()){
				break;
			}

			this.setCards( this.getCards() + " " + String.valueOf(this.tefuda[i]));

			count += this.tefuda[i];

		}

		System.out.println(this.getCards() + " :合計" + this.getSum());

	}
	

}