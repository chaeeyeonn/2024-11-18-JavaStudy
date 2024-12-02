import java.util.Arrays;
import java.util.Scanner;
public class 연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//4. 양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라
        Scanner scan=new Scanner(System.in);
//        int[] num=new int[10];
//        for(int i=0;i<num.length;i++)
//        {
//        	System.out.print("정수 입력:");
//        	num[i]=scan.nextInt();        	
//        }
//        System.out.print(Arrays.toString(num));
//        System.out.println();
//        for(int i:num)
//        {
//        	if(i%3==0)
//        	{
//        		System.out.print(i+" ");
//        	}
//        }
        
// 5. 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라.
//     그리고 배열에 든 숫자들과 평균을 출력하라.
//      int[] num=new int[10];
//      int sum=0;
//      
//      for(int i=0;i<num.length;i++)
//      {
//      	num[i]=(int)(Math.random()*10)+1;     	
//      }
//      System.out.print(Arrays.toString(num));
//      for(int i=0;i<num.length;i++)
//      {
//    	  sum+=num[i];
//      }
//      System.out.println();
//      System.out.printf("평균:%.2f",sum/10.0);
        
// 6. int[] num = { 94, 85, 95, 88, 90 };
//    다음 배열에서 최대값,최소값을 출력하는 프로그램을 작성하시오
        
//      int[] num = { 94, 85, 95, 88, 90 };
//      int max=num[0];
//      int min=num[0];
//      
//      for(int i=0;i<num.length;i++)
//      {
//    	  if(max<num[i])
//    		  max=num[i];
//    	  if(min>num[i])
//    		  min=num[i];
//      }
//      System.out.printf("최대값: %d 최소값: %d",max,min);
        
// 8. arr 배열 중에서 인덱스가 1인 곳의 값을 출력해보자.
//      int[] arr={10,20,30,50,3,60,-3};
//      System.out.println(arr[1]);

// 9.  arr 배열 중에서 값이 60인 곳의 인덱스를 출력해보자. 
      int[] arr={10,20,30,50,3,60,-3};
      for(int i=0;i<arr.length;i++)
      {
    	  if(arr[i]==60)
      System.out.println(i);
      }



        
	}

}
