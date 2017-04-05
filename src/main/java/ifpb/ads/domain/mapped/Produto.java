package ifpb.ads.domain.mapped;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 29/03/2017, 08:34:53
 */
@MappedSuperclass
public abstract class Produto implements Serializable{

    @Id
    @GeneratedValue
    private int id;
    private String descricao;

    public Produto(String descricao) {
        this.descricao = descricao;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
