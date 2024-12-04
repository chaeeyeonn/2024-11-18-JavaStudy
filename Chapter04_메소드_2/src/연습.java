import java.text.ChoiceFormat;
import java.util.Scanner;
public class 연습 {
//1~10까지 출력하는 메소드를 구현하시오
    static void print1()
    {
    	for(int i=1;i<=10;i++)
    	{
    		System.out.print(i+" ");
    	}
    }
	
//1~10까지 합을 구하는 메소드를 구현하시오
       static int print2()
       {
    	   int sum=0;
    	   for(int i=1;i<=10;i++)
    	   {
    		   sum+=i;
    	   }
    	   return sum;
       }
	
//1~n까지 합을 구하는 메소드를 구현하시오 ==> 사용자 요청값 'n' 매개변수 등장
         static int print3(int n)
         {
        	 int sum1=0;
        	 for(int i=1;i<=n;i++)
        	 {
        		 sum1+=i;
        	 }
        	 return sum1;
         }
	
//두 정수의 나눗셈 결과를 구하는 메소드를 구현하시오(실수)
          static String print4(int a,int b)
          {
        	  if(b==0)
        		  return "0으로 나눌 수 없다.";//b가 0이면 종료
        	  
        	 return String.valueOf(a/(double)b);//return은 여러 개 사용할 수 있다
          }
          
//문자열의 소문자를 대문자로 바꾸는 메소드를 구현하시오
          static void change(String a)
          {
        	  a=a.toUpperCase();
        	  System.out.println(a);
          }
          
//문자열을 입력받아서 좌우 대칭인지 확인하는 메소드를 구현하시오
          /*
           *   경우의 수 => 3
           *   
           */
          static String change2(String s)
          {
        	  if(s.length()%2!=0)
        		  return "문자열 개수가 짝수여야 합니다";
        	  
        	  String res="";//둘 중에 한 개만 전송
        	  boolean bCheck=true;
        	  /*
        	   *   A B B A
        	   *   -     -
        	   *     - -
        	   *     
        	   *     비교
        	   */
        	  for(int i=0;i<s.length()/2;i++)
        	  {
        		  char start=s.charAt(i);
        		  char end=s.charAt(s.length()-1-i);
        		  if(start!=end)
        		  {
        			  bCheck=false;
        			  break;
        		  }
        	  }
        	  if(bCheck==true)
        	  {
        		  res="좌우대칭입니다";
        	  }
        	  else
        	  {
        		  res="좌우대칭이 아닙니다";
        	  }
        	  return res;
        	
          }
          
//문자열을 거꾸로 출력하는 메소드를 구현하시오
          static void reverse(String s)
          {
        	  for(int i=s.length()-1;i>=0;i--)
        	  {
        		  System.out.print(s.charAt(i));
        	  }
//        	  System.out.println(new StringBuilder(s).reverse());//라이브러리 이용
          }
          
//학점을 구하는 메소드를 구현하시오
          static void hakjum(int kor)
          {
        	  char c='A';
        	  switch(kor/10)
        	  {
        	  case 10: case 9:
        		  c='A';
        		  break;
        	  case 8:
        		  c='B';
        		  break;
        	  case 7:
        		  c='C';
        		  break;
        	  case 6:
        		  c='D';
        		  break;
        		  default:
        			  c='F';
        	  }
        	  System.out.println("학점:"+c);
          }
          /*
           *  java.text => DecimalFormat => 10,000(콤마 찍기)
           *               SimpleDateFormat => 날짜 변환
           *               ChoiceFormat => 값 선택
           *               MessageFormat => 오라클 insert
           */
          static void hakjum2(int kor)
          {
        	  double[] limit={50,60,70,80,90};
        	  String[] grade={"F","D","C","B","A"};
        	  ChoiceFormat cf=new ChoiceFormat(limit,grade);//라이브러리
        	  System.out.println(cf.format(kor));
          }
          
          
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse("abcde");
		String ss=change2("asdfga");
		System.out.println(ss);
		hakjum(80);
		hakjum2(59);
		
   

	}

}
