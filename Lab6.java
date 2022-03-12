/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6;

/*
 *
 * @author Yisacor
 */
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   
        System.out.println("Yahtzee");
        Player p = new Player();

        takeTurn(p);

        while(true) {

          System.out.print("Play again? (Y/N) ");
          boolean choice = CheckInput.getYesNo();

          if (choice){
            takeTurn(p);
          }

          else{
            break;
          }
        }
       System.out.println("Game Over");
       System.out.println("Final Score = " + p.getPoints() + " points");
      }

      /*
      * method to roll the die and see what happens when rolled
      * @param p is the object of the class player where it gets the attributes of the player calss
      */
      public static void takeTurn(Player p) {
        p.roll();
        System.out.println("\nRolling Dice..."+p.toString());
        if(p.threeOfAKind()){        
          System.out.println("You got 3 of a kind!");
        }
        else if(p.pair()){
          System.out.println("You got a pair!");
        }
        else if(p.series()){
          System.out.println("You got a series of 3!");  
        }
        else{
          System.out.println("Awww. Too Bad.");
        }
        System.out.println("Score = "+p.getPoints()+" points.");
       }

    }






