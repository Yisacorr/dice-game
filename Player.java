/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6;

import java.util.Arrays;

/**
 *
 * @author Yisacor
 */
public class Player {
  Die [] Dice;
  int points;


  public Player(){
    Dice = new Die[3];
    for( int i = 0; i < 3; i++ ) {
        Dice[i] = new Die(6);
    }
  }
        
  public int getPoints(){
      return points;
  }

  public void sort(){
        if (Dice[1].lessThan(Dice[0]))
        {
            Die temp = Dice[0];
            Dice[0] = Dice[1];
            Dice[1] = temp;
        }
        if (Dice[2].lessThan(Dice[1]))
        {
            Die temp = Dice[1];
            Dice[1] = Dice[2];
            Dice[2] = temp;
        }
        
        if (Dice[1].lessThan(Dice[0]))
        {
            Die temp = Dice[0];
            Dice[0] = Dice[1];
            Dice[1] = temp;
        }     
    }   
  public boolean pair(){
      if ((Dice[0].equals(Dice[1])) || (Dice[0].equals(Dice[2])) || (Dice[1].equals(Dice[2]))){
          points += 1;
          return true;
      }
      return false;
  }
  public boolean threeOfAKind(){
      if((Dice[0].equals(Dice[1])) && (Dice[0].equals(Dice[2])) && (Dice[1].equals(Dice[2]))){
         points += 3;
         return true;
      }
      return false;
  }
  public boolean series(){
      sort();
      if((Dice[2].difference(Dice[1])==1) && (Dice[1].difference(Dice[0])==1)){
        points += 2;
        return true;}
      return false;
  }

  public void roll(){
  for( int d = 0; d < 3; d++ ) {
         Dice[d].roll();
      }
  sort();
  }

  @Override
  public String toString(){
      return ("D1=" +Dice[0] + "," + "D2=" +Dice[1]+ "," +"D3="+ Dice[3]);
  }
}
