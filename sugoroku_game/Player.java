package sugoroku_game;

public class Player {
	private String name;
	private int current;
	public Player(String name, int current) {
		this.name = name;
		this.current = 0;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public int getCurrent() {
		return current;
	}
}
