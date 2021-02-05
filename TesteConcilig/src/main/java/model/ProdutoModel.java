package model;

import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity

@Table(name = "PRODUTO")
public class ProdutoModel implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "PRO_ID", nullable = false, precision = 10, scale = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "SEQ_PRODUTO")
    private int PRO_ID;

    @Column(name = "PRO_NOME", nullable = true, length = 80)
    private String PRO_NOME;

    @Override
    public String toString() {
        return PRO_NOME;
    }

    public ProdutoModel(){
        
    }
    public ProdutoModel(String PRO_NOME){
        this.PRO_NOME = PRO_NOME;
                   
    }   

    /**
     * @return the PRO_ID
     */
    public int getPRO_ID() {
        return PRO_ID;
    }

    /**
     * @param PRO_ID the PRO_ID to set
     */
    public void setPRO_ID(int PRO_ID) {
        this.PRO_ID = PRO_ID;
    }

    /**
     * @return the PRO_NOME
     */
    public String getPRO_NOME() {
        return PRO_NOME;
    }

    /**
     * @param PRO_NOME the PRO_NOME to set
     */
    public void setPRO_NOME(String PRO_NOME) {
        this.PRO_NOME = PRO_NOME;
    }


    }
