package rpgg;

public class CharacterDuel {
     
    /**
     *
     */
    public static void fight(){
    Wizard one= new Wizard("Jana",3,4,5);
        Mage two= new Mage("Caitlyn",6,5,4);
        
        int damage =0 ;
        
        for(int i=1;;i++){
            System.out.println("Round"+i);
            System.out.println(one.getName()+": "+one.getCurrentlife());
            System.out.println(two.getName()+": "+two.getCurrentlife());
            
            if((one.getCurrentMagic()>=8)&&(one.getCurrentlife()<10)){
                System.out.println(one.getName()+" cast heal for "+one.castHeal());
            }else{
                if(pne.getCurrentMagic()>=5){
                    damage = one.castLightningBolt;
                    System.out.println(one.getName()+" Lightnig Bolt "+two.getName()+" for "+damage);
                }else{
                    damage=one.attack();
                    System.out.println(one.getName()+" attacks "+two.getName()+" for "+damage);
                }
                two.wound(damage);
                
                if(two.getCurrentlife()<=0){
                    System.out.println(one.getName()+" wins!");
                    break;
                }
            }
            if((two.getCurrentMagic()>8)&&(two.getCurrentlife()<10)){
                System.out.println(two.getName()+" Nova "+one.getName()+" for "+damage);
            }else{
                if(two.getCurrentMagic()>=5){
                    damage=two.castNova;
                    System.out.println(two.getName()+" Nova "+one.getName()+" for "+damage);
                }else{
                    damage=two.attack();
                    System.out.println(two.getName()+" attacks "+one.getName()+" for "+damage);
                }
                 one.wound(damage);
            
                if(one.getCurrentlife()<=0){
                System.out.println(two.getName()+" wins!");
                break;
            }
        }
         
    }
    
    }
}   

