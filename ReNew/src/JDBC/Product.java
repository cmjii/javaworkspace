package JDBC;

public class Product {
	/*
	pno int not null auto_increment,
	pname varchar(200) not null,
	price int not null default 0,
	regdate datetime default now(),
	madeby text, 
	*/
	
	private int pno; //제품등록번호
	private String pname; //제품 이름
	private int price; // 가격
	private String regdate; //등록일자
	private String madeby; //설명
	
	//기본 생성자
	public Product() {}
	
	// 상품 등록을 위한 생성자
    public Product(String pname, int price, String madeby) {
        this.pname = pname;
        this.price = price;
        this.madeby = madeby;
    }
    
    // 상품 리스트 조회를 위한 생성자
    public Product(int pno, String pname, int price) {
        this.pno = pno;
        this.pname = pname;
        this.price = price;
    }
    
    // 제품 상세 정보 조회를 위한 생성자
    public Product(int pno, String pname, int price, String regdate, String madeby) {
        this.pno = pno;
        this.pname = pname;
        this.price = price;
        this.regdate = regdate;
        this.madeby = madeby;
    }
    
    // 상품 수정을 위한 생성자
    public Product(int pno, String pname, int price, String madeby) {
        this.pno = pno;
        this.pname = pname;
        this.price = price;
        this.madeby = madeby;
    }

    
    
	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getMadeby() {
		return madeby;
	}

	public void setMadeby(String madeby) {
		this.madeby = madeby;
	}

	
	@Override
	public String toString() {
		return "Product [pno=" + pno + ", pname=" + pname + ", price=" + price + ", regdate=" + regdate + ", madeby="
				+ madeby + "]";
	}
    
}
