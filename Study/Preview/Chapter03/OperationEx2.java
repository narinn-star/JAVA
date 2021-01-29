package chapter3;

public class OperationEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gameScore = 150;
		
		//int lastScore = ++gameScore;
		int lastscore = gameScore++;
		//System.out.println(lastScore);
		System.out.println(lastscore);
		
		//int lastScore2 = --gameScore;
		int lastscore2 = gameScore--;
		//System.out.println(lastScore2);
		System.out.println(lastscore2);
	}

}
