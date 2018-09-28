import java.util.Scanner;
public class Thrice{
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);       
        int loop = 0;
        int tally1 = 0;
        int tally2 = tally1;
        int tally3 = 0;
        double count = 1;
        double score = 1;
        double average = 0;
        double total = 0;
      
        
        //loop
        for(int j = 0; j  <= 1000; j++)
        {
            
            
            
            
              while(loop <=1){
            int dice1 = (int)(Math.random()*6+1);
            int dice2 = (int)(Math.random()*6+1);
            int dice3 = (int)(Math.random()*6+1);
            if(dice1 == dice2 && dice1 == dice3){
                loop = 2;
                tally1 = dice1 * 3;
          //      System.out.println(tally1);
            }
            
        }
        for(int i = 0; i <= tally1; i++){
            int dice1 = (int)(Math.random()*6+1);
            int dice2 = (int)(Math.random()*6+1);
            int dice3 = (int)(Math.random()*6+1);
            tally2 = tally2 + dice1 * dice2 * dice3;
           
        }
       // System.out.println(tally2);
        //System.out.println("Do you want to retire?");
       // System.out.println("0 for no, 1 for yes");
        int retire = 0; //scan.nextInt();
        loop = 0;
        if(retire == 1){
           score = tally1 + tally2;
          //  System.out.println(score);
        }if(retire == 0){
             while(loop <=1){
            int dice1 = (int)(Math.random()*6+1);
            int dice2 = (int)(Math.random()*6+1);
            int dice3 = (int)(Math.random()*6+1);
            count = count + 1;
            if(dice1 == dice2 && dice1 == dice3){
                loop = 2;
                tally3 = dice1 * 3;
                if(tally3 == tally1){
                tally3 = tally2 * 3;
                score = tally3;
       //         System.out.println(score);
                }else{
                    tally2 = tally3;
                    score = tally2;
          //          System.out.println(score);
                }
            }
            
        }
        double power = Math.pow(3.0 , count);
        score = score * power;          //totals tallys and Power 
       //System.out.println(score);      // Prints score
       // System.out.println("------------");
       // System.out.println(count);
        }   
            
            average = average + score;
        }
        total = average/1000;
        System.out.println(total);
   
    }   
}
