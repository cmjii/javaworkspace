package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.BoardVO;
import domain.PagingVO;
import handler.PagingHandler;
import service.BoardService;
import service.BoardServiceImpl;


@WebServlet("/brd/*")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(BoardController.class);	
	private RequestDispatcher rdp;	
	private String destpage;
	private int ok;
	private BoardService bsv;
	
    public BoardController() {
    	bsv = new BoardServiceImpl();
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/")+1);
		
		switch(path) {
		case "register" : 
			destpage = "/board/register.jsp";
			break;
		
		case "insert" :
			try {
				String title = request.getParameter("title");
				String writer = request.getParameter("writer");
				String content = request.getParameter("content");
				BoardVO bvo = new BoardVO(title, writer, content);
				ok = bsv.insert(bvo);
				log.info(">>> ok "+(ok>0? "OK":"Fail"));
				destpage = "/index.jsp";
			} catch (Exception e) {
				e.printStackTrace();
				log.info("insert ERROR");
			}
			break;
			
		case "list" :
				try {
					//페이지네이션
					PagingVO pgvo = new PagingVO();
					log.info(request.getParameter("pageNo"));
					if(request.getParameter("pageNo") != null) {
						int pageNo = Integer.parseInt(request.getParameter("pageNo"));
						int qty = Integer.parseInt(request.getParameter("qty"));
						String type = request.getParameter("type");
						String keyword = request.getParameter("keyword");
						log.info(">>> pageNo / qty"+pageNo +"/"+qty+" / "+type+" / " + keyword);
						pgvo = new PagingVO(pageNo, qty,type,keyword);
					}
					int totalCount = bsv.gettotal(pgvo);
					PagingHandler ph = new PagingHandler(pgvo, totalCount);
					request.setAttribute("ph", ph);
					//리스트
					List<BoardVO> list=bsv.getList(pgvo);
					request.setAttribute("list", list);
					destpage = "/board/list.jsp";
				} catch (Exception e) {
					e.printStackTrace();
					log.info("list ERROR");
				}
			break;
			
		case "detail" :
			try {
				int bno = Integer.parseInt(request.getParameter("bno"));
				BoardVO bvo = bsv.getDetail(bno);
				request.setAttribute("bvo", bvo);
				destpage="/board/detail.jsp";
				
			} catch (Exception e) {
				e.printStackTrace();
				log.info("detail ERROR");
			}
			break;
		case "modify":
			try {
				int bno = Integer.parseInt(request.getParameter("bno"));
				BoardVO bvo = bsv.getDetail(bno);
				request.setAttribute("bvo", bvo);
				destpage="/board/modify.jsp";
			} catch (Exception e) {
				e.printStackTrace();
				log.info("modify ERROR");
			}
			break;
		case "edit":
			try {
				int bno = Integer.parseInt(request.getParameter("bno"));
				String title = request.getParameter("title");
				String content = request.getParameter("content");
				BoardVO bvo = new BoardVO(bno, title, content);
				ok = bsv.edit(bvo);
				destpage = "/brd/list";
			} catch (Exception e) {
				e.printStackTrace();
				log.info("edit ERROR");
			}
			break;
		case "remove":
			try {
				int bno = Integer.parseInt(request.getParameter("bno"));
				ok = bsv.remove(bno);
				destpage = "/brd/list";
			} catch (Exception e) {
				e.printStackTrace();
				log.info("remove ERROR");
			}
			break;
	
		}

		rdp = request.getRequestDispatcher(destpage);
		rdp.forward(request, response); //요청에 필요한 객체를 가지고 destPage 경로로 전송
		
	}

	
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

}
