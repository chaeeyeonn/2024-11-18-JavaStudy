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
//          static void change(String a)
//          {
//        	  a=a.toUpperCase();
//        	  System.out.println(a);
//          }
//대문자를 소문자로 만들기
       static void change(String s) { 
          String ss="";
  		for(int i=0;i<s.length();i++)
  		{
  			char c=s.charAt(i);
  			if(c>='A' && c<='Z')
  			{
  				ss+=(char)(c+32);  // a=97 , A=65 => 32
  			}//char+"" = String
//  			else
//  				ss+=c;
  		}
  		System.out.println(ss);}
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
          
//학점을 구하는 메소드를 구현하시오 //Chapter04_메소드_2 => 메소드_2 참고
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
          
          
//년도를 입력받아서 윤년인지 여부를 확인하는 메소드를 구현하시오. // 이후부턴 Chapter04_메소드_2 => 메소드_3 참고
      	static boolean isYear(int year)
    	{
    		boolean bCheck=false;
    		if((year%4==0 && year%100!=0) || (year%400==0))
    		{
    			bCheck=true;
    		}
    		return bCheck;
    	}
//10. 두수를 입력받아 큰 수를 출력하는 메소드를 구현하시오.
    	static void maxPrint(int a,int b)
    	{
    		System.out.println(a>b?a:b);
    	}
//11. 입력 받은 값이 짝수인지 홀수인지 판별하는 메소드를 구현하시오
          static void check2(int a)
          {
        	  if(a%2==0)
        		  System.out.println(a+"는(은) 짝수");
        	  else
        		  System.out.println(a+"는(은) 홀수");
          }
//12. 3의 배수를 판별하는 메소드를 구현하시오
          static int check3(int a)
          {
        	  if(a%3==0)
        		  System.out.println(a+"는(은) 3의 배수입니다");
        	  else
        		  System.out.println(a+"는(은) 3의 배수가 아닙니다");
        	  return a;
          }
//13. 년,월,일을 입력받아서 요일을 구하는 메소드를 구현하시오
          static char print6(int year,int month,int day)
          {
        	  int total=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
        	  int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
        	  if((year%4==0 && year%100!=0) || (year%400==0))
        		  lastday[1]=29;
        	  else
        		  lastday[1]=28;
        	  
        	  for(int i=0;i<month-1;i++)
        	  {
        		  total+=lastday[i];
        	  }
        	  total+=day;
        	  
        	  char[] strWeek= {'일','월','화','수','목','금','토'};
        	  int week=total%7;
        	  
        	 return strWeek[week];
        	  
        	  
        	  
          }
//14. 메소드를 정의하여 입력받은 숫자를 거꾸로 뒤집은 수를 출력하는 프로그램을 작성하세요
          static int print7(int a)
          {
        	  int reverse=0;
        	  while(a>0)
        	  {
        		  reverse=reverse*10+a%10;
        		  a/=10;
        		  
        	  }
        	  System.out.println(reverse);
        	  return reverse;
          }
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse("abcde");
		String ss=change2("asdfga");
		System.out.println(ss);
		hakjum(80);
		hakjum2(59);
		isYear(2024);
		maxPrint(1,2);
		check2(50);
		check3(30);
		print6(2024,12,4);
		print7(123);
		change("KdkqD");
		
   

	}

}
