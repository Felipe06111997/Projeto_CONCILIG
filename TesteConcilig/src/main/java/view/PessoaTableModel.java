package view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.PessoaModel;

public class PessoaTableModel extends AbstractTableModel {

    private ArrayList<PessoaModel> linhas;
    String[] colunas = {"ID", "NOME", "CPFCNPJ"};

    public PessoaTableModel(ArrayList<PessoaModel> arraypessoa) {
        linhas = arraypessoa;
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
        PessoaModel pessoa = (PessoaModel) linhas.get(row);
        switch (col) {
            case 0:
                return pessoa.getPES_ID();
            case 1:
                return pessoa.getPES_NOME();
            case 2:
                return pessoa.getPES_CPF();
            default:
                return null;
        }
    }

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de PessoaModel
    public void addLista(ArrayList<PessoaModel> pessoa) {
        int tamanhoAntigo = getRowCount();

        //Adiciona os usuários
        linhas.addAll(pessoa);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
}
