package funProject0722;
import java.util.Scanner;

public class C_StockInfoSelect {

	Scanner sc = new Scanner(System.in);
	
	void addStockInfo() {
	
		int select;
		String manu = "수동입력";
		String auto = "Data Crawling";
		
		System.out.println("[1]"+manu);
		System.out.println("[2]"+auto);
		
		select = sc.nextInt();
		
	//[1-1]ADD MANUALLY
		if(select==1) {
			
			System.out.println("정보입력방식: ("+(manu)+")을/를 선택하셨습니다.");
			System.out.println();
			
			Scanner sc1 = new Scanner(System.in);
			
			System.out.print("회사명: ");
			String companyName = sc1.nextLine();
			System.out.print("시가총액(원): ");
			long marketCap = sc1.nextLong();
			System.out.print("52주 최고가(원): ");
			int highestPrice = sc1.nextInt();
			System.out.print("52주 최저가(원): ");
			int lowestPrice = sc1.nextInt();
			System.out.print("PER(%): ");
			double per = sc1.nextDouble();
			System.out.print("EPS(%): ");
			double eps = sc1.nextDouble();
			System.out.print("PBR(%): ");
			double pbr = sc1.nextDouble();
			System.out.print("BPS(%): ");
			double bps = sc1.nextDouble();
			System.out.print("배당수익률(%): ");
			double dividendRate = sc1.nextDouble();
			
	//[1-2]DATA CRAWLING
		} else if(select==2) {
			System.out.println("정보입력방식: ("+auto+")을/를 선택하셨습니다.");
			System.out.println("죄송합니다. 아직 구현되지 않은 기능입니다.");
		//data crawling 실행 + 맨 위에 100 입력시 뒤로 돌아가는 기능 구현
		} else if(select==0) {
			//수동입력 클래스에서 선언한 method 실행 + 맨 위에 [0] 입력시 뒤로 돌아가는 기능 구현
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}
