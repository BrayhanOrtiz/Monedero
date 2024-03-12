import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner DatosMenu = new Scanner(System.in);

        System.out.println("MONEDERO DE AHORROS");
        int entrada, salir = 0, monedaVeinte = 0, tipoMoneda, monedaCinco = 0, monedaCien = 0, monedaDosc = 0, monedaQuinientos = 0, totalMonedas;
        String nombreAlcancia = "";

        System.out.println("como le quieres llamar a tu nueva alcancia");
        nombreAlcancia = DatosMenu.next();
        do {
            do {
                System.out.println("1)Agregar monedas\n2)Contar Monedas\n3)Total Ahorrado\n4)Romper alcancia\n5)Nueva alcancia");
                System.out.println("Digite la opcion que necesita");
                entrada = DatosMenu.nextInt();
                System.out.println("bienvenido "+ nombreAlcancia);

                if (entrada < 0 || entrada > 5) {
                    System.out.println("Entrada incorrecta");
                } else {
                    switch (entrada) {

                        case 1:

                            System.out.println("Digite la denominacion de moneda que va agregar:\n$20\n$50\n$100\n$200\n$500");
                            tipoMoneda = DatosMenu.nextInt();
                            if (tipoMoneda == 20) {
                                System.out.println("Haz agregado $" + tipoMoneda + " a tu ahorro");
                                monedaVeinte++;
                            } else if (tipoMoneda == 50) {
                                System.out.println("Haz agregado $" + tipoMoneda + " a tu ahorro");
                                monedaCinco++;
                            } else if (tipoMoneda == 100) {
                                System.out.println("Haz agregado $" + tipoMoneda + " a tu ahorro");
                                monedaCien++;
                            } else if (tipoMoneda == 200) {
                                System.out.println("Haz agregado $" + tipoMoneda + " a tu ahorro");
                                monedaDosc++;
                            } else if (tipoMoneda == 500) {
                                System.out.println("Haz agregado $" + tipoMoneda + " a tu ahorro");
                                monedaQuinientos++;
                            } else
                                System.out.println("Valor incorrecto");
                                System.out.println("Digita nuevamente lo que necesitas");

                            break;


                        case 2:

                            System.out.println("Digite la denominacion de moneda a contar:\n$20\n$50\n$100\n$200\n$500");
                            tipoMoneda = DatosMenu.nextInt();
                            if (tipoMoneda == 20) {
                                System.out.println("De la moneda  $" + tipoMoneda + " tienes ahorrado en " + nombreAlcancia + " $" + (monedaVeinte * 20));

                            } else if (tipoMoneda == 50) {
                                System.out.println("De la moneda  $" + tipoMoneda + " tienes ahorrado en " + nombreAlcancia + " $" + (monedaCinco * 50));

                            } else if (tipoMoneda == 100) {
                                System.out.println("De la moneda  $" + tipoMoneda + " tienes ahorrado en " + nombreAlcancia + " $" + (monedaCien * 100));

                            } else if (tipoMoneda == 200) {
                                System.out.println("De la moneda  $" + tipoMoneda + " tienes ahorrado en" + nombreAlcancia + " $" + (monedaDosc * 200));
                            } else if (tipoMoneda == 500) {
                                System.out.println("De la moneda  $" + tipoMoneda + " tienes ahorrado en " + nombreAlcancia + " $" + (monedaQuinientos * 500));
                            }

                            break;
                        case 3:
                            totalMonedas = (100 * monedaCien + 50 * monedaCinco + 200 * monedaDosc + 20 * monedaVeinte+ 500*monedaQuinientos);
                            System.out.println("El total ahorrado es:" + totalMonedas);
                            break;
                        case 4:
                            totalMonedas = (100 * monedaCien + 50 * monedaCinco + 200 * monedaDosc + 20 * monedaVeinte);
                            System.out.println("Acabas de romper tu alcancia, " + nombreAlcancia + " tu valor total es:" + totalMonedas);
                            monedaCien = 0;
                            monedaCinco = 0;
                            monedaDosc = 0;
                            monedaVeinte = 0;
                            break;
                    }


                }  if ( entrada==5){
                    System.out.println("¿quieres crear otra alcancia?\n si=1, no=2");
                    salir=DatosMenu.nextInt();
                }

            } while (entrada > 0 || entrada < 6);


        } while (salir==1);

    }

}
