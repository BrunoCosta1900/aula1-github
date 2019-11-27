 package inicio_logica_games;

import java.util.ArrayList;

public class Game implements Runnable {
	
	private boolean isRunning;
	private Thread thread;
	
	private ArrayList<Entidade> entidades;
	
	public Game() {
		entidades.add(new Entidade());
		entidades.add(new Entidade());
		entidades.add(new Entidade());
		entidades.add(new Entidade());
		for(int i = 0; i < entidades.size(); i++) {
			System.out.println("Hey!!");
		}
		
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		game.start();
		
		entidades.
	}
	
	
}
