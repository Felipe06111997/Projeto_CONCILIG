package dao;

import java.util.ArrayList;
import model.ContratoModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class ContratoDao implements GenericDao<ContratoModel> {

    @Override
    public void incluir(ContratoModel Contrato) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(Contrato);
        t.commit();
        session.close();
    }

    @Override
    public void alterar(ContratoModel Contrato) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(Contrato);
        t.commit();
        session.close();
    }

    @Override
    public ArrayList<ContratoModel> consultar(String filtro) {
        String sql = "from " + ContratoModel.class.getName() + filtro;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        ArrayList lista = (ArrayList<ContratoModel>) session.createQuery(sql).list();
        t.commit();
        session.close();
        return lista;
    }

    @Override
    public void excluir(ContratoModel Contrato) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(Contrato);
        t.commit();
        session.close();
    }

    @Override
    public ContratoModel get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (ContratoModel) session.load(ContratoModel.class, id);
    }
}
