package cicloWhile;

import javax.swing.JOptionPane;

public class SubMenuCicloWhile {
    public static void main(String[] args) {
        int codMenuPpal = 0, codMenuTipico = 0, codMenuAlaCarta = 0, codMenuInternacional = 0, platoTipico = 0, platoTipicoSopa = 0, platoAlaCarta = 0, platoAlaCartaSopa = 0, platoInternacional = 0, platoInternacionalSopa = 0,
                platosProcesados = 0, totalPlatos = 0;

        String nombre = "";
        while (codMenuPpal != 4) {
            String menu = "MENU RESTAURANTE\n\n";
            menu += "1. Plato tipico \n";
            menu += "2. Plato a la Carta\n";
            menu += "3. Plato Internacional\n";
            menu += "4. Salir\n\n";
            menu += "Por favor Seleccione una opcion \n";
            codMenuPpal = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (codMenuPpal) {
                case 1:
                    codMenuTipico = 0;
                    while (codMenuTipico != 3) {
                        String menuTipico = "MENU TIPICO\n\n";
                        menuTipico += "1. Frijoles\n";
                        menuTipico += "2. Sopa de Verduras\n";
                        menuTipico += "3. Regresar\n\n";
                        menuTipico += "Por favor seleccione una opcion \n";
                        codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog(menuTipico));

                        switch (codMenuTipico) {
                            case 1:
                                platoTipico++;
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Frijoles, el costo es de $" + 12000);
                                break;
                            case 2:
                                platoTipicoSopa++;
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Sopa de Verduras, el costo es de $" + 8000);
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    break;

                case 2:
                    codMenuAlaCarta = 0;
                    while (codMenuAlaCarta != 3) {
                        String menuAlaCarta = "MENU A LA CARTA\n\n";
                        menuAlaCarta += "1. Sopa de Mondongo\n";
                        menuAlaCarta += "2. Carne asada con Arroz\n";
                        menuAlaCarta += "3. Regresar\n\n";
                        menuAlaCarta += "Por favor seleccione una opcion \n";
                        codMenuAlaCarta = Integer.parseInt(JOptionPane.showInputDialog(menuAlaCarta));

                        switch (codMenuAlaCarta) {
                            case 1:
                                platoAlaCartaSopa++;
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Sopa de Mondongo, el costo es de $" + 12000);
                                break;
                            case 2:
                                platoAlaCarta++;
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Carne Asada con Arroz, el costo es de $" + 18000);
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    break;

                case 3:
                    codMenuInternacional = 0;
                    while (codMenuInternacional != 3) {
                        String menuInternacional = "MENU INTERNACIONAL\n\n";
                        menuInternacional += "1. Sopa de Camarones\n";
                        menuInternacional += "2. Filet Mignon\n";
                        menuInternacional += "3. Regresar\n\n";
                        menuInternacional += "Por favor seleccione una opcion \n";
                        codMenuInternacional = Integer.parseInt(JOptionPane.showInputDialog(menuInternacional));

                        switch (codMenuInternacional) {
                            case 1:
                                platoInternacionalSopa++;
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Sopa de Camarones, el costo es de $" + 60000);
                                break;
                            case 2:
                                platoInternacional++;
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Filet Mignon, el costo es de $" + 120000);
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    break;

                case 4:
                    totalPlatos = (platoTipico * 12000) + (platoTipicoSopa * 8000) + (platoAlaCartaSopa * 12000) + (platoAlaCarta * 18000) + (platoInternacionalSopa * 60000) + (platoInternacional * 120000);
                    platosProcesados = platoTipico + platoTipicoSopa + platoAlaCarta + platoAlaCartaSopa + platoInternacional + platoInternacionalSopa;
                    nombre = JOptionPane.showInputDialog("Ingrese su nombre");

                    if (platosProcesados >= 1) {
                        JOptionPane.showMessageDialog(null, "Gracias por Comer con nosotros \n\n"
                                + "Señor " + nombre + " usted consumio lo siguiente: \n\n"
                                + "El total de platos tipicos solicitados " + (platoTipico + platoTipicoSopa) + " platos\n"
                                + "El total de platos a la mesa solicitados " + (platoAlaCarta + platoAlaCartaSopa) + " platos\n"
                                + "El total de platos Internacionales solicitados " + (platoInternacional + platoInternacionalSopa) + " platos\n\n"
                                + "El total de Platos ordenados son " + platosProcesados
                                + " El total de de la deuda a pagar es lo siguiente: " + totalPlatos);
                    } else {
                        JOptionPane.showMessageDialog(null, "Señor " + nombre + " Gracias por elegirnos espero que vuelva.");
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "No corresponde a un codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        }
    }
}
