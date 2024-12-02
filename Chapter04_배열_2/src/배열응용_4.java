/*
 *   정렬
 *    = 선택정렬 select sort / 버블정렬
 *    = ASC / DESC =====> Oracle: Order by
 *      ---   ----
 *      오름차순 / 내림차순(****) => 최신순 위해 
 *      
 *    86page~96page => 1차원 배열
 *    알고리즘 => 정렬 알고리즘 => 108page
 *    
 *    1. 선택정렬: 한 개의 데이터를 선택 후 기준점으로 변경
 *    내림차순 만들기
 *    10 30 50 20 40
 *    -- --
 *    30 10
 *    --    --
 *    50    30
 *    --       --
 *    50       20
 *    --          --
 *    50          40
 *    ---------------1round: for문 한 번 수행
 *    50 10 30 20 40
 *    -- -- --
 *    고정30 10
 *       --    --
 *       30    20
 *       --       --
 *       40       30
 *    ---------------2round
 *    ...
 *    ...
 *    ==> 앞에서부터 하나씩 비교 후 맨 앞 자리 고정
 *    ==> 총 4round
 *    i(round)    j(비교횟수) ==> i+j=5, j=5-i
 *    1           4                      - arr.length-1
 *    2           3
 *    3           2
 *    4           1       
 *    
 */
public class 배열응용_4 {
    static void sort(int[] arr)//main 안에 들어가면 못 쓰니 밖에다 둔 것
    {
    for(int i=0;i<arr.length-1;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])//내림차순 / 부등호 반대면 오름차순
			{
				int temp=arr[i];//임시로 받아둘 변수 생성
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		//초기화
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("정렬 전:");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		//정렬
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])//내림차순 / 부등호 반대면 오름차순
				{
					int temp=arr[i];//임시로 받아둘 변수 생성
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("정렬 후:");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}

	}

}
