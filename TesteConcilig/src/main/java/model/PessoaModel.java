package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PESSOA")
public class PessoaModel implements java.io.Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "PES_ID", nullable = false, precision = 10, scale = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "SEQ_PESSOA")
    private int PES_ID;

    @Column(name = "PES_NOME", nullable = true, length = 80)
    private String PES_NOME;

    @Column(name = "PES_CPF", nullable = true, length = 20)
    private String PES_CPF;

    @Override
    public String toString() {
        return this.getPES_NOME();
    }

    public PessoaModel() {
        
    }

    public PessoaModel(String PES_NOME,String PES_CPF) {
        
        
        this.PES_NOME = PES_NOME;
        this.PES_CPF = PES_CPF;
        
    }

    /**
     * @return the PES_ID
     */
    public int getPES_ID() {
        return PES_ID;
    }

    /**
     * @param PES_ID the PES_ID to set
     */
    public void setPES_ID(int PES_ID) {
        this.PES_ID = PES_ID;
    }

    /**
     * @return the PES_NOME
     */
    public String getPES_NOME() {
        return PES_NOME;
    }

    /**
     * @param PES_NOME the PES_NOME to set
     */
    public void setPES_NOME(String PES_NOME) {
        this.PES_NOME = PES_NOME;
    }

    /**
     * @return the PES_CPF
     */
    public String getPES_CPF() {
        return PES_CPF;
    }

    /**
     * @param PES_CPF the PES_CPF to set
     */
    public void setPES_CPF(String PES_CPF) {
        this.PES_CPF = PES_CPF;
    }

    
}
