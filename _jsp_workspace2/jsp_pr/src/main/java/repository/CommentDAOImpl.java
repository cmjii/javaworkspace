package repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.CommentVO;
import orm.DatabaseBuilder;

public class CommentDAOImpl implements CommentDAO {
	
	private static Logger log = LoggerFactory.getLogger(CommentDAOImpl.class);
	private SqlSession sql;
	private int isok;
	
	public CommentDAOImpl() {
		new DatabaseBuilder();
		sql = DatabaseBuilder.getFactory().openSession();
	}

	@Override
	public int insert(CommentVO cvo) {
		log.info("post check3");
		isok = sql.insert("CommentMapper.post",cvo);
		if(isok>0)sql.commit();
		return isok;
	}

	@Override
	public List<CommentVO> getList(int bno) {
		log.info("list check3");
		return sql.selectList("CommentMapper.list",bno);
	}
	
}
