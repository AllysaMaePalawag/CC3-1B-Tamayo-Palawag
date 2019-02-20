package rpgg;

public class CharacterDuel extends TestCharacter {
     
    public static void fight(){
    Wizard one= new Wizard("Wizard",3,4,5);
        Mage two= new Mage("Mage",6,5,4);
        
        int damage;
        
        for(int i=1;;i++){
            System.out.println("Round "+i);
            System.out.println(one.getName()+": "+one.getCurrentLife());
            System.out.println(two.getName()+": "+two.getCurrentLife());
            
            if((one.getCurrentMagic()<=8)&&(one.getCurrentLife()<10)){
                System.out.println(one.getName()+" cast heal for "+one.castHeal());
            }else{
                if(one.getCurrentMagic()>=5){
                    damage = one.castLightningBolt();
                    System.out.println(one.getName()+" cast Lightnig Bolt to "+two.getName()+" for "+ damage);
                }else{
                    damage=one.attack();
                    System.out.println(one.getName()+" attacks "+two.getName()+" with Lightnig Bolt for "+ damage);
                }
                two.wound(damage);
                
                if(two.getCurrentLife()<=0){
                    System.out.println(one.getName()+" wins! \n Final HP: \n" + one.getName() + " HP = " + one.getCurrentLife()
                    +"\n" + two.getName() + " HP = " + two.getCurrentLife());
                    break;
                }
            }
            
            
            if((two.getCurrentMagic()<=8)&&(two.getCurrentLife()<10)){
                System.out.println(two.getName()+" cast heal for "+two.castHeal());
            }else{
                if(two.getCurrentMagic()>=5){
                    damage=two.castNova();
                    System.out.println(two.getName()+" cast Nova to "+one.getName()+" for "+damage);
                }else{
                    damage=two.attack();
                    System.out.println(two.getName()+" attacks "+one.getName()+" with Nova for "+damage);
                }
                 one.wound(damage);
            
                if(one.getCurrentLife()<=0){
                System.out.println(two.getName()+" wins! \n Final HP: \n" + two.getName() + " HP = " + two.getCurrentLife()
                    + "\n" + one.getName() + " HP = " + one.getCurrentLife());
                break;
            }
        }
         
    }
    
    }
}   

