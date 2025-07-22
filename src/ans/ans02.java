package ans;

public class ans02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//다음 숫자들을 거꾸로 출력하시오. ex) 50 40 30 20 10
		int[] num = {10,20,30,40,50};
		
		for(int i=num.length-1;i>=0;i--) {
			System.out.println(num[i]);
		}

	}

}
