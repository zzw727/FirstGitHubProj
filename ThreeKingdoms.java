package exercise;

import java.util.Scanner;

/**
 * 
 * @author ZhangGeezer
 * 	������ɱ��ȭ��Ϸ��ϵͳ
 * 
 */
public class ThreeKingdoms {

	public static void main(String[] args) {
		//����ɨ����
		Scanner inScanner = new Scanner(System.in);
		String choice = "";//ѭ������,����ʼֵ
		String opponentName = "";//������������
		String playerChuQuanName = "";//��ҳ�ȭ��ѧ��
		String npcChuQuanName = "";//NPC��ȭ��ѧ��
		int countWin = 0;//��¼Ӯ�Ĵ���
		int countLose = 0;//��¼��Ĵ���
		int countDogfall = 0;//��¼ƽ�ֵĴ���
		
		//��ʼ����ʼ����
		System.out.println("------------------------------\n");
		System.out.println("  ����ɱ��Ϸ������ʼ��ף����Ϸ���\n");
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
				npcChuQuanName = "ʯͷ";
			}else if(chuQuanNpc == 2) {
				npcChuQuanName = "����";
			}else if(chuQuanNpc == 3){
				npcChuQuanName = "��";
			}
			//��ӡ��Ϸ����
			System.out.println("1��ʯͷ����2��������������������");
			System.out.print("��ѡ����Ҫ����ȭ��");
			int chuQuanPlayer = inScanner.nextInt();//�������chuQuanPlayer��������ҳ�ȭ
			////�ж���������ȭ������ѧ����ֵ
			switch (chuQuanPlayer) {
			case 1:
				playerChuQuanName = "ʯͷ";
				break;
			case 2:
				playerChuQuanName = "����";
				break;
			default:
				playerChuQuanName = "��";
				break;
			}
			//��ӡ������Գ���ȭ
			System.out.println("��\t�����ǣ�" + playerChuQuanName);
			System.out.println(opponentName + "\t�����ǣ�" + npcChuQuanName);

			//�ж���Ӯ
			if(playerChuQuanName.equals(npcChuQuanName)) {
				System.out.println("---ƽ�֣�---\n");	
				countDogfall++;
			}else if(playerChuQuanName.equals("ʯͷ") && npcChuQuanName.equals("����")) {
				System.out.println("---��Ӯ�ˣ�---\n");
				countWin++;
			}else if(playerChuQuanName.equals("ʯͷ") && npcChuQuanName.equals("��")) {
				System.out.println("---�����ˣ�---\n");
				countLose++;
			}else if(playerChuQuanName.equals("����") && npcChuQuanName.equals("ʯͷ")) {
				System.out.println("---�����ˣ�---\n");
				countLose++;
			}else if(playerChuQuanName.equals("����") && npcChuQuanName.equals("��")) {
				System.out.println("---��Ӯ�ˣ�---\n");
				countWin++;
			}else if(playerChuQuanName.equals("��") && npcChuQuanName.equals("ʯͷ")) {
				System.out.println("---��Ӯ�ˣ�---\n");
				countWin++;
			}else if(playerChuQuanName.equals("��") && npcChuQuanName.equals("����")) {
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
