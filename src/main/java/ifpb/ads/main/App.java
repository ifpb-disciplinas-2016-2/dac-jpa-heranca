package ifpb.ads.main;

import ifpb.ads.domain.joined.Carro;
import ifpb.ads.domain.joined.Fusca;
import ifpb.ads.domain.mapped.Alimento;
import ifpb.ads.domain.single.Aluno;
import ifpb.ads.domain.single.AlunoBolsista;
import ifpb.ads.domain.single.Pessoa;
import ifpb.ads.domain.single.Professor;
import ifpb.ads.domain.table.Animal;
import ifpb.ads.domain.table.Felino;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 29/03/2017, 07:31:32
 */
public class App {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exemplo-heranca");
        EntityManager em = emf.createEntityManager();
        
        Alimento alimento = new Alimento(2.85d, "Arroz");
        em.getTransaction().begin();
        em.persist(alimento);
        em.getTransaction().commit();

        //        persistirPessoa(em);        
//        persistirAnimal(em);
//        pesistirCarro(em);
    }
    
    private static void pesistirCarro(EntityManager em) {
        Carro carro = new Carro("F1000");
        Fusca fusca = new Fusca("1972", "massa");
        
        em.getTransaction().begin();
        em.persist(carro);
        em.persist(fusca);
        em.getTransaction().commit();
        
    }
    
    private static void persistirAnimal(EntityManager em) {
        Animal leao = new Animal("Leão", "Kiko");
        Felino felino = new Felino("ração", "Gato preguiça", "Kiko");
        
        em.getTransaction().begin();
        em.persist(felino);
        em.persist(leao);
        em.getTransaction().commit();
        
    }
    
    private static void persistirPessoa(EntityManager em) {
        Pessoa pessoa = new Pessoa("Kiko", "123");
        Aluno aluno = new Aluno("123-ads", "Chaves", "234");
        AlunoBolsista bolsista = new AlunoBolsista("123-ads", "Chaves", "234");
        Professor professor = new Professor("1234", "Job", "456");
        em.getTransaction().begin();
        em.persist(bolsista);
        em.persist(professor);
        em.persist(pessoa);
        em.persist(aluno);
        em.getTransaction().commit();
    }
    
}
