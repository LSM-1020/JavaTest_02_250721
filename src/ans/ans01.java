package ans;

public class ans01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//다음 값 들의 평균을 계산하여 출력하시오.(향상된 for문 사용)

		int[] numArr= {90, 80, 70, 100, 85};
		int sum = 0;
		for(int num:numArr) { //향상된 for문
			sum = sum + num;
		}
//		System.out.println(sum/numArr.length); // 나눌때 실수로 나올수도 있기때문에 5.0 or 강제형변환
		System.out.println(sum/(double) numArr.length);
	}
	

}
