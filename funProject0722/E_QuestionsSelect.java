
package funProject0722;
import java.util.Scanner;


public class E_QuestionsSelect {

	Scanner sc = new Scanner(System.in);

	byte either1;
	byte either2;
	byte either3;
	byte either4;
	byte either5;
	byte either6;
	byte either7;
	byte either8;
	byte either9;
	byte either10;
	
	public void ment1() {
		System.out.println("다음 선호사항의 번호를 입력해주세요");
		System.out.println();}
		

	E_QuestionsSelect ment = new E_QuestionsSelect();
	public void answerQuestions() {
		
	System.out.println("양자택일 질문을 통해 기호를 파악하는 단계입니다.");	
	System.out.println("선호유형의 번호를 입력해주세요.");
	
	//[보유기간]
	System.out.println("보유기간");
	System.out.println("[1]장기 vs [2]단기");
	either1 = sc.nextByte();
	  //[보유기간][장기]
	  if(either1==1) {
		System.out.println("[1]장기 보유 을/를 선택하셨습니다.");
		ment.ment1();
		//[수익구조]
		System.out.println("수익구조");
		System.out.println("[1]시세차익 vs [2]배당수익");
		either2 = sc.nextByte();
			//[수익구조][시세차익]
			if(either2==1) {
				System.out.println("[1]시세차익 을/를 선택하셨습니다.");
				ment.ment1();
				//[시장민감도]
				System.out.println("시장민감도");
				System.out.println("[1]양 vs [2]음");
				either3 = sc.nextByte();
					//[시장민감도][양]
					if(either3==1) {
						System.out.println("[1]양의 시장민감도 을/를 선택하셨습니다.");
						ment.ment1();
						//[시장민감도][양][높은 절대치 vs 낮은 절대치]
						System.out.println("시장민감도 정도");
						System.out.println("[1]높은 절대치 vs [2]낮은 절대치");
						either4 = sc.nextByte();
					}
					//[시장민감도][음]
					if(either3==2) {
						System.out.println("[2]음의 시장민감도 을/를 선택하셨습니다.");
						ment.ment1();
						//[시장민감도][음][높은 절대치 vs 0에 가까움]
						System.out.println("시장민감도 정도");
						System.out.println("[1]높은 절대치 vs [2]낮은 절대치");
						either4 = sc.nextByte();
					}
			//[수익구조][배당수익]
			if(either2==2) {
				System.out.println("[2]배당수익 을/를 선택하셨습니다.");
				//여기에다가 break; 와 같은 질문을 끝내는 기능을 넣어야함 (배당 정도 골랐을때)
			}
		}
	}
	  
		//수익구조 - 배당수익
		if(either2==2) {}
	  //[보유기간][단기]
	  if(either1==2) {
		System.out.println("[2]단기 보유를 선택하셨습니다.");
		ment.ment1();
		//[수익구조]
		System.out.println("수익구조");
		System.out.println("[1]시세차익 vs [2]배당수익");
		either2 = sc.nextByte();
			//[수익구조][시세차익]
			if(either2==1) {
				System.out.println("[1]시세차익 을/를 선택하셨습니다.");
				ment.ment1();
				//[시장민감도]
				System.out.println("시장민감도");
				System.out.println("[1]양 vs [2]음");
				either3 = sc.nextByte();
					//[시장민감도][양]
					if(either3==1) {
						System.out.println("[1]양의 시장민감도 을/를 선택하셨습니다.");
						ment.ment1();
						//[시장민감도][양][높은 절대치 vs 낮은 절대치]
						System.out.println("시장민감도 정도");
						System.out.println("[1]높은 절대치 vs [2]낮은 절대치");
						either4 = sc.nextByte();
					}
					//[시장민감도][음]
					if(either3==2) {
						System.out.println("[2]음의 시장민감도 을/를 선택하셨습니다.");
						ment.ment1();
						//[시장민감도][음][높은 절대치 vs 0에 가까움]
						System.out.println("시장민감도 정도");
						System.out.println("[1]높은 절대치 vs [2]낮은 절대치");
						either4 = sc.nextByte();
					}
			//[수익구조][배당수익]
			if(either2==2) {
				System.out.println("[2]배당수익 을/를 선택하셨습니다.");
				//여기에다가 break; 와 같은 질문을 끝내는 기능을 넣어야함 (배당 정도 골랐을때)
		
			}
		}
	}
}
	
	
	//series of questions -> answered -> one final value with many variables added 
}
