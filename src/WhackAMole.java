
public class WhackAMole {
	
	int  score, molesLeft, attemptsLeft;
	char[][] moleGrid;


		WhackAMole(int numAttempts, int gridDimension){
			this.attemptsLeft = numAttempts;
			moleGrid= new char[gridDimension][gridDimension];
			 
		}
		//Constructor for the game, specifies total number of whacks allowed, and the grid dimension. 
		//After reading through the assignment, make sure to initialize the moleGrid with the appropriate character.
       
		boolean place(int x, int y) {
			return false;
			//Given a location, place a mole at that location. Return true if you can. (Also update number of moles left.)            
		}


	void whack(int x, int y) {
		//-  Given a location, take a whack at that location. If that location contains a mole, the score, 
		//number of attemptsLeft, and molesLeft is updated. If that location does not contain a mole, only attemptsLeft is updated.
	}


	void printGridToUser() {
		//– Print the grid without showing where the moles are. For every spot that has recorded a “whacked mole,” 
		//print out a W, or * otherwise.
	}


	void printGrid() {
		//-  Print the grid completely. This is effectively dumping the 2d array on the screen. 
		//The places where the moles are should be printed as an ‘M’. The places where the moles have been 
		//whacked should be printed as a ‘W’. The places that don’t have a mole should be printed as *.
	}



}
