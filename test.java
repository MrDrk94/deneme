package tavlama;

import com.boragungoren.java.Klavye;
public class test {
static int tarlagenisligi;
static int domates;
static int fasulye;
static int m�s�r;
static double mutluluk;

public static int amac(int d,int m,int f){
	
	int amac=10*d+7*m+3*f;
	return amac;
	
}

public static void say��ret(){
	domates=(int)(Math.random()*3);
	m�s�r=(int)(Math.random()*tarlagenisligi/2+1);
	fasulye=(int)(Math.random()*tarlagenisligi/3)+1;
	
	while(2*domates+2*m�s�r+3*fasulye>tarlagenisligi)
		{
			domates=(int)(Math.random()*3);
			m�s�r=(int)(Math.random()*tarlagenisligi/2+1);
			fasulye=(int)(Math.random()*tarlagenisligi/3)+1;
		}
	
}


public static void main(String[] args) {
	System.out.println("Tarla genisli�ini giriniz");
		tarlagenisligi=Klavye.intOku();
		
		
		System.out.println("L�tfen ba�lang�� de�erlerinizi k�s�tlara dikkat ederek veriniz!!!");
		System.out.println("(Domates en fazla 2, fasulye en az 1 olmal�d�r :)  )");
	System.out.println("Domatesi girin");
		domates=Klavye.intOku();
	System.out.println("M�s�r� girin");
		m�s�r=Klavye.intOku();
	System.out.println("Fasulye girin");
		fasulye=Klavye.intOku();

		mutluluk=(amac(domates,m�s�r,fasulye));
		System.out.println("Ba�lang�� ��z�m�= "+mutluluk);
	
	int x=0;
	double temp;
	double T=100;
	while(x<1000){
		say��ret();
		temp=amac(domates,m�s�r,fasulye);
		if(temp>mutluluk)
		{
			mutluluk=temp;
			System.out.println("Domates: "+domates+"\t M�s�r: "+m�s�r+"\t Fasulye: "+fasulye+"\t Mutluluk De�eri: "+mutluluk);
		}
		else
			if(Math.exp((temp-mutluluk)/T)>Math.random()*1)
			{
					mutluluk=temp;	
					System.out.println("Domates: "+domates+"\t M�s�r: "+m�s�r+"\t Fasulye: "+fasulye+"\t Mutluluk De�eri: "+mutluluk);
			}
		x++;
		if(x%3==0)
			T=T*0.8;
	}
	
}	
}
