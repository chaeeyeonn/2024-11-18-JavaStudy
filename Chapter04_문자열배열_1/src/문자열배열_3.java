import java.util.*;
import com.sist.data.*;
public class 문자열배열_3 {
	/*
	 *   클래스 => 한 개에 대한 정보
	 *   class Music
	 *   {
	 *    String title,singer,album,state;
	 *    int modify
	 *   }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] title=ArrayData.title;
		String[] singer=ArrayData.singer;
		String[] album=ArrayData.album;
		String[] state=ArrayData.state;
		int[] modify=ArrayData.modify;//증감 횟수
		// => String[][] music=new String[50][5]; 2차원 배열
		// => Music[] music=new Music[50]; 사용자 정의 데이터형
		
		// 뮤직 목록 출력
		System.out.println("Music Top50");
		for(int i=0;i<title.length;i++)
		{
			String s=state[i];
			String m="";
			if(s.equals("유지"))
			{
				m="-";
			}
			else if(s.equals("상승"))
			{
				m="▲ "+modify[i];
			}
			else if(s.equals("하강"))
			{
				m="▼ "+modify[i];
			}
			System.out.println((i+1)+"."+m+" "+title[i]+" "+singer[i]+" "+album[i]);
		}
		System.out.println("============================================================");
		//검색 만들기
//		Scanner scan=new Scanner(System.in);
//		System.out.println("카테고리 선택(곡명(1),가수명(2)):");
//		int menu=scan.nextInt();
//		
//		if(menu==1)
//		{
//			System.out.print("제목 입력:");
//			String name=scan.next();
//			int count=0;
//			for(int i=0;i<title.length;i++)
//			{
//				if(title[i].contains(name))
//				{
//					System.out.println("노래명:"+title[i]);
//					System.out.println("가수명:"+singer[i]);
//					System.out.println("앨범명:"+album[i]);
//					System.out.println("등폭:"+(state[i].equals("유지")?"유지":state[i]+" "+modify));
//					count++;
//					System.out.println("======================================================");
//				}
//			}
//			System.out.println("총 "+count+"건 검색");
//		}
//		else if(menu==2)
//		{
//			System.out.print("가수 입력:");
//			String name=scan.next();
//			int count=0;
//			for(int i=0;i<singer.length;i++)
//			{
//				if(singer[i].contains(name))
//				{
//					System.out.println("노래명:"+title[i]);
//					System.out.println("가수명:"+singer[i]);
//					System.out.println("앨범명:"+album[i]);
//					System.out.println("등폭:"+(state[i].equals("유지")?"유지":state[i]+" "+modify));
//					count++;
//					System.out.println("======================================================");
//				}
//			}
//			System.out.println("총 "+count+"건 검색");
//		}
		
// 등폭이 가장 많은(최대값) / 가장 적은(최소값) 노래명, 가수명 출력하기
		int min=100;
		for(int i=0;i<50;i++)//노래 50곡
		{
			if(min>modify[i] && modify[i]!=0)
			{
				min=modify[i];
			}
		}
		System.out.println("min="+min);
		//max값에 해당하는 index 번호 구하기
		int count=0;
		//count => 등폭값이 같을 수 있으니 해당 등폭값에 대한 배열 수 찾기위한 변수 설정 => 가변형
		for(int i=0;i<50;i++)
		{
			if(min==modify[i])
			{
				count++;
			}
		}
		System.out.println("배열 개수:"+count);
		int[] arr=new int[count];//동적 배열 생성(개수가 설정되어있지 않음)
		int j=0;
		for(int i=0;i<50;i++)
		{
			if(min==modify[i])
			{
				arr[j]=i;
				j++;
			}
		}
		//데이터출력
		for(int i:arr)
		{
			System.out.println(title[i]+" "+singer[i]);
		}
	}

}
