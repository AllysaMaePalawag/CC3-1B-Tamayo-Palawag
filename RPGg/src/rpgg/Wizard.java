package rpgg;

public class Wizard extends Character{

    private int MaxMagic;
    private int CurrentMagic;
    int castLightningBolt;
    int castHeal;
  
    
    /**
* The Wizard(String,int,int,int) constructor overrides the
* constructor with the same signature in Character. It first
* calls that constructor using the super keyword, then
* initializes maxmagic to a value, and sets currentmagic to
* the same value, similar to lifepoints.
*/

    public Wizard(String n, int s, int d, int i) {
        super(n, s, d, i);
    }
    
/**
* castLightningBolt() represents casting a magic spell. The
* method first checks that currentmagic is greater than/equal
* to 5. If it is, currentmagic is reduced by 5 and a random
* number is returned using the dice inherited from Character,
* modified by the character's intelligence.
* Otherwise, returns 0.
*/

    public int castLightningBolt(){
        if(CurrentMagic>=5){
            CurrentMagic = CurrentMagic - 5;
            return CurrentMagic;
        }else{
        return 0;
        }
    }

/**
* castHeal() represents casting a magic spell. The method first
* checks that currentmagic is greater than/equal to 8. If it
* is, currentmagic is reduced by 8 and the character's heal()
* method is called with a random number, modified by the
* character's intelligence score. The amount healed is also
* returned by the method.
     * @return 
*/
    
    public int castHeal(){
        if(CurrentMagic>=8){
            CurrentMagic = CurrentMagic - 8;
            return heal(dice.roll());
        }else{
            return heal(dice.roll());
        }
    }

    public int getMaxMagic(){
        MaxMagic = dice.roll();
        return MaxMagic;
    }
    public int getCurrentMagic(){
        return MaxMagic;
    }

}
