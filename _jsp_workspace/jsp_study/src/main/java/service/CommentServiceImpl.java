package service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.CommentVO;
import repository.CommentDAO;
import repository.CommentDAOImpl;

public class CommentServiceImpl implements CommentService {

	private static Logger log = LoggerFactory.getLogger(CommentServiceImpl.class);
	private CommentDAO cdao;
	
	public CommentServiceImpl() {
		cdao= new CommentDAOImpl();
	}

	@Override
	public int post(CommentVO cvo) {
		log.info("post check2");
		return cdao.insert(cvo);
	}

	@Override
	public List<CommentVO> getlist(int bno) {
		log.info("list check2");
		return cdao.getList(bno);
	}

	@Override
	public int remove(int cno) {
		log.info("remove check2");
		return cdao.delete(cno);
	}

	@Override
	public int modify(CommentVO cvo) {
		log.info("modify check2");
		return cdao.update(cvo);
	}

	public int removeAllbno(int bno) {
		// TODO Auto-generated method stub
		log.info("removeAllbno check2");
		return cdao.removeAll(bno);
	}


	
}
