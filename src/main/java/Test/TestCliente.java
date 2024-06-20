package Test;

import DAO.TblClienteImp;
import model.TblCliente;

public class TestCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TblCliente cliente = new TblCliente();
		TblClienteImp crud = new TblClienteImp();
		
		//INSERTAMOS DATOS
		cliente.setNombre("Jhon Alessandro");
		cliente.setApellido("Machacuay Rojas");
		cliente.setDni("76174404");
		cliente.setEmail("jotap4h@hotmail.com");
		cliente.setTel("99999999");
		cliente.setSexo("M");
		cliente.setNacionalidad("Peruana");
		//INVOCA EL REGISTRAR
		crud.RegistrarCliente(cliente);
	}

}
