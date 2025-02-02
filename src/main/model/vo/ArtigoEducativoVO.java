package model.vo;

public class ArtigoEducativoVO {
    private idArtigo;
    private String tema;
    private String autor;
    private String link;
    private String conteudoTexto;

    public ArtigoEducativoVO(String tema, String autor, String link, String conteudoTexto) {
        this.tema = tema;
        this.autor = autor;
        this.link = link;
        this.conteudoTexto = conteudoTexto;
    }

    public java.lang.String getTema() {
        return tema;
    }

    public void setTema(java.lang.String tema) {
        this.tema = tema;
    }

    public java.lang.String getAutor() {
        return autor;
    }

    public void setAutor(java.lang.String autor) {
        this.autor = autor;
    }

    public java.lang.String getLink() {
        return link;
    }

    public void setLink(java.lang.String link) {
        this.link = link;
    }

    public java.lang.String getConteudoTexto() {
        return conteudoTexto;
    }

    public void setConteudoTexto(java.lang.String conteudoTexto) {
        this.conteudoTexto = conteudoTexto;
    }
}