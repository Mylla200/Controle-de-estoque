package dao;

import dao.entity.ItemVenda;
import java.sql.Connection;
import java.util.List;

public interface ItemVendaDAO {
    public List<ItemVenda> getItensVenda(int codVenda) throws Exception;
    public void addItemVenda(ItemVenda itemVenda, Connection connection) throws Exception;
}
