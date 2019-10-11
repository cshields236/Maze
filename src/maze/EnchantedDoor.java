package maze;
public class EnchantedDoor extends Door{

	protected static int doorCnt = 1; 
	
	public EnchantedDoor(Room r1, Room r2) {
		super(r1, r2);
	    doorNr = doorCnt++;
	    System.out.println("creating an Enchanted Door #" + doorNr + " between " + r1 + " and " + r2); 
	    room1 = r1;
	    room2 = r2;
	}

}
