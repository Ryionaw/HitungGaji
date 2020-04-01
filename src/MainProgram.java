public class MainProgram {

    public static void main(String[] args) {

        Staff Staff1 = new Staff();
        Staff1.setNama("Andika");
        Staff1.setKehadiran(20);

        Dosen Dosen1 = new Dosen();
        Dosen1.setNama("Budiman");
        Dosen1.setSKS(12);

        Pegawai Pegawai1 = new Pegawai();
        Pegawai1.setNama("Charles");

        Pegawai Pegawai2 = new Pegawai();
        Pegawai2.setNama("Donny");

        DaftarGaji daftar_gaji = new DaftarGaji(5);
        daftar_gaji.addPegawai(Staff1);
        daftar_gaji.addPegawai(Dosen1);
        daftar_gaji.addPegawai(Pegawai1);
        daftar_gaji.addPegawai(Pegawai2);
        daftar_gaji.printSemuaGaji();
    }
}