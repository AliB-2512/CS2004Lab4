import java.util.ArrayList;

public class coderunner {
	public static void main(String args[]) {
		ArrayList <Float> X = new ArrayList <Float>();
		X.add(7f);
		X.add(3f);
		X.add(-1f);
		X.add(2f);
		X.add(9f);
		X.add(0f);
		X.add(0.8f);
		X.add(52f);
		X.add(2.2f);
		X.add(900f);
		System.out.print(PrefixAverage(X));
	}
	
	public static ArrayList<Float> PrefixAverage(ArrayList<Float> X){
		ArrayList <Float> a = new ArrayList <Float>();
		float s = 0;
		if (X == null || X.isEmpty()) {
	        return null;
		}
		for (int i = 0; i<= X.size()-1;i++) {
			s = s +X.get(i);
			a.add(i,s/(i+1));
		}
		return a;
	}
}
 
