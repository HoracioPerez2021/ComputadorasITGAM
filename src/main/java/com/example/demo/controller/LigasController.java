package com.example.demo.controller;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.models.Tickets;
import com.example.demo.models.Clientes;
import com.example.demo.models.Ventas;
import com.example.demo.models.Computadoras;
import com.example.demo.models.Proveedores;
@Controller
@RequestMapping("/examenUnidad2")
public class LigasController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/Computadoras")
	public String Computadoras (Model modelo) {
		
		ArrayList<Computadoras> computadora = new ArrayList<Computadoras>();
		computadora.add(new Computadoras(161130413,"Lenovo","Core i5","Windows 8",6,4));
		computadora.add(new Computadoras(161130133,"HP","Core i3","Windows 7",12,8));
		computadora.add(new Computadoras(161130123,"Acer","Pentium","Windows XP",8,4));
		computadora.add(new Computadoras(161130456,"Asus","AMD","Ubuntu",16,8));
		computadora.add(new Computadoras(161130789,"Samsung","Celeron","Linux",4,4));
		
		computadora.add(new Computadoras(161130645,"Apple","Pentium","Windows 8",6,4));
		computadora.add(new Computadoras(161130345,"Alienware","Core i3","Windows 8",12,8));
		computadora.add(new Computadoras(161144181,"Gateway","Core i9","Windows 8",8,8));
		computadora.add(new Computadoras(161164652,"Sony","AMD","Ubuntu",4,4));
		computadora.add(new Computadoras(162621524,"LG","Core i5","Fedora",4,4));
		modelo.addAttribute("Computadoras",computadora);
		modelo.addAttribute("titulo","Tabla de Computadoras");
		return "Computadoras";
	}
	
	@GetMapping("/Tickets")
	public String Tickets (Model modelo) {
		
		ArrayList<Tickets> ticket = new ArrayList<Tickets>();
		ticket.add(new Tickets(123,20,161130,1,12500));
		ticket.add(new Tickets(456,30,161140,2,14000));
		ticket.add(new Tickets(789,40,161150,3,13350));
		ticket.add(new Tickets(1011,50,161150,4,16300));
		ticket.add(new Tickets(1012,60,161160,5,6630));
		
		ticket.add(new Tickets(1013,16,161170,2,12500));
		ticket.add(new Tickets(1014,17,161180,1,14000));
		ticket.add(new Tickets(1015,18,161190,3,13350));
		ticket.add(new Tickets(1016,19,161110,1,6300));
		ticket.add(new Tickets(1017,20,161120,2,6630));
		
		modelo.addAttribute("Tickets",ticket);
		modelo.addAttribute("titulo","Tabla de Tickets");
		return "Tickets";
	}
	
		@GetMapping("/Ventas")
		public String Ventas (Model modelo) {
		ArrayList<Ventas> venta = new ArrayList<Ventas>();
		venta.add(new Ventas(1,001,"13-12-2020",11111,4000,150,29150));
		venta.add(new Ventas(2,002,"06-07-2020",22222,2240,150,16390));
		venta.add(new Ventas(3,003,"08-01-2020",33333,4272,150,31122));
		venta.add(new Ventas(4,004,"15-03-2020",44444,2608,150,19058));
		venta.add(new Ventas(5,005,"30-08-2020",55555,3182,150,23220));
		
		venta.add(new Ventas(6,006,"16-11-2020",25000,4000,150,29150));
		venta.add(new Ventas(7,007,"16-09-2020",66666,2240,150,16390));
		venta.add(new Ventas(8,007,"11-04-2020",77777,4272,150,31122));
		venta.add(new Ventas(9,011,"16-06-2020",88888,2608,150,19058));
		venta.add(new Ventas(10,010,"16-08-2020",99999,3182,150,23220));
		
		modelo.addAttribute("Ventas",venta);
		modelo.addAttribute("titulo","Tabla de Ventas");
		return "Ventas";
		
	}
		
		@GetMapping("/Clientes")
		
		public String Clientes (Model modelo) {
			ArrayList<Clientes> cliente = new ArrayList<Clientes>();
			cliente.add(new Clientes(161130276,"Horacio","Pérez Campos",551234445,"horas@gmail.com","Alvaro Obregon"));
			cliente.add(new Clientes(16113,"Brandon","Castro Castro",55475890,"bran@hotmail.com","CDMX"));
			cliente.add(new Clientes(16114,"Daniel","Sanchez Barrios",2030624842,"Dan@porn.com","CDMX"));
			cliente.add(new Clientes(16174,"Raul","Zacarias Zacarias",559960039,"Raul@Zaca.com","CDMX"));
			cliente.add(new Clientes(16163,"Gonzalo","Rosales Campos",553463914,"gonza@gmail.com","Ecatepec"));
			
			cliente.add(new Clientes(68410,"Eduardo","González Sierra",553527527,"lalo@hotmail.com","Aragon"));
			cliente.add(new Clientes(16841,"Gonzalo","Ramirez Perez",557862752,"gon@glez.com","Maravillas"));
			cliente.add(new Clientes(16354,"Brenda","Acosta González",558627275,"Bren@hotmail.com","CDMX"));
			cliente.add(new Clientes(14681,"Armando","Manzanero Hernández",558672572,"Armando@Manzanero.com","Ecatepec"));
			cliente.add(new Clientes(13458,"Julio","Preciado Senado",55786452,"Julio@Preciado.com","Ecatepec"));
			
			modelo.addAttribute("Clientes",cliente);
			modelo.addAttribute("titulo","Tabla de Clientes");
			return "Clientes";
		}
		
		@GetMapping("/Proveedores")
		
		public String Proveedores (Model modelo) {
			ArrayList<Proveedores> proveedor = new ArrayList<Proveedores>();
			proveedor.add(new Proveedores(161130,"HP","Horacio","horas@Hp.com","HOR7851",551234445,"Alvaro Obregon"));
			proveedor.add(new Proveedores(261130,"Lenovo","Raul","Raul@lenov.com","RAUF2003",559960039,"CDMX"));
			proveedor.add(new Proveedores(661130,"Liverpool","Gonzalo","gonza@live.com","AAFAS611",553463914,"Lagunilla"));
			proveedor.add(new Proveedores(761130,"Dell","Brandon","bran@dell.com","BRDCAS511",55475890,"Buenos Aires"));
			proveedor.add(new Proveedores(861130,"Chedraui","Julio","jul@ched.com","JUSAS5151",55598547,"Obrera"));
			
			proveedor.add(new Proveedores(461130,"HP","Gonzalo","gonzo@hp.com","GOF51651",553698547,"Neza"));
			proveedor.add(new Proveedores(761130,"LG","Berenice","bere@lg.com","BESASFA5151",552456,"Ecatepec"));
			proveedor.add(new Proveedores(961130,"Sony","Guadalupe","guada@sony.com","GUF5A151",55538547,"Olimpica"));
			proveedor.add(new Proveedores(361130,"Elektra","Viviana","vivi@Elektra.com","VIFA15151",55398547,"Azteca"));
			proveedor.add(new Proveedores(661130,"Gateway","Alejandro","ale@gate.com","ALF1515",55598547,"Villa"));
			
			modelo.addAttribute("Proveedores",proveedor);
			modelo.addAttribute("titulo","Tabla de Proveedores");
			return "Proveedores";
		}	
}
