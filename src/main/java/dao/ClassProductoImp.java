package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.Iproducto;
import model.TblProductocl3;

public class ClassProductoImp implements Iproducto{
	

    @Override
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

    // Método para cerrar el EntityManagerFactory al finalizar la aplicación
   
        
    }

