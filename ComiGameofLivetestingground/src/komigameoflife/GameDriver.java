package komigameoflife;

import javax.swing.JFrame;

public class GameDriver {

	public static void main(String[] args) {
		String title = "morgans game of life";
		Conway game = new Conway();
		JFrame frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(game.grid);
		frame.pack();
		frame.setVisible(true);
		
		
	}

}
