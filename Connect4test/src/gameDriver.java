import javax.swing.JFrame;

public class gameDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title = "Connect 4!";
		Connect4 game = new Connect4(6,7,80);
		JFrame frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(280, 360);
		frame.setResizable(false);
		frame.add(game.grid);
		frame.pack();
		frame.setVisible(true);
		game.mainloop();

	}

}
