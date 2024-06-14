package SUPER10Prog.Q6;

public class Player {

	    private int playerCode; 
	    private String playerName; 
	    
	    
	    private static int objectCount = 0;

	    
	    public Player(int playerCode, String playerName) {
	        this.playerCode = playerCode; 
	        this.playerName = playerName; 
	        objectCount++;
	    }

	   
	    public void printDetails() {
	        System.out.println("Player Code: " + playerCode); 
	        System.out.println("Player Name: " + playerName); 
	    }

	   
	    public static int getObjectCount() {
	        return objectCount; 
	    }

	  
	    public static void main(String[] args) {
	        
	        Player p1 = new Player(007, "Darshan"); 
	        Player p2 = new Player(999, "Deepak"); 
	        Player p3 = new Player(555, "Divyam"); 

	        
	        System.out.println("Player 1 Details:");
	        p1.printDetails(); 
	        System.out.println();

	        System.out.println("Player 2 Details:");
	        p2.printDetails(); 
	        System.out.println();

	        System.out.println("Player 3 Details:");
	        p3.printDetails(); 
	        System.out.println();

	        
	        System.out.println("Total number of player objects created: " + Player.getObjectCount());
	    }
	}


