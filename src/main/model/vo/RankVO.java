package model.vo;

public class RankVO{
    private int idRank;
    private int posicao;
    private Empresa empresa;
    private intpontuacao;

    public RankVO(int idRank, int posicao, Empresa empresa) {
        this.idRank = idRank;
        this.posicao = posicao;
        this.empresa = empresa;
    }

    public int getIdRank() {
        return idRank;
    }

    public void setIdRank(int idRank) {
        this.idRank = idRank;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}