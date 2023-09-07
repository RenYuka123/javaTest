package xxx;

public class TestBMI {
	public static void main(String[] args) {
		
		double weight = 55, height=1.65;
		double bmi = weight/(height*height); // Math.pow(height,2) 次方運算
			//printf(null,args)
			//printf("BMI = %3.f" , bmi)
		System.out.println("BMI值"+bmi);
		//System.out.printf("BMI = %.2f", bmi);
		//System.out.printf("BMI = %.2f%n", bmi); %n換行
			if(bmi<18.5) {
				System.out.println("過瘦");
			}
			else if(bmi<24) {
				System.out.println("適中");
			}
			else {
				System.out.println("過重");
			}
	}

	
	
	

}
