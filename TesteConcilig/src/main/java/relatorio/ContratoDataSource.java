package relatorio;

import java.util.Iterator;
import java.util.List;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import model.ContratoModel;

public class ContratoDataSource implements JRDataSource {

    private Iterator itrContrato;
    private Object valorAtual;

    private int i = 0;

    private boolean irParaProximoAluno = true;

    public ContratoDataSource(List lista) {
        super();
        this.itrContrato = lista.iterator();
    }

    public boolean next() throws JRException {
        valorAtual = itrContrato.hasNext() ? itrContrato.next() : null;
        irParaProximoAluno = (valorAtual != null);
        return irParaProximoAluno;
    }

    public Object getFieldValue(JRField campo) throws JRException {
        Object valor = null;
        ContratoModel contrato = (ContratoModel) valorAtual;

        if ("CON_ID".equals(campo.getName())) {
            valor = contrato.getCON_ID();
        } else if ("PES_ID".equals(campo.getName())) {
            valor = contrato.getPessoa().getPES_ID();
        } else if ("PRO_ID".equals(campo.getName())) {
            valor = contrato.getProduto().getPRO_ID();
        } else if ("CON_NUMERO".equals(campo.getName())){
			valor = contrato.getCON_NUMERO();
		} else if ("CON_VENCIMENTO".equals(campo.getName())){
			valor = contrato.getCON_VENCIMENTO();
		} else if ("CON_VALOR".equals(campo.getName())){
			valor = contrato.getCON_VALOR();
		}

        return valor;
    }
}