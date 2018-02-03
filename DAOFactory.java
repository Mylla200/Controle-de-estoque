package dao;

import dao.mysql.*;

public abstract class DAOFactory {
    public static ClienteDAO getClienteDAO() {
        return new ClienteDAOMySQL();
    }
    
    public static ItemVendaDAO getItemVendaDAO() {
        return new ItemVendaDAOMySQL();
    }
    
    public static ProdutoDAO getProdutoDAO() {
        return new ProdutoDAOMySQL();
    }
    
    public static VendaDAO getVendaDAO() {
        return new VendaDAOMySQL();
    }
    
    public static VendedorDAO getVendedorDAO() {
        return new VendedorDAOMySQL();
    }
}
