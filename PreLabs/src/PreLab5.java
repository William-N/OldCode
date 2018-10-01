import java.util.ArrayList;

public class PreLab5 {

    /**
     *  In this lab we will be writing grade calculators for several different course grading 
     *  structures. 
     *  
     *  For prelab we will compute the final letter grade for any student in a class 
     *  that has quizzes and one final exam with the lowest quiz score being dropped. We will
     *  accomplish this in smaller pieces by writing and calling 3 separate methods
     */
    
    /**
     *  prelab Q1: Given a final course average as a double, 
     *  compute the final letter grade based on the following cutoffs
     *  
     *  A   90.0 <= grade
     *  A-  87.0 <= grade < 90.0
     *  B+  83.0 <= grade < 87.0 
     *  B   80.0 <= grade < 83.0 
     *  B-  77.0 <= grade < 80.0 
     *  C+  73.0 <= grade < 77.0 
     *  C   70.0 <= grade < 73.0 
     *  C-  67.0 <= grade < 70.0 
     *  D+  63.0 <= grade < 67.0 
     *  D   60.0 <= grade < 63.0 
     *  F           grade < 60.0 
     */
    public static String getLetterGrade(double numericGrade){
    	
        double A = 90.0;
        double A_Minus = 87.0;
        double B_Plus = 83.0;
        double B = 80.0;
        double B_Minus = 77.0;
        double C_Plus = 73.0;
        double C = 70.0;
        double C_Minus = 67.0;
        double D_Plus = 63.0;
        double D = 60.0;

        if(numericGrade >= A){
            return "A";
        }else if(numericGrade >= A_Minus){
            return "A-";
        }else if(numericGrade >= B_Plus){
            return "B+";
        }else if(numericGrade >= B){
            return "B";
        }else if(numericGrade >= B_Minus){
            return "B-";
        }else if(numericGrade >= C_Plus){
            return "C+";
        }else if(numericGrade >= C){
            return "C";
        }else if(numericGrade >= C_Minus){
            return "C-";
        }else if(numericGrade >= D_Plus){
            return "D+";
        }else if(numericGrade >= D){
            return "D";
        }else{
            return "F";
        }

    }



    /**
     *  prelab Q2: In a course that has a many equally weighted quizzes and one final exam, compute 
     *  the final letter grade of a student with the following weightings
     * 
     *  quizzes    : 60%
     *  final exam : 40%
     */
    public static String weightedLetterGrade(ArrayList<Double> quizScores, double finalExamScore)
    {
        double quizWeight = 0.6;
        double examWeight = 0.4;
        
        // compute the quiz average
        double quizTotal = 0.0;
        for(double grade : quizScores){
            quizTotal = quizTotal + grade;
        }
        double quizAverage = quizTotal / quizScores.size();
        
        // compute the course average
        double courseAverage = quizAverage*quizWeight + finalExamScore*examWeight;
        
        // call the previous method to get the letter grade based on this course average
        String finalGrade = getLetterGrade(courseAverage);
        return finalGrade;
    }



    /**
     *  PreLab Q3 / Lab Part 1: In a course that has a many equally weighted quizzes and one final 
     *  exam, compute the final letter grade of a student with the following weightings
     * 
     *  * After dropping the lowest quiz score *
     * 
     *  quizzes    : 60%
     *  final exam : 40%
     */
    public static String dropOneQuiz(ArrayList<Double> quizScores, double finalExamScore){
        
        // Find the min value and the index where it can be found
        double minScore = Double.POSITIVE_INFINITY;
        int indexOfMin = -1;
        for(int i=0; i<quizScores.size(); i++){
            double score = quizScores.get(i);
            if(score < minScore){
                minScore = score;
                indexOfMin = i;
            }
        }

        // remove the value at the index containing the minimum element (drop the lowest quiz score)
        quizScores.remove(indexOfMin);

        // Call the previous method to compute the letter grade with the dropped quiz
        // Notice that we are calling methods that we've written to avoid rewriting code
        // which saves time and makes the program much easier to read, among other benefits
        return weightedLetterGrade(quizScores, finalExamScore);
    }
    
    public static void main(String[] args)
    {
    		
    		ArrayList<Double> quizScores=new ArrayList<Double>();
    		
    		quizScores.add(100.0);
    		quizScores.add(100.0);
    		quizScores.add(74.0);
    		quizScores.add(94.0);
    		quizScores.add(100.0);
    		quizScores.add(100.0);
    		quizScores.add(100.0);
    		
    		double finalExamScore=90.0;
    	
    		System.out.println(dropOneQuiz(quizScores, finalExamScore));
    }

}
