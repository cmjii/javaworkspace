package Word;

import java.util.Objects;

public class word implements Comparable{

	//단어, 의미
	//정렬 -> Comparator 구현 객체
	//기존 클래스 + Comparable 구현
	//정렬 (equals 비교하여 정렬)
	//어떤 값을 기준을 정렬 할 것인가
	
	private String word;
	private String mean;
	
	public word () {}
	public word (String word, String mean) {
		this.word=word;
		this.mean=mean;
	}
	
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}
	@Override
	public String toString() {
		return "word=" + word + " mean=" + mean ;
	}
	
	@Override
	public int compareTo(Object o) {
		// 내 클래스의 객체 값과, 매개변수로 들어오는 객체의 값을 비교
		// Comparator (이미 완성된 컬렉션에서 앞의 값과 뒤의 값을 비교)
		word word = (word)o;
		return this.word.compareTo(word.word); //갈색 글씨가 매개변수 검은색 글씨는 클래스명
		//내림차순 결과 앞에 -부호만 변경
		//return -this.word.compareTo(word.word);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(mean, word);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) //실제 주소가 같은지 확인
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		word other = (word) obj;
		return Objects.equals(mean, other.mean) && Objects.equals(word, other.word);
	}
	
	
	
	
}
