
public class assignment4 {
	public static void main(String args[]) {
		double x[]= {7,3,-1,2,9,0,0.8,52,2.2,900};
		PrefixAverage1(x);
		PrefixAverage2(x);
	}
	public static void PrefixAverage1(double x[]) {
		double a[] = new double[x.length];
		System.out.print("Algorithm1: ");
		 for (int i = 0; i <= x.length-1; i++) {
	            double s = x[0];
	            for (int j = 1; j <= x.length-1; j++) {
	            	if (j <= i){
	            		s = s + x[j];
	            	}
	            }
	            a[i] = s /(i+1);
	         
	            System.out.print(a[i]+", ");
		 }
	}
	public static void PrefixAverage2(double x[]) {
		double a[] = new double[x.length];
		double s = 0;
		System.out.print("\nAlgorithm2: ");
		for (int i = 0; i<= x.length-1;i++) {
			s = s +x[i];
			a[i] = s/(i+1);
			System.out.print(a[i]+", ");
		}
		
	}
}
