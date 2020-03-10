package ZivotinjskoCarstvo;

public class Slicica {

    private Integer broj;
    private String NazivZivotinje;

    public Slicica(Integer broj, String nazivZivotinje) {
        this.broj = broj;
        NazivZivotinje = nazivZivotinje;
    }

    public Integer getBroj() {
        return broj;
    }

    public void setBroj(Integer broj) {
        this.broj = broj;
    }

    public String getNazivZivotinje() {
        return NazivZivotinje;
    }

    public void setNazivZivotinje(String nazivZivotinje) {
        NazivZivotinje = nazivZivotinje;
    }
}
