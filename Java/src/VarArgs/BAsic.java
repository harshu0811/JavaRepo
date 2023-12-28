package VarArgs;

public class BAsic {
		public double add(double...a){
			double res=0;
			for(double x:a) {
				res+=x;
			}
			return res;
		}
		public String check(String s, int... b) {
			for(int a:b) {
				s+=a;
			}
			return s;
		}
}
