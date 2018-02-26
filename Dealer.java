
public class Dealer extends Player{

	private int secoundCard;


	public void open(int turnNum){
	
		for(int i=2; i<=getDrowTimes()-1; i++){
			this.setCards(this.getCards() + " " + String.valueOf(this.tefuda[i]));
		}

		System.out.print(this.getCards() + " ");
		System.out.println(":‡Œv" + this.getSum());

	}

	void secoundDrow(){
				 
		this.secoundCard = new java.util.Random().nextInt(9);

		this.setDrowTimes();

		this.setCards(this.tefuda[0] + " X");

		System.out.print(this.getCards() + " ");
		System.out.println(":‡Œv" + this.getSum());	

	}

	void check(int turn){

		int checkSum = this.getSum() + secoundCard;

		if(checkSum >= 10){
			checkSum -= 10;
		}

		if(checkSum < 6){

			drow(turn);

		}

	}

	void game(){

		this.setSum(secoundCard);

		if(getSum() >= 10){
			setSum(-10);
		}

		int count = this.tefuda[0] + this.secoundCard;
		this.setCards(String.valueOf(this.tefuda[0]) + " " + String.valueOf(this.secoundCard));

		for(int i = 2; i < this.getDrowTimes() - 1; i++){

			this.setCards(this.getCards() + " " + String.valueOf(this.tefuda[i]));

			count += this.tefuda[i];

		}

		System.out.println(this.getCards() + " :‡Œv" + this.getSum());

	}

}