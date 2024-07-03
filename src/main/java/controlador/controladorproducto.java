package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClassProductoImp;
import model.TblProductocl3;

/**
 * Servlet implementation class controladorproducto
 */
public class controladorproducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controladorproducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TblProductocl3 producto= new TblProductocl3();
		ClassProductoImp crud= new ClassProductoImp();
		
	
		
		String accion=request.getParameter("accion");
		if (accion !=null){
			switch(accion){
			case"modificar":
				int codigo=Integer.parseInt(request.getParameter("codigo"));
				
				producto.setIdproductoscl3(codigo);
				TblProductocl3 buscarcod=crud.Buscarproducto(producto);
				request.setAttribute("codigo",buscarcod.getIdproductoscl3());
				request.setAttribute("nombre",buscarcod.getNombrecl3());
				request.setAttribute("preciocomp", buscarcod.getPreciocompcl3());
				request.setAttribute("precioven", buscarcod.getPrecioventacl3());
				request.setAttribute("estado",buscarcod.getEstadocl3());
				request.setAttribute("descrip", buscarcod.getDescripcl3());
				request.getRequestDispatcher("/formActualizar.jsp").forward(request,response);
				break;
				
			case "Eliminar":
				int codeeli = Integer.parseInt(request.getParameter("codigo"));
				producto.setIdproductoscl3(codeeli);
				crud.EliminarProdu(producto);
				List<TblProductocl3> listado = crud.Listadoproducto();
				request.setAttribute("listadoproductos", listado);
				request.getRequestDispatcher("/RegistrarProducto.jsp").forward(request, response);
				break;
				
			case "Listar":
				List<TblProductocl3> listadoProducto=crud.Listadoproducto();
				request.setAttribute("listadoproductos", listadoProducto);
				request.getRequestDispatcher("/FormRegistrarProducto.jsp").forward(request, response);
				break;
			}
			
		}
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String codigo = request.getParameter("codigo");
		String nombre = request.getParameter("nombre");
	    double precioCompra = Double.parseDouble(request.getParameter("preciocomp"));
	    double precioVenta = Double.parseDouble(request.getParameter("precioventa"));
	    String estado = request.getParameter("estado");
	    String descripcion = request.getParameter("descripcion");

	    // Crear una instancia del producto
	    List<TblProductocl3> listadoproducto = null;
	    TblProductocl3 producto = new TblProductocl3();
	    ClassProductoImp crud = new ClassProductoImp();
	    
	    
	    producto.setNombrecl3(nombre);
	    producto.setPreciocompcl3(precioCompra);
	    producto.setPrecioventacl3(precioVenta);
	    producto.setEstadocl3(estado);
	    producto.setDescripcl3(descripcion);

	 
	    if(codigo != null){
			int cod = Integer.parseInt(codigo);
			producto.setIdproductoscl3(cod);
			crud.Actualizarproducto(producto);
			listadoproducto = crud.Listadoproducto();
		}else{
			crud.registrarproducto(producto);
			listadoproducto = crud.Listadoproducto();
		}
		

	   
	    request.setAttribute("listadoproducto", listadoproducto);
	    
	    // Redireccionar a la vista de listado de productos
	    request.getRequestDispatcher("/RegistrarProducto.jsp").forward(request, response);
	    
	    
	    
	}

}
