package atos;

public class Exercice2PairOfDice {
	
	
	private int die1;
    private int die2;
    
    public Exercice2PairOfDice() {
        this.die1 = 0;
        this.die2 = 0;
    }
    
    public int getDie1() {
        return this.die1;
    }
    
    public int getDie2() {
        return this.die2;
    }
    
    public void setDie1(int die1) {
        this.die1 = die1;
    }
    
    public void setDie2(int die2) {
        this.die2 = die2;
    }
    
    public int rolledDicePair() {
        int diceRolledNbre = 0;
        
        while(this.die1 + this.die2 != 2) {
            diceRolledNbre++;
            this.die1 = (int) (1 + Math.random() * (4 - 1));
            this.die2 = (int) (1 + Math.random() * (4 - 1));
        }
        
        return diceRolledNbre;
    }

	public static void main(String[] args) {
		Exercice2PairOfDice pdc = new  Exercice2PairOfDice();
        System.out.println(pdc.rolledDicePair());

	}

}
