package exercise;

import java.util.Scanner;

/**
 * 
 * @author ZhangGeezer
 * 	������ɱ��ȭ��Ϸ��ϵͳ �޸İ汾
 * 
 */
public class ThreeKingdoms {

	public static void main(String[] args) {
		//����ɨ����
		Scanner inScanner = new Scanner(System.in);
		String choice = "";//ѭ������,����ʼֵ
		String opponentName = "";//������������
		boolean judgePrint = true;//�ж������Ƿ�����
		String PlayerchuQuanName = "";//��ҳ�ȭ��ѧ��
		String NpcchuQuanName = "";//NPC��ȭ��ѧ��
		int countWin = 0;//��¼Ӯ�Ĵ���
		int countLose = 0;//��¼��Ĵ���
		int countDogfall = 0;//��¼ƽ�ֵĴ���
		
		//��ʼ����ʼ����
		System.out.println("------------------------------\n");
		System.out.println("  ����ɱ��Ϸ�޸İ汾������ʼ��ף����Ϸ���\n");
		System.out.println("------------------------------");
		//��ʾѡ�����
		System.out.println("1���ܲ٣���2�����𣩣�3����褣�");
		System.out.print("��ѡ����Ķ��֣�");
		int opponentChoice = inScanner.nextInt();//������ֱ���opponentChoice�����ռ���¼��Ķ���ѡ��
		//switch�ṹ�������������ж�ѡ�������λӢ��NPC,Ȼ���opponentName��ֵ����Ӣ������
		switch (opponentChoice) {
		case 1:
			opponentName = "�ܲ�";
			break;
		case 2:
			opponentName = "����";
			break;
		case 3:
			opponentName = "���";
			break;
		default:
			System.out.println("��������ϵͳ�쳣�˳���");
			return;
		}
		//��ӡ���ѡ��Ķ���
		System.out.println("��ѡ��Ķ����ǣ�" + opponentName + "\n");
		//��ȷ��ѭ�����������ҿ϶�ִ��һ�Σ�ʹ��do-whileѭ����ѭ������Ϊ�������y
		do {

			int chuQuanNpc = (int)(Math.random()*3)+1;//����1��2��3֮����������
			//�ж�NPC�����ȭ������ѧ����ֵ
			if (chuQuanNpc == 1) {
				NpcchuQuanName = "ʯͷ";
			}else if(chuQuanNpc == 2) {
				NpcchuQuanName = "����";
			}else if(chuQuanNpc == 3){
				NpcchuQuanName = "��";
			}
			//��ӡ��Ϸ����
			System.out.println("1��ʯͷ����2��������������������");
			System.out.print("��ѡ����Ҫ����ȭ��");
			int chuQuanPlayer = inScanner.nextInt();//�������chuQuanPlayer��������ҳ�ȭ
			////�ж���������ȭ������ѧ����ֵ
			switch (chuQuanPlayer) {
			case 1:
				PlayerchuQuanName = "ʯͷ";
				break;
			case 2:
				PlayerchuQuanName = "����";
				break;
			default:
				PlayerchuQuanName = "��";
				break;
			}
			//��ӡ������Գ���ȭ
			System.out.println("��\t�����ǣ�" + PlayerchuQuanName);
			System.out.println(opponentName + "\t�����ǣ�" + NpcchuQuanName);

			//�ж���Ӯ
			if(PlayerchuQuanName.equals(NpcchuQuanName)) {
				System.out.println("---ƽ�֣�---\n");	
				countDogfall++;
			}else if(PlayerchuQuanName.equals("ʯͷ") && NpcchuQuanName.equals("����")) {
				System.out.println("---��Ӯ�ˣ�---\n");
				countWin++;
			}else if(PlayerchuQuanName.equals("ʯͷ") && NpcchuQuanName.equals("��")) {
				System.out.println("---�����ˣ�---\n");
				countLose++;
			}else if(PlayerchuQuanName.equals("����") && NpcchuQuanName.equals("ʯͷ")) {
				System.out.println("---�����ˣ�---\n");
				countLose++;
			}else if(PlayerchuQuanName.equals("����") && NpcchuQuanName.equals("��")) {
				System.out.println("---��Ӯ�ˣ�---\n");
				countWin++;
			}else if(PlayerchuQuanName.equals("��") && NpcchuQuanName.equals("ʯͷ")) {
				System.out.println("---��Ӯ�ˣ�---\n");
				countWin++;
			}else if(PlayerchuQuanName.equals("��") && NpcchuQuanName.equals("����")) {
				System.out.println("---�����ˣ�---\n");
				countLose++;
			}
			System.out.println("����y���ǣ�����������");
			System.out.print("�Ƿ������һ�֣�");
			choice = inScanner.next();
			System.out.println();


		}while(choice.equals("y"));
		
		//��Ϸ������ӡ������
		System.out.println("----- ������Ϸ��������л���룡-----");
		System.out.println("���˴���Ϸ��Ӯ��" + countWin + "�Σ�����" + countLose + "�Σ�ƽ��" + countDogfall + "��");
	}

}
