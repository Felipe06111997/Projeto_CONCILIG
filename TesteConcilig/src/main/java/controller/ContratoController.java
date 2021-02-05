package controller;

import dao.ContratoDao;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.ContratoModel;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import util.ReportUtils;

public class ContratoController implements GenericController<ContratoModel> {

    ContratoDao Contratodao;

    public ContratoController() {
        Contratodao = new ContratoDao();
    }

    @Override
    public void incluir(ContratoModel obj) throws Exception{
        Contratodao.incluir(obj);
    }

    @Override
    public void alterar(ContratoModel obj) throws Exception{
        Contratodao.alterar(obj);
    }

    @Override
    public void excluir(ContratoModel obj) throws Exception{
        Contratodao.excluir(obj);
    }

    @Override
    public ArrayList<ContratoModel> consultar(String filtro) {
        return Contratodao.consultar(filtro);
    }

    @Override
    public void gravar(ContratoModel obj, String operacao) throws Exception{
        if (operacao.equals("incluir")) {
            incluir(obj);
        } else {
            alterar(obj);
        }
    }

    @Override
    public Exception imprimir() {
        Exception retorno = null;
        InputStream inputStream = getClass().getResourceAsStream("/relatorios/RelatorioContrato.jasper");


        Map parametros = new HashMap();
        
        List dados = consultar("");
        
        // criando o datasource com os dados criados
        JRDataSource ds = new JRBeanCollectionDataSource(dados);

        try {
            // passando o datasource para o método de criação e exibição do relatório
            ReportUtils.openReport("Contratos - Bean Collection Data Source", inputStream, parametros, ds);

        } catch (Exception ex) {
            retorno =  ex;
        }
        return retorno;
    }
}
