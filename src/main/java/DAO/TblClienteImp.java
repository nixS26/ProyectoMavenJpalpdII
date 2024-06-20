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
		// establecer la conexion con la unidad de persistencia
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoMavenJpalpdII");
		//gestionar las entidades
		EntityManager emanager= em.createEntityManager();
		//inciamos la transaccion
		emanager.getTransaction().begin();
		//registramos a la base de datos
		emanager.persist(cliente);
		//emititmos mensaje por consola
		System.out.println("Cliente Registrado en la base de datos");
		//confirmamos la transaccion
		emanager.getTransaction().commit();
		//cerramos
		emanager.close();
	}//fin del metodo registrar cliente

	@Override
	public void ActualizarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		
	}//fin del metodo actualizar cliente

	@Override
	public void EliminarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		
	}//fin del metodo eliminar cliente

	@Override
	public TblCliente BuscarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}//fin del metodo buscar cliente

	@Override
	public List<TblCliente> ListarCliente() {
		// TODO Auto-generated method stub
		return null;
	}//fin del metodo listar cliente

}
