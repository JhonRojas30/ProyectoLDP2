package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.ICliente;
import model.TblCliente;

public class TblClienteImp implements ICliente{

	@Override
	public void RegistrarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		EntityManagerFactory em = Persistence.createEntityManagerFactory("ProyectoMavenJPALDPII");
		//GESTIONAR LAS ENTIDADES
		EntityManager emanager = em.createEntityManager();
		//INICIAMOS LA TRANSACCION
		emanager.getTransaction().begin();
		//REGISTRAMOS A LA BASE DE DATOS
		emanager.persist(cliente);
		//EMITIR UN MSJ POR PANTALLA
		System.out.println("Cliente Registrado en la Base de Datos");
		//CONFIRMAMOS LA TRANSACCION
		emanager.getTransaction().commit();
		//CERRAMOS
		emanager.close();
	}

	@Override
	public void ActualizarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TblCliente BuscarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TblCliente> ListarCliente() {
		// TODO Auto-generated method stub
		return null;
	}

}
