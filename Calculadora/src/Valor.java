//Essa classe vai ser onde acontece de verdade as operações da calculadora.
public class Valor {
	//inicialização das variáveis que vão ser utilizadas.
	protected double valor1, valor2;
	protected char operando2;
	public Valor(){
		valor1=0;
		valor2=0;
		operando2='+';
	}
	
	//Operações a ser realizadas
	public void operacoes(char operando){
		if(operando2=='+'){
			valor1=valor1+valor2;
		}
		else if(operando2=='-'){
			valor1=valor1-valor2;
		}
		else if(operando2=='*'){
			valor1=valor1*valor2;
		}
		else if(operando2=='/'){
			valor1=valor1/valor2;
		}
		if (operando=='='){
			System.out.print(valor1);
		}
		
		//Uma vez guardado o resultado da operação passada no valor1 reinicia-se a variável valor 2 e prepara-se
		//o operando pra receber uma nova operação.
		valor2=0;
		operando2=operando;
	}
	
	//Aqui o valor que está entre operandos é armazenado em valor 2
	public void read(double valor){
		if(operando2=='='){
			valor1=0;
			operando2='+';
		}
		valor2=10*valor2+valor;
	}
	
	//A calculadora é reniciada
	public void clear(){
		valor1=0;
		valor2=0;
		operando2='+';
	}
}
