/*public class Main {
    public static void main(String[] args) {
        System.out.println("EJEMPLOS IF");

        int numero1 = 3;
        int numero2 = 2;
        int numero3 = 4;
    }

    public static int Maxima(int numero1, int numero2, int numero3) {
        if (numero1 > numero2 && numero1 > numero3) {
            return numero1;
        } else if (numero2 > numero1 && numero2 > numero3) {
            return numero2;
        } else if (numero3 > numero1 && numero3 > numero2) {
            return numero3;
        }
        return 0;
    }
}*/

/*public class Main {
    public static void main(String[] cargs) {
        int[] ArrayNotas = {3,5,7,2,8,5,3};
        int[] ArrayNotasSegundaManera = new int[10];

        ArrayNotasSegundaManera[0] = 4;
        ArrayNotasSegundaManera[1] = 3;
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hola");
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 10) {
            System.out.println(contador);
            contador++;
        }
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int contador = 0;
        do {
            System.out.println("1");
            contador++;
        }while (contador < 10);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int dia = 4;

        System.out.print("Dia de la semana: ");
        if (dia <=5) {
            System.out.println("Dia laboral");
        }else if (dia > 5 && dia < 8) {
            System.out.println("Dia festivo");
        }
    }
}*/

public class Main {
    public static void main(String[] args) {
        int numero = 0;
        int suma = 0;

        while (numero < 10) {
            suma = suma += numero;
            System.out.println(suma);
            numero++;
        }
    }
}