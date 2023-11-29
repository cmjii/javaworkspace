package repository;

import java.util.List;

import domain.BoardVO;

public interface BoardDao {

	int insert(BoardVO bvo);

	List<BoardVO> list();

	BoardVO detail(int bno);

	int readcountup(int bno);

	int edit(BoardVO bvo);

}
