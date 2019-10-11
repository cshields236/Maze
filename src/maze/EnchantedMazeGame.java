package maze;
public class EnchantedMazeGame extends MazeGame {

		public static void main(String[] args) {
			
			EnchantedMazeGame emg = new EnchantedMazeGame();
			MazeFactory factory = new EnchantedMazeFactory();
			emg.createMaze(factory);
			
		}
			
}
