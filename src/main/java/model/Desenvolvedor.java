package model;

import javax.persistence.*;

@Entity
//@Table(name = "db_fulano")
public class Desenvolvedor {
    @Id     //Primary key
    @GeneratedValue(strategy = GenerationType.AUTO)     //auto-increment
    private Long id;
    @Column(length = 50, nullable = false)
    private String nome;
    @Column(length = 14, nullable = false, unique = true)
    private String cpf;
    @Column(length = 9, nullable = false)
    private String genero;
    @Column(length = 10, nullable = false)
    private String ano_nasc;

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", genero='" + genero + '\'' +
                ", ano_nasc='" + ano_nasc + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAno_nasc() {
        return ano_nasc;
    }
    public void setAno_nasc(String ano_nasc) {
        this.ano_nasc = ano_nasc;
    }
}
