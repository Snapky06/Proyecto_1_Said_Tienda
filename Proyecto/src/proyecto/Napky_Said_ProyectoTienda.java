/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Scanner;

/**
 *
 * @author saidn
 */
public class Napky_Said_ProyectoTienda {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Variables principales
        int opcion = 0, codigo = 0, dia = 1, veces_caja = 1;

// Variables de compras y ventas
        int cantidad_compras = 0, cantidad_ventas = 0;
        int cantidad_de_compras = 0, cantidad_de_ventas = 0, codigo_compras = 0;
        int ventas_maiz = 0, ventas_azucar = 0, ventas_trigo = 0, ventas_avena = 0;
        int cantidad_ventas_azucar = 0, cantidad_ventas_avena = 0, cantidad_ventas_trigo = 0, cantidad_ventas_maiz = 0;
        int ingresos = 0;

// Variables financieras
        double efectivo = 0.0, cantidad = 0.0, compras = 1, subtotal = 0.0, total = 1, gasto = 0.0;
        double compra_media = 0, mayor_ganancia_venta = 0, mayor_gasto_compra = 0;
        double subtotal_con_isv = 0.0, isv_de_subtotal = 0.0, caja = 0.0, azucar = 0.0;
        double avena = 0.0, trigo = 0.0, maiz = 0.0, descuento = 0.0, impuesto = 0.07;
        double ganancia = 0, valor_medio_venta = 0;

// Variables auxiliares
        char otro_producto = 'p', ingreso_dinero, Si_No = 'n', volver_intentar_compras = 'p';

// Estado de la caja
        boolean abrircaja = false;

// FINAL VARIABLES
        System.out.println("\n|-----------------------------|");
        System.out.println("|---      TIENDA JAVA      ---|");
        System.out.println("|-----------------------------|\n");
        //Inicio de While
        while (opcion != 6) {
            System.out.println("\n|-----------------------------|");
            System.out.println("|       MENU PRINCIPAL        |");
            System.out.println("|-----------------------------|");
            System.out.println("| Hoy Es El Dia : " + dia);
            System.out.println("|-----------------------------|");
            System.out.println("| [1] Abrir Caja             |");
            System.out.println("| [2] Ventas                 |");
            System.out.println("| [3] Compras                |");
            System.out.println("| [4] Reportes               |");
            System.out.println("| [5] Cierre De Caja         |");
            System.out.println("| [6] Salir Del Sistema      |");
            System.out.println("|-----------------------------|");
            System.out.print("| Seleccione (1,2,3,4,5 o 6) : ");
            opcion = leer.nextInt();
            System.out.println("|-----------------------------|\n");
//Inicio Switch Opcion
            switch (opcion) {

                case 1:
                    if (opcion == 1 && veces_caja >= 2) {
                        abrircaja = true;

                        System.out.println("\n|------------------------------------|");
                        System.out.println("|              CAJA                 |");
                        System.out.println("|------------------------------------|");
                        System.out.print("| Quiere Ingresar Dinero (S/N) : ");

                        ingreso_dinero = leer.next().toUpperCase().charAt(0);

                        if (ingreso_dinero == 'S') {
                            System.out.print("| Ingrese el Monto Deseado : Lps. ");
                            efectivo = leer.nextDouble();

                            if (efectivo > 0) {
                                caja += efectivo;
                                System.out.println("| Monto Ingresado : Lps. " + efectivo + " |");
                                System.out.println("| Total en Caja   : Lps. " + String.format("%.2f", caja) + " |");
                            } else {
                                System.out.println("| La Cantidad No Es Valida |");
                            }
                        } else {
                            System.out.println("| Total en Caja : Lps. " + caja + " |");
                        }

                        // Final opcion de abrir caja
                        System.out.println("|------------------------------------|\n");
                    }

                    if (opcion == 1 && dia == 1 && veces_caja == 1) {
                        abrircaja = true;

                        System.out.println("\n|----------------------------------|");
                        System.out.println("|              CAJA               |");
                        System.out.println("|----------------------------------|");

                        System.out.print("| Ingrese el Monto Deseado : Lps. ");
                        efectivo = leer.nextDouble();

                        if (efectivo > 0) {
                            caja += efectivo;
                            System.out.println("| Monto Ingresado : Lps. " + efectivo + " |");
                            veces_caja++;
                        } else {
                            System.out.println("| La Cantidad No Es Valida |");
                        }

                        // Final opcion de abrir caja
                        System.out.println("|----------------------------------|\n");
                    }

                    break;

                case 3:
                    //If que tiene que estar la caja abierta
                    if (abrircaja) {
                        subtotal = 0;
                        do {
                            System.out.println("|--------------Compras--------------|");
                            System.out.println("|-----------------------------------|");
                            System.out.println("|   Que Tipo de Proveedor Desea     |");
                            System.out.println("|-----------------------------------|");
                            System.out.println("| [A] Solo le Compramos Azucar y Maiz |");
                            System.out.println("| [B] Solo le Compramos Avena y Trigo |");
                            System.out.println("| [C] Solo le Compramos Avena         |");
                            System.out.print("| Seleccione (A, B o C): ");
                            char proveedor = leer.next().toUpperCase().charAt(0);
                            System.out.println("|-----------------------------------|");

                            //Switch de Proveedor
                            switch (proveedor) {

                                //Inicio de Proveedor C
                                //Inicio de Proveedor C
                                case 'C':

                                    if (caja >= 22) {

                                        System.out.println("\n|----------Compras------------|");
                                        System.out.println("| Saldo = Lps. " + caja + "         |");
                                        System.out.println("| Proveedor C                 |");
                                        System.out.println("|-----------------------------|");
                                        System.out.println("| [2] Avena = Lps. 22/kg      |");
                                        System.out.println("|-----------------------------|");

                                        do {
                                            System.out.print("|Seleccione(2) : ");
                                            codigo = leer.nextInt();

                                            if (codigo == 2) {
                                                System.out.print("|Que Cantidad En k/g Desea : ");
                                                cantidad = leer.nextDouble();
                                                if (cantidad > 0 && caja >= 22 * cantidad) {
                                                    compra_media += (22 * cantidad / compras);
                                                    compras = 22 * cantidad;
                                                    caja -= compras;
                                                    avena += cantidad;
                                                    cantidad_de_compras += cantidad;
                                                    cantidad_compras++;
                                                    gasto = 22 * cantidad;

                                                    if (compras > mayor_gasto_compra) {
                                                        mayor_gasto_compra = compras;
                                                    }

                                                    System.out.println("\n|---------------Compras-------------------|");
                                                    System.out.println("|---    Producto : Avena  ----------------|");
                                                    System.out.println("|---    Total : Lps." + compras + "   --------------|");
                                                    System.out.println("|---    Cantidad : " + cantidad + "k/g  --------------|");
                                                    Si_No = 'N';
                                                } else {
                                                    System.out.println("|---Cantidad Insuficiente Para La Compra---|");
                                                    System.out.print("|Desea Volver A Intentar (S o N) : ");
                                                    Si_No = leer.next().toUpperCase().charAt(0);
                                                }
                                            } //INICIO FILTRO C
                                            else {
                                                System.out.print("|---Proveedor No Vende Este Producto---|\n");
                                                System.out.print("|Desea Volver A Intentar (S o N) : ");
                                                Si_No = leer.next().toUpperCase().charAt(0);
                                            }

                                            //FINAL FILTRO C
                                        } while (Si_No == 'S');
                                    } else {
                                        System.out.println("|----------------------------|");
                                        System.out.println("|------No Tiene Dinero-------|");
                                        System.out.println("|----------------------------|");
                                    }
                                    System.out.println("|----------------------------------------|\n");
                                    volver_intentar_compras = 'N';
                                    //FINAL PROVEEDOR C
                                    break;
//Inicio De Compras B
                                case 'B':
                                    if (caja >= 20) {

                                        System.out.println("\n|----------Compras------------|");
                                        System.out.println("|      Proveedor B           |");
                                        System.out.println("|-----------------------------|");
                                        System.out.println("| [2] Avena = Lps. 20/kg     |");
                                        System.out.println("| [3] Trigo = Lps. 30/kg     |");
                                        System.out.println("|-----------------------------|");

                                        do {
                                            System.out.print("| Seleccione (2 o 3): ");
                                            codigo = leer.nextInt();

                                            switch (codigo) {

                                                case 2:
                                                    System.out.print("| Que Cantidad En kg Desea: ");
                                                    cantidad = leer.nextDouble();

                                                    if (cantidad > 0 && caja >= 20 * cantidad) {
                                                        compra_media += (20 * cantidad / compras);
                                                        compras = 20 * cantidad;
                                                        caja -= compras;
                                                        avena += cantidad;
                                                        cantidad_de_compras += cantidad;
                                                        cantidad_compras++;
                                                        gasto = 20 * cantidad;

                                                        if (compras > mayor_gasto_compra) {
                                                            mayor_gasto_compra = compras;
                                                        }

                                                        System.out.println("\n|-------------Compras-------------|");
                                                        System.out.println("| Producto  : Avena               |");
                                                        System.out.println("| Total     : Lps. " + compras + " |");
                                                        System.out.println("| Cantidad  : " + cantidad + " kg  |");
                                                        System.out.println("|----------------------------------|");

                                                        Si_No = 'N';
                                                    } else {
                                                        System.out.println("| Cantidad Insuficiente Para La Compra |");
                                                        System.out.print("| Desea Volver A Intentar (S o N): ");
                                                        Si_No = leer.next().toUpperCase().charAt(0);
                                                    }
                                                    break;

                                                case 3:
                                                    System.out.print("| Que Cantidad En kg Desea: ");
                                                    cantidad = leer.nextDouble();

                                                    if (cantidad > 0 && caja >= 30 * cantidad) {
                                                        compra_media += (30 * cantidad / compras);
                                                        compras = 30 * cantidad;
                                                        caja -= compras;
                                                        trigo += cantidad;
                                                        cantidad_de_compras += cantidad;
                                                        cantidad_compras++;
                                                        gasto = 30 * cantidad;

                                                        if (compras > mayor_gasto_compra) {
                                                            mayor_gasto_compra = compras;
                                                        }

                                                        System.out.println("\n|-------------Compras-------------|");
                                                        System.out.println("| Producto  : Trigo               |");
                                                        System.out.println("| Total     : Lps. " + compras + " |");
                                                        System.out.println("| Cantidad  : " + cantidad + " kg  |");
                                                        System.out.println("|----------------------------------|");

                                                        Si_No = 'N';
                                                    } else {
                                                        System.out.println("| Cantidad Insuficiente Para La Compra |");
                                                        System.out.print("| Desea Volver A Intentar (S o N): ");
                                                        Si_No = leer.next().toUpperCase().charAt(0);
                                                    }
                                                    break;

                                                default:
                                                    System.out.println("| Proveedor No Vende Este Producto |");
                                                    System.out.print("| Desea Volver A Intentar (S o N): ");
                                                    Si_No = leer.next().toUpperCase().charAt(0);
                                                    break;
                                            }

                                        } while (Si_No == 'S');

                                    } else {
                                        System.out.println("|----------------------|");
                                        System.out.println("| No Tiene Dinero     |");
                                        System.out.println("|----------------------|");
                                    }

                                    System.out.println("|----------------------------------|\n");
                                    volver_intentar_compras = 'N';
                                    break;
//Final De Compras B

                                //Inicio Compras A
                                case 'A':

                                    if (caja >= 18) {

                                        System.out.println("\n|------------Compras------------|");
                                        System.out.println("| Saldo = Lps. " + caja + "         |");
                                        System.out.println("| Proveedor A                 |");
                                        System.out.println("|-----------------------------|");
                                        System.out.println("| [1] Azucar = Lps. 25/kg     |");
                                        System.out.println("| [4] Maiz   = Lps. 18/kg     |");
                                        System.out.println("|-----------------------------|");

                                        do {
                                            System.out.print("| Seleccione (1 o 4): ");
                                            codigo = leer.nextInt();

                                            switch (codigo) {

                                                case 1:
                                                    System.out.print("| Que Cantidad En kg Desea: ");
                                                    cantidad = leer.nextDouble();

                                                    if (cantidad > 0 && caja >= 25 * cantidad) {
                                                        compra_media += (25 * cantidad / compras);
                                                        compras = 25 * cantidad;
                                                        caja -= compras;
                                                        azucar += cantidad;
                                                        cantidad_de_compras += cantidad;
                                                        cantidad_compras++;
                                                        gasto = 25 * cantidad;

                                                        if (compras > mayor_gasto_compra) {
                                                            mayor_gasto_compra = compras;
                                                        }

                                                        System.out.println("\n|-------------Compras-------------|");
                                                        System.out.println("| Producto  : Azucar              |");
                                                        System.out.println("| Total     : Lps. " + compras + " |");
                                                        System.out.println("| Cantidad  : " + cantidad + " kg  |");
                                                        System.out.println("|----------------------------------|");

                                                        Si_No = 'N';
                                                    } else {
                                                        System.out.println("| Cantidad Insuficiente Para La Compra |");
                                                        System.out.print("| Desea Volver A Intentar (S o N): ");
                                                        Si_No = leer.next().toUpperCase().charAt(0);
                                                    }
                                                    break;

                                                case 4:
                                                    System.out.print("| Que Cantidad En kg Desea: ");
                                                    cantidad = leer.nextDouble();

                                                    if (cantidad > 0 && caja >= 18 * cantidad) {
                                                        compra_media += (18 * cantidad / compras);
                                                        compras = 18 * cantidad;
                                                        caja -= compras;
                                                        maiz += cantidad;
                                                        cantidad_de_compras += cantidad;
                                                        cantidad_compras++;
                                                        gasto = 18 * cantidad;

                                                        if (compras > mayor_gasto_compra) {
                                                            mayor_gasto_compra = compras;
                                                        }

                                                        System.out.println("\n|-------------Compras-------------|");
                                                        System.out.println("| Producto  : Maiz                |");
                                                        System.out.println("| Total     : Lps. " + compras + " |");
                                                        System.out.println("| Cantidad  : " + cantidad + " kg  |");
                                                        System.out.println("|----------------------------------|");

                                                        Si_No = 'N';
                                                    } else {
                                                        System.out.println("| Cantidad Insuficiente Para La Compra |");
                                                        System.out.print("| Desea Volver A Intentar (S o N): ");
                                                        Si_No = leer.next().toUpperCase().charAt(0);
                                                    }
                                                    break;

                                                default:
                                                    System.out.println("| Proveedor No Vende Este Producto |");
                                                    System.out.print("| Desea Volver A Intentar (S o N): ");
                                                    Si_No = leer.next().toUpperCase().charAt(0);
                                                    break;
                                            }

                                        } while (Si_No == 'S');

                                    } else {
                                        System.out.println("|----------------------|");
                                        System.out.println("| No Tiene Dinero     |");
                                        System.out.println("|----------------------|");
                                    }

                                    System.out.println("|----------------------------------|\n");
                                    volver_intentar_compras = 'N';
                                    break;
//Final Compras A

                                //Inicio De Default
                                default:
                                    System.out.println("|-------------------------------|");
                                    System.out.println("|      Proveedor Inexistente    |");
                                    System.out.print("| Desea Volver A Intentar [S/N]: ");
                                    volver_intentar_compras = leer.next().toUpperCase().charAt(0);
                                    System.out.println("|-------------------------------|\n");
                                    break;
//Final De Default
                            }

                        } while (volver_intentar_compras == 'S');

                    } else {
                        System.out.println("\n|-----------------------------|");
                        System.out.println("|---  Tiene Que Abrir Caja ---|");
                        System.out.println("|-----------------------------|\n");
                    }
                    break;
//Case de Ventas
                case 2:
                    if (abrircaja && azucar > 0 || maiz > 0 || trigo > 0 || avena > 0) {
                        subtotal = 0;
                        System.out.println("\n|----------------------------------------------|");
                        System.out.println("\n|-------------------Ventas---------------------|");
                        System.out.println("|---           Que Proveedor Desea          ---|");
                        System.out.println("|---[A]  Vende Azucar, Avena, Trigo Y Maiz  ---|");
                        System.out.println("|---[B]  Vende Azucar, Avena Y Trigo        ---|");
                        System.out.println("|---[C]  Vende Maiz Solamente               ---|");
                        System.out.print("|Seleccione (A,B o C): ");
                        char proveedor_compras = leer.next().toUpperCase().charAt(0);
                        System.out.println("|----------------------------------------------|\n");
                        switch (proveedor_compras) {

                            //Inicio Proveedor A
                            case 'A':
                                if (azucar > 0 || avena > 0 || trigo > 0 || maiz > 0) {
                                    do {
                                        System.out.println("\n|--------------Ventas--------------|");
                                        System.out.println("|         Proveedor A              |");
                                        System.out.println("|----------------------------------|");
                                        System.out.println("| [1] Azucar : " + azucar + " kg | Lps. 30/kg |");
                                        System.out.println("| [2] Avena  : " + avena + " kg | Lps. 25/kg |");
                                        System.out.println("| [3] Trigo  : " + trigo + " kg | Lps. 32/kg |");
                                        System.out.println("| [4] Maiz   : " + maiz + " kg | Lps. 20/kg |");
                                        System.out.println("|----------------------------------|");

                                        System.out.print("| Seleccione (1, 2, 3 o 4): ");
                                        codigo_compras = leer.nextInt();
                                        System.out.println("|----------------------------------|\n");

                                        switch (codigo_compras) {

                                            case 1:
                                                System.out.println("|---------------------------|");
                                                System.out.print("| Que Cantidad En kg Desea: ");
                                                cantidad = leer.nextDouble();
                                                System.out.println("|---------------------------|\n");

                                                if (azucar >= cantidad) {
                                                    azucar -= cantidad;
                                                    cantidad_de_ventas += cantidad;
                                                    ventas_azucar += cantidad;
                                                    subtotal += 30 * cantidad;
                                                    cantidad_ventas_azucar += cantidad;
                                                } else {
                                                    System.out.println("\n|----------------------------------|");
                                                    System.out.println("| No Hay Suficiente Producto       |");
                                                    System.out.println("|----------------------------------|\n");
                                                }
                                                break;

                                            case 2:
                                                System.out.println("|---------------------------|");
                                                System.out.print("| Que Cantidad En kg Desea: ");
                                                cantidad = leer.nextDouble();
                                                System.out.println("|---------------------------|\n");

                                                if (avena >= cantidad) {
                                                    avena -= cantidad;
                                                    cantidad_de_ventas += cantidad;
                                                    ventas_avena += cantidad;
                                                    subtotal += 25 * cantidad;
                                                    cantidad_ventas_avena += cantidad;
                                                } else {
                                                    System.out.println("\n|----------------------------------|");
                                                    System.out.println("| No Hay Suficiente Producto       |");
                                                    System.out.println("|----------------------------------|\n");
                                                }
                                                break;

                                            case 3:
                                                System.out.println("|---------------------------|");
                                                System.out.print("| Que Cantidad En kg Desea: ");
                                                cantidad = leer.nextDouble();
                                                System.out.println("|---------------------------|\n");

                                                if (trigo >= cantidad) {
                                                    trigo -= cantidad;
                                                    cantidad_de_ventas += cantidad;
                                                    ventas_trigo += cantidad;
                                                    subtotal += 32 * cantidad;
                                                    cantidad_ventas_trigo += cantidad;
                                                } else {
                                                    System.out.println("\n|----------------------------------|");
                                                    System.out.println("| No Hay Suficiente Producto       |");
                                                    System.out.println("|----------------------------------|\n");
                                                }
                                                break;

                                            case 4:
                                                System.out.println("|---------------------------|");
                                                System.out.print("| Que Cantidad En kg Desea: ");
                                                cantidad = leer.nextDouble();
                                                System.out.println("|---------------------------|\n");

                                                if (maiz >= cantidad) {
                                                    maiz -= cantidad;
                                                    cantidad_de_ventas += cantidad;
                                                    ventas_maiz += cantidad;
                                                    subtotal += 20 * cantidad;
                                                    cantidad_ventas_maiz += cantidad;
                                                } else {
                                                    System.out.println("\n|----------------------------------|");
                                                    System.out.println("| No Hay Suficiente Producto       |");
                                                    System.out.println("|----------------------------------|\n");
                                                }
                                                break;

                                            default:
                                                System.out.println("\n|----------------------------------|");
                                                System.out.println("| Opcion No Valida                |");
                                                System.out.println("|----------------------------------|\n");
                                                break;
                                        }

                                        System.out.print("| Desea Comprar Otro Producto (S/N): ");
                                        otro_producto = leer.next().toUpperCase().charAt(0);

                                    } while (otro_producto == 'S');

                                } else {
                                    System.out.println("\n|----------------------------------|");
                                    System.out.println("| No Hay Productos Disponibles     |");
                                    System.out.println("|----------------------------------|\n");
                                }
                                break;

                            // Inicio Proveedor B
                            case 'B':

                                if (azucar > 0 || avena > 0 || trigo > 0) {
                                    do {
                                        System.out.println("\n|--------------Ventas--------------|");
                                        System.out.println("|         Proveedor B              |");
                                        System.out.println("|----------------------------------|");
                                        System.out.println("| [1] Azucar : " + azucar + " kg | Lps. 30/kg |");
                                        System.out.println("| [2] Avena  : " + avena + " kg | Lps. 25/kg |");
                                        System.out.println("| [3] Trigo  : " + trigo + " kg | Lps. 32/kg |");
                                        System.out.println("|----------------------------------|");

                                        System.out.print("| Seleccione (1, 2 o 3): ");
                                        codigo_compras = leer.nextInt();
                                        System.out.println("|----------------------------------|\n");

                                        switch (codigo_compras) {

                                            case 1:
                                                System.out.println("|---------------------------|");
                                                System.out.print("| Que Cantidad En kg Desea: ");
                                                cantidad = leer.nextDouble();
                                                System.out.println("|---------------------------|\n");

                                                if (azucar >= cantidad) {
                                                    azucar -= cantidad;
                                                    cantidad_de_ventas += cantidad;
                                                    ventas_azucar += cantidad;
                                                    subtotal += 30 * cantidad;
                                                    cantidad_ventas_azucar += cantidad;
                                                } else {
                                                    System.out.println("\n|----------------------------------|");
                                                    System.out.println("| No Hay Suficiente Producto       |");
                                                    System.out.println("|----------------------------------|\n");
                                                }
                                                break;

                                            case 2:
                                                System.out.println("|---------------------------|");
                                                System.out.print("| Que Cantidad En kg Desea: ");
                                                cantidad = leer.nextDouble();
                                                System.out.println("|---------------------------|\n");

                                                if (avena >= cantidad) {
                                                    avena -= cantidad;
                                                    cantidad_de_ventas += cantidad;
                                                    ventas_avena += cantidad;
                                                    subtotal += 25 * cantidad;
                                                    cantidad_ventas_avena += cantidad;
                                                } else {
                                                    System.out.println("\n|----------------------------------|");
                                                    System.out.println("| No Hay Suficiente Producto       |");
                                                    System.out.println("|----------------------------------|\n");
                                                }
                                                break;

                                            case 3:
                                                System.out.println("|---------------------------|");
                                                System.out.print("| Que Cantidad En kg Desea: ");
                                                cantidad = leer.nextDouble();
                                                System.out.println("|---------------------------|\n");

                                                if (trigo >= cantidad) {
                                                    trigo -= cantidad;
                                                    cantidad_de_ventas += cantidad;
                                                    ventas_trigo += cantidad;
                                                    subtotal += 32 * cantidad;
                                                    cantidad_ventas_trigo += cantidad;
                                                } else {
                                                    System.out.println("\n|----------------------------------|");
                                                    System.out.println("| No Hay Suficiente Producto       |");
                                                    System.out.println("|----------------------------------|\n");
                                                }
                                                break;

                                            default:
                                                System.out.println("\n|----------------------------------|");
                                                System.out.println("| Opcion No Valida                |");
                                                System.out.println("|----------------------------------|\n");
                                                break;
                                        }

                                        System.out.print("| Desea Comprar Otro Producto (S/N): ");
                                        otro_producto = leer.next().toUpperCase().charAt(0);

                                    } while (otro_producto == 'S');

                                } else {
                                    System.out.println("\n|----------------------------------|");
                                    System.out.println("| No Hay Productos Disponibles     |");
                                    System.out.println("|----------------------------------|\n");
                                }
                                break;

                            // Inicio Proveedor C
                            case 'C':
                                if (maiz > 0) {
                                    do {
                                        System.out.println("\n|--------------Ventas--------------|");
                                        System.out.println("|         Proveedor C              |");
                                        System.out.println("|----------------------------------|");
                                        System.out.println("| [4] Maiz : " + maiz + " kg | Lps. 20/kg |");
                                        System.out.println("|----------------------------------|");

                                        System.out.print("| Seleccione (4): ");
                                        codigo_compras = leer.nextInt();
                                        System.out.println("|----------------------------------|\n");

                                        switch (codigo_compras) {
                                            case 4:
                                                System.out.println("|---------------------------|");
                                                System.out.print("| Que Cantidad En kg Desea: ");
                                                cantidad = leer.nextDouble();
                                                System.out.println("|---------------------------|\n");

                                                if (maiz >= cantidad) {
                                                    maiz -= cantidad;
                                                    ventas_maiz += cantidad;
                                                    subtotal += 20 * cantidad;
                                                    cantidad_ventas_maiz += cantidad;
                                                } else {
                                                    System.out.println("\n|----------------------------------|");
                                                    System.out.println("| No Hay Suficiente Producto       |");
                                                    System.out.println("|----------------------------------|\n");
                                                }
                                                break;

                                            default:
                                                System.out.println("\n|----------------------------------|");
                                                System.out.println("| Opcion No Valida                |");
                                                System.out.println("|----------------------------------|\n");
                                                break;
                                        }

                                        System.out.print("| Desea Comprar Otro Producto (S/N): ");
                                        otro_producto = leer.next().toUpperCase().charAt(0);

                                    } while (otro_producto == 'S');

                                } else {
                                    System.out.println("\n|----------------------------------|");
                                    System.out.println("| No Hay Productos Disponibles     |");
                                    System.out.println("|----------------------------------|\n");
                                }
                                break;
                        }
                        //Inicio De Facturacion
                        if (cantidad_ventas_azucar > 0 || cantidad_ventas_avena > 0 || cantidad_ventas_trigo > 0 || cantidad_ventas_maiz > 0) {
                            cantidad_ventas++;
                            System.out.println("\n|------Factura------|\n");

// Registro de ventas por producto
                            if (cantidad_ventas_azucar > 0) {
                                System.out.println("Producto : Azucar");
                                System.out.println("Cantidad : " + cantidad_ventas_azucar + " kg");
                                System.out.println("Precio Por kg : 30");
                                System.out.println("Subtotal : Lps. " + (cantidad_ventas_azucar * 30) + "\n");
                            }

                            if (cantidad_ventas_avena > 0) {
                                System.out.println("Producto : Avena");
                                System.out.println("Cantidad : " + cantidad_ventas_avena + " kg");
                                System.out.println("Precio Por kg : 25");
                                System.out.println("Subtotal : Lps. " + (cantidad_ventas_avena * 25) + "\n");
                            }

                            if (cantidad_ventas_trigo > 0) {
                                System.out.println("Producto : Trigo");
                                System.out.println("Cantidad : " + cantidad_ventas_trigo + " kg");
                                System.out.println("Precio Por kg : 32");
                                System.out.println("Subtotal : Lps. " + (cantidad_ventas_trigo * 32) + "\n");
                            }

                            if (cantidad_ventas_maiz > 0) {
                                System.out.println("Producto : Maiz");
                                System.out.println("Cantidad : " + cantidad_ventas_maiz + " kg");
                                System.out.println("Precio Por kg : 20");
                                System.out.println("Subtotal : Lps. " + (cantidad_ventas_maiz * 20) + "\n");
                            }

// Reiniciar conteos de ventas
                            cantidad_ventas_azucar = 0;
                            cantidad_ventas_avena = 0;
                            cantidad_ventas_trigo = 0;
                            cantidad_ventas_maiz = 0;

// Calculo de impuestos y descuentos
                            isv_de_subtotal = subtotal * impuesto;
                            subtotal_con_isv = isv_de_subtotal + subtotal;

                            if (subtotal_con_isv < 1000) {
                                descuento = 0.0;
                            } else if (subtotal_con_isv >= 1000 && subtotal_con_isv < 5000) {
                                descuento = 0.05;
                            } else if (subtotal_con_isv >= 5000) {
                                descuento = 0.1;
                            }

                            double subtotal_descuento = subtotal_con_isv * descuento;
                            total = subtotal_con_isv - subtotal_descuento;

// Mostrar totales
                            System.out.println("Su Subtotal Es : " + subtotal);
                            System.out.println("Su Subtotal Con El Impuesto Del 7% : Lps. " + String.format("%.2f", isv_de_subtotal));
                            System.out.println("Su Porcentaje De Descuento : % " + (descuento * 100) + " La Cantidad Del Descuento : Lps. " + subtotal_descuento);
                            System.out.println("Su Total Es : Lps. " + String.format("%.2f", total));
                            System.out.println("\n|-------------------|\n");

// Actualizar La Venta Mayor
                            if (total > mayor_ganancia_venta) {
                                mayor_ganancia_venta = total;
                            }

                            caja += total;
                            ingresos += total;
                            subtotal = 0;
                            if (cantidad_ventas > 1) {
                                valor_medio_venta += total / cantidad_ventas;
                            }
                        } else {
                            System.out.println("\n|------------------------------|");
                            System.out.println("|---No Se Realizo Una Compra---|");
                            System.out.println("|------------------------------|\n");
                        }
                    } else if (abrircaja == false) {
                        System.out.println("\n|-----------------------------|");
                        System.out.println("|---  Tiene Que Abrir Caja ---|");
                        System.out.println("|-----------------------------|\n");
                    } else if (azucar <= 0 || maiz <= 0 || trigo <= 0 || avena <= 0) {
                        System.out.println("\n|------------------------------|");
                        System.out.println("|-------No Hay Productos-------|");
                        System.out.println("|------------------------------|\n");

                    }
                    //Final De Facturacion
                    break;
                //Break de Ventas

                //Inicio De Reportes
                case 4:
                    if (abrircaja) {

                        //Calculos Para Reportes
                        if (cantidad_de_ventas > 0) {
                            ganancia = (((ingresos - gasto) / ingresos) * 100);
                        }
                        //Fin De Calculos De Reportes

                        System.out.println("|----------------------------------|");
                        System.out.println("|           REPORTES              |");
                        System.out.println("|----------------------------------|");
                        System.out.println("| Cantidad En Caja      : Lps." + String.format("%.2f", caja));
                        System.out.println("| Numero De Compras     : " + cantidad_compras);
                        System.out.println("| Numero De Ventas      : " + cantidad_ventas);
                        System.out.println("|----------------------------------|");
                        System.out.println("| Volumen De Compras    : " + cantidad_de_compras);
                        System.out.println("| Volumen De Ventas     : " + cantidad_de_ventas);
                        System.out.println("| Margen De Ganancia    : %" + String.format("%.2f", ganancia));
                        System.out.println("|----------------------------------|");
                        System.out.println("| Valor Medio De Compra : Lps." + String.format("%.2f", compra_media));
                        if (cantidad_ventas > 1) {
                            System.out.println("| Valor Medio De Venta  : Lps." + String.format("%.2f", valor_medio_venta));
                        } else {
                            System.out.println("| Valor Medio De Venta  : Lps." + String.format("%.2f", total));
                        }
                        System.out.println("|----------------------------------|");
                        System.out.println("| El Mayor Gasto Fue    : Lps." + mayor_gasto_compra);
                        System.out.println("| La Mayor Ganancia Fue : Lps." + mayor_ganancia_venta);
                        System.out.println("|----------------------------------|");
// Inicio Producto Estrella
                        if (ventas_azucar > ventas_avena && ventas_azucar > ventas_trigo && ventas_azucar > ventas_maiz) {
                            System.out.println("| El Producto Estrella Es : Azucar");
                        } else if (ventas_avena > ventas_azucar && ventas_avena > ventas_trigo && ventas_avena > ventas_maiz) {
                            System.out.println("| El Producto Estrella Es : Avena");
                        } else if (ventas_trigo > ventas_azucar && ventas_trigo > ventas_avena && ventas_trigo > ventas_maiz) {
                            System.out.println("| El Producto Estrella Es : Trigo");
                        } else if (ventas_maiz > ventas_azucar && ventas_maiz > ventas_avena && ventas_maiz > ventas_trigo) {
                            System.out.println("| El Producto Estrella Es : Maiz");
                        } else if ((ventas_azucar == ventas_avena && ventas_azucar == ventas_trigo && ventas_azucar > ventas_maiz)
                                || (ventas_azucar == ventas_avena && ventas_azucar == ventas_maiz && ventas_azucar > ventas_trigo)
                                || (ventas_azucar == ventas_trigo && ventas_azucar == ventas_maiz && ventas_azucar > ventas_avena)
                                || (ventas_avena == ventas_trigo && ventas_avena == ventas_maiz && ventas_avena > ventas_azucar)
                                || (ventas_azucar == ventas_avena && ventas_azucar == ventas_trigo && ventas_azucar == ventas_maiz && ventas_azucar > 0)) {
                            System.out.println("| Hay un empate entre los productos estrella");
                        } else if (ventas_maiz > 0 && ventas_maiz == ventas_azucar && ventas_maiz == ventas_avena && ventas_maiz == ventas_trigo) {
                            System.out.println("| Los Productos Fueron Vendidos Equitativamente");
                        } else if (ventas_azucar == 0 && ventas_trigo == 0 && ventas_avena == 0 && ventas_maiz == 0) {
                            System.out.println("| No Se Han Vendido Productos");
                        }
//Final Producto Estrella
                        System.out.println("|----------------------------------|\n");
                    } else {
                        System.out.println("\n|-----------------------------|");
                        System.out.println("|---  Tiene Que Abrir Caja ---|");
                        System.out.println("|-----------------------------|\n");
                    }
                    break;
                //Fin De Reportes

                //Inicio De Cierre De Caja
                case 5:
                    dia += 1;
                    System.out.println("|----------- Cierre De Caja ------------|");

                    do {
                        System.out.println("| Cantidad De Dinero En La Caja : Lps. " + String.format("%.2f", caja) + " |");
                        System.out.print("| Cuanto Desea Ingresar Al Banco (Max 60%) : Lps. ");

                        efectivo = leer.nextDouble();
                        System.out.println("|----------------------------------------|");

                        if (efectivo / caja < 0.60) {
                            caja -= efectivo;
                            Si_No = 'N';

                            // Volviendo Las Variables De Reportes A 0
                            ingresos = 0;
                            abrircaja = false;
                            cantidad_compras = 0;
                            cantidad_ventas = 0;
                            cantidad_de_compras = 0;
                            cantidad_de_ventas = 0;
                            compra_media = 0;
                            subtotal = 0;
                            ganancia = 0;
                            valor_medio_venta = 0;
                            mayor_gasto_compra = 0;
                            mayor_ganancia_venta = 0;
                            ventas_azucar = 0;
                            ventas_avena = 0;
                            ventas_trigo = 0;
                            ventas_maiz = 0;
                            gasto = 0;

                        } else {
                            System.out.println("|---------------------------|");
                            System.out.println("|   Ingreso Mas Del 60%    |");
                            System.out.println("|---------------------------|");

                            System.out.print("\n| Desea Volver A Intentar (S/N): ");
                            Si_No = leer.next().toUpperCase().charAt(0);
                        }

                    } while (Si_No == 'S');

                    break;
            }
            //Final Switch Opcion

        }
        //Final de While

    }
}
