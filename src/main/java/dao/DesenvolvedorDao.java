package dao;

import model.Desenvolvedor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class DesenvolvedorDao {
    EntityManagerFactory emf = null;
    EntityManager em = null;

    public DesenvolvedorDao() {
        emf = Persistence.createEntityManagerFactory("IBGDEV-JPA");
        em = emf.createEntityManager();
        em.getTransaction().begin();
    }

    public void salvar(Desenvolvedor desenv){
        em.persist(desenv);

        em.getTransaction().commit();
        em.close();
    }

    public Desenvolvedor pesquisarPorId(Long id){
        Desenvolvedor pessoaEncontrada = em.find(Desenvolvedor.class, id);

        em.close();
        return pessoaEncontrada;
    }

    public void deletar(Long id){
        Desenvolvedor pessoaEncontrada = em.find(Desenvolvedor.class, id);
        em.remove(pessoaEncontrada);

        em.getTransaction().commit();
        em.close();
    }

    public void atualizar(Desenvolvedor desenv){
        em.merge(desenv);

        em.getTransaction().commit();
        em.close();
    }

    public void listarTodos(){
        String sql = "from Desenvolvedor";
        TypedQuery typedQuery = em.createQuery(sql, Desenvolvedor.class);
        List<Desenvolvedor> listaPessoas = typedQuery.getResultList();

        for(Desenvolvedor pessoaPercorrida : listaPessoas){
            System.out.println(pessoaPercorrida);

            em.close();
        }
    }
}
