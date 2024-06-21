package Test;

import java.util.List;

import DAO.TblClienteImp;
import model.TblCliente;

public class TestCliente {

	public static void main(String[] args) {
		// REALIZAMOS LAS RESPECTIVAS INSTANCIAS
		TblCliente cliente = new TblCliente();
		TblClienteImp crud=new TblClienteImp();
		/*//insertamos datos
		cliente.setNombre("Ninfa Estefany");
		cliente.setApellido("Zapata Chavez");
		cliente.setDni("10365722");
		cliente.setEmail("zapata@gmail.com");
		cliente.setSexo("F");
		cliente.setNacionalidad("peruana");
		//invocamos el metodo registrar...
		crud.RegistrarCliente(cliente);
		*/
		List<TblCliente> listado=crud.ListarCliente();
		//aplicacos un bucle
		for(TblCliente lis:listado){
			//imprimir por pantalla
			System.out.println("codigo "+ lis.getIdcliente()+"\n"+
			"nombre" + lis.getNombre()+"\n"+
					"apellido" + lis.getApellido()+"\n"+
					"dni"+lis.getDni());
		}
		
	}//FIN DEL METODO PRINCIPAL

	
}//FIN DE LA CLASE
