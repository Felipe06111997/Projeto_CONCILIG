package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CONTRATO")
public class ContratoModel implements java.io.Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CON_ID", nullable = false, precision = 10, scale = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "SEQ_CONTRATO")
    private int CON_ID;

    @Column(name = "CON_NUMERO", nullable = false, precision = 4, scale = 0)
    private int CON_NUMERO;

    @Column(name = "CON_VALOR", nullable = true, precision = 18, scale = 2)
    private double CON_VALOR;
	
    @Column(name = "CON_VENCIMENTO",nullable = true, length = 10)
    private String CON_VENCIMENTO;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PES_ID", nullable = false)
    private PessoaModel pessoa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRO_ID", nullable = false)
    private ProdutoModel produto;

    public ContratoModel() {
    }

    public ContratoModel(int CON_ID, int CON_NUMERO, ProdutoModel produto,PessoaModel pessoa, String CON_VENCIMENTO, double CON_VALOR) {
        this.CON_ID = CON_ID;
        this.CON_NUMERO = CON_NUMERO;
        this.produto = produto;
        this.pessoa = pessoa;
        this.CON_VENCIMENTO = CON_VENCIMENTO;
        this.CON_VALOR = CON_VALOR;
    }

    /**
     * @return the CON_ID
     */
    public int getCON_ID() {
        return CON_ID;
    }

    /**
     * @param CON_ID the CON_ID to set
     */
    public void setCON_ID(int CON_ID) {
        this.CON_ID = CON_ID;
    }

    /**
     * @return the CON_NUMERO
     */
    public int getCON_NUMERO() {
        return CON_NUMERO;
    }

    /**
     * @param CON_NUMERO the CON_NUMERO to set
     */
    public void setCON_NUMERO(int CON_NUMERO) {
        this.CON_NUMERO = CON_NUMERO;
    }

    /**
     * @return the CON_VALOR
     */
    public double getCON_VALOR() {
        return CON_VALOR;
    }

    /**
     * @param CON_VALOR the CON_VALOR to set
     */
    public void setCON_VALOR(double CON_VALOR) {
        this.CON_VALOR = CON_VALOR;
    }


    /**
     * @return the pessoa
     */
    public PessoaModel getPessoa() {
        return pessoa;
    }

    /**
     * @param pessoa the pessoa to set
     */
    public void setPessoa(PessoaModel pessoa) {
        this.pessoa = pessoa;
    }

    /**
     * @return the produto
     */
    public ProdutoModel getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(ProdutoModel produto) {
        this.produto = produto;
    }
	
	/**
     * @return the CON_VENCIMENTO
     */
    public String getCON_VENCIMENTO() {
        return CON_VENCIMENTO;
    }

    /**
     * @param CON_VENCIMENTO the CON_VENCIMENTO to set
     */
    public void setCON_VENCIMENTO(String CON_VENCIMENTO) {
        this.CON_VENCIMENTO = CON_VENCIMENTO;
    }

}
