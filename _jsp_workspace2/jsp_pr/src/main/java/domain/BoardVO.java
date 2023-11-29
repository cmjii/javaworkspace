package domain;

public class BoardVO {
	//번호, 제목, 작성자, 날짜, 수정날짜, 조회
	private int bno;
	private String title;
	private String writer;
	private String content;
	private String regdate;
	private String moddate;
	private int readcount;
	
	public BoardVO() {}
	
	//insert
	public BoardVO(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
	}

	//list
	public BoardVO(int bno, String title, String writer, String regdate, int readcount) {
		this.title = title;
		this.writer = writer;
		this.bno = bno;
		this.regdate = regdate;
		this.readcount = readcount;
	}
	
	//update
	public BoardVO(int bno, String title, String content) {

		this.bno = bno;
		this.title = title;
		this.content = content;
	}
	
	//detail
	public BoardVO(int bno, String title, String writer, String content, String regdate, String moddate,
			int readcount) {

		this.bno = bno;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regdate = regdate;
		this.moddate = moddate;
		this.readcount = readcount;
	}
	
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getModdate() {
		return moddate;
	}
	public void setModdate(String moddate) {
		this.moddate = moddate;
	}
	public int getReadcount() {
		return readcount;
	}
	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}
	
	
	@Override
	public String toString() {
		return "번호 : " + bno + ", 제목 : " + title + ", 작성자 : " + writer + ", 내용 : " + content + ", 작성일 : "
				+ regdate + ", 수정일 : " + moddate + ", 조회 : " + readcount + "]";
	}
	
}
