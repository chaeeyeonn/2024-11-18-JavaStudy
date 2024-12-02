/*
 *   # 3명의 학생 => 국,영,수 점수 입력
 *   => 총점, 평균, 학점, 등수 출력
 */
import java.util.Scanner;
public class 배열응용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//int[][] arr=new int[3][7]; => 2차원 배열
		int[] kor=new int[3];//1번, 2번, 3번 => 인덱스 번호 일치해야 함
		int[] eng=new int[3];// 000
		int[] math=new int[3];
		
		int[] total=new int[3];
		double[] avg=new double[3];//앞뒤 데이터형 맞추기 / 0.0,0.0,0.0
		char[] score=new char[3];// '\0'
		int[] rank=new int[3];
		
		//점수 입력 받아 초기화 => avg
		for(int i=0;i<kor.length;i++)
		{
			System.out.print((i+1)+"국어 입력:");
			kor[i]=scan.nextInt();
			
			System.out.print((i+1)+"영어 입력:");
			eng[i]=scan.nextInt();
			
			System.out.print((i+1)+"수학 입력:");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			
			avg[i]=total[i]/3.0;
		}
		// 학점 계산
		for(int i=0;i<kor.length;i++)
		{
			switch((int)(avg[i])/10)//정수,문자,문자열만 가능하여 10으로 나눔
			{
			case 10: case 9:
				score[i]='A';
				break;
			case 8:
				score[i]='B';
				break;
			case 7:
				score[i]='C';
				break;
			case 6:
				score[i]='D';
				break;
			default:
				score[i]='F';
			}
		}
		// 등수 계산
		for(int i=0;i<kor.length;i++)
		{
			rank[i]=1;
			for(int j=0;j<kor.length;j++)
			{
				if(total[i]<total[j])
					rank[i]++;
			}
		}
		//출력
		for(int i=0;i<kor.length;i++)
		{
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c%-5d\n",kor[i],eng[i],math[i],total[i],avg[i],score[i],rank[i]);// %0d => 해당 숫자만큼의 공간 확보 => %5d=2칸 쓰면 3칸 공백 후 글자
			                                                                               // %-0d => 왼쪽 정렬 => 공백을 출력 => %-5d => 글자 먼저 수 공백 3칸
			// JDK1.5이상에서만 사용 가능
			// C언어와 동일 => exe파일: C언어에서 도입 / 썬 => 순수하게 자바로만 라이브러리 추가
			// 오라클에서 자바 인수 => C언어로 변경이 되는 경향
		}
	
		
		

	}

}
