package cc31b;

import java.util.Scanner;

public class CC31B {
    
    public static void main(String[] args) {
     
        Scanner sc= new Scanner(System.in);
       
        System.out.print("Enter size of array: ");
        int c= sc.nextInt();
        double index []=new double[c];
        
        
        System.out.println("Enter elements for array: ");
        
        for (int i=0; i < index.length; i++){
            index [i]= sc.nextInt();
        }
        
        System.out.println("Mean: "+ mean(index));
        System.out.println("Mode: "+ mode(index));
    }
    

    static double mean(double[] index){
    
        double sum = 0;
    
        for (int i = 0; i < index.length; i++) {
        sum += index[i];
    }
    
        return sum / index.length;
        
}
    static double mode(double [] index){
    
        double maxValue=0;
        double maxCount=0;
        for(int i=0; i < index.length; i++ ){
            int count=0;
            for(int j=0; j<index.length;j++){
                if (index[j]==index[i]) count++;           
            }
            if (count>maxCount){
                maxCount=count;
                maxValue= index[i];
            }
            }
        return maxValue;
        
    }           
}