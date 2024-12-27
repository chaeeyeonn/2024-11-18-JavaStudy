package com.sist.board;
import java.util.*;
import java.io.*;
public class BoardManager {
	// 게시물을 모아서 관리
	// 게시물이 모든 사용자에게 공유되어야 함
	private static List<BoardVO> boardList=new ArrayList<BoardVO>();
	// 오라클 => 저장된 데이터가 static => 공유된 데이터
	// 초기화
	public BoardManager()
	{
		boardGetData();
	}
	// 기능 설정
	// 1. 목록 출력 => 페이지 나누기 => Read
	public List<BoardVO> boardListData(int page)
	{
		List<BoardVO> list=new ArrayList<BoardVO>();
		int j=0; // 10개씩 나눠주는 변수
		int pagecnt=(page*10)-10; // 시작 위치 => 1페이지: 0~9
		// 오라클 => WHERE rownum BETWEEN 1 AND 10
		List<BoardVO> temp=new ArrayList<BoardVO>();
		// 최신순(역순)으로 배열 위해 뒤에서부터 add 출력
		for(int i=boardList.size()-1;i>=0;i--) 
		{
			temp.add(boardList.get(i));
		}
		// 페이지별 출력(10개씩)
		for(int i=0;i<temp.size();i++)
		{
			if(j<10 && i>=pagecnt)
			{
				BoardVO vo=temp.get(i);
				list.add(vo);
				j++;
			}
		}
		return list;
	}
	// 2. 추가 => Create
	public void boardInsert(BoardVO vo)
	{
		boardList.add(vo);// ArrayList에 저장 후
		boardSave();// 파일 변경까지 마쳐야 함
	}
	// 3. 상세보기 
	public BoardVO boardDetailData(int no)
	{
		BoardVO vo=new BoardVO();
		for(BoardVO dvo:boardList)// 조회수 증가
		{
			if(dvo.getNo()==no)
			{
				dvo.setHit(dvo.getHit()+1);
				boardSave();
				break;
			}
		}
		
		boardGetData();
		
		for(BoardVO dvo:boardList)// 상세보기 데이터 찾기
		{
			if(dvo.getNo()==no)
			{
				vo=dvo;
				break;
			}
		}
		return vo;
	}
	// 4. 수정 / 삭제 => Update / Delete => CRUD
	public BoardVO boardUpdateData(int no)
	{
		BoardVO vo=new BoardVO();
		for(BoardVO dvo:boardList)
		{
			if(dvo.getNo()==no)
			{
				vo=dvo;
				break;
			}
		}
		return vo;
	}
	public boolean boardUpdate(BoardVO vo)
	{
		boolean bCheck=false;
		int index=0;		
		for(int i=0;i<boardList.size();i++)
		{
			BoardVO dvo=boardList.get(i);
			if(vo.getNo()==dvo.getNo())
			{
				index=i;
				break;
			}
		}
		BoardVO dvo=boardList.get(index);
		if(dvo.getPwd().equals(vo.getPwd()))
		{
			bCheck=true;
			boardList.set(index, vo);// 수정 => List에서만 수정됨
			boardSave();// 파일 변경
		}
		else
		{
			bCheck=false;
		}
		return bCheck;
	}
	public boolean boardDelete(int no,String pwd)
	{
		boolean bCheck=true;
		
		for(BoardVO vo:boardList)
		{
			if(vo.getNo()==no)
			{
				if(vo.getPwd().equals(pwd))
				{
					if(!vo.getPwd().equals(pwd))
					{
						bCheck=false;
						return bCheck;
					}

				}
			}
		}
		int index=0;
		// remove(int index)
		for(int i=0;i<boardList.size();i++)
		{
			BoardVO vo=boardList.get(i);
			if(vo.getNo()==no)
			{
				index=i;
				break;
			}
		}
		// 삭제
		boardList.remove(index);
		boardSave(); // 파일 저장
		
		return bCheck;
	}
	// 5. 찾기 => 검색
	// => 오라클 => SELECT / INSERT / UPDATE / DELETE => DML
	// 중복 사항: 저장 / 읽기 => 별도 메소드 제작
	// 추가 / 수정 / 삭제 시 데이터 읽기
	public void boardGetData()// 추가될 때마다 다시 읽고 있어야 하니 중복 사항
	{
		ObjectInputStream ois=null;
		try
		{
			FileInputStream fis=new FileInputStream("c:\\java_data\\board.txt");
			ois=new ObjectInputStream(fis);
			boardList=(List<BoardVO>)ois.readObject();
			//ObjectInputStream => 파일과 연결
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				ois.close();
			}catch(Exception ex) {}
		}
	}
	// => 자바: 자동으로 갱신 안 함 => 저장 , 읽기 모두 따로 만들어야 함 => 메소드 호출 필요
	// 수정 / 추가 / 삭제 시 데이터 변경
	public void boardSave()
	{
		ObjectOutputStream oos=null;
		try
		{
			FileOutputStream fos=new FileOutputStream("c:\\java_data\\board.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(boardList);
			// 수정 => boardList.set() 
			// 삭제 => boardList.remove()
			// 추가 => boardList.add()
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
	// 총페이지 구하기
	public int boardTotalPage()
	{
		return (int)(Math.ceil(boardList.size()/10.0)); // 한 페이지에 10개씩
	}
	// + 게시물 번호 자동 생성 => 시퀀스 Create Sequence
	public int boardSequence()
	{
		int max=0;
		
		try//맨 처음에 값이 없으므로(게시글 아직 하나도 없으니) 오류 예외 처리
		{
		for(BoardVO vo:boardList)
		{
			if(vo.getNo()>max)
			{
				max=vo.getNo();
			}
		}
		}catch(Exception ex) {}
		return max+1; // 자동으로 1이 생성
	}

}
