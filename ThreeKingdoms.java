package exercise;

import java.util.Scanner;

/**
 * 
 * @author ZhangGeezer
 * 	《三国杀猜拳游戏》系统 修改版本
 * 
 */
public class ThreeKingdoms {

	public static void main(String[] args) {
		//定义扫描器
		Scanner inScanner = new Scanner(System.in);
		String choice = "";//循环变量,赋初始值
		String opponentName = "";//对手姓名变量
		boolean judgePrint = true;//判断输入是否正常
		String PlayerchuQuanName = "";//玩家出拳的学名
		String NpcchuQuanName = "";//NPC出拳的学名
		int countWin = 0;//记录赢的次数
		int countLose = 0;//记录输的次数
		int countDogfall = 0;//记录平局的次数
		
		//初始化开始界面
		System.out.println("------------------------------\n");
		System.out.println("  三国杀游戏修改版本即将开始，祝您游戏愉快\n");
		System.out.println("------------------------------");
		//提示选择对手
		System.out.println("1（曹操），2（关羽），3（周瑜）");
		System.out.print("请选择你的对手：");
		int opponentChoice = inScanner.nextInt();//定义对手变量opponentChoice，接收键盘录入的队友选择
		//switch结构根据输入数字判断选择的是哪位英雄NPC,然后给opponentName赋值保存英雄名字
		switch (opponentChoice) {
		case 1:
			opponentName = "曹操";
			break;
		case 2:
			opponentName = "关羽";
			break;
		case 3:
			opponentName = "周瑜";
			break;
		default:
			System.out.println("输入有误！系统异常退出！");
			return;
		}
		//打印输出选择的对手
		System.out.println("您选择的对手是：" + opponentName + "\n");
		//不确定循环次数，并且肯定执行一次，使用do-while循环，循环条件为输入的是y
		do {

			int chuQuanNpc = (int)(Math.random()*3)+1;//生成1，2，3之间的随机整数
			//判断NPC随机出拳，并给学名赋值
			if (chuQuanNpc == 1) {
				NpcchuQuanName = "石头";
			}else if(chuQuanNpc == 2) {
				NpcchuQuanName = "剪刀";
			}else if(chuQuanNpc == 3){
				NpcchuQuanName = "布";
			}
			//打印游戏界面
			System.out.println("1（石头），2（剪刀），其他（布）");
			System.out.print("请选择你要出的拳：");
			int chuQuanPlayer = inScanner.nextInt();//定义变量chuQuanPlayer，接收玩家出拳
			////判断玩家随机出拳，并给学名赋值
			switch (chuQuanPlayer) {
			case 1:
				PlayerchuQuanName = "石头";
				break;
			case 2:
				PlayerchuQuanName = "剪刀";
				break;
			default:
				PlayerchuQuanName = "布";
				break;
			}
			//打印输出各自出的拳
			System.out.println("你\t出的是：" + PlayerchuQuanName);
			System.out.println(opponentName + "\t出的是：" + NpcchuQuanName);

			//判断输赢
			if(PlayerchuQuanName.equals(NpcchuQuanName)) {
				System.out.println("---平局！---\n");	
				countDogfall++;
			}else if(PlayerchuQuanName.equals("石头") && NpcchuQuanName.equals("剪刀")) {
				System.out.println("---你赢了！---\n");
				countWin++;
			}else if(PlayerchuQuanName.equals("石头") && NpcchuQuanName.equals("布")) {
				System.out.println("---你输了！---\n");
				countLose++;
			}else if(PlayerchuQuanName.equals("剪刀") && NpcchuQuanName.equals("石头")) {
				System.out.println("---你输了！---\n");
				countLose++;
			}else if(PlayerchuQuanName.equals("剪刀") && NpcchuQuanName.equals("布")) {
				System.out.println("---你赢了！---\n");
				countWin++;
			}else if(PlayerchuQuanName.equals("布") && NpcchuQuanName.equals("石头")) {
				System.out.println("---你赢了！---\n");
				countWin++;
			}else if(PlayerchuQuanName.equals("布") && NpcchuQuanName.equals("剪刀")) {
				System.out.println("---你输了！---\n");
				countLose++;
			}
			System.out.println("输入y（是），其他（否）");
			System.out.print("是否继续下一局：");
			choice = inScanner.next();
			System.out.println();


		}while(choice.equals("y"));
		
		//游戏结束打印输出结果
		System.out.println("----- 本次游戏结束，感谢参与！-----");
		System.out.println("您此次游戏，赢了" + countWin + "次，输了" + countLose + "次，平局" + countDogfall + "次");
	}

}
