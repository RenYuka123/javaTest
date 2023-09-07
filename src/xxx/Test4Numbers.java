package xxx;

public class Test4Numbers {
	public static void main(String args[]) {
		for(int i=0;i<=100;i++) {
			if(i%4==0)
			System.out.println(i+" ");
		}
		//System.out.print("\n") 換行符號
		for(int i=0;i<=100;i+=4) {
			System.out.println(i+" ");
		}
	}
}
