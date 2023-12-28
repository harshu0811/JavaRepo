package VarArgs;

public class BAsicDriver {
	public static void main(String[] args) {
		BAsic b=new BAsic();
		System.out.println(b.add());
		System.out.println(b.add(10));
		System.out.println(b.add(10,20,30));
		double[] d= {10,20,30,40};
		System.out.println(b.add(d));
		System.out.println(b.check("harsha"));
		System.out.println(b.check("h", 'a'));
	} 
}
