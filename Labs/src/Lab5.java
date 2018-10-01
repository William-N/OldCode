import java.util.ArrayList;

public class Lab5 
{
	
    public static String getLetterGrade(double grade)
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

        if(grade >= A)
        {
            return "A";
        }
        else if(grade >= A_Minus)
        {
            return "A-";
        }
        else if(grade >= B_Plus)
        {
            return "B+";
        }
        else if(grade >= B)
        {
            return "B";
        }
        else if(grade >= B_Minus)
        {
            return "B-";
        }
        else if(grade >= C_Plus)
        {
            return "C+";
        }
        else if(grade >= C)
        {
            return "C";
        }
        else if(grade >= C_Minus)
        {
            return "C-";
        }
        else if(grade >= D_Plus)
        {
            return "D+";
        }
        else if(grade >= D)
        {
            return "D";
        }
        else
        {
            return "F";
        }

    }
    
    public static String finalLetterGrade(ArrayList<Double> quizScores, ArrayList<Double> hwScores, double midtermScore, double finalExamScore)
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
        
        return getLetterGrade(courseAverage);
    }
	
	public static String computeGrade(ArrayList<Double>quizGrades, ArrayList<Double>homeworkGrades, double midtermScore, double finalScore)
	{
		
		double minScore = Double.MAX_VALUE;
        int indexOfMin = -1;
        for(int i=0; i<quizGrades.size(); i++)
        {
            double score = quizGrades.get(i);
            if(score < minScore)
            {
                minScore = score;
                indexOfMin = i;
            }
        }

        quizGrades.remove(indexOfMin);
        
		minScore = Double.MAX_VALUE;
        indexOfMin = -1;
        for(int i=0; i<quizGrades.size(); i++)
        {
            double score = quizGrades.get(i);
            if(score < minScore)
            {
                minScore = score;
                indexOfMin = i;
            }
        }

        quizGrades.remove(indexOfMin);
        
        minScore = Double.MAX_VALUE;
        indexOfMin=-1;
        for(int i=0; i<homeworkGrades.size(); i++)
        {
        		double score=homeworkGrades.get(i);
        		if(score<minScore)
        		{
        			minScore=score;
        			indexOfMin=i;
        		}
        }
        
        homeworkGrades.remove(indexOfMin);
        

        return finalLetterGrade(quizGrades, homeworkGrades, midtermScore, finalScore);
	}
	

	public static void main(String[] args) 
	{

		ArrayList<Double>quizGrades= new ArrayList<Double>();
		
		quizGrades.add(64.0);
		quizGrades.add(59.0);
		quizGrades.add(59.0);
		quizGrades.add(64.0);
		quizGrades.add(68.0);
		quizGrades.add(59.0);
		
		ArrayList<Double>homeworkGrades= new ArrayList<Double>();
		
		homeworkGrades.add(62.0);
		homeworkGrades.add(97.0);
		homeworkGrades.add(89.0);
		
		double midtermScore=46.0;
		double finalScore=41.0;
		
		System.out.println(computeGrade(quizGrades, homeworkGrades, midtermScore, finalScore));
		
	}

}
