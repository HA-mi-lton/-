package sugoroku_game;

import java.util.Scanner;

public class Game_main {

	public static void main(String[] args) {
		Player player1 = new Player("Shiro",0);
		Message m = new Message();
		Dice d = new Dice();
		Scanner s = new Scanner(System.in);
		Game_control game = new Game_control();
		game.run(player1, d, s, m);
	}
}
