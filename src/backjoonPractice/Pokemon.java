package backjoonPractice;
import java.util.*;

public class Pokemon {
	private int n; 
	private int input; //inputs
	private HashMap<Integer, String> PokeDex = new HashMap<Integer, String>();
	
	public Pokemon() {
		Scanner scanner = new Scanner(System.in);
		int PokeNum; // value
		String PokeNam; // key
		String KorV; //key or Value

		n = scanner.nextInt();
		input = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			PokeNum = i;
			PokeNam = scanner.next();
			PokeDex.put(PokeNum, PokeNam);
		}
		
		for(int i = 0; i < input; i++) {
			//문자열을 키값인지 벨류값인지 판단해야함
		}
		
		scanner.close();
	}
	
	public static void main(String[] args) {
		new Pokemon();
	}
}
