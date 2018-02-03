package dao;

import dao.entity.ItemVenda;
import dao.entity.Venda;
import java.util.List;

public interface VendaDAO {
    public Venda getVenda(int codVenda) throws Exception;
    public void addVenda(Venda venda, List<ItemVenda> itens) throws Exception;
}
