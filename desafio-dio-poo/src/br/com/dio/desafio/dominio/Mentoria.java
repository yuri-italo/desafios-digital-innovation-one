package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;


    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo,descricao);
        this.data = data;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + super.getTitulo() + '\'' +
                ", descricao='" + super.getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
