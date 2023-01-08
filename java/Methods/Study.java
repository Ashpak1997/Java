package Methods;

public class Study {

	private int playerPosition;               // Variable declaration
	private String playerName;
	private float criticOneRating, criticTwoRating, criticThreeRating;
	
	private float avrageRating;
	private char category;

	Study(){                       // Constructor Declaration 
		playerPosition = 1;
		playerName = "Ashpak";
		criticOneRating = 9f;
		criticTwoRating = 9.9f;
		criticThreeRating = 9.45f;
		avrageRating = 9.8f;
		category = 'A';
	}
	
	public void PlayerRating(int playerPosition , String playerName) {

		this.playerPosition = playerPosition;
		this.playerName = playerName;
		
	}


}
