package maze;
public class MazeFactory {
	
	protected static MazeFactory _theFactory;
	
	protected MazeFactory() {
		
	}
	
	public static MazeFactory getInstance() {
		if (_theFactory == null) {
			_theFactory = new MazeFactory();
			return _theFactory;
		}
		else
			return _theFactory;
	}

	public Maze makeMaze() {
		return new Maze();
	}
	
	public Room makeRoom(int i) {
		return new Room(i);
	}
	
	public Door makeDoor(Room r1, Room r2) {
		return new Door(r1, r2);
	}
	
	public Wall makeWall() {
		return new Wall();
	}
		
}
