package ans;

public class ans05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//아래 숫자들을 모두 곱한 값을 배열을 사용하여 출력하시오. 10 20 30 40 50
		int[] numArr = {1,2,3,4,5};
		int num = 1;
		
		for(int sum : numArr) {
			
			num = num * sum;
			
			
		}
		System.out.println(num);
	}

}
