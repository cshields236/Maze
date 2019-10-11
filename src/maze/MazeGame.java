package maze;
public class MazeGame {
	
	// Create the maze.
	
	public Maze createMaze(MazeFactory mf) {
		
		Maze maze = mf.makeMaze();	
		Room r1 = mf.makeRoom(1); 
		Room r2 = mf.makeRoom(2);
		Door door = mf.makeDoor(r1, r2);
		maze.addRoom(r1); maze.addRoom(r2);
		r1.setSide(Direction.North, mf.makeWall());
		r1.setSide(Direction.East, door);
		r1.setSide(Direction.South, mf.makeWall());
		r1.setSide(Direction.West, mf.makeWall());
		r2.setSide(Direction.North, mf.makeWall());
		r2.setSide(Direction.East, mf.makeWall());
		r2.setSide(Direction.South, mf.makeWall());
		r2.setSide(Direction.West, door);
		return maze;	
	}	
	
	public Maze createMaze(MazeBuilder mb) {
		
		mb.buildMaze();
		Room r1 = mb.buildRoom();
		Room r2 = mb.buildRoom();
		mb.buildDoor(r1, Direction.North, r2, Direction.South);
		return mb.getMaze();
		
	}	
	
	public static void main(String[] args) {
		
		MazeGame mg = new MazeGame();
		MazeFactory factory = MazeFactory.getInstance();
		MazeBuilder mb = new StandardMazeBuilder();
		//mg.createMaze(factory);
		mg.createMaze(mb);
		
	}
}
