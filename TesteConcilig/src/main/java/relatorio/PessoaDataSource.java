package relatorio;

import java.util.Iterator;
import java.util.List;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import model.PessoaModel;

public class PessoaDataSource implements JRDataSource {

    private Iterator itrPessoa;
    private Object valorAtual;

    private int i = 0;

    private boolean irParaProximoAluno = true;

    public PessoaDataSource(List lista) {
        super();
        this.itrPessoa = lista.iterator();
    }

    public boolean next() throws JRException {
        valorAtual = itrPessoa.hasNext() ? itrPessoa.next() : null;
        irParaProximoAluno = (valorAtual != null);
        return irParaProximoAluno;
    }

    public Object getFieldValue(JRField campo) throws JRException {
        Object valor = null;
        PessoaModel pessoa = (PessoaModel) valorAtual;

        if ("PES_ID".equals(campo.getName())) {
            valor = pessoa.getPES_ID();
        } else if ("PES_NOME".equals(campo.getName())) {
            valor = pessoa.getPES_NOME();
        } else if ("PES_CPF".equals(campo.getName())) {
            valor = pessoa.getPES_CPF();
        }

        return valor;
    }
}
