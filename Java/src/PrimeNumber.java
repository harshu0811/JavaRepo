
public class PrimeNumber {
	public static void main(String[] args) {
		int key=4;
		int fcount=0;
		for(int i=0;fcount<key;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				fcount++;
			}
			if(fcount==key)
			{
				System.out.println(i);
			}
		}
	}
}
