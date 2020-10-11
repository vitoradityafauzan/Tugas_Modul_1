package vitorf.TugasMod1.no2;

public class Pendaftaran {
    String nama;
    private int lahir_tgl;
    private int lahir_bln;
    private int lahir_thn;
    int nim;

    public Pendaftaran(String nama, int nim, int lahir_tgl, int lahir_bln, int lahir_thn) {
        this.nama = nama;
        this.lahir_tgl = lahir_tgl;
        this.lahir_bln = lahir_bln;
        this.lahir_thn = lahir_thn;
        this.nim = nim;
    }

    public int getLahir_tgl() {
        return lahir_tgl;
    }

    public int getLahir_bln() {
        return lahir_bln;
    }

    public int getLahir_thn() {
        return lahir_thn;
    }

    public String getNama() {
        return nama;
    }

    public int getNim() {
        return nim;
    }

}
