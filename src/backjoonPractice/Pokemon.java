package backjoonPractice;
import java.util.*;

public class Pokemon {
	private int n; 
	private int input; //inputs
	private HashMap<Integer, String> PokeDex = new HashMap<Integer, String>();
	
	private boolean isKorV(String inputKorV) { //key value 판별함수
		boolean result = true;
		for(char c : inputKorV.toCharArray()) {
			if(!Character.isDigit(c)) { //문자가 숫자가 아니면
				result = false;
				break;
			}
		}
		return result;
	}
	
	private int getKey(String value) { //key 값 찾는함수
		Set<Integer> keys = PokeDex.keySet();
		Iterator<Integer> it = keys.iterator();
		
		while(it.hasNext()) {
			int key = it.next();
			if(value.equals(PokeDex.get(key))) {
				return key;
			}
		}
		return -1;
	}
	
	public Pokemon() {
		Scanner scanner = new Scanner(System.in);
		int PokeNum; // value
		String PokeNam; // key
		
		String inputKorV; //input Key or Value
		int inputOfKey; //key of inputKorV
		
		n = scanner.nextInt();
		input = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			PokeNum = i;
			PokeNam = scanner.next();
			PokeDex.put(PokeNum, PokeNam);
		}
		
		for(int i = 0; i < input; i++) {
			inputKorV = scanner.next(); //문자열을 키값인지 벨류값인지 판단해야함
			
			if(isKorV(inputKorV) == true){ //key
				inputOfKey = Integer.parseInt(inputKorV);
				System.out.println(PokeDex.get(inputOfKey)); //print value
			}else { //value
				System.out.println(getKey(inputKorV)); //print key
			}
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		new Pokemon();
	}
}
