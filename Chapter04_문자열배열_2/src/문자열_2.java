import java.util.*;
public class 문자열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//새로운 메모리 저장공간 생성 => new
		String[] ids={"admin","hong","park","kim","shim"};
		String[] pwds={"1234","1234","1234","1234","1234"};
		String[] name={"이순신","홍길동","박문수","김두한","심청이"};
		//로그인 처리
		System.out.println("ID:");
		String id=scan.next();
		
		System.out.println("Password:");
		String pwd=scan.next(); //pwd 암호화 / 복호화 필요
		//encorder=decoder
		
		//1. id 체크
		int count=0;//반복문은 무조건 처음부터 ~ 디폴트 설정 필요
		int index=0;
		for(int i=0;i<ids.length;i++) {
			if(ids[i].equals(id))
			{
				count++;
				index=i;
				break;
			}
		
		
		}
		if(count==0)
		{
		    System.out.println("아이디가 존재하지 않습니다");
		}
		else//id 존재
		{
			//비밀번호 체크
			if(pwds[index].equals(pwd))
			{
			    System.out.println(name[index]+"님 로그인 되었습니다");
			}
			else//비밀번호 틀림
			{
				System.out.println("비밀번호가 틀립니다");
			}
		}
		

	}

}
