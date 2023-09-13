package Word;

import java.util.Objects;

public class word implements Comparable{

	//�ܾ�, �ǹ�
	//���� -> Comparator ���� ��ü
	//���� Ŭ���� + Comparable ����
	//���� (equals ���Ͽ� ����)
	//� ���� ������ ���� �� ���ΰ�
	
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
		// �� Ŭ������ ��ü ����, �Ű������� ������ ��ü�� ���� ��
		// Comparator (�̹� �ϼ��� �÷��ǿ��� ���� ���� ���� ���� ��)
		word word = (word)o;
		return this.word.compareTo(word.word); //���� �۾��� �Ű����� ������ �۾��� Ŭ������
		//�������� ��� �տ� -��ȣ�� ����
		//return -this.word.compareTo(word.word);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(mean, word);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) //���� �ּҰ� ������ Ȯ��
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		word other = (word) obj;
		return Objects.equals(mean, other.mean) && Objects.equals(word, other.word);
	}
	
	
	
	
}
