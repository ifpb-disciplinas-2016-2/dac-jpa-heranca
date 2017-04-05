package ifpb.ads.domain.mapped;

import javax.persistence.Entity;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 29/03/2017, 08:36:12
 */
@Entity
public class Alimento extends Produto {

    private double preco;

    public Alimento(double preco, String descricao) {
        super(descricao);
        this.preco = preco;
    }

    public Alimento() {
        super("");
    }

    

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
