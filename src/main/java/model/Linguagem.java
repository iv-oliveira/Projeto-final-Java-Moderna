package model;

import javax.persistence.*;

@Entity
public class Linguagem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @Column(length = 50, nullable = false)
    private String Nome;
    @Column(length = 10, nullable = false)
    private String versao;

    @Override
    public String toString() {
        return "Linguagem{" +
                "Id=" + Id +
                ", Nome='" + Nome + '\'' +
                ", versao='" + versao + '\'' +
                '}';
    }

    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }

    public String getVersao() {
        return versao;
    }
    public void setVersao(String versao) {
        this.versao = versao;
    }
}
