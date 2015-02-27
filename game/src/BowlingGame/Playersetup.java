package BowlingGame;

import java.util.Scanner;

public class Playersetup {
	
	int player[] = {0,1,2,3,4,5,6};
	Scanner input = new Scanner(System.in);		
	int play = input.nextInt();
	
	
	public int getplayer(){
		if (play > 6){
			play = 0;
		}
		
		return player[play];
		}
	}






