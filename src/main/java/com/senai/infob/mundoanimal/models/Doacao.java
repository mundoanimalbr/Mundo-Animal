package com.senai.infob.mundoanimal.models;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="Doacao")
public class Doacao{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer Id;

    @Column(name="pagamento")
    private Pagamento pagamento;

    public Doacao(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    @Column(name="material")
    private String material;

    @Column(name="tel_contato")
    private String telContato;
    public Doacao() {
    }

    private List<Usuario> usuario;

@ManyToMany
    @JoinTable(
        name = "doacao_usuario",
        joinColumns = @JoinColumn(name = "doacao_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    )


    
}
