package backjoonPractice;
import java.util.*;

public class EnterLog {
	private HashMap<String, String> inOutMap = new HashMap<String, String>();
	private int n;
	private String nameTmp;
	private String stateTmp;
	
	public EnterLog() {	
		Scanner scanner = new Scanner(System.in);
		
		n = scanner.nextInt();
		for(int i = 0; i < n; i++) {
			nameTmp = scanner.next();
			stateTmp = scanner.next();
			inOutMap.put(nameTmp, stateTmp); //해시맵 저장
		}
		
		Set<String> keys = inOutMap.keySet();
		Iterator<String> it = keys.iterator();
		Vector<String> v = new Vector<String>();
		
		while(it.hasNext()) {
			String name = it.next();
			if(inOutMap.get(name).equals("enter") == true)
				v.add(name); //벡터에 출근사원 저장
		}
		
		Collections.sort(v); //정렬
		Collections.reverse(v); //역순
		
		for(String n : v) {
			System.out.println(n);
		}
		
		scanner.close();
	}
	
	public static void main(String[] args) {
		new EnterLog();
	}
}
