package ans;

public class ans03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//다음 숫자열에서 3의 갯수가 몇개 인지 출력하시오. 1 3 7 3 3 5 3 6 9 3 3 3
		int[] num = {1,3,7,3,3,5,3,6,9,3,3,3};
		int count = 0;
				for(int thr: num) {
				if(thr == 3) {
					count++;
				}
				
			}
				System.out.println(count);	

	}

}
