package ifpb.ads.domain.table;

import javax.persistence.Entity;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 29/03/2017, 08:05:15
 */
@Entity
public class Felino extends Animal {

    private String alimentacao;

    public Felino() {
    }

    public Felino(String alimentacao, String raca, String dono) {
        super(raca, dono);
        this.alimentacao = alimentacao;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

}
