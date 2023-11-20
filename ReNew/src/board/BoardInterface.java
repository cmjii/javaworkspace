package board;

import java.util.Scanner;

public interface BoardInterface {
	
	void printMenu();
	void addBoard(Scanner scan); //등록
	void searchBoard(Scanner scan); //조회
	void modifyBoard(Scanner scan); //수정
	void removeBoard(Scanner scan); //삭제
	void printBoard(); //전체출력

	
}
