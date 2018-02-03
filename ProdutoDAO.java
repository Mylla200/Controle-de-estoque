package dao;

import dao.entity.Produto;
import java.util.List;

public interface ProdutoDAO {
    public Produto getProduto(String ean) throws Exception;
    public List<Produto> getAllProdutos() throws Exception;
}
