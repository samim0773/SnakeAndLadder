package com.bridgelabz;

public class SnakeLadder {
	public static void main(String[] args) {
		System.out.println("Lets play snake ladder Game");
		
		// start position is zero
		int startPosition = 0;
		
		System.out.println("start position: " + startPosition);
		
		//Random Dice Value btn 1 to 6
		int diceValue=(int) Math.floor((Math.random()*6) + 1);
		
		//check the dice value
		System.out.println(diceValue);
		
		//random number for no play ladder and snake
		int checkOption = (int)(Math.random() * 10) % 3 + 1;
		
		//check the random value
		System.out.println("check "+checkOption);
		
		switch(checkOption) {
			// case for ladder
			case 1:
				startPosition = startPosition + diceValue;
				break;
			// case for snake 
			case 2:
				startPosition = startPosition - diceValue;
				break;
			// case for not playing
			default:
				System.out.println("Player is not playing " + startPosition);
		}
		// check position after player choode a option 
		System.out.println("position after  player choose a option : "+startPosition);
	}
	
	

}
