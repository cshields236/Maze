package maze;
public class Room extends MapSite {

	protected int roomNr;
	protected static int roomCnt = 1;
	private MapSite northSide;
	private MapSite southSide;
	private MapSite eastSide;
	private MapSite westSide;
	
	public Room(){ 
	    roomNr = roomCnt++;
	    System.out.println("creating Room #" + roomNr); 
	}
	
	public Room(int value) {
		roomNr = value;
		roomCnt++;
	}
	
	public void setSide(int d, MapSite site){
	    if (d == Direction.North) { 
	    	northSide = site; 
	    } 
	    else if (d == Direction.South) {  
	    	southSide = site; 
	    }
	    else if (d == Direction.East){ 
	    	eastSide = site; 
	    }
	    else if (d == Direction.West){ 
	    	westSide = site; 
	    }
	    System.out.println("setting " + d + " side of " + this.toString() + " to " + site.toString());
	}
	  
	public void setSide(Direction dir, MapSite site){
		
		int d = dir.getDirection();
		
	    if (d == Direction.North) { 
	    	northSide = site; 
	    } 
	    else if (d  == Direction.South) {  
	    	southSide = site; 
	    }
	    else if (d  == Direction.East){ 
	    	eastSide = site; 
	    }
	    else if (d  == Direction.West){ 
	    	westSide = site; 
	    }
	    System.out.println("setting " + d + " side of " + this.toString() + " to " + site.toString());
	}
	
	public MapSite getSide(int d){
	    MapSite result = null;
	    if (d == Direction.North){ result = northSide; } 
	    else if (d == Direction.South){ result = southSide; } 
	    else if (d == Direction.East){ result = eastSide; }
	    else if (d == Direction.West){ result = westSide; }
	    return result;
	}
	  
	public String toString(){ 
		return "Room #" + new Integer(roomNr).toString();
	}

}
