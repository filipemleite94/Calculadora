public class Valor {
	protected double valor1, valor2;
	protected char operando2;
	public Valor(){
		valor1=0;
		valor2=0;
		operando2='+';
	}
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
		valor2=0;
		operando2=operando;
	}
	public void read(double valor){
		if(operando2=='='){
			valor1=0;
			operando2='+';
		}
		valor2=10*valor2+valor;
	}
	public void clear(){
		valor1=0;
		valor2=0;
		operando2='+';
	}
}
