package word;

public class WordClass {
	
	private String word;
	private String mean;
	
	public WordClass() {}
	public WordClass(String word, String mean) {
		this.word = word;
		this.mean = mean;
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
		return "단어 : " + word + ", 뜻 : " + mean;
	}
	
	
	

}
