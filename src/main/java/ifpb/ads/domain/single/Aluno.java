package ifpb.ads.domain.single;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 29/03/2017, 07:30:45
 */
@Entity
@DiscriminatorValue("ALUNO")
public class Aluno extends Pessoa{

    private String matricula;

    public Aluno() {
    }

    public Aluno(String matricula, String nome, String cpf) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public String getBolsa() {
        return matricula;
    }

    public void setBolsa(String matricula) {
        this.matricula = matricula;
    }
    
}
