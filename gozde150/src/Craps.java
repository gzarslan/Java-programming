

/**********************************************
 * Workshop 1 (Part2)
 * Course:JAC444 -summer 2021 
 * Last  Name: Arslan
 * First Name: Gozde
 * ID: 150320190
 * Section:NCC
 * This assignment represents my own work in accordance with Seneca Academic Policy.
 * Signature 
 * Date:01/06/2021
 * **********************************************/
		public class Craps {

			public static void main(String [] args) {
				// TODO Auto-generated method stub 
				int dice1;
				int dice2;

				 dice1=(int)(Math.random()*6+1); //roll dice to get random number
			     dice2=(int)(Math.random()*6+1);
			    int sum= dice1 + dice2; //sum of two dice
			    System.out.printf("You rolled \n"+ dice1 +" + " + dice2 + " = " + sum + "\n");


				switch(sum) { //if the sum is 2,3,12
				case 2:
				case 3:
				case 12:
				  System.out.println("Craps, Better Luck Next Time, You Lose the game");
				  return ;
				case 7: //if the sum 7,11
				case 11:
				  System.out.println("Congratulations, You are the Winner");
				  return;
				}
				int point=sum; // the point store the sum
				System.out.printf("Point is (established) set to \n",point);

				do {					
					System.out.printf("You rolled \n"+ dice1 +" + " + dice2 + " = " + sum + "\n");
					if(sum==point) {
						System.out.println("Congratulations, You Win");
						break;
					}
					else if(sum==7) {
						System.out.println("Craps, Better Luck Next Time, You Lose");
						break;
					}

				}while(true);

			}


	}


