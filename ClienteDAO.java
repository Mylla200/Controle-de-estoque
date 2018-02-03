package dao;

import dao.entity.Cliente;
import java.util.List;

public interface ClienteDAO {
    public Cliente getCliente(String cpf) throws Exception;
    public List<Cliente> getAllClientes() throws Exception;
    public void updateCliente(Cliente cliente) throws Exception;
}
