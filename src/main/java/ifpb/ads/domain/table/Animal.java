package ifpb.ads.domain.table;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 29/03/2017, 08:04:14
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Animal implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String raca;
    private String dono;

    public Animal() {
    }

    public Animal(String raca, String dono) {
        this.raca = raca;
        this.dono = dono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
    

}
