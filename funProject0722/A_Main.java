package funProject0722;
import java.util.Scanner;

public class A_Main {
	public static void main(String[] args) {
		boolean runsystem = true;
		Scanner sc = new Scanner(System.in);
		
		while(runsystem) {
		
		//[0]MAIN UI-START
			
			int selectmain;
			
			System.out.println("WHAT TO ANALYZE");
			System.out.println("M.HTS WILL HELP YOU");
			System.out.println("--------------------");
			System.out.println("SELECT MENU");               
			System.out.println("[1]INSTRUCTION [2]START [3]EXIT");	 
			
			selectmain = sc.nextInt();
			
				if (selectmain!=1 && selectmain!=2) {
					System.out.println("잘못된 선택입니다.");
				}
			
				else if(selectmain==1) {
					B_Instruction bring = new B_Instruction();
					bring.instruction();
					}
				
		//[0]MAIN UI-EXIT
				else if (selectmain==3) {
					System.out.println("프로그램 종료");
					runsystem = false;
				}
				
		//[1]STOCK INFO
				else if (selectmain==2) {
					C_StockInfoSelect bringStockInfo = new C_StockInfoSelect();
					bringStockInfo.addStockInfo();
				}
			
		//[2]CHOOSE INDUSTRY SECTOR
				
				D_Industry bringIndustry = new D_Industry();
				bringIndustry.chooseIndustry();
				
//		//[3]Preference Setting
//				
//				E_QuestionsSelect bringQuestions = new E_QuestionsSelect();
//				bringQuestions.answerQuestions();
//				
//		//[4]ANALYZE
//				
//				F_Analyze bringAnalysis = new F_Analyze();
//				bringAnalysis.startAnalysis();
//				
//		//[5]IMPORT AS TEXTFILE
//				
//				G_CreateFile bringtextfile =new G_CreateFile();
//				bringtextfile.createtextfile();
		}
	}
} 

