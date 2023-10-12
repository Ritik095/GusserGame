import java.util.*;

class NumberGusser{
	int guessNum;
	
	int guessNum(){
		Scanner s = new Scanner(System.in);
		System.out.println("Please guess your number");
		guessNum = s.nextInt();
		return guessNum;
		
	}
}
class Player{
	
int guessNum;
	
	int guessNum(){
		Scanner s = new Scanner(System.in);
		System.out.println("Please guess your number");
		guessNum = s.nextInt();
		return guessNum;
		
	}
}

class Umpire{
	int numberFromGusser;
	int numberFromPlayer1;
	int numberFromPlayer2;
	int numberFromPlayer3;
	
	void collectNumFromGusser() {
		NumberGusser ng = new NumberGusser();
		numberFromGusser = ng.guessNum();
	}
	void collectNumFromPlayer() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		numberFromPlayer1 = p1.guessNum();
		numberFromPlayer2 = p2.guessNum();
		numberFromPlayer3 = p3.guessNum();

	}
	void compare() {
		if(numberFromGusser == numberFromPlayer1)
		{
			if(numberFromGusser == numberFromPlayer2 && numberFromGusser == numberFromPlayer3)
			{
				System.out.println("All player win this game");
			}
			else if(numberFromGusser == numberFromPlayer2)
			{
				System.out.println("Player 1 and player 2 won this game");
			}
			else if(numberFromGusser == numberFromPlayer3)
			{
				System.out.println("Player 1 and 3 won this game");
			}else {
			System.out.println("Player 1 won the game");
			}
		}else if(numberFromGusser == numberFromPlayer2)
		{
			if(numberFromGusser == numberFromPlayer3)
			{
				System.out.println("Player 2 and 3 won the game");
			}
			System.out.println("Player 2 won");
			
		}else if(numberFromGusser== numberFromPlayer3){
			System.out.println("Player 3 won");
			
		}else {
			System.out.println("Lose the match");
			
		}
	}

}
public class GusserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire u =new Umpire();
		u.collectNumFromGusser();
		u.collectNumFromPlayer();
		u.compare();

	}

}
