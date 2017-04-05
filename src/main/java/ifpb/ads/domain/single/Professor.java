package ifpb.ads.domain.single;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 29/03/2017, 07:30:45
 */
@Entity
@DiscriminatorValue("PROF")
public class Professor extends Pessoa{

    private String siape;

    public Professor() {
    }

    public Professor(String siape, String nome, String cpf) {
        super(nome, cpf);
        this.siape = siape;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }
    
}
