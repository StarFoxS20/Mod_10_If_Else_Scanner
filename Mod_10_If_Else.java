
import java.util.Scanner;

public class Mod_10_If_Else{

public static void main(String args[])
  {

      //**+**|#|Introdução|#|**+**//

        System.out.print("Vamos calcular a média das suas notas");

        Scanner s = new Scanner(System.in);

        System.out.println("Por favor digite as suas notas em números reais.");

    //**+**|#|Coletando o valor de cada nota|#|**+**//

        System.out.println("Começe digitando a primeira nota:");
    double nota1 = s.nextDouble();
        System.out.println("Digite a segunda nota:");
    double nota2 = s.nextDouble();
        System.out.println("Digite a terceira nota:");
    double nota3 = s.nextDouble();
        System.out.println("Por fim a quarta nota:");
    double nota4 = s.nextDouble();

    //**+**|#|Calculando a media|#|**+**//

    double media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("A sua média é:" + media);

    //**+**|#|Entregando o resultado|#|**+**//

    if (media >= 7){
        System.out.println("Parabéns você foi aprovado!!");
    }
    else if (media >= 5) {
        System.out.println("Você terá uma nova chanse de melhorar sua nota!!");
    }
    else if (media < 5){
        System.out.println("Que pena você pegou recuperação!!");

//**+**|#|Se tiver alguma sugestão de otimização estarei disposto a ouvir|#|**+**//

    }
  }
}



