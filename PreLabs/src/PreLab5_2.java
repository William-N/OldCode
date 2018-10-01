import java.util.ArrayList;

public class PreLab5_2 
{

    public static String getLetterGrade(double numericGrade)
    {
    	
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
        }else if(numericGrade >= A_Minus)
        {
            return "A-";
        }else if(numericGrade >= B_Plus)
        {
            return "B+";
        }else if(numericGrade >= B)
        {
            return "B";
        }else if(numericGrade >= B_Minus)
        {
            return "B-";
        }else if(numericGrade >= C_Plus)
        {
            return "C+";
        }else if(numericGrade >= C)
        {
            return "C";
        }else if(numericGrade >= C_Minus)
        {
            return "C-";
        }else if(numericGrade >= D_Plus)
        {
            return "D+";
        }else if(numericGrade >= D)
        {
            return "D";
        }else
        {
            return "F";
        }

    }

    public static String weightedLetterGrade(ArrayList<Double> quizScores, double finalExamScore, double midtermScore, ArrayList<Double> hwScores)
    {
        double quizWeight = 0.2;
        double hwWeight=0.4;
        double midtermWeight=0.15;
        double finalWeight = 0.25;
        
        double quizTotal = 0.0;
        for(double grade : quizScores)
        {
            quizTotal = quizTotal + grade;
        }
        
        double hwTotal=0.0;
        for(double grade: hwScores)
        {
        		hwTotal=hwTotal+grade;
        }
        
        double quizAverage = quizTotal / quizScores.size();
        
        double hwAverage=hwTotal/hwScores.size();
        
        double courseAverage = quizAverage*quizWeight + finalExamScore*finalWeight + hwAverage*hwWeight +midtermScore*midtermWeight;
        
        String finalGrade = getLetterGrade(courseAverage);
        return finalGrade;
    }


    public static String dropOneQuiz(ArrayList<Double> quizScores, double finalExamScore, double midtermScore, ArrayList<Double> hwScores)
    {
        
        double minScore = Double.MAX_VALUE;
        int indexOfMin = -1;
        for(int i=0; i<quizScores.size(); i++)
        {
            double score = quizScores.get(i);
            if(score < minScore)
            {
                minScore = score;
                indexOfMin = i;
            }
        }

        quizScores.remove(indexOfMin);
        
        minScore = Double.MAX_VALUE;
        indexOfMin=-1;
        for(int i=0; i<hwScores.size(); i++)
        {
        		double score=hwScores.get(i);
        		if(score<minScore)
        		{
        			minScore=score;
        			indexOfMin=i;
        		}
        }
        
        hwScores.remove(indexOfMin);
        

        return weightedLetterGrade(quizScores, finalExamScore, midtermScore, hwScores);
    }
    
    public static void main(String[] args)
    {
    		
    		ArrayList<Double> quizGrades=new ArrayList<Double>();
    		
    		quizGrades.add(28.0);
    		quizGrades.add(26.0);
    		quizGrades.add(65.0);
    		quizGrades.add(60.0);
    		quizGrades.add(63.0);
    		quizGrades.add(36.0);
    		quizGrades.add(68.0);
    		quizGrades.add(49.0);
    		quizGrades.add(31.0);
    		quizGrades.add(34.0);
    		quizGrades.add(41.0);
    		quizGrades.add(50.0);
    		quizGrades.add(39.0);
    		quizGrades.add(59.0);
    		quizGrades.add(59.0);
    		quizGrades.add(52.0);
    		quizGrades.add(61.0);
    		quizGrades.add(81.0);
    		quizGrades.add(9.0);
    		quizGrades.add(56.0);
    		quizGrades.add(69.0);
    		quizGrades.add(46.0);

    		
   		ArrayList<Double> homeworkGrades=new ArrayList<Double>();
   		
   		homeworkGrades.add(74.0);
   		homeworkGrades.add(71.0);
   		homeworkGrades.add(75.0);
   		homeworkGrades.add(77.0);
   		homeworkGrades.add(89.0);
   		homeworkGrades.add(76.0);
   		homeworkGrades.add(82.0);
   		homeworkGrades.add(77.0);
   		homeworkGrades.add(78.0);
   		homeworkGrades.add(68.0);
   		homeworkGrades.add(74.0);
   		homeworkGrades.add(82.0);
   		
   		double midtermScore=93.0;
    		double finalExamScore=79.0;
    	
    		System.out.println(dropOneQuiz(quizGrades, finalExamScore, midtermScore, homeworkGrades));
    }

}
