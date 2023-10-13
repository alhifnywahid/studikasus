package StudiKasus;

import javax.swing.JOptionPane;
public class CatatanSederhana {
    public static void main(String[] args) {
        String catatan = null, tampilkanCatatan = null, ubahCatatan, riwayatCatatan = null, isiPesan = "Masukkan Catatan : ";
        byte menuUtama, pemberitahuan, menuCatatan, pesan = -1;
        boolean perulangan = true;
        while (perulangan){
            menuUtama = (byte) JOptionPane.showOptionDialog( null, "PROGRAM CATATAN SEDERHANA.", "MENU UTAMA", 1, -1, null, new Object[]{"Buat Catatan", "Lihat Catatan", "Keluar"}, null);
            if (menuUtama == 0){
                while (perulangan){
                    if (tampilkanCatatan == null){
                        catatan = JOptionPane.showInputDialog(null, isiPesan, "INPUT CATATAN", pesan);
                        if ("".equals(catatan)){
                            isiPesan = "Catatan Tidak Boleh Kosong!";
                            pesan = 2;
                        } else if (catatan == null) {
                            isiPesan = "Masukkan Catatan : ";
                            pesan = -1;
                            perulangan = false;
                        } else {
                            isiPesan = "Masukkan Catatan : ";
                            pesan = -1;
                            tampilkanCatatan = catatan;
                            riwayatCatatan = "> " + tampilkanCatatan + "\n";
                            JOptionPane.showMessageDialog(null, "Berhasil membuat catatan!", "PEMBERITAHUAN", -1);
                            perulangan = false;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Sudah ada catatan yang tesimpan!\nSilahkan cek di menu Lihat Catatan.", "PEMBERITAHUAN", 2);
                        perulangan = false;
                    }
                }
                perulangan = true;
            } else if (menuUtama == 1){
                if (catatan == null){
                    JOptionPane.showMessageDialog(null, "Tidak ada catatan yang tersimpan!\nSilahkan buat catatan terlebih dahulu.", "PEMBERITAHUAN", JOptionPane.WARNING_MESSAGE);
                } else {
                    while (perulangan){
                        menuCatatan = (byte) JOptionPane.showOptionDialog( null, "Catatan Tersimpan : " + tampilkanCatatan, "MENU CATATAN", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Ubah Catatan", "Hapus Catatan", "History", "Kembali"}, null);
                        if (menuCatatan == 0){
                            while (perulangan){ //
                                ubahCatatan = JOptionPane.showInputDialog(null, isiPesan, "INPUT CATATAN", pesan);
                                if ("".equals(ubahCatatan)){
                                    isiPesan = "Catatan Tidak Boleh Kosong!";
                                    pesan = 2;
                                } else if (ubahCatatan == null){
                                    isiPesan = "Masukkan Catatan : ";
                                    pesan = -1;
                                    perulangan = false;
                                } else {
                                    isiPesan = "Masukkan Catatan : ";
                                    pesan = -1;
                                    JOptionPane.showMessageDialog(null, "Catatan berhasil di ubah!", "PEMBERITAHUAN", -1);
                                    tampilkanCatatan = ubahCatatan;
                                    riwayatCatatan += "> " + tampilkanCatatan + "\n";
                                    perulangan = false;
                                }
                            }
                            perulangan = true;
                        } else if (menuCatatan == 1) {
                            tampilkanCatatan = null;
                            catatan = null;
                            JOptionPane.showMessageDialog(null, "Catatan berhasil di hapus!", "PEMBERITAHUAN", -1);
                            perulangan = false;
                        } else if (menuCatatan == 2) {
                            if (riwayatCatatan == null){
                                JOptionPane.showMessageDialog(null, "Tidak ada riwayat perubahan.", "PEMBERITAHUAN", -1);
                            } else {
                                JOptionPane.showMessageDialog(null, riwayatCatatan, "PEMBERITAHUAN", -1);
                            }
                        } else {
                            perulangan = false;
                        }
                    }
                    perulangan = true;
                }
            } else {
                pemberitahuan = (byte) JOptionPane.showOptionDialog( null, "Apakah anda yakin ingin keluar?", "MENU UTAMA", 0, 2, null, new Object[]{"Iya", "Tidak"}, null);
                perulangan = pemberitahuan != 0 && pemberitahuan != -1;
            }
        }
    }
}

