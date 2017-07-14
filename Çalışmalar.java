package musab;

public class Çalismalar {

	public static String son_tekrar(String metin,int tekrar){
		String son="";
		if(tekrar<0){
			
			System.out.println("Please enter a positivie number");
			son="Error";	
		}
		else
			if(metin.length()<tekrar){
				System.out.println("Your number must be smaller than length of your text");
				son="Error";
			}
			else{
				for(int i=0;i<tekrar;i++){
					son=son+metin.substring(metin.length()-tekrar);
				}
			}
		
		return son;
	}
	 
	public static int [][] z_matris(final int boyut){
		int [][] matrix = new int[boyut][boyut];
		boolean rotate=false;
		int sayac=0;
		boolean go_on=true;
		
		for(int x=0;x<boyut;x++){
			for(int y=0;y<=x;y++){
				if(rotate){
					matrix[y][x-y]=sayac;
					sayac++;
				}
				else{
					matrix[x-y][y]=sayac;
					sayac++;
				}
			}
			rotate=!rotate;
			
		}
		
		sayac=boyut*boyut-1;
		if(boyut%2==0)
			rotate=!rotate;
		
		for(int x=0;x<boyut;x++){
			for(int y=0;y<x;y++){
				if(rotate){
					matrix[(boyut-1)-y][boyut-(x-y)]=sayac;
					sayac--;
				}
				else{
					matrix[boyut-(x-y)][(boyut-1)-y]=sayac;
					sayac--;
				}
			}
			rotate=!rotate;
		}
		
		for(int i=0;i<matrix.length;i++){
			System.out.println();
			for(int j=0;j<matrix.length;j++){
				System.out.print(matrix[i][j]+"\t");
			}
		}
		return matrix;
	}
	
	public static int [] change_array (int [] first_array,int k){
		int length=first_array.length;
		k=k%first_array.length;			// k will be in array length scala 
		int temp=0;
		
		for(int i=0;i<k;i++){
			temp=first_array[length-1];
			for(int j=0;j<length-1;j++){
				first_array[length-j-1]=first_array[(length-j-2)];
			}
			first_array[0]=temp;
		}
		return first_array;
	}
	
	public static void main(String[] args) {
	//	z_matris(4);
	/*	int [] array={1,2,3,4,5};
		change_array(array, 2);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ "\t");
		}
	*/
	}
}
