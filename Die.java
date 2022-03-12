/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6;

/**
 *
 * @author Yisacor
 */
public class Die{
  private int sides;
  private int value;
  
  public Die(int s){
    if (s > 1){
      sides = s;
    } else{
      sides = 6;
    }
    roll();
  }
  /*
  * method to randomly chose the value of the dice when rolled
  * returns the value of the roll as an int
  */
  public int roll(){
    value = (int)( Math.random() * sides ) + 1;
    return value;
  }
 
  /*
  * method to see if the object,which will be a die, is equal to the other die in the amount of sides and value of the rolled side
  *@param obj is the object that it is comparing to
  * returns true or false depending if the dies are equal
  */
  @Override
  public boolean equals(Object obj) {
    Die Dice = (Die) obj;
    if (value != Dice.value)
      return false;
    if (sides != Dice.sides)
      return false;
    return true;
   }

  /*
  * method to check if one die's value is less than the others
  * @param d is the die that it is comparing to
  * returns true or false depending on the two values
  */
  public boolean lessThan(Die d){
    return (value < d.value);
  }
  
  /*
  * method to take the difference of two dies
  * @param d is the die that subtrating with
  * returns the difference of the values
  */
  public int difference(Die d){
    return(value - d.value);
  }
  
  /*
  * method to display the value as a string
  * returns the value as a string
  */
  @Override
  public String toString(){
    return("" + value);
  }
}
