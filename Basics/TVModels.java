import java.util.Scanner;

public class Main {
	
	int N, M;
	int[] TV;    // �Ǹŵ� TV ��
	int[] sold;  // �Ǹż���
	int[] score; // �α⵵
	
	void inputData() {
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		TV = new int[100000 + 10];
		sold = new int[100000 + 10];
		score = new int[100000 + 10];
		
		for(i = 0; i < N; i++) {
			TV[i] = sc.nextInt();
		}
		
		sc.close();
	}
	
	int Solve() {
		int i, max;
		
		// �� �� �Ǹż����� ī��Ʈ
		for (i = 0; i < N; i++) {
			sold[TV[i]]++;
		}

		// ���� ����� ���� �α⵵ ��� (�α⵵ = �Ǹż���)
		for (i = 1; i <= M; i++) {
			score[i] = sold[i];
		}
		
		// �α⵵�� ���� ���� �𵨹�ȣ ã��
		max = 1;
		for (i = 2; i <= M; i++) {
			if(score[i] > score[max]) max = i;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		
		m.inputData();					//	�Է� �Լ�
		int sol = m.Solve();			//	���� Ǯ��
		
		System.out.println(sol);		//	���� ���

	}
}

