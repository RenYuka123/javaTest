package xxx;

public class arraymethodtest {
	public int [][] creatarray(){
		int [][] data = new int[3][3];
		for(int i = 0;i<data.length;i++) {
			for(int j =0;j<data[i].length;j++) {
				data[i][j]=(int)(Math.random()*31);
			}
		}
		return(data);
	}
	public static void main(String[] args) {
		arraymethodtest ary = new arraymethodtest();
		int [][] x = ary.creatarray();
		int [][] y = ary.creatarray();
		int [][] z = new int [3][3];
		for(int i=0;i<z.length;i++) {
			for(int j =0;j<z[i].length;j++) {
				z[i][j]=x[i][j]+y[i][j];
			}
		}
		ary.getperform(x);
		ary.getperform(y);
		ary.getperform(z);
	}
	
	public void getperform(int [][] array) {
		for(int i = 0 ;i<array.length;i++) {
			for(int j = 0 ;j<array[i].length;j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("=============");
	}
}
