/*1.
 *  ABCD
 *  EFGH
 *  IJKL
 *  MNOP
 */
/*2.
 *  ABCD
 *  ABCD
 *  ABCD
 *  ABCD
 */
/*3.
 *  AAAA
 *  BBBB
 *  CCCC
 *  DDDD
 */
/*4.
 *   #123
 *   1#23
 *   12#3
 *   123#
 */
/*
 * 5.
 *   ★
 *   ★★
 *   ★★★
 *   ★★★★
 *   
 *   i     j
 *   줄수   별수 => i=j
 *   1     1
 *   2     2
 *   3     3
 *   4     4
 */
/*
 * 6.
 *   ★★★★
 *   ★★★
 *   ★★
 *   ★
 *   
 *   i     j    => 역순 => 더하기
 *   줄수   별수
 *   1     4   i+j=5 => j=5-i
 *   2     3
 *   3     2
 *   4     1
 *   
 */
/*
 * 7.
 *   주사위 2개를 던져서 6이 나올 경우의 수 출력
 */
/*
 * 8.
 *       ＊
 *      ＊＊
 *     ＊＊＊
 *    ＊＊＊＊
 *    i+j=4 => j=4-i
 *    i=k
 *    i     j      k
 *    줄수   공백   별표
 *    1     3      1
 *    2     2      2
 *    3     1      3
 *    4     0      4
 */
/*
 * 9.
 *    ＊＊＊＊
 *      ＊＊＊
 *       ＊＊
 *        ＊
 *   i=j+1 => j=i-1
 *   i+k=5 => k=5-i
 *   i    j     k
 *   줄수  공백   별표
 *   1    0     4
 *   2    1     3
 *   3    2     2
 *   4    3     1
 */
public class 반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // char c='A' // 1.3. 계속 증가
//		char c='A';//1.3.
/*		for(int i=1;i<=4;i++)
		{
//			for(int j=1;j<=4;j++)
//				{
//				  System.out.print(c++);
//				}
			//char c='A';//2. 이차 for문 조건대로 증가 후 돌아옴
			for(int j=1;j<=4;j++)
			{
//				System.out.print(c);
				if(i==j)//4. 1번칸=1번줄 / 2번칸=2번줄 ...
					System.out.print("#");
				else//4.
					System.out.print(j);// 이차 for문 그대로 숫자 입력
			}
//			c++;//3.
			System.out.println();*/
//		}
 /*          for(int i=1;i<=4;i++)
           {
        	   for(int j=1;j<=5-i;j++)// 5. => j=i / 6.
        	   {
        		   System.out.print("★");
        	   }
        	   System.out.println();
	}*/
/*		    for(int i=1;i<=6;i++)//7.
		    {
		    	for(int j=1;j<=6;j++)
		    	{
		    		if(i+j==6)
		    		{
		    			//System.out.print("["+i+","+j+"]");
		    			System.out.printf("[%d,%d]\n",i,j);
		    		}
		    	}
		    }*/
		
		for(int i=1;i<=4;i++)//8. 9.
	    {
	    	//공백
			for(int j=1;j<=i-1;j++)// 9.
			{
				System.out.print(" ");
			}
			//별표
			for(int k=1;k<=5-i;k++)//9. => 변수간의 규칙성 찾기
			{
				System.out.print("*");
			}
			System.out.println();
	    }
}
}
