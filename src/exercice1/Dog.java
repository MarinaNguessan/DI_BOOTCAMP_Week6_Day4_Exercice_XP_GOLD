package exercice1;

public class Dog {
	
	    // TODO: declare an instance variable to hold the drinking time

	    private int time;
	    
	    public void setDrinkTime(int time) {
	        // TODO: implement method stub
	        this.time = time;
	    }

	    public int getDrinkTime() {
	        // TODO: implement method stub
	        return this.time;
	    }

	    /**
	     * The dog needs to go for a walk if it had a drink more than 4 hours ago;
	     * i.e., if getDrinkTime() returns a value > 4.
	     */
	    public boolean needsToGo() {
	        // TODO: implement method stub
	        if(getDrinkTime() > 4) {
	            return true;
	        }
	        return false;
	    }
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
