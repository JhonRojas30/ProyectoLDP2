package Interfaces;

import java.util.List;

import model.TblCliente;

public interface ICliente {

//DECLARAMOS LAS VARIABLES
	public void RegistrarCliente(TblCliente cliente);
	public void ActualizarCliente(TblCliente cliente);
	public void EliminarCliente(TblCliente cliente);
	public TblCliente BuscarCliente(TblCliente cliente);
	public List<TblCliente>ListarCliente();
}
