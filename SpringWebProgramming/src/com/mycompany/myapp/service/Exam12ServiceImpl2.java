package com.mycompany.myapp.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.mycompany.myapp.dao.Exam12Dao;
import com.mycompany.myapp.dto.Exam12Board;
import com.mycompany.myapp.dto.Exam12Member;

@Component
public class Exam12ServiceImpl2 implements Exam12Service{
	//@Autowired// 의 경우는 타입을 보고 넣는다. EXam12Dao 인터페이스 구현한 객체가 두개이기 때문에 어떤 것으로 해야 할지 몰라서 에러가 난다. 그렇기 때문에Resource 를 넣는다.
	@Resource(name="exam12DaoImpl2")// 디폴트 값이 없기 때문에 name 을 써줘야 한다. 인터페이스를 사용할때는 타입을 쓴다 그렇기 때문에 정확한 어떤 객체를 사용할지 알아야 한다.
	private Exam12Dao dao;

	@Override
	public void boardWrite(Exam12Board board) {
		dao.boardInsert(board);
	}

	
	@Override
	public List<Exam12Board> boardListAll() {
		List<Exam12Board> list = dao.boardSelectAll();
		return list;
	}
	
	@Override
	public List<Exam12Board> boardListPage(int pageNo, int rowsPerPage) {
		List<Exam12Board> list = dao.boardSelectPage(pageNo, rowsPerPage);
		return list;
	}
	
	@Override
	public int boardTotalRows() {
		int totalRows = dao.boardCountAll();
		return totalRows;
	}
	@Override
	public Exam12Board getBoard(int bno) {
		Exam12Board board = dao.boardSelectByBno(bno);
		board.setBhitcount(board.getBhitcount() + 1);
		dao.boardUpdateBhitcount(bno, board.getBhitcount());
		return board;
	}
	@Override
	public String boardCheckBpassword(int bno, String bpassword) {
		String result = "fail";
		Exam12Board board = dao.boardSelectByBno(bno);
		if(board.getBpassword().equals(bpassword)){
			result = "success";
		}
		return result;
	}
	@Override
	public void boardUpdate(Exam12Board board) {
		dao.boardUpdate(board);
	}
	@Override
	public void boardDelete(int bno) {
		dao.boardDelete(bno);
	}
	
	//// MEMBER////////////////////////////////////////
	
	@Override
	public void memberJoin(Exam12Member member) {
		dao.memberInsert(member);
	}
	@Override
	public List<Exam12Member> memberListPage(int pageNo, int rowsPerPage) {
		List<Exam12Member> list = dao.memberSelectPage(pageNo, rowsPerPage);
		return list;
	}
	@Override
	public int memberTotalRows() {
		int totalRows = dao.memberCountAll();
		return totalRows;
	}
	@Override
	public Exam12Member getMember(String mid) {
		Exam12Member member = dao.memberSelectByMid(mid);
		return member;
	}
	@Override
	public String memberCheckBpassword(String mid, String mpassword) {
		String result = "fail";
		Exam12Member member = dao.memberSelectByMid(mid);
		if(member.getMpassword().equals(mpassword)){
			result = "success";
		}
		return result;
	}
	@Override
	public void memberUpdate(Exam12Member member) {
		dao.memberUpdate(member);
	}
	@Override
	public void memberDelete(String mid) {
		dao.memberDelete(mid);
	}
}
