public class mainPercobaan3 {
    public static void main(String args[]){
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
        Pegawai asisten = new Pegawai("456", "Patrick Star");
        KeretaApi keretapi = new KeretaApi("Gaya Baru", "Bisnis", masinis, asisten);
        
        System.out.println(keretapi.info());
    }
}
