package testentidad;

import java.util.List;

import dao.ClassProductoImp;
import model.TblProductocl3;

public class testentidadproducto {
	
public static void main (String[] args){
		
	ClassProductoImp crud=new ClassProductoImp();
		
	/*		TblProductocl3 producto3=new TblProductocl3();
		
		
		
		 producto3.setNombrecl3("monitor");
		producto3.setPrecioventacl3(200);
		producto3.setPreciocompcl3(150);
		producto3.setEstadocl3("Nuevo");
		producto3.setDescripcl3("producto para escritorio");
		
		crud.registrarproducto(producto3);  */

	TblProductocl3 producto1=new TblProductocl3();  
	
	
	List<TblProductocl3> lista = crud.Listadoproducto();
	   for(TblProductocl3 li : lista){
            System.out.println("Producto: " + li.getIdproductoscl3() + " ; " + li.getNombrecl3());
        }
}

}