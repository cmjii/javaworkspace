package day_18;

public class Word1 {

	private String word;
	private String mean;
	
	
	public Word1() {}
	public Word1(String word, String mean) {
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
	public void setMea��(String mean) {
		this.mean = mean;
	}
	
	
	@Override
	public String toString() {
		return  word +" : " + mean ;
	}
	
	
}
