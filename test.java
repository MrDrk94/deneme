package tavlama;

import com.boragungoren.java.Klavye;
public class test {
static int tarlagenisligi;
static int domates;
static int fasulye;
static int misr;
static double mutluluk;

public static int amac(int d,int m,int f){
	
	int amac=10*d+7*m+3*f;
	return amac;
	
}

public static void sayiüret(){
	domates=(int)(Math.random()*3);
	misir=(int)(Math.random()*tarlagenisligi/2+1);
	fasulye=(int)(Math.random()*tarlagenisligi/3)+1;
	
	while(2*domates+2*misir+3*fasulye>tarlagenisligi)
		{
			domates=(int)(Math.random()*3);
			misir=(int)(Math.random()*tarlagenisligi/2+1);
			fasulye=(int)(Math.random()*tarlagenisligi/3)+1;
		}
	
}


public static void main(String[] args) {
	System.out.println("Tarla genisliðini giriniz");
		tarlagenisligi=Klavye.intOku();
		
		
		System.out.println("Lütfen baslngic degerlerinizi kisitlara dikkat ederek veriniz!!!");
		System.out.println("(Domates en fazla 2, fasulye en az 1 olmalidir :)  )");
	System.out.println("Domatesi girin");
		domates=Klavye.intOku();
	System.out.println("Mýsýrý girin");
		mýsýr=Klavye.intOku();
	System.out.println("Fasulye girin");
		fasulye=Klavye.intOku();

		mutluluk=(amac(domates,mýsýr,fasulye));
		System.out.println("Baþlangýç çözümü= "+mutluluk);
	
	int x=0;
	double temp;
	double T=100;
	while(x<1000){
		sayýüret();
		temp=amac(domates,mýsýr,fasulye);
		if(temp>mutluluk)
		{
			mutluluk=temp;
			System.out.println("Domates: "+domates+"\t Mýsýr: "+mýsýr+"\t Fasulye: "+fasulye+"\t Mutluluk Deðeri: "+mutluluk);
		}
		else
			if(Math.exp((temp-mutluluk)/T)>Math.random()*1)
			{
					mutluluk=temp;	
					System.out.println("Domates: "+domates+"\t Mýsýr: "+mýsýr+"\t Fasulye: "+fasulye+"\t Mutluluk Deðeri: "+mutluluk);
			}
		x++;
		if(x%3==0)
			T=T*0.8;
	}
	
}	
}
