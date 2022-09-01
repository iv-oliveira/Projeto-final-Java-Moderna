import dao.DesenvolvedorDao;
import model.Desenvolvedor;

public class Principal {
    public static void main(String[] args) {
        Desenvolvedor desenv = new Desenvolvedor();
        desenv.setNome("Outro");
        desenv.setCpf("095.952.275.20");
        desenv.setAno_nasc("14/09/1991");
        desenv.setGenero("Masculino");

        DesenvolvedorDao desDao = new DesenvolvedorDao();
        desDao.deletar(2L);

    }
}
