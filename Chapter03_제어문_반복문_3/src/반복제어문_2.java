/*
 *   for(int i=1;i<=3;i++)
 *   {
 *     for(int j=1;j<=3;j++)
 *     {
 *       if(j==2)
 *         break; ==> 1. j가 있는 for문만 제어 => i는 정상 작동
 *      }
 *      break; => 2.한 번 수행 후 종료
 *   }
 *   1.
 *   i=1 ==> j=1
 *   i=2 ==> j=1
 *   i=3 ==> j=1
 *   
 *   2.
 *   i=1,j=1
 *   i=1,j=2
 */
public class 반복제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1;i<=3;i++)
//			   {
//			     for(int j=1;j<=3;j++)
//			     {
//			       if(j==2)
//			        break; 
//			       System.out.println("i="+i+",j="+j);
//			       }
//			       break; 
//			    }
		//이름이 있는 break(잘 사용 안 함)
		outer:for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
					break outer;//원하는 지점으로 가서 break를 걸 수 있음(outer있는 지점)
				System.out.println("i="+i+",j="+j);
			}
				
		}

	}

}
