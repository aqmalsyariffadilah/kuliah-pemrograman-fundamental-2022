package gui.aqmal;

public class Variabel {
    private String nomorkartu;
    private String jenisatm;
    private String bank;
    private String namapemilik;

    public Variabel() {
    }

    public Variabel(String nomorkartu, String jenisatm, String bank, String namapemilik) {
        this.nomorkartu = nomorkartu;
        this.jenisatm = jenisatm;
        this.bank = bank;
        this.namapemilik = namapemilik;
    }

    public String getNomorkartu() {
        return nomorkartu;
    }

    public void setNomorkartu(String nomorkartu) {
        this.nomorkartu = nomorkartu;
    }

    public String getJenisatm() {
        return jenisatm;
    }

    public void setJenisatm(String jenisatm) {
        this.jenisatm = jenisatm;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getNamapemilik() {
        return namapemilik;
    }

    public void setNamapemilik(String namapemilik) {
        this.namapemilik = namapemilik;
    }

    @Override
    public String toString() {
        return ("\n nomorkartu='" + nomorkartu + '\'' +
                "\njenisatm='" + jenisatm + '\'' +
                "\nbank='" + bank + '\'' +
                "\nnamapemilik='" + namapemilik);
    }
}
