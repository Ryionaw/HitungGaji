public class MainProgram {

    public static void main(String[] args) {

        Staf s1 = new Staf();
        s1.setNama("Putu");
        s1.setKehadiran(20);

        Dosen d1 = new Dosen();
        d1.setNama("Dharmadi");
        d1.setSKS(12);

        Pegawai p1 = new Pegawai();
        p1.setNama("Kadek");

        DaftarGaji daftar_gaji = new DaftarGaji(3);
        daftar_gaji.addPegawai(s1);
        daftar_gaji.addPegawai(d1);
        daftar_gaji.addPegawai(p1);
        daftar_gaji.printSemuaGaji();
    }
}