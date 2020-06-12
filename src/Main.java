import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/* 
		entrada de dados string
		  
		Scanner sc = new Scanner(System.in);		
		String x;
		x = sc.next();
		
		System.out.println ("Você digitou: " + x);
		sc.close();

------------------------------------------------------------------------------------------------------------------------
		
		entrada de dados int
		
		Scanner sc = new Scanner(System.in);
		int x;		
		x = sc.nextInt();
		
		System.out.println ("Você digitou: " + x);
		sc.close(); 
		
------------------------------------------------------------------------------------------------------------------------
		
		entrada de dados double
		
		Scanner sc = new Scanner(System.in);
		double x;
		x = sc.nextDouble();
		
		System.out.printf("Você digitou: %.2f%n", x);
		sc.close();
		
------------------------------------------------------------------------------------------------------------------------
		
		entrada de dados char
		
		Scanner sc = new Scanner(System.in);
		char x;
		x = sc.next().charAt(0);
		
		System.out.println("você digitou: " + x);
		sc.close();
		
------------------------------------------------------------------------------------------------------------------------

		entrada de dados diversos
		
		Scanner sc = new Scanner(System.in);
		String x;
		int y;
		double z;
		char h;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		h = sc.next().charAt(0);
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(h);
		sc.close();
		
-----------------------------------------------------------------------------------------------------------------------		
		
		entrada de dados para string recebendo caracteres ate pressionar enter (texto)
		Scanner sc = new Scanner(System.in);
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();
		
------------------------------------------------------------------------------------------------------------------------		
		
		entrada de dados para string recebendo caracteres e outras variaveis ate pressionar enter (texto)
		Scanner sc = new Scanner(System.in);
		String s1, s2, s3;
		int a;
		
		a = sc.nextInt();
	(inserir um nexline a mais para consumir a quebra de linha)
	    sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println(a);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();
		
------------------------------------------------------------------------------------------------------------------------		
		
		operações matemáticas no java		
		double x = 9.00;
		double y = 4.00;
		double z = -5.00;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.pow(y, x);
		C = Math.abs(z);
		
		System.out.println("a raiz quadrada de " + x + " é " + A);
		System.out.println(y + " elevado a " + x + " é " + B);
		System.out.println("o valor absoluto de " + z + " é " + C);
		
------------------------------------------------------------------------------------------------------------------------

		EXERCICIOS DE ESTRUTURA SEQUENCIAL
		exercicio 1) 
		
		Scanner sc = new Scanner(System.in);
		int x, y, z, h, d, r;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("SOMA: " + (x + y));
		
		z = sc.nextInt();
		h = sc.nextInt();
		
		System.out.println("SOMA: " + (z + h));
		
		d = sc.nextInt();
		r = sc.nextInt();
		
		
		System.out.println("SOMA: " + (d + r));
		
		sc.close();
		
		exercicio 2) 
		
		Scanner sc = new Scanner(System.in);
		double r1, a1, r2, a2, r3, a3, pi = 3.14159;
		r1= sc.nextDouble();
		sc.nextLine();
		a1 = pi * Math.pow(r1, 2);
		
		System.out.printf("Área do Círculo 1 = %.4f%n", a1);
		
		r2= sc.nextDouble();
		a2 = pi * Math.pow(r2, 2);
		
		System.out.printf("Área do Círculo 2 = %.4f%n", a2);
		
		r3 = sc.nextDouble();
		a3 = pi * Math.pow(r3, 2);
		
		System.out.printf("Área do Círculo 3 = %.4f", a3);
		
		
		exercicio 3)
		
		Scanner sc = new Scanner(System.in);
		int A1, B1, C1, D1, P1, A2, B2, C2, D2, P2;
		A1 = sc.nextInt();
		sc.nextLine();
		B1 = sc.nextInt();
		C1 = sc.nextInt();
		D1 = sc.nextInt();
		P1 = (A1 * B1 - C1 * D1);
	
		System.out.println("DIFERENCA = " + P1);
		
		A2 = sc.nextInt();
		B2 = sc.nextInt();
		C2 = sc.nextInt();
		D2 = sc.nextInt();
		P2 = (A2 * B2 - C2 * D2);
		
		System.out.println("DIFERENÇA = " + P2);
		sc.close();
		
		
		exercicio 4)
		
		Scanner sc = new Scanner(System.in);
		int codfunc, horas, codfunc2, horas2, codfunc3, horas3;
		double porhora, salario, porhora2, salario2, porhora3, salario3;
		codfunc = sc.nextInt();
		sc.nextLine();
		horas = sc.nextInt();
		porhora = sc.nextDouble();
		salario = (double) horas * porhora;
		codfunc2 = sc.nextInt();
		horas2 = sc.nextInt();
		porhora2 = sc.nextDouble();
		salario2 = (double) horas2 * porhora2;
		codfunc3 = sc.nextInt();
		horas3 = sc.nextInt();
		porhora3 = sc.nextDouble();
		salario3 = (double) horas3 * porhora3;
		
		System.out.printf("Número: %d%nSalário: R$ %.2f%nNúmero: %d%nSalário: R$ %.2f%nNúmero: %d%nSalário: R$ %.2f", codfunc, salario, codfunc2, salario2, codfunc3, salario3);
		sc.close();
		
		exercicio 5)
		
		Scanner sc = new Scanner(System.in);
		int cod1, qtde1, cod1_2, qtde1_2, cod2, qtde2, cod2_2, qtde2_2, cod3, qtde3, cod3_2, qtde3_2;
		double val1, val1_2, valtot1, val2, val2_2, valtot2, val3, val3_2, valtot3;
		
		cod1 = sc.nextInt();
		qtde1 = sc.nextInt();
		val1= sc.nextDouble();
		cod1_2 = sc.nextInt();
		qtde1_2 = sc.nextInt();
		val1_2= sc.nextDouble();
		valtot1 = (double) (qtde1 * val1 + qtde1_2 *val1_2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valtot1);
		
		cod2 = sc.nextInt();
		qtde2 = sc.nextInt();
		val2= sc.nextDouble();
		cod2_2 = sc.nextInt();
		qtde2_2 = sc.nextInt();
		val2_2= sc.nextDouble();
		valtot2 = (double) (qtde2 * val2 + qtde2_2 * val2_2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valtot2);
		
		cod3 = sc.nextInt();
		qtde3 = sc.nextInt();
		val3= sc.nextDouble();
		cod3_2 = sc.nextInt();
		qtde3_2 = sc.nextInt();
		val3_2= sc.nextDouble();
		valtot3 = (double) (qtde3 * val3 + qtde3_2 * val3_2);

		System.out.printf("VALOR A PAGAR: R$ %.2f", valtot3);

		sc.close();
		
		exercicio 6)
		
		Scanner sc = new Scanner(System.in);
		double A, B, C, at90, acirculo, atrapezio, aquadrado, aretangulo, pi, A2, B2, C2, at902, acirculo2, atrapezio2, aquadrado2, aretangulo2;
		
		A = sc.nextDouble();
		B = sc.nextDouble(); 
		C = sc.nextDouble();
		at90 = (A * C / 2);
		pi = 3.14159;
		acirculo = pi * Math.pow(C, 2);
		atrapezio = (A + B) * C / 2;
		aquadrado = Math.pow(B, 2);
		aretangulo = A * B;
		
		System.out.printf("Área do Triângulo: %.3f%nÁrea do Círculo: %.3f%nÁrea do Trapézio: %.3f%nÁrea do Quadrado: %.3f%nÁrea do Retângulo: %.3f%n", at90, acirculo, atrapezio, aquadrado, aretangulo);
	
		
		A2 = sc.nextDouble();
		B2 = sc.nextDouble(); 
		C2 = sc.nextDouble();
		at902 = (A2 * C2 / 2);
		acirculo2 = pi * Math.pow(C2, 2);
		atrapezio2 = (A2 + B2) * C2 / 2;
		aquadrado2 = Math.pow(B2, 2);
		aretangulo2 = A2 * B2;
		
		System.out.printf("Área do Triângulo: %.3f%nÁrea do Círculo: %.3f%nÁrea do Trapézio: %.3f%nÁrea do Quadrado: %.3f%nÁrea do Retângulo: %.3f%n", at902, acirculo2, atrapezio2, aquadrado2, aretangulo2);
		sc.close();
		
----------------------------------------------------------------------------------------------------------------------------
		
		EXERCÍCIOS DE ESTRUTURA CONDICIONAL
		exercicio 1)
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if (x < 0) 
			System.out.println(x + " é um número NEGATIVO");
		else 
			System.out.println(x + " é um número POSITIVO");
		sc.close();
		
		exercicio 2)

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if (x % 2 == 0) 
			System.out.println(x + " é um número PAR");
		else 
			System.out.println(x + " é um número IMPAR");
		sc.close();
		
		exercicio 3)

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0)
			System.out.println(A + " e " + B + " SÃO MÚLTIPLOS");
		else
			System.out.println(A + " e " + B + " NÃO SÃO MÚLTIPLOS");
		sc.close();
		
		exercicio 4)
		
		Scanner sc = new Scanner(System.in);
		int inicio = sc.nextInt();
		int fim = sc.nextInt();
		

		if (inicio < fim)
			System.out.println("O JOGO DUROU " + (fim - inicio) + " HORAS.");
		
		else			
			System.out.println("O JOGO DUROU " + (24 - inicio + fim) + " HORAS.");
		
		sc.close();
		
		
		exercicio 5)
		
		Scanner sc = new Scanner(System.in);
		int cod = sc.nextInt();
		double qtde = sc.nextDouble();
				
		if (cod == 1) {
			System.out.printf("O valor a pagar é: R$ %.2f", (qtde * 4.0));
		}
		else if (cod == 2) {
			System.out.printf("O valor a pagar é: R$ %.2f", (qtde * 4.5));
		}
		else if (cod == 3) {
			System.out.printf("O valor a pagar é: R$ %.2f", (qtde * 5.0));
		}
		else if (cod == 4) {
			System.out.printf("O valor a pagar é: R$ %.2f", (qtde * 2.0));
		}
		else if (cod == 5) {
			System.out.printf("O valor a pagar é: R$ %.2f", (qtde * 1.5));
		}
		else 
			System.out.printf("O código do produto digitado é iválido.");
		sc.close();
		
		exercicio 6)

		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		
		if (x >=0 && x <= 25) {
			System.out.println(x + " está no INTERVALO [0,25].");
		}
		else if (x > 25 && x <= 50) {
			System.out.println(x + " está no INTERVALO [25,50].");
		}
		else if (x > 50 && x <= 75) {
			System.out.println(x + " está no INTERVALO [50,75].");
		}
		else if (x > 75 && x <= 100) {
			System.out.println(x + " está no INTERVALO [75,100].");
		}
		else {
			System.out.println(x + " está fora de INTERVALO.");
		}
		sc.close();
		
		exercicio 7)

		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		
		if (x ==0 && y ==0) {
			System.out.println("O ponto está na origem");
		}
		else if (x == 0) {
			System.out.println("Eixo X");
		}
		else if (y == 0) {
			System.out.println("Eixo Y");
		}
		else if (x > 0 && y > 0) {
			System.out.println("O ponto está no quadrante 1");
		}
		else if (x < 0 && y > 0) {
			System.out.println("O ponto está no quadrante 2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("O ponto está no quadrante 3");
		}
		else {
			System.out.println("O ponto está no quadrante 4");	
		}
		sc.close();
		
		
	exercicio 8)	
		
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = (x - 3000.0) * 0.18 + 1000.0 * 0.08;
		double z = (x - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		
		if (x <= 2000.0) {
			System.out.println("ISENTO.");
		}
		else if (x <= 3000.0) {
			System.out.printf("O imposto a pagar é de %.2f", ((x - 2000.0) * 0.08) );
		}
		else if (x <= 4500.0) {
			System.out.printf("O imposto a pagar é de %.2f", y);
		}
		else {
			System.out.printf("O imposto a pagar é de %.2f", z);
		}
		sc.close();

--------------------------------------------------------------------------------------------------------------------
		
		operadores de atribuição cumulativa
		
		Scanner sc = new Scanner(System.in);
		int minutos = sc.nextInt();
		double conta = 50.00;
		
		if (minutos > 100) {
			conta += (minutos -100) *2;
		}	
			System.out.printf("O valor da conta é: R$ %.2f", conta);
		sc.close();
		
----------------------------------------------------------------------------------------------------------------

		comando SWITCH-CASE
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
		case 1:
			dia="Domingo";
		break;
		case 2:
			dia="Segunda";
			break;
		case 3:
			dia="Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia="Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia="Dia inválido";
			break;
		}
			System.out.println("Dia da semana: " + dia);
		sc.close();	
		
		
---------------------------------------------------------------------------------------------------------------------

		EXPRESSÃO CONDICIONAL TERNÁRIA: Substitui o if else indicando uma condição entre parênteses seguido de "?" indicando a condição e depois o valor caso verdadeiro seguido de ":" e a expressão caso falso.
		
		double preco = 35.0;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.2;
		
		System.out.println(preco - desconto);
		
		
----------------------------------------------------------------------------------------------------------------------

		ESTRUTURA REPETITIVA ENQUANTO (WHILE)
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int soma = 0;
		
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println("A soma dos valores digitados é: " + soma);
		sc.close();
		
----------------------------------------------------------------------------------------------------------------------

		EXERCICIOS ESTRUTURA REPETITIVA
		exercicio 1)

		Scanner sc = new Scanner(System.in);
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inválida.");
			senha = sc.nextInt();
		}
		System.out.println("Acesso permitido.");
		sc.close();
		
		exercicio 2)
	
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro quadrante.");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo quadrante.");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro quadrante.");
			}
			else if (x > 0 && y < 0) {
				System.out.println("quarto quadrante.");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();
		
		exercicio 3)

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int alcool = 0;
		int diesel = 0;
		int gasolina = 0;
		
		while (x != 4) {
			if (x == 1) {
				alcool += 1;
				x = sc.nextInt();
			}
			else if (x == 2) {
				gasolina += 1;
				x = sc.nextInt();
			}
			else if (x == 3) {
				diesel +=1;
				x = sc.nextInt();
			}
			else {
				x = sc.nextInt();
			}
		}
		System.out.printf("MUITO OBRIGADO!%nALCOOL: %d%nGASOLINA: %d%nDIESEL: %d", alcool, gasolina, diesel);
		sc.close();
		
--------------------------------------------------------------------------------------------------------------------
		
		ESTRUTURA REPETITIVA PARA (FOR)
		for (comando que só executa uma vez ; condição ; comando que irá executar toda vez depois de voltar) 
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int soma = 0;
		
		for (int i=0; i < N ; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		System.out.println("a soma dos valores digitados é :" + soma);
		sc.close();
		
---------------------------------------------------------------------------------------------------------------------

		EXERCICIOS DE ESTRUTURA REPETITIVA FOR
		exercicio 1) 
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for (int i = 1; i <= x ; i++ ) {
			if (i % 2 != 0) {
				System.out.println(i);
			}			
		}
		sc.close();
		
		exercicio 2)

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int somain =0;
		int somaout=0;
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			if(x >= 10 && x <=20) {
				somain +=1;
			} else {
				somaout +=1;
			}
			
		}
		System.out.println(somain + " in");
		System.out.println(somaout + " out");
		
		sc.close();
		
		exercicio 3)

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		for (int i=0 ; i < n ; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();
			System.out.printf("média ponderada: %.1f%n", (x*2 + y*3 + z*5) / 10);
			
		}
		
		sc.close();
		
		exercicio 4)
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("divisão impossível.");
			}
			else {
			double divisao = (double) x/y;
			System.out.printf("%.1f%n", divisao);
			}
		}
		sc.close();
		
		exercicio 5)
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fat =1;
		
		for (int i = 1; i <= n ; i++) {
			
			fat *= i;
			
		}
		System.out.println(fat);
		
		sc.close();
		
		exercicio 6)
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		for (int i=1 ; i <=n ; i++) {
			if ( n % i == 0) {
				System.out.println(i);
			}
		}
		sc.close();
		
		exercicio 7)

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i =1; i <= n ; i++) {
			System.out.print(i + " ");
			System.out.print ((int) Math.pow(i, 2) + " ");
			System.out.println((int) Math.pow(i, 3));
		}
		sc.close();
		
---------------------------------------------------------------------------------------------------------------------

		ESTRUTURA DE REPETIÇÃO DO .. WHILE
		
		 A diferença para o while é que nesse caso o primeiro bloco de comandos será executado pelo menos 1 vez
		 
		
		Scanner sc = new Scanner(System.in);
		
		char resp;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 +32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
			} while (resp != 'n');
		sc.close();
		
		*/
		
		System.out.println("bom dia");
		
		
		
		
		
		
		
		
		
	}

}
