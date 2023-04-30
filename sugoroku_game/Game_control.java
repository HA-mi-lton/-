package sugoroku_game;

import java.util.Scanner;

public class Game_control {
	public void run(Player p, Dice d, Scanner s, Message mes) {
		System.out.println("プレイヤー名："+p.getName());
		System.out.println("現在地："+p.getCurrent());
		mes.startGame();
		
		while(p.getCurrent() != 10) {
			System.out.println("現在地："+p.getCurrent());
			System.out.println("サイコロを振ります\nEnterを押してください");
			s.nextLine();
			int current = d.playDice();
			System.out.println(current+"の目が出ました");
			p.setCurrent(p.getCurrent()+current);
			if(p.getCurrent() == 2) {
				System.out.println("1マス進みます");
				p.setCurrent(p.getCurrent()+1);
				System.out.println("現在地："+p.getCurrent());
			}else if(p.getCurrent() == 6) {
				System.out.println("スタートに戻ります");
				p.setCurrent(0);
				System.out.println("現在地："+p.getCurrent());
			}else if(p.getCurrent() == 8) {
				System.out.println("3マス戻ります");
				p.setCurrent(p.getCurrent()-3);
				System.err.println("現在地："+p.getCurrent());
			}else if(p.getCurrent() > 10) {
				System.out.println("ゴールから超えた分のみ戻ります");
				p.setCurrent(10-(p.getCurrent()-10));
				System.out.println("現在地："+p.getCurrent());
			}
		}
			mes.goal();
			mes.endGame();
	}
}
