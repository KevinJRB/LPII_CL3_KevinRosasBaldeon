package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClassUsuarioImp;
import model.TblUsuariocl3;

/**
 * Servlet implementation class controladorusuario
 */
public class controladorusuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controladorusuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String usuario = request.getParameter("usuario");
	        String password= request.getParameter("password");

	        // Instanciar las respectivas entidades
	        TblUsuariocl3 usuariologin =new TblUsuariocl3();
	        ClassUsuarioImp crud = new ClassUsuarioImp();

	        // Asignar valores
	        usuariologin.setUsuariocl3(usuario);
	        usuariologin.setPasswordcl3(password);

	        
	        
	        
	            
	        // Invocar el método registrar
	        crud.resgistrarUsuario(usuariologin);
	      
	        if (usuario != null && password != null && usuario.equals("kevin123") && password.equals("kevin")) {
	            
	        	request.getRequestDispatcher("/RegistrarProducto.jsp").forward(request, response); 
	        } else {
	           
	            request.setAttribute("error", "Usuario o contraseña incorrectos.");
	            request.getRequestDispatcher("/login.jsp").forward(request, response);
	        
	        // Redireccionar a la vista
	        
	    }
	}

}
