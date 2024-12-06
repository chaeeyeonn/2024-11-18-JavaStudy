package com.sist;
import java.util.*;
class MyBoard
{
	public void write()
	{
		System.out.println("글쓰기 처리");
	}
	public void list()
	{
		System.out.println("목록 처리");
	}
	public void update()
	{
		System.out.println("수정 처리");
	}
	public void delete()
	{
		System.out.println("삭제 처리");
	}
}
public class Board {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("글쓰기(write),수정하기(update),목록(list):");
		String cmd=scan.next();
		
		MyBoard m=new MyBoard();
		if(cmd.equals("write"))
		{
			m.write();
		}
		else if(cmd.equals("update"))
		{
			m.update();
		}
		else if(cmd.equals("list"))
		{
			m.list();
		}

	}

}
