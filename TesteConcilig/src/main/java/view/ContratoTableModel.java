package view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.ContratoModel;

public class ContratoTableModel extends AbstractTableModel {

    private ArrayList<ContratoModel> linhas;
    String[] colunas = {"ID", "NOME", "CPF", "CONTATO"};

    public ContratoTableModel(ArrayList<ContratoModel> arraycontrato) {
        linhas = arraycontrato;
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
        ContratoModel contrato = (ContratoModel) linhas.get(row);
        switch (col) {
            case 0:
                return contrato.getCON_ID();
            case 1:
                return contrato.getPessoa().getPES_NOME();
            case 2:
                return contrato.getPessoa().getPES_CPF();
            case 3:
                return contrato.getProduto().getPRO_NOME();
            default:
                return null;
        }
    }

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de ContratoModel
    public void addLista(ArrayList<ContratoModel> contrato) {
        int tamanhoAntigo = getRowCount();

        //Adiciona os Contratos
        linhas.addAll(contrato);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
}
