public class MainProgram {

    public static void main(String[] args) {

        Staf s1 = new Staf();
        s1.setNama("Andika");
        s1.setKehadiran(20);

        Dosen d1 = new Dosen();
        d1.setNama("Budiman");
        d1.setSKS(12);

        Pegawai p1 = new Pegawai();
        p1.setNama("Charles");

        Pegawai p2 = new Pegawai();
        p2.setNama("Donny");

        DaftarGaji daftar_gaji = new DaftarGaji(5);
        daftar_gaji.addPegawai(s1);
        daftar_gaji.addPegawai(d1);
        daftar_gaji.addPegawai(p1);
        daftar_gaji.addPegawai(p2);
        daftar_gaji.printSemuaGaji();
    }
}