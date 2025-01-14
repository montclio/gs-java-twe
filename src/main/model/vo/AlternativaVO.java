package model.vo;


public class AlternativaVO {
    private int idAlternativa;
    private String descAlternativa;

    public AlternativaVO(int idAlternativa, String descAlternativa) {
        this.idAlternativa = idAlternativa;
        this.descAlternativa = descAlternativa;
    }

    public int getIdAlternativa() {
        return idAlternativa;
    }

    public void setIdAlternativa(int idAlternativa) {
        this.idAlternativa = idAlternativa;
    }

    public java.lang.String getDescAlternativa() {
        return descAlternativa;
    }

    public void setDescAlternativa(java.lang.String descAlternativa) {
        this.descAlternativa = descAlternativa;
    }
}