package ifpb.ads.domain.joined;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 29/03/2017, 08:17:15
 */
@Entity
@DiscriminatorValue("FUSCA")
public class Fusca extends Carro implements Serializable {

    private String ano;

    public Fusca() {
    }

    public Fusca(String ano, String modelo) {
        super(modelo);
        this.ano = ano;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

}
