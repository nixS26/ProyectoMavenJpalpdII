package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.TblClienteImp;
import model.TblCliente;

/**
 * Servlet implementation class ControladorCliente
 */
public class ControladorCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorCliente() {
        super();
        // TODO Auto-generated constructor stub
    }//fin del constructor 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				TblCliente cliente = new TblCliente();
				TblClienteImp crud = new TblClienteImp();
				List<TblCliente> listadocliente =crud.ListarCliente();
				//ASIGNAMOS EL LISTADO DE CLIENTES RECUPERADOS DE LA BD
				request.setAttribute("ListadoClientes", listadocliente);
				
				//response.getWriter().append("Controlador Cliente ").append(request.getContextPath());
				//REDIRECCIONAMOS
				request.getRequestDispatcher("/ListadoClientes.jsp").forward(request, response);

	}//fin del metodo doget...

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				//doGet(request, response);
				
				//RECUPERAMOS LOS DATOS DEL FORMULARIO
				String nombre = request.getParameter("nombre");
				String apellido = request.getParameter("apellido");
				String dni = request.getParameter("dni");
				String email = request.getParameter("email");
				String telef = request.getParameter("telefono");
				String sexo = request.getParameter("sexo");
				String nacion = request.getParameter("nacionalidad");
				
				//INSTANCIAMOS LAS RESPECTIVAS CLASES
				TblCliente cliente = new TblCliente();
				TblClienteImp crud = new TblClienteImp();
				//ASIGNAMOS LOS VALORES
				cliente.setNombre(nombre);
				cliente.setApellido(apellido);
				cliente.setDni(dni);
				cliente.setEmail(email);
				cliente.setTel(telef);
				cliente.setSexo(sexo);
				cliente.setNacionalidad(nacion);
				
				//INVOCAMOS EL METEODO A REGISTRAR
				crud.RegistrarCliente(cliente);
				//actualizar el listdao
				List<TblCliente> listadocliente=crud.ListarCliente();
			
				//ASIGNAMOS EL LISTADO DE CLIENTES RECUPERADOS DE LA BD
				request.setAttribute("ListadoClientes", listadocliente);
				//REDIRECCIONAMOS A LISTADO
				request.getRequestDispatcher("/ListadoClientes.jsp").forward(request, response);
			}//FIN DEL METODO DOPOST



}
