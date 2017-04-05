package ifpb.ads.domain.single;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 29/03/2017, 07:30:45
 */
@Entity
//@DiscriminatorValue("BOLSISTA")
public class AlunoBolsista extends Aluno{

    private String bolsa;

    public AlunoBolsista() {
    }

    public AlunoBolsista(String bolsa, String nome, String cpf) {
        super("123", nome, cpf);
        this.bolsa = bolsa;
    }

    public String getBolsa() {
        return bolsa;
    }

    public void setBolsa(String bolsa) {
        this.bolsa = bolsa;
    }
    
}
