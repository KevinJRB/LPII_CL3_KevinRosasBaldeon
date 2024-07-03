package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.Iproducto;
import model.TblProductocl3;

public  class ClassProductoImp implements Iproducto{
	

    
    public void registrarproducto(TblProductocl3 producto) {
    	EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL3_KevinRosasBaldeon");
		EntityManager em=fabr.createEntityManager();
		em.getTransaction().begin();
		em.persist(producto);
		System.out.println("Producto registrado en la BD correctamente");
		em.getTransaction().commit();
		em.close();
    }

    @Override
    public List<TblProductocl3> Listadoproducto() {
    	EntityManagerFactory fabr = Persistence.createEntityManagerFactory("LPII_CL3_KevinRosasBaldeon");
		EntityManager em = fabr.createEntityManager();
		em.getTransaction().begin();
		List<TblProductocl3> Listado = em.createQuery("select c from TblProductocl3 c", TblProductocl3.class).getResultList();
		em.getTransaction().commit();
		em.close();
		return Listado;
    }
    
    @Override
    public void Actualizarproducto(TblProductocl3 producto) {
		// TODO Auto-generated method stub
		EntityManagerFactory fabr = Persistence.createEntityManagerFactory("LPII_CL3_KevinRosasBaldeon");
		EntityManager em = fabr.createEntityManager();
		em.getTransaction().begin();
		em.merge(producto);
		em.getTransaction().commit();
		em.close();
		
	}
    
    @Override
    public void EliminarProdu(TblProductocl3 producto) {
		// TODO Auto-generated method stub
		EntityManagerFactory fabr = Persistence.createEntityManagerFactory("LPII_CL3_KevinRosasBaldeon");
		EntityManager em = fabr.createEntityManager();
		em.getTransaction().begin();
		TblProductocl3 elim = em.merge(producto);
		em.remove(elim);
		System.out.println("Cliente eliminado de la base de datos");
		em.getTransaction().commit();
		em.close();
		
	}
    
    @Override
    public TblProductocl3 Buscarproducto(TblProductocl3 producto) {
		//establecemos la conexion con la unidad de persistencia..
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL3_KevinRosasBaldeon");
		//gestionar las entidads
		EntityManager em=fabr.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//recuperamos el codigo a buscar
		TblProductocl3 busproducto=em.find(TblProductocl3.class,producto.getIdproductoscl3());
		//confirmamos 
		em.getTransaction().commit();
		//cerramos
		em.close();
		return busproducto;
	}

	
    }

