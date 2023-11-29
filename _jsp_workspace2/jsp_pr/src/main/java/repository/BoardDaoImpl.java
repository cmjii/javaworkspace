package repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.BoardVO;
import orm.DatabaseBuilder;

public class BoardDaoImpl implements BoardDao {
	private static final Logger log = LoggerFactory.getLogger(BoardDaoImpl.class);
	
	private SqlSession sql;
	
	public BoardDaoImpl() {
		new DatabaseBuilder();
		sql = DatabaseBuilder.getFactory().openSession();
	}

	@Override
	public int insert(BoardVO bvo) {
		log.info(">> insert check3");
		int ok = sql.insert("BoardMapper.in",bvo);
		if(ok>0) sql.commit();
		return ok;
	}

	@Override
	public List<BoardVO> list() {
		log.info(">> list check3");
		
		return sql.selectList("BoardMapper.list");
	}

	@Override
	public BoardVO detail(int bno) {
		log.info(">> list check3");
		return sql.selectOne("BoardMapper.de",bno);
	}

	@Override
	public int readcountup(int bno) {
		log.info("readcount check3");
		int ok = sql.update("BoardMapper.re",bno);
		if(ok>0) sql.commit();
		return ok;
	}

	@Override
	public int edit(BoardVO bvo) {
		log.info("edit check3");
		int ok = sql.update("BoardMapper.up",bvo);
		if(ok>0) sql.commit();
		return ok;
	}
}
