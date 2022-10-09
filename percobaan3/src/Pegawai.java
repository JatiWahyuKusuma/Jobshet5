public class Pegawai {
    private String nip;
    private String nama;

    public Pegawai(String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNip(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String info(){
        String info = " ";
        info += "Nip : " + nip + "\n";
        info += "Nama : " + nama + "\n";
        return info;
    }
}
