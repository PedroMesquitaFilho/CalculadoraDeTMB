// ☆ CALCULADOR DE TMB ☆
public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);

    double peso;
    double altura;
    double idade;
    String sexo;

    System.out.println("Digite 'M' para masculino e 'F' para feminino: ");
    sexo = scan.nextLine();

    System.out.println("Altura em cm: ");
    altura = scan.nextDouble();

    System.out.println("Idade em anos: ");
    idade = scan.nextDouble();

    System.out.println("Peso em Kg: ");
    peso = scan.nextDouble();

    String masc = "M";
    String fem = "F";
    double tmbMasc = 66.5 + (13.7 * peso) + (5 * altura) - (6.8 * idade);
    double tmbFem = 655 + (9.6 * peso) + (1.8 * altura) - (4.7 * idade);

    if (sexo.equalsIgnoreCase(masc)) {
        System.out.println(tmbMasc);
    }
    else if (sexo.equalsIgnoreCase(fem)) {
        System.out.println(tmbFem);

    }
    else {
        System.out.println("Algo deu Errado ,repita o procedimento mais atentamente!");
    }

    }
