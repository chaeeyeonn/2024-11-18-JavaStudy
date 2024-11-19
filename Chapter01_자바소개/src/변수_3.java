// 수정 => 다시 저장
public class 변수_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=100;
        // a(100)
        System.out.println(a);
        
        a=200;
        System.out.println(a);
        
        a=1000;
        System.out.println(a);
        // 같은 블록 안에서는 같은 변수명을 사용할 수 없다
        /*
         *   학생 1명
         *   국어: 90
         *   수학: 90
         *   영어: 90
         *   총점: 270
         *   평균: 90.0
         *   학점: A
         *   등수: 2
         */
        int v=90;
        int b=90;
        int c=90;
        int d=270;
        double e=90.0;
        char f='A';
        int g=2;
        /*
         * 좀 더 쉬운 방법
         * int kor=90,eng=90,math=90;
         * int kor,eng,math;
         * kor=eng=math=90;
         * 
         */
        System.out.println("====결과값====");
        System.out.println("국어점수"+v);
        System.out.println("영어점수"+b);
        
        
	}

}
