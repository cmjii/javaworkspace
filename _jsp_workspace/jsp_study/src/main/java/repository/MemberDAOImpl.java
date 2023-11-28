package repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.MemberVO;
import orm.DatabaseBuilder;
import service.MemberServiceImpl;

public class MemberDAOImpl implements MemberDAO {

	private static final Logger log =
			LoggerFactory.getLogger(MemberServiceImpl.class);
	//sql Session 객체
	private SqlSession sql;
	
	public MemberDAOImpl() {
		new DatabaseBuilder();
		sql = DatabaseBuilder.getFactory().openSession();
	}

	@Override
	public int insert(MemberVO mvo) {
		log.info(" >> join check3");
		int isOk = sql.insert("MemberMapper.reg",mvo);
		if(isOk>0) {
			sql.commit();
		}
		return isOk;
	}

	@Override
	public MemberVO login(MemberVO mvo) {
		log.info(" >> login check3");
		return sql.selectOne("MemberMapper.login",mvo);
	}

	@Override
	public int lastLogin(String id) {
		log.info(" >> lastLogin check 3");
		int isOk = sql.update("MemberMapper.last",id);
		if(isOk>0) {
			sql.commit();
		}
		return isOk;
	}

	@Override
	public List<MemberVO> selectlist() {
		log.info(" >> list check 3");
		return sql.selectList("MemberMapper.list");
	}

	@Override
	public int memdetail(MemberVO mvo) {
		log.info(" >>detail check 3");
		int isOk = sql.update("MemberMapper.detail",mvo);
		if(isOk>0) {
			sql.commit();
		}
		return isOk;
	}

	@Override
	public int memremove(String id) {
		log.info(" >>remove check 3");
		int isOk = sql.delete("MemberMapper.re",id);
		if(isOk>0) {
			sql.commit();
		}
		return isOk;
	}



}
