package BowlingGame;

import java.util.Scanner;	//import scanner for key input//

public class Game extends gameprocess {
	public static void main(String Bowling[]) {

		for(int i=0; i<1; i++){
		
		Scanner namesetup = new Scanner(System.in);
		Scanner replay = new Scanner(System.in);
		
		String p1Name;
		String p2Name;
		String p3Name;
		String p4Name;
		String p5Name;
		String p6Name;
		
		int aop;
		
			
		
		gameprocess p1;
		gameprocess p2;
		gameprocess p3;
		gameprocess p4;
		gameprocess p5;
		gameprocess p6;
		p1 = new gameprocess();
		p2 = new gameprocess();
		p3 = new gameprocess();
		p4 = new gameprocess();
		p5 = new gameprocess();
		p6 = new gameprocess();
		
		System.out.println(" WELCOME TO BOWLING! ");
		System.out.println(" ");
		System.out.println(" Choose amount of players ");
		Playersetup ps = new Playersetup();				//define link to player setup class in man void//
		System.out.println(" Amount of players chosen " + ps.getplayer()); // print amount of players chosen in player setup //
		System.out.println("  ");
	
		aop = ps.getplayer();
		
		System.out.println("  ");
		
		if (aop == 1){
			
			System.out.println(" Enter Player1 Name ");
			p1Name = namesetup.next();
			System.out.println(" Welcome " + p1Name);
			System.out.println("  ");
			
			System.out.println("  ");
			System.out.println(" Your up " + p1Name);
			System.out.println("  ");
			
			
			
			p1.game();
			
			
			System.out.println(p1Name + " Final Score  ");
			p1.totalScore();
			System.out.println("  ");
		}
		
		if (aop == 2){
			
			System.out.println(" Enter Player1 Name ");
			p1Name = namesetup.next();
			System.out.println(" Enter Player2 Name ");
			p2Name = namesetup.next();
			System.out.println(" Welcome " + p1Name + " & " + p2Name);
			System.out.println("  ");
			
			System.out.println("  ");
			
			
			System.out.println(" Your up " + p1Name);
			System.out.println("  ");
			p1.game();
			System.out.println("  ");
			System.out.println("  ");
			
			System.out.println(" Your up " + p2Name);
			System.out.println("  ");
			
			p2.game();
			
			System.out.println(p1Name + " Final Score  ");
			p1.totalScore();
			System.out.println("  ");
			System.out.println(p2Name + " Final Score  ");
			p2.totalScore();
			System.out.println("  ");
		}
		
		if (aop == 3){
			
			System.out.println(" Enter Player1 Name ");
			p1Name = namesetup.next();
			System.out.println(" Enter Player2 Name ");
			p2Name = namesetup.next();
			System.out.println(" Enter Player3 Name ");
			p3Name = namesetup.next();
			System.out.println(" Welcome " + p1Name + " , " + p2Name + " & " + p3Name);
			System.out.println("  ");
			
			
			System.out.println(" Your up " + p1Name);
			System.out.println("  ");
			p1.game();
			
			
			System.out.println(" Your up " + p2Name);
			System.out.println("  ");
			
			p2.game();
			System.out.println("  ");
			System.out.println("  ");
			
			System.out.println(" Your up " + p3Name);
			System.out.println("  ");
			
			p3.game();
			System.out.println("  ");
			System.out.println("  ");
			
			System.out.println(p1Name + " Final Score  ");
			p1.totalScore();
			System.out.println("  ");
			System.out.println(p2Name + " Final Score  ");
			p2.totalScore();	
			System.out.println("  ");
			System.out.println(p3Name + " Final Score  ");
			p3.totalScore();
			System.out.println("  ");
			
		}
		
		if (aop == 4){
			
			System.out.println(" Enter Player1 Name ");
			p1Name = namesetup.next();
			System.out.println(" Enter Player2 Name ");
			p2Name = namesetup.next();
			System.out.println(" Enter Player3 Name ");
			p3Name = namesetup.next();
			System.out.println(" Enter Player4 Name ");
			p4Name = namesetup.next();
			System.out.println(" Welcome " + p1Name + " , " + p2Name + " , " + p3Name + " & " + p4Name);
			System.out.println("  ");
			
			System.out.println(" Your up " + p1Name);
			System.out.println("  ");
			p1.game();
			
			System.out.println("  ");
			System.out.println("  ");
			
			System.out.println(" Your up " + p2Name);
			System.out.println("  ");
			p2.game();
			
			System.out.println("  ");
			System.out.println("  ");
			
			System.out.println(" Your up " + p3Name);
			System.out.println("  ");
			p3.game();
			
			System.out.println("  ");
			System.out.println("  ");
			
			System.out.println(" Your up " + p4Name);
			System.out.println("  ");
			p4.game();
			
			
			System.out.println(p1Name + " Final Score  ");
			p1.totalScore();
			System.out.println("  ");
			System.out.println(p2Name + " Final Score  ");
			p2.totalScore();	
			System.out.println("  ");
			System.out.println(p3Name + " Final Score  ");
			p3.totalScore();
			System.out.println("  ");
			System.out.println(p4Name + " Final Score  ");
			p4.totalScore();	
			System.out.println("  ");
			
		}
		
		if (aop == 5){
			
			System.out.println(" Enter Player1 Name ");
			p1Name = namesetup.next();
			System.out.println(" Enter Player2 Name ");
			p2Name = namesetup.next();
			System.out.println(" Enter Player3 Name ");
			p3Name = namesetup.next();
			System.out.println(" Enter Player4 Name ");
			p4Name = namesetup.next();
			System.out.println(" Enter Player5 Name ");
			p5Name = namesetup.next();
			System.out.println(" Welcome " + p1Name + " , " + p2Name + " , " + p3Name + " , " + p4Name + " & " + p5Name);
			System.out.println("  ");
			
			System.out.println(" Your up " + p1Name);
			System.out.println("  ");
			p1.game();
			System.out.println("  ");
			System.out.println("  ");
			
			System.out.println(" Your up " + p2Name);
			System.out.println("  ");
			p2.game();
			System.out.println("  ");
			System.out.println("  ");
			
			System.out.println(" Your up " + p3Name);
			System.out.println("  ");
			p3.game();
			
			System.out.println("  ");
			System.out.println("  ");
			
			System.out.println(" Your up " + p4Name);
			System.out.println("  ");
			p4.game();
			
			System.out.println("  ");
			System.out.println("  ");
			
			System.out.println(" Your up " + p5Name);
			System.out.println("  ");
			p5.game();
			
			
			System.out.println(p1Name + " Final Score ");
			p1.totalScore();
			System.out.println("  ");
			System.out.println(p2Name + " Final Score ");
			p2.totalScore();	
			System.out.println("  ");
			System.out.println(p3Name + " Final Score ");
			p3.totalScore();
			System.out.println("  ");
			System.out.println(p4Name + " Final Score ");
			p4.totalScore();	
			System.out.println("  ");
			System.out.println(p5Name + " Final Score ");
			p5.totalScore();
			System.out.println("  ");
			
			
			
		}
		
		if (aop == 6){
			
			System.out.println(" Enter Player1 Name ");
			p1Name = namesetup.next();
			System.out.println(" Enter Player2 Name ");
			p2Name = namesetup.next();
			System.out.println(" Enter Player3 Name ");
			p3Name = namesetup.next();
			System.out.println(" Enter Player4 Name ");
			p4Name = namesetup.next();
			System.out.println(" Enter Player5 Name ");
			p5Name = namesetup.next();
			System.out.println(" Enter Player6 Name ");
			p6Name = namesetup.next();
			System.out.println(" Welcome " + p1Name + " , " + p2Name + " , " + p3Name + " , " + p4Name + " , " + p5Name + " & " + p6Name);
			System.out.println("  ");
			
			
			System.out.println("  ");
			System.out.println("  ");
			
			System.out.println(" Your up " + p1Name);
			System.out.println("  ");
			p1.game();
			System.out.println("  ");
			System.out.println("  ");
			
			System.out.println(" Your up " + p2Name);
			System.out.println("  ");
			p2.game();
			System.out.println("  ");
			System.out.println("  ");
			
			System.out.println(" Your up " + p3Name);
			System.out.println("  ");
			p3.game();
			System.out.println("  ");
			System.out.println("  ");
			
			System.out.println(" Your up " + p4Name);
			System.out.println("  ");
			p4.game();
			System.out.println("  ");
			System.out.println("  ");
			
			System.out.println(" Your up " + p5Name);
			System.out.println("  ");
			p5.game();
			System.out.println("  ");
			System.out.println("  ");
			
			System.out.println(" Your up " + p6Name);
			System.out.println("  ");
			p6.game();
			
			
			System.out.println(p1Name + " Final Score ");
			p1.totalScore();
			System.out.println("  ");
			System.out.println(p2Name + " Final Score ");
			p2.totalScore();	
			System.out.println("  ");
			System.out.println(p3Name + " Final Score ");
			p3.totalScore();
			System.out.println("  ");
			System.out.println(p4Name + " Final Score ");
			p4.totalScore();	
			System.out.println("  ");
			System.out.println(p5Name + " Final Score ");
			p5.totalScore();
			System.out.println("  ");
			System.out.println(p6Name + " Final Score ");
			p6.totalScore();	
			System.out.println("  ");
			
			
			
		}
		
	
		
		
		
		
		System.out.println("  ");
		System.out.println(" HOPE YOU HAD FUN SEE YOU SOON :P ");
		
		System.out.println(" Press 1 to Play again! ");
		int y = replay.nextInt();
		if (y == 1){
		i --;
		}

	}
	}
	
}
