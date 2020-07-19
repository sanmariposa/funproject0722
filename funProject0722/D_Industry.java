package funProject0722;
import java.util.Scanner;

public class D_Industry extends A_Main{

	Scanner sc = new Scanner(System.in);
	
	void chooseIndustry() {
	
		int select;
		select = sc.nextInt();
		
		String A1A = "건강";
		String B2B = "레저";
		String C3C = "항공+물류";
		String D4D = "금융";
		String E5E = "통신";
		String F6F = "전자제품";
		String G7G = "판매";
		String H8H = "원자재";
		String I9I = "에너지";
		String J10J = "일상용품";
		String K11K = "유틸리티";
		String L12L = "건설";
		String M13M = "디스플레이";
		String N14N = "자동차";
		String O15O = "IT";
		String P16P = "식료품";
		String Q17Q = "기타";
		
		System.out.println("////////////////");
		System.out.println("산업군을 선택해 주세요");
		System.out.println("[1]"+A1A+"\t"+"\t"+"[2]"+B2B+"\t"+"\t"+"[3]"+C3C+"\t"+"[4]"+D4D);
		System.out.println("[5]"+E5E+"\t"+"\t"+"[6]"+F6F+"\t"+"[7]"+G7G+"\t"+"\t"+"[8]"+H8H);
		System.out.println("[9]"+I9I+"\t"+"\t"+"[10]"+J10J+"\t"+"[11]"+K11K+"\t"+"[12]"+L12L);
		System.out.println("[13]"+M13M+"\t"+"[14]"+N14N+"\t"+"[15]"+O15O+"\t"+"\t"+"[16]"+P16P);
		System.out.println("[17]"+Q17Q);
			
		System.out.println();
			

		}
	}

