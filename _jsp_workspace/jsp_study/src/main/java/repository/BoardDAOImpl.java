package repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import controller.BoardController;
import domain.BoardVO;
import domain.PagingVO;
import orm.DatabaseBuilder;

public class BoardDAOImpl implements BoardDAO {
	private static final Logger log = LoggerFactory.getLogger(BoardDAOImpl.class);
	
	//DB연결
	private SqlSession sql;
	
	public BoardDAOImpl() {
		new DatabaseBuilder();
		sql = DatabaseBuilder.getFactory().openSession();
	}

	//메서드 구현
	
	@Override
	public int insert(BoardVO bvo) {
		log.info(">>>> insert check 3");
		//실제 DB에 저장 => mybatis / mapper
		//sql.insert(mapperNamespace.id로 인식)
		int isOk = sql.insert("BoardMapper.add", bvo);
		//insert, update, delete시 DB가 변경괴는 구문
		if(isOk>0) {
			sql.commit();
		}
		return isOk;
	}

	@Override
	public List<BoardVO> selectList(PagingVO pgvo) {
		log.info(">>>> list check 3");
		return sql.selectList("BoardMapper.list",pgvo);
	}

	@Override
	public BoardVO getDeatil(int bno) {
		log.info(">>>> detail check 3");
		return sql.selectOne("BoardMapper.detail",bno);
	}

	@Override
	public int readcountUpdate(int bno) {
		log.info(">>>> detail readcount update check");
		int isOk = sql.update("BoardMapper.read",bno);
		if(isOk>0) {
			sql.commit();
		}
		return isOk;
	}


	@Override
	public int update(BoardVO bvo) {
		log.info(">>>> modify check3");
		int isOk = sql.update("BoardMapper.up",bvo);
		if(isOk>0) {
			sql.commit();
		}
		return isOk;
	}

	@Override
	public int delete(int bno) {
		log.info(">>>> remove check3");
		int isOk = sql.delete("BoardMapper.de",bno);
		if(isOk>0) {
			sql.commit();
		}
		return isOk;
	}


	@Override
	public int getTotal(PagingVO pgvo) {
		log.info(">>>> total check3");
		
		return sql.selectOne("BoardMapper.tot",pgvo);
	}

	@Override
	public String getFileName(int bno) {
	log.info(">>>>  check3");
		
		return sql.selectOne("BoardMapper.fileName",bno);
	}


}
