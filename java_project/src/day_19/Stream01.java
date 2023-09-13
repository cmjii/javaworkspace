package day_19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream01 {

	public static void main(String[] args) {
		/* Stream(��Ʈ��) : �ڷ��� ���� ������� ������ ������ ���� �� �� �ֵ��� ���ִ� �ݺ���
		 * ��Ұ� �ϳ��� �귯���� ���·� ó��
		 * ��Ʈ���� �����Ͽ� ������ �����ϸ� ��Ʈ���� �Ҹ� ��
		 * ���� �Ұ� -> �ٸ� ������ �����Ϸ��� �ٽ� ��Ʈ�� ����
		 * ��Ʈ�� ������ ���� �ڷḦ �������� ����.
		 * 
		 * �߰����� : filter( ���ǿ� �´� ��Ҹ� ����), distinct(�ߺ�����)
		 * 		sorted(����), map(����),,,
		 * �������� : sum(). forEach(). reduce(���),,,
		 * */
		
		Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9);
		int[] arr = {10,20,30,40,50};
		IntStream arrStream = Arrays.stream(arr);
		Long cnt = arrStream.count(); //�̹� �Ҹ� ��
		//int sum = arrStream.sum(); // �ٽ� ��� �Ұ�
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(cnt);
		System.out.println(sum);
		
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println(avg);
		
		int sum1 = Arrays.stream(arr).filter(b->b>=30).sum();
		System.out.println(sum1);
		
		String[] str = {"a","b","c","d"};
		Stream<String> strStream = Arrays.stream(str);
		
		//���� �迭���� 70�̻��� ������ �հ踦 ���
		int[] numArr = {50,78,96,85,45,35,12};
		
		//���� ������� ���
		int asum =0;
		for(int i =0; i<numArr.length; i++) {
			if(numArr[i]>=70)
			asum += numArr[i];
		} System.out.println(asum);
		
		//stream���� ���
		
		int asum1 = Arrays.stream(numArr).filter(n->n>=70).sum();
		System.out.println("stream���� ����: "+asum1);
		
		//����Ʈ�� ��Ʈ�� ����
		//����Ʈ�� ���� ����Ʈ ���� 70�̻��� ������ �հ�
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(78);
		list.add(98);
		list.add(45);
		list.add(85);
		list.add(63);
		list.add(52);
		
		//sum int��Ʈ�������� ��� ����
		int listsum = list.stream()
				.filter(n->n>=70)
				.mapToInt(t->t.intValue())
				.sum();
		System.out.println("Integer stream: " + listsum);
		
		Stream<Integer> s = list.stream();
		s.filter(b->b>=7).forEach(n-> System.out.print(n+" "));
		System.out.println(list.stream().mapToInt(n->n.intValue()).count());
	}

}
