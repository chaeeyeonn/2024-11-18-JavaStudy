/*
 *  if(조건문)
 *  {
 *    조건이 맞으면 true
 *  }
 *  else
 *  {
 *    조건이 false
 *  }
 *  
 *  if(조건문)
 *  {
 *  }
 *  ---------------단일조건문
 *  if(조건문)
 *  {
 *  }
 *  else: 바로 위 if(조건문)만 처리한다 => 단독 사용 불가능
 *  {
 *  }
 *  
 *   교재58page
 *    다중 조건문 => 해당 조건에 맞는 내용 한 개만 실행
 *    if(조건문)
 *    {
 *      실행문장
 *      조건 true => 문장 실행 후 종료
 *      조건 false => 다음 조건으로 넘어감
 *    }
 *    else if(조건문)
 *    {
 *      실행문장
 *      조건 true => 문장 실행 후 종료
 *      조건 false => 다음 조건으로 넘어감
 *    }
 *    else if(조건문)
 *    {
 *      실행문장
 *      조건 true => 문장 실행 후 종료
 *      조건 false => 다음 조건으로 넘어감
 *    }
 *    else if(조건문)
 *    {
 *      실행문장
 *      조건 true => 문장 실행 후 종료
 *      조건 false => 다음 조건으로 넘어감
 *    }
 *    else => 생략 가능
 *    {
 *      실행문장
 *    }
 *    
 *    사용처: 게임(key 선택에 따른 처리 방법)
 */
public class 제어문_선택조건문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15;
		if(a%3==0)
			System.out.println(a+"는(은) 3의 배수입니다");
		else if(a%5==0)//수행되지 못함
		    System.out.println(a+"는(은) 5의 배수입니다");
		else if(a%7==0)
		    System.out.println(a+"는(은) 7의 배수입니다");
		else
		    System.out.println(a+"는(은) 3,5,7의 배수가 아닙니다");
		//15는 3,5의 배수인데 else if는 하나만 실행하므로 3의 배수만 결과로 나옴
		// => else if가 아닌 if문으로 통일해야함

	}

}
