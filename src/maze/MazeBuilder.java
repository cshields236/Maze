package maze;
public interface MazeBuilder {
	/* Supports a set of standard construction methods to create objects */
	public void buildMaze();
	public Room buildRoom();
	public void buildDoor(Room from, Direction side1, Room to, Direction side2);
	public void buildDoor(Room from, int side1, Room to, int side2);
	public Maze getMaze();
}
