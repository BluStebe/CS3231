public class BMI {

    public static void main(String[] args) {
    	
    	int sum = sumdigit(932);
        System.out.println("The sum of the digits of the number 932 is " + sum);
        
    }
    
    public static int sumdigit(int n){
		//complete your code for this method below
		int hundreds = n / 100;
		n %= 100;
		int tens = n / 10;
		n %= 10;
		int ones = n;
		
		return (int) (hundreds + tens + ones); //dummy return value
    }
}
