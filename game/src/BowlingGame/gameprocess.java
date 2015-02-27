package BowlingGame;

import java.util.Scanner;

public class gameprocess {

	
	
	
	
	//// copy//paste  ///
	int frameno = 0;
	///////// scores ////////
	int frameScore = 0;								// create overall frame score int//
	int prevBonus = 0;
	int totalScore = 0;								// create total game score int //
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	boolean tenthFrameStrike = false;				// roll 3 variable only available on tenth frame declared as false //
	int tenthFrameRoll2 = 0;						// int for second roll in tenth frame if first was a strike// 
	boolean tenthFrameThirdRoll = false;			// last frame if roll1 & 2 are strikes //
	int tFlastRollScore = 0;						// int for last roll //								
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	boolean spare = false;							// declare spare as a boolean variable starting at false//
	boolean strike = false;							// declare strike as a boolean variable starting at false//
	boolean secondStrike = false;
	boolean tenframeStrikeBonus = false;
	
	void game(){
/////// FRAME LOOP START //////////
	for (int f = 1; f < 11; f++){					// construct for loop to loop though frames // // f = frame no starting on 1, if f is lower than 11 use loop, frame increment by 1 //
		System.out.println("Frame Number = " + f);	// print which is current frame //
		System.out.println(" " );
		
		frameno = f;
	/////// KEYBOARD INPUT //////////
	Scanner input = new Scanner(System.in);			// construct scanner type in game//
	int r1 = input.nextInt();						// declare scanner as int value//
	int r2 = 0;	
	int bonus = 0;									// declare bonus variable o keep track of extra points throughout loop//
	boolean strikeRun = false;
	
	
	//for (int p = 1 ; p < 6; p++ ){
	
	
	
	
	//////// ROLL 1 = FALSE /////////
	if (r1 > 10){									// if roll 1 is more than 10, this isnt possible, re-roll! //
		System.out.println(" Stop cheating! roll again!! ");
		r1 = input.nextInt();
		
	}
	/////// if frame 9 is a strike boolean /////
	if (f == 9 && r1 == 10){
		tenframeStrikeBonus = true;
		
	}
	///////// two strikes in a row////////
	if ( strike == true && secondStrike == false && r1 == 10){							// if strike boolean is still true, last frame was 10 //
		bonus = 10 ;
		secondStrike = true;
		prevBonus = 10;
		System.out.println(" second strike! ");
		System.out.println(" bonus = " + bonus);
		System.out.println(" prevbonus = " + prevBonus);
		strike = false;
	}
	//////// 3 strikes in a row but next is not ////
	if ( strike == true && secondStrike == true && r1 == 10){
		bonus =  r1 + prevBonus + bonus ;
		strikeRun = true;	
		System.out.println(" 3rd strike found ");
		System.out.println(" bonus = " + bonus);
		System.out.println(" prevbonus = " + prevBonus);
		strike = false;
		}
	////////second STRIKE BUT third roll NOT STRIKE //////
	if( strike == true && secondStrike == true && r1 < 10){																		
		System.out.println(" strike run now normal roll " );
		System.out.println(" bonus  = " + bonus);	// print bonus points //
		System.out.println(" ");
		secondStrike = false;
		strikeRun = true;
	}
	//////// SPARE POINTS /////////
	if(spare == true){								// if statement - if spare boolean value is true, do this //
		bonus =  r1;								// bonus is equal to the next roll 1 // 
		spare = false;								// set spare back to false until next time spare frame occurs//
		System.out.println(" bonus  = " + bonus);	// print what the extra points will be //
		System.out.println(" ");
	}
	////////STRIKE RECOG /////////
	if (r1 == 10) {									// if statement if first roll hits all pins//
		System.out.println(" STRIKEEEEEE!!!! ");	// print recognition of this //
		System.out.println("  ");
		strike = true;								// strike has been recognized set boolean value to true //	
	}
	////// ROLL 1 SCORE ///////////
	frameScore =  r1 + bonus;				// work out first roll// 
	System.out.println(" Roll 1 Score = " + r1);	// print results//
	System.out.println("  ");
	
	////////GUTTERBALL ////////
	if (r1 == 0) {									// if statement if first roll hits no pins//
		System.out.println(" GutterBall!! "); // print recognition of this//
	}	
	/////// NEXT ROLL INPUT ///////										
	if ( r1 < 10) { 
		r2= input.nextInt(); 			// if r1 is lower than 10 (not a strike) then take r2 input//
		System.out.println(" Roll 2 score = " + r2);	// print out results of roll2 and frame below//
		System.out.println("  ");	
	}
	///// IF BOTH ROLLS OVER 10 //////
	if (r1 + r2 > 10){								// if r1 & r2 = over 10 points, invalid score, add roll 2 again ///
		System.out.println(" Invalid score, frame cannot be more than 10 ");
		r1 = 0;
		r2 = 0;
		f--;
		
	}		
	//////// SPARE RECOG//////////
	if (r1 < 10 && r1 + r2 == 10) {					// if roll 1 is less than 10 & roll 1 + roll 2 = 10 its a spare//
		System.out.println(" SPAREEEE!!! ");		// recognize spare // not happy that i have to spell it with a z! //			
		System.out.println("  ");
		spare = true;								// spare has been recognized so change boolean value to true //				
	}
	//////// GUTTER FRAME //////////
	if (r1 + r2 == 0) {												// if both rolls miss all pins // 
		System.out.println(" Seriously....Practice more!! ");	// show reconition of no pins hit in frame//
	}
	// strike run //// 
	if (strike == true && secondStrike == true && r1  < 10){
		bonus = r1 * 3  + r2;
		strikeRun = false;
		secondStrike = false;
		strike = false;
	}
	//////// STRIKE BUT SECOND FRAME NOT STRIKE //////
	if(strike == true && r1 < 10){					// if strike value is true, this put after first roll so it knows if r1 was equal to 10 thus true //
		if(strikeRun == true){
			bonus = r1 * 2 + r2;
			strikeRun = false;
			strike = false;
		}
		else{
			bonus =  r1 + r2;							// bonus then equals the sum of the next two rolls //
		strike = false;								// set strike back to false //
		System.out.println(" bonus  = " + bonus);	// print bonus points //
		System.out.println(" ");
	}
	}
	
	//////// TENTH FRAME PROCESS ///////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	////// STRIKE ON ROLL OF TENTH FRAME RECOGNITION //////
	if (f==10 && r1 == 10){											// if on frame 10 & first roll was a 10, you get a 3rd roll //
		tenthFrameStrike = true;
		//bonus = bonus + prevBonus + tenthFrameRoll2;
		System.out.println(" strike on tenth frame! nice work ! roll again! ");
		
	}
	
	////// PROCESS 10TH FRAME STRIKE ADD 2ND/3RD ROLL //////
	if ( f == 10 && tenthFrameStrike == true){						// if on frame 10 and 3rd roll is true roll again and print // 
		
		tenthFrameRoll2 = input.nextInt();
		tenthFrameThirdRoll = true;
		System.out.println(" score from second roll was " + tenthFrameRoll2);
		System.out.println(" ");
	}
	
	////////SPARE ON LAST FRAME RECOGNITION /////
	if (f == 10 && r1 + r2 == 10 && r1 < 10){						// if on frame 10 and both roll = 10 but first was not a strike give extra shot for the spare //
		System.out.println( "extra roll for the spare in the last frame.... go on then " );
		System.out.println(" ");
		tenthFrameThirdRoll = true;	
	}
	///////// STRIKE ON ROLL 1 & 2 OF 10TH FRAME /////
	if (f == 10 && tenthFrameRoll2 == 10){							// if on frame 10 and 2nd roll was 10 (two strike in a row) last roll is true)
		tenthFrameThirdRoll = true;
		System.out.println(" Another strike! your on form! last roll! make it count! ");
		System.out.println(" ");
	}
	
	////////// ROLL 2 10TH FRAME IS OVER 10 ///// 
	if (f == 10 && tenthFrameRoll2 > 10){							// if were on the tenth frame and the second roll is over 10, invalid score; re-roll //
		
		System.out.println("false frame");				// acknowledge false score //
		tenthFrameRoll2 = input.nextInt();							// re-roll //
		System.out.println(" roll 2 f10 = " + tenthFrameRoll2);		// print score // 
	
	}		
	
	//////// if 9th frame is a strike 10th frame 2nd roll is bonus ////
	if (f == 10 && tenframeStrikeBonus == true){
		
		tenthFrameRoll2 = tenthFrameRoll2 * 2;
		tenframeStrikeBonus = false;
	}		

	/////// PROCESS POINTS FOR 10TH FRAME 3RD ROLL /////
	if (f == 10 && tenthFrameThirdRoll == true){					// if on frame 10 and last roll is true take last input and print  //
		tFlastRollScore = input.nextInt();
		
		System.out.println(" score from last roll = " + tFlastRollScore);
		System.out.println(" ");
		System.out.println(bonus);
		///// Nested if statement : if 3 strikes in a row acknowledge awesomness!/////
		if(tFlastRollScore == 10){
			//bonus = r1 + tenthFrameRoll2 + tFlastRollScore;
			System.out.println(" 3 strikes in a row! your a pro! ");
			System.out.println(" ");
			System.out.println(bonus);
		}
	}
	////// ROLL 3 IN FRAME 10 IS FALSE 
	if (tFlastRollScore > 10){										// if lucky enough to get to 3rd roll on tenth frame, check that roll is not over 10 ///
		
		System.out.println("false frame is active");				// if roll is over 10, acknowledge false roll //
		tFlastRollScore = input.nextInt();							// re-roll 3rd roll //
		System.out.println(" Final roll = " + tFlastRollScore);		// print score // 
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
	///////// FRAME SCORE ///////////
	
	
	frameScore = r1 + r2 + bonus + tenthFrameRoll2 + tFlastRollScore;		// work out overall frame score//
	System.out.println(" " );	
	System.out.println(" frame score = " + frameScore);		
	////////// TOTAL GAME SCORE ////////
	totalScore = frameScore + totalScore;									// work out total score by adding frame score to total int //
	System.out.println(" Total score = " + totalScore);
	System.out.println(" " );
	
	
	
/////// FRAME LOOP END //////////
	}
	
	if(totalScore == 0){													// print perfect game if strikes on all frames// 
		System.out.println( " Gutter Game!! Blame it on the egg shaped balls!!! ");
	}
	
	if(totalScore == 300){													// print perfect game if strikes on all frames// 
		System.out.println( " Perfect gam!! Awesomeness!!! ");
	}
	
	System.out.println(" Game Over!!! ");
	
///// copy / past //////	
}

	void totalScore(){
		
		int fs;
		fs = totalScore;
		System.out.println(fs);
	}
	//void frameNum(){
		
	//	int fn;
	//	fn = frameno;
	//	System.out.println(fn);
		
	//}
	
	public int getframeno(){
		int fn;
		fn = frameno;
		return frameno;
		
	}
	
}
