package electrodomesticos;
import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		electrodomestico productos = new electrodomestico ();
		
		while(!productos.isContinuar()) {
		// realizar el menú
		System.out.println(" ============ ESTE ES EL CATALOGO DE ELECTRODOMESTICOS DISPONIBLES ==============");
		System.out.println("************************************************************************************");
		System.out.println("1. lavadora");
		System.out.println("2. plancha");
		System.out.println("3. licuadora");
		System.out.println("4. salir");
		System.out.println("ingresa una opcion");
		productos.setOpcion(entrada.nextInt());
		
		switch(productos.getOpcion()) {
		case 1:
			System.out.println("=== HAS ELEGIDO LA OPCION 1 ===");
			System.out.println("---------------------------------");
			System.out.println(" LAVADORA ");
			productos.setCantidad(0);
			System.out.println("cantidad de lavadoras disponibles " + productos.getCantidad());
			productos.setMarca(null);
			System.out.println(" Marcas disponibles "+ productos.getMarca());
			productos.setPrecio(0, null);
			System.out.println(" precios segun la marca "+ productos.getPrecio());
			break;
			
		case 2:
			System.out.println("=== HAS ELEGIDO LA OPCION 2 ===");
			System.out.println("---------------------------------");
			System.out.println(" PLANCHAS");
			productos.setCantidad(0);
			System.out.println("cantidad de lavadoras disponibles " + productos.getCantidad());
			productos.setMarca(null);
			System.out.println(" Marcas disponibles "+ productos.getMarca());
			productos.setPrecio(0, null);
			System.out.println(" precios segun la marca "+ productos.getPrecio());
			  break;
			
		case 3:
			System.out.println("=== HAS ELEGIDO LA OPCION 3 ===");
			System.out.println("---------------------------------");
			System.out.println(" LICUADORA ");
			productos.setCantidad(0);
			System.out.println("cantidad de lavadoras disponibles " + productos.getCantidad());
			productos.setMarca(null);
			System.out.println(" Marcas disponibles "+ productos.getMarca());
			productos.setPrecio(0, null);
			System.out.println(" precios segun la marca "+ productos.getPrecio());
			break;
			
		case 4:
			System.out.println("GRACIAS POR PREFERIR NUESTRO SERVIVIOS, TE ESPERAMOS PRONTO");
			productos.setContinuar(true);
			break;
			
			
			
		
		}
		}
		
	}

}
