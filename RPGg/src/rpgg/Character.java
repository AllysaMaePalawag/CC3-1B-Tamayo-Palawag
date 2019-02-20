package rpgg;

public class Character {
  
    private String name;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int maxlife;
    private int currentlife;
    
    static Dice dice = new Dice();
    
    public Character(String n, int s, int d, int i) {
        this.name = n;
        this.strength = s;
        this.dexterity = d;
        this.intelligence = i;
        maxlife = dice.roll() + 10;
        currentlife = maxlife;   
    }
    /**
    * Returns a random die roll using the roll method in the 
    * Dice.java, modified by the character's strength
    */
    public int attack() {
        if (strength > 10){
            strength = strength - dice.roll();
        }else{
            strength = strength;
        }
        return strength;
    }
    
    public void wound(int damage) { 
        currentlife = currentlife - damage;
    }
    /**
    * Increases current life by the heal parameter. 
    * current life cannot be greater than max life */
    public int heal(int heal) { 
        currentlife = currentlife + heal;
        return heal;
        
    }
    
    public String getName() {
        return name;
    }
    
    public int getStrength() {
        return strength;
    }
    
    public int getDexterity() {
        return dexterity;
    }
    
    public int getIntelligence() { 
        return intelligence;
    }

    public int getCurrentLife() { 
        return currentlife;
    }
    
    public int getMaxLife() {
        return maxlife;
    }
 
}
