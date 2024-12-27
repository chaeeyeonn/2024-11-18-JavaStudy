package com.sist.main;
import java.io.Serializable;
/*
 *   객체 단위로 저장
 *     - 네트워크
 *       1. 값 형식 데이터: int / float / char / ... => 스택에 저장 직접 접근 가능
 *       2. 참조 형식 데이터: 객체 => 주소만 저장 => 실제 데이터 Heap에 저장
 *        => 값 자체를 저장 후 전송
 *        => 실제 값 저장 후 전송
 *     - 일반 프로그램: CVS / JSON => 자체에서 값을 저장된 상태
 *       
 *       참조 => 값: 시리얼라이즈(직렬화)
 *                 => implements Serialize
 *       => 값을 받을 경우에는 다시 참조형으로 저장(역직렬화)
 *                 => ObjectOutputStream / ObjectInputStream 사용
 *                 => 원상 복귀 가능
 *       ==> 오라클 탄생
 *       
 *   직렬화
 */
import java.util.*;
import java.io.*;
// 객체의 실제값을 스택(실제 저장값) => 다른 컴퓨터로 전송
// 직렬화 => 빅데이터 분석 => 하둡 => 파이썬(넘파일, 판다스, ...)
class Sawon implements Serializable
{
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private int pay;
	
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	//실제 값 저장 / 생성자
	public Sawon(int sabun, String name, String dept, String job, int pay) {
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.pay = pay;
	}
	//default 생성자 => 생성자가 이미 존재 => 자동 생성 불가
	public Sawon()
	{
		
	}
	
}
public class IO_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Sawon> list=new ArrayList<Sawon>();
		//Object 단위 => 데이터를 모아 저장 가능
		list.add(new Sawon(1,"홍길동","개발부","사원",3200));
		list.add(new Sawon(2,"심청이","총무부","과장",4000));
		list.add(new Sawon(3,"이순신","영업부","부장",5200));
		list.add(new Sawon(4,"강감찬","자재부","대리",3500));
		list.add(new Sawon(5,"춘향이","인사부","팀장",4200));
		ObjectOutputStream oos=null;
		try
		{
			File file=new File("c:\\java_data\\sawon_info.txt");
			if(!file.exists())//파일이 없다면
			{
				file.createNewFile();//파일을 만들어라
			}
			FileOutputStream fos=new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
			
			//저장 => 직렬화
			oos.writeObject(list);
			System.out.println("객체 단위 저장 완료");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				oos.close();
			}catch(Exception ex) {}
		}
	}

}
