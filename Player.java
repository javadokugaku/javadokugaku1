public abstract class Player{

	int[] tefuda;
	private int sum;
	private int drowTimes;
	private String cards;

	void drow(int turn){

		int drowCard = new java.util.Random().nextInt(9);
		this.tefuda[turn] = drowCard;
		this.sum += drowCard;
		this.drowTimes++;

		if(this.sum >= 10){
			this.sum -= 10;	
		}

	}
		

	public int getSum(){
		return this.sum ;
	}

	public void setSum(int cardNum){
		this.sum += cardNum;
	}

	public int getDrowTimes(){
		return this.drowTimes ;
	}

	public void setDrowTimes(){
		this.drowTimes ++;
	}

	public String getCards(){
		return this.cards;
	}

	public void setCards(String drowNum){
		this.cards = drowNum;
	}



	public abstract void open (int turnNum);
		
}