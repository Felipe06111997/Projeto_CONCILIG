package relatorio;

import java.util.Iterator;
import java.util.List;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import model.ProdutoModel;

public class ProdutoDataSource implements JRDataSource {

    private Iterator itrProduto;
    private Object valorAtual;

    private int i = 0;

    private boolean irParaProximoAluno = true;

    public ProdutoDataSource(List lista) {
        super();
        this.itrProduto = lista.iterator();
    }

    public boolean next() throws JRException {
        valorAtual = itrProduto.hasNext() ? itrProduto.next() : null;
        irParaProximoAluno = (valorAtual != null);
        return irParaProximoAluno;
    }

    public Object getFieldValue(JRField campo) throws JRException {
        Object valor = null;
        ProdutoModel produto = (ProdutoModel) valorAtual;

        if ("PRO_ID".equals(campo.getName())) {
            valor = produto.getPRO_ID();
        } else if ("PRO_NOME".equals(campo.getName())) {
            valor = produto.getPRO_NOME();
        }
		
        return valor;
    }
}
