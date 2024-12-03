/*
 *   
 */
import java.util.Arrays;
import com.sist.data.*;
public class 문자열배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String seoul=ArrayData.arrayData("seoul_location.txt");
		String[] seoul_data=seoul.split("\n");// 전체에 대해 하나씩 나누기
		for(String s:seoul_data)// 한 데이터당 나누기
		{
			String[] data=s.split("\\|");
			if(data[3].contains("마포"))
			{
			System.out.println("번호:"+data[0]);
			System.out.println("명소명:"+data[1]);
			System.out.println("주소:"+data[3]);
			System.out.println("소개:"+data[2]);
			System.out.println("================================================");
			}
		}
		
	}

}
