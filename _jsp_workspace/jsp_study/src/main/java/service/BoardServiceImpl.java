package service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import controller.BoardController;
import domain.BoardVO;
import domain.PagingVO;
import repository.BoardDAO;
import repository.BoardDAOImpl;

public class BoardServiceImpl implements BoardService {
	private static final Logger log = LoggerFactory.getLogger(BoardServiceImpl.class);
	
	private BoardDAO bdao; //interface로 생성
	
	private CommentServiceImpl 	csv = new CommentServiceImpl();
	
	public BoardServiceImpl() {
		bdao = new BoardDAOImpl(); //class로 생성 bdao 구현 객체 생성
	}

	@Override
	public int register(BoardVO bvo) {
		log.info(">>>>> insert check2");
		return bdao.insert(bvo);
	}

	@Override
	public List<BoardVO> getList(PagingVO pgvo) {
		log.info(">>>> list check2");
		return bdao.selectList(pgvo);
	}

	@Override
	public BoardVO getDetail(int bno) {
		log.info(">>>> detail check2");
		//detail 체크시 readcount +1
		int isOk = bdao.readcountUpdate(bno);
		return bdao.getDeatil(bno);
	}

	@Override
	public int modify(BoardVO bvo) {
		log.info(">>>> modify check2");
		return bdao.update(bvo);
	}

	@Override
	public int remove(int bno) {
		log.info(">>>> remove check2");
		//지우기 전에 댓글 삭제 하고 글 지우기
		int isok = csv.removeAllbno(bno);
		return bdao.delete(bno);
	}

	@Override
	public int getTotal(PagingVO pgvo) {
		log.info(">>>> total check2");
		return bdao.getTotal(pgvo);
	}

	@Override
	public String getFileName(int bno) {
		log.info(">>>> FileName check2");
		return bdao.getFileName(bno);
	}


}
