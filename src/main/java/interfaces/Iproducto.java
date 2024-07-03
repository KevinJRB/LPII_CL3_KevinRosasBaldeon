package interfaces;

import java.util.List;


import model.TblProductocl3;

public interface Iproducto {

	public void  registrarproducto(TblProductocl3 producto);
	
	
	
	public List<TblProductocl3>Listadoproducto();
	
	public void EliminarProdu(TblProductocl3 producto);
	


	public TblProductocl3 Buscarproducto(TblProductocl3 producto);



	void Actualizarproducto(TblProductocl3 producto);
	
	
}
