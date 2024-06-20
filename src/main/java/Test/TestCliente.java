package Test;

import DAO.TblClienteImp;
import model.TblCliente;

public class TestCliente {

	public static void main(String[] args) {
		// REALIZAMOS LAS RESPECTIVAS INSTANCIAS
		TblCliente cliente = new TblCliente();
		TblClienteImp crud=new TblClienteImp();
		//insertamos datos
		cliente.setNombre("Ninfa Estefany");
		cliente.setApellido("Zapata Chavez");
		cliente.setDni("10365722");
		cliente.setEmail("zapata@gmail.com");
		cliente.setSexo("F");
		cliente.setNacionalidad("peruana");
		//invocamos el metodo registrar...
		crud.RegistrarCliente(cliente);
	}//FIN DEL METODO PRINCIPAL

}//FIN DE LA CLASE
