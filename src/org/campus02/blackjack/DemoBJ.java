package org.campus02.blackjack;

public class DemoBJ {

	public static void main(String[] args) {
		
		Blackjack bj = new Blackjack();
		
		Player p1 = new Player("Dominik", 24);
		Player p2 = new Player("David", 38);
		Player p3 = new Player("Stefan", 28);
		
		//Spieler adden
		System.out.println("Added " + p1 + "?" + bj.add(p1));
		System.out.println("Added " + p2 + "?" + bj.add(p2));
		System.out.println("Added " + p3 + "?" + bj.add(p3));
		
		//Readden von SPieler2 sollte nicht gehen...
		System.out.println("Added " + p2 + "?" + bj.add(p2));
		

	}

}
