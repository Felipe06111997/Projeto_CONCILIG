package view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.ProdutoModel;

public class ProdutoTableModel extends AbstractTableModel {

    private ArrayList<ProdutoModel> linhas;
    String[] colunas = {"ID", "NOME"};

    public ProdutoTableModel(ArrayList<ProdutoModel> arrayproduto) {
        linhas = arrayproduto;
    }

    //Retorna a quantidade de colunas do modelo, que no caso será fixa
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    //Retorna a quantidade de linhas atual do objeto, que no caso é o tamnho da lista
    @Override
    public int getRowCount() {
        return linhas.size();
    }

    //Retorna o nome da coluna, recebendo seu índice
    @Override
    public String getColumnName(int indiceColuna) {
        return colunas[indiceColuna];
    }

    @Override
    public Object getValueAt(int row, int col) {
        ProdutoModel produto = (ProdutoModel) linhas.get(row);
        switch (col) {
            case 0:
                return produto.getPRO_ID();
            case 1:
                return produto.getPRO_NOME();
            default:
                return null;
        }
    }

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de ProdutoModel
    public void addLista(ArrayList<ProdutoModel> produto) {
        int tamanhoAntigo = getRowCount();

        //Adiciona os usuários
        linhas.addAll(produto);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
}
