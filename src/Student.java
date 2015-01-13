/* Student.java
 * Manage a student's name and three test scores.
 */

/**
 * 
 * Manages a student's name and three test scores.
 * 
 * @author Spencer Davis, Daniel Wester
 * @version 4/12/2012
 * 
 */

public class Student {

   //Instance variables
   //Each student object has a name and three test scores
   private String name;             //Student name
   private int test1;               //Score on test 1
   private int test2;               //Score on test 2
   private int test3;               //Score on test 3

   //Constructor method

   /**
    * Default constructor initializes name to the empty string and the test scores to zero.
    */
   public Student(){
   //Initialize a new student's name to the empty string and the test
   //scores to zero.
      name = "";
      test1 = 0;
      test2 = 0;
      test3 = 0;
   }
    
   //Other methods

   /**
    * Sets the name of a student.
    * @param nm String represents the name entered.
    */
   public void setName (String nm){
   //Set a student's name
      name = nm;
   }
   
   /**
    * Returns the name of a student.
    * @return String the student's name
    */
   public String getName (){
   //Get a student's name
      return name;
   }
  
   /**
    * Sets the score of the test number i.
    * @param i int test number
    * @param score int test score
    */
   public void setScore (int i, int score){
   //Set test i to score
      if      (i == 1) test1 = score;
      else if (i == 2) test2 = score;
      else             test3 = score;
   }

   /**
    * Returns the score of the test number i.
    * @param i int test number
    * @return int the test score
    */
   public int getScore (int i){
   //Retrieve score i
      if      (i == 1) return test1;
      else if (i == 2) return test2;
      else             return test3;
   }
   
   /**
    * Computes and returns the average of all three test scores.
    * @return int average
    */
   public int getAverage(){
   //Compute and return the average
      int average;
      average = (int) Math.round((test1 + test2 + test3) / 3.0);
      return average;
   }
   
   /**
    * Finds out which test score is highest and returns it.
    * @return int highest score
    */
   public int getHighScore(){
   //Determine and return the highest score
      int highScore;
      highScore = test1;
      if (test2 > highScore) highScore = test2;
      if (test3 > highScore) highScore = test3;
      return highScore;
   }
   
   /**
    * Constructs and returns a string representation of the student object.
    * @return String name, all three test scores, and average test score
    */
   public String toString(){
   //Construct and return a string representation of the student
      String str;
      str = "Name:    " + name  + "\n" +    // "\n" denotes a newline
            "Test 1:  " + test1 + "\n" +
            "Test 2:  " + test2 + "\n" + 
            "Test 3:  " + test3 + "\n" +
            "Average: " + getAverage();
      return str;
   }  
}
