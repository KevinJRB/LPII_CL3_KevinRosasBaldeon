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
		TblProductocl3 productos= new TblProductocl3();
		ClassProductoImp crud= new ClassProductoImp();
		List<TblProductocl3> Listado = crud.Listadoproducto();
		
		
		request.setAttribute("listadoproducto",Listado);
		
		request.getRequestDispatcher("/Listado.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = request.getParameter("nombre");
	    double precioCompra = Double.parseDouble(request.getParameter("preciocomp"));
	    double precioVenta = Double.parseDouble(request.getParameter("precioventa"));
	    String estado = request.getParameter("estado");
	    String descripcion = request.getParameter("descripcion");

	    // Crear una instancia del producto
	    TblProductocl3 producto = new TblProductocl3();
	    ClassProductoImp crud = new ClassProductoImp();
	    
	    
	    producto.setNombrecl3(nombre);
	    producto.setPreciocompcl3(precioCompra);
	    producto.setPrecioventacl3(precioVenta);
	    producto.setEstadocl3(estado);
	    producto.setDescripcl3(descripcion);

	 
	  

	    // Registrar el producto en la base de datos
	    crud.registrarproducto(producto);

	    // Obtener la lista actualizada de productos y enviarla a Listado.jsp
	    List<TblProductocl3> listadoproducto = crud.Listadoproducto();
	    request.setAttribute("listadoproducto", listadoproducto);
	    
	    // Redireccionar a la vista de listado de productos
	    request.getRequestDispatcher("/Listado.jsp").forward(request, response);
	}

}
