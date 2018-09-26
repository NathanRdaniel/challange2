public class Thrice {
    public static void main(String[] args) {
        int dice1 = 1;
        int dice2 = 2;
        int dice3 = 3;
        int tally2= 1;
        System.out.println(dice1);  
        int taly = 0; 
        //round2
        while(dice1 > dice2 || dice1 < dice3){
            dice1 = (int)(Math.random()*3+1);
            dice2 = (int)(Math.random()*3+1);
            dice3 = (int)(Math.random()*3+1);
            System.out.println("test");
           }
          //round2
           if (dice1 == dice2 && dice1 == dice3){
            taly = dice1 * 3;
            System.out.println(taly);
             for(int i = 1; i <= taly; i++ ){
             dice1 = (int)(Math.random()*3+1);
             dice2 = (int)(Math.random()*3+1);
             dice3 = (int)(Math.random()*3+1);
             tally2 = dice1 * dice2 * dice3 * tally2;
             System.out.println(tally2 + taly);
            //3
            
          }
        }
    }
}