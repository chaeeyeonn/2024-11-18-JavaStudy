/*
 *  while / do~while - 반드시 한 번 이상 수행 시(java의 사용빈도는 없)
 *  |반복횟수가 없는 경우(데이터베이스/파일읽기)
 *  |반복 제어문
 *    |break: 반복 종료
 *     continue: 특정 부분을 제외
 *     =========for: 증가식으로 이동 / while: 조건식으로 이동
 *                                 ------continue는 처음부터 시작
 *                                 
 *  while
 *  형식) 초기식 1
 *       while(조건식) 2
 *       {
 *        반복 실행 문장 3
 *        증가식 4
 *       }
 *   
 *  do~while: while을 보완(무조건 한 번 수행)
 *  형식) 초기식 1
 *       do
 *       {
 *        반복 실행 문장 2
 *        증가식 3
 *       }while(조건식); 4 => false면 종료
 *      
*/
public class 반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~10
	    System.out.println("=======for========");
	    for(int i=1;i<=10;i++)
	    {
	    	System.out.print(i+" ");
	    }
	    System.out.println("\n========while=======");
	    int i=1;
	    while(i<=10)
	    {
	    	System.out.print(i+" ");
	    	i++;
	    }
	    System.out.println("\n==========do~while===========");
	    //int i=1;이 while문에 이미 있으므로 또 쓰지 않음
	    do
	    {
	    	System.out.print(i+" ");
	    	//위에서 이미 i가 11로 진행되었으므로 초기화 필요
	    	i=1;
	    	i++;
	    	//i++일 경우 do~while문은 증가한 뒤 조건 검색
	    }while(i<=10);
	    
	    

	}

}
