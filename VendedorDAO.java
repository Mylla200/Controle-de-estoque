package dao;

import dao.entity.Vendedor;
import java.util.List;

public interface VendedorDAO {
    public Vendedor getVendedor(String cpf) throws Exception;
    public List<Vendedor> getAllVendedores() throws Exception;
}
