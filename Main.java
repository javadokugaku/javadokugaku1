public class Main{
	public static void main(String[] args){
		

		//�q���쐬
		Ko k1 = new Ko();
		k1.tefuda = new int[4];
		k1.setSum(0);
		k1.setDrowTimes ();
		

		//�e���쐬
		Dealer d1 = new Dealer();
		d1.tefuda = new int[4];
		d1.setSum(0);
		d1.setDrowTimes();
		d1.drow(0);
		

		//��ɃJ�[�h���o������
		int[] ba = new int[5];
		int baOpen = new java.util.Random().nextInt(9);
		String line = "1:" + baOpen;
		ba[0] = baOpen;
		

		//5���̃J�[�h���o��
		for(int i=1; i<5; i++){
		
			ba[i] = new java.util.Random().nextInt(9);
			line = line + " " + ( i + 1 ) + ":" + ba[i];

		}
		
		
		System.out.println("");
		System.out.println(d1.tefuda[0]);
		System.out.println("");
		System.out.println(line);
		System.out.println("�v���C����J�[�h�̔ԍ�����͂��G���^�[�������ĉ�����");


		int selectNum = 0;


		//�J�[�h�̔ԍ����󂯕t����(1�`5�����͂����܂ŌJ��Ԃ�)
		do{

			selectNum = new java.util.Scanner(System.in).nextInt();

		}while( !(selectNum>0 && selectNum<6) );


		//�I�����ꂽ�J�[�h���q�̎�D�Ƃ���
		k1.tefuda[0] = ba[selectNum - 1];
		k1.setSum(k1.tefuda[0]);


		//�q�Ɛe�����ꂼ��J�[�h������
		k1.drow(1);
		d1.secoundDrow();
		

		System.out.println("");
		System.out.println(k1.tefuda[0] + " " + k1.tefuda[1] + " :���v" + k1.getSum());
		System.out.println("");


		boolean boo = true;
		int into = 0;


		for(int i=2; i<4; i++){

			//�J�[�h���������m�F
			if(boo){

				into = k1.check();

			}			
			

			//1�����͂��ꂽ��1�������A����ȊO�͈����Ȃ�
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

		
		//�������������߂�
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