import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char c='0';
		int a, counter;
		String s;
		Valor valores=new Valor();
		System.out.printf("Vamos iniciar a calculadora, digite o calculo que deseja executar: \n");
		for(counter=0;;counter=0){
			s=entrada.nextLine();
			while(counter<s.length()){				
				c=s.charAt(counter);
				counter++;
				if((c<'0')||(c>'9')){
					if(c=='c'||c=='C'){
						valores.clear();
					}
					else if(c=='+'||c=='-'||c=='*'||c=='/'||c=='='){
						valores.operacoes(c);
					}
				}
				else {
					a=(((int)c)-((int)'0'));
					valores.read(a);
				}
			}
		}

	}
}


