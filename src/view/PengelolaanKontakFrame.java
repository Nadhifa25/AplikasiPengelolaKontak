package view;

import controller.KontakController;
import model.Kontak;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.List;

/**
 * Aplikasi Pengelolaan Kontak
 * @author vivob
 */
public class PengelolaanKontakFrame extends javax.swing.JFrame {
    
    private DefaultTableModel model;
    private KontakController controller;

    public PengelolaanKontakFrame() {
        initComponents();
        controller = new KontakController();
        model = new DefaultTableModel(new String[]{"No", "Nama", "Nomor Telepon", "Kategori"}, 0);
        tblKontak.setModel(model);
        loadContacts();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtNomorTelepon = new javax.swing.JTextField();
        txtPencarian = new javax.swing.JTextField();
        cmbKategori = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKontak = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("APLIKASI PENGELOLAAN KONTAK");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setBackground(new java.awt.Color(213, 213, 255));

        jLabel2.setText("Nama Kontak");

        jLabel3.setText("Nomor Telepon");

        jLabel4.setText("Kategori");

        jLabel5.setText("Pencarian");

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        txtPencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPencarianKeyTyped(evt);
            }
        });

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Keluarga", "Teman", "kantor" }));

        tblKontak.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblKontak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKontakMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKontak);

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnExport.setText("Export");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        btnImport.setText("Import");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNomorTelepon, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbKategori, javax.swing.GroupLayout.Alignment.LEADING, 0, 267, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(166, 166, 166)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(btnTambah)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnEdit)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnHapus))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(btnExport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnImport)))
                .addGap(10, 86, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomorTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExport)
                    .addComponent(btnImport))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        addContact();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        editContact();
    }//GEN-LAST:event_btnEditActionPerformed

    private void tblKontakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKontakMouseClicked
        int selectedRow = tblKontak.getSelectedRow();
            if (selectedRow != -1) {
            populateInputFields(selectedRow);
            }
    }//GEN-LAST:event_tblKontakMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
       deleteContact();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtPencarianKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPencarianKeyTyped
        searchContact();
    }//GEN-LAST:event_txtPencarianKeyTyped

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
       exportToCSV();
    }//GEN-LAST:event_btnExportActionPerformed

        private void loadContacts() {
        try {
            model.setRowCount(0);
            List<Kontak> contacts = controller.getAllContacts();
            int rowNumber = 1;
            for (Kontak contact : contacts) {
                model.addRow(new Object[]{rowNumber++, contact.getNama(), contact.getNomorTelepon(), contact.getKategori()});
            }
        } catch (SQLException evt) {
            showError("Gagal memuat kontak: " + evt.getMessage());
        }
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void addContact() {
        String nama = txtNama.getText().trim();
        String nomorTelepon = txtNomorTelepon.getText().trim();
        String kategori = (String) cmbKategori.getSelectedItem();

        if (!validatePhoneNumber(nomorTelepon)) {
            return;
        }
        
        try {
            if (controller.isDuplicatePhoneNumber(nomorTelepon, null)) {
                JOptionPane.showMessageDialog(this, "Kontak nomor telepon ini sudah ada.", "Kesalahan", JOptionPane.WARNING_MESSAGE);
                return;
            }
            controller.addContact(nama, nomorTelepon, kategori);
            loadContacts();
            JOptionPane.showMessageDialog(this, "Kontak berhasil ditambahkan!");
            clearInputFields();
        } catch (SQLException evt) {
            showError("Gagal menambahkan kontak: " + evt.getMessage());
        }
    }

    private boolean validatePhoneNumber(String phoneNumber) {
        if (phoneNumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nomor telepon tidak boleh kosong.");
            return false;
        }
        if (!phoneNumber.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Nomor telepon hanya boleh berisi angka.");
            return false;
        }
        if (phoneNumber.length() < 8 || phoneNumber.length() > 15) {
            JOptionPane.showMessageDialog(this, "Nomor telepon harus memiliki panjang antara 8 hingga 15 karakter.");
            return false;
        }
        return true;
    }

    private void clearInputFields() {
        txtNama.setText("");
        txtNomorTelepon.setText("");
        cmbKategori.setSelectedIndex(0);
    }
    
    private void editContact() {
    int selectedRow = tblKontak.getSelectedRow();
    if (selectedRow == -1) {
    JOptionPane.showMessageDialog(this, "Pilih kontak yang ingin diperbarui.", "Kesalahan", JOptionPane.WARNING_MESSAGE);
    return;
    }
    int id = (int) model.getValueAt(selectedRow, 0);
    String nama = txtNama.getText().trim();
    String nomorTelepon = txtNomorTelepon.getText().trim();
    String kategori = (String) cmbKategori.getSelectedItem();
    if (!validatePhoneNumber(nomorTelepon)) {
    return;
    }
    try {
    if (controller.isDuplicatePhoneNumber(nomorTelepon, id)) {
    JOptionPane.showMessageDialog(this, "Kontak nomor telepon ini sudah ada.", "Kesalahan", JOptionPane.WARNING_MESSAGE);
    return;
    }
    controller.updateContact(id, nama, nomorTelepon, kategori);
    loadContacts();
    JOptionPane.showMessageDialog(this, "Kontak berhasil diperbarui!");
    clearInputFields();
    } catch (SQLException evt) {
    showError("Gagal memperbarui kontak: " + evt.getMessage());
    }
    }
    private void populateInputFields(int selectedRow) {
    // Ambil data dari JTable
    String nama = model.getValueAt(selectedRow, 1).toString();
    String nomorTelepon = model.getValueAt(selectedRow, 2).toString();
    String kategori = model.getValueAt(selectedRow, 3).toString();
    // Set data ke komponen input
    txtNama.setText(nama);
    txtNomorTelepon.setText(nomorTelepon);
    cmbKategori.setSelectedItem(kategori);
    }
    
    private void deleteContact() {
        int selectedRow = tblKontak.getSelectedRow();
        if (selectedRow != -1) {
        int id = (int) model.getValueAt(selectedRow, 0);
        try {
        controller.deleteContact(id);
        loadContacts();
        JOptionPane.showMessageDialog(this, "Kontak berhasil dihapus!");
        clearInputFields();
        } catch (SQLException e) {
            showError(e.getMessage());
}
}
}
    
    private void searchContact() {
        String keyword = txtPencarian.getText().trim();
        if (!keyword.isEmpty()) {
        try {
        List<Kontak> contacts = controller.searchContacts(keyword);
        model.setRowCount(0); // Bersihkan tabel
        for (Kontak contact : contacts) {
        model.addRow(new Object[]{
        contact.getId(),
        contact.getNama(),
        contact.getNomorTelepon(),
        contact.getKategori()
        });
        }
        if (contacts.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Tidak ada kontak ditemukan.");
        }
        } catch (SQLException ex) {
        showError(ex.getMessage());
        }
        } else {
        loadContacts();
        }
        }
    
    private void exportToCSV() {
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Simpan File CSV");
    int userSelection = fileChooser.showSaveDialog(this);
    if (userSelection == JFileChooser.APPROVE_OPTION) {
    File fileToSave = fileChooser.getSelectedFile();
    // Tambahkan ekstensi .csv jika pengguna tidak menambahkannya
    if (!fileToSave.getAbsolutePath().endsWith(".csv")) {
    fileToSave = new File(fileToSave.getAbsolutePath() + ".csv");
    }
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileToSave))) {
    writer.write("ID,Nama,Nomor Telepon,Kategori\n"); // Header CSV
    for (int i = 0; i < model.getRowCount(); i++) {
    writer.write(
    model.getValueAt(i, 0) + "," +
    model.getValueAt(i, 1) + "," +
    model.getValueAt(i, 2) + "," +
    model.getValueAt(i, 3) + "\n"
    );
    }
    JOptionPane.showMessageDialog(this, "Data berhasil diekspor ke " + fileToSave.getAbsolutePath());
    } catch (IOException ex) {
    showError("Gagal menulis file: " + ex.getMessage());
    }
    }
    }
    private void importFromCSV() {
    showCSVGuide();
    int confirm = JOptionPane.showConfirmDialog(
    this,
    "Apakah Anda yakin file CSV yang dipilih sudah sesuai dengan format?", "Konfirmasi Impor CSV",
    JOptionPane.YES_NO_OPTION
    );
    if (confirm == JOptionPane.YES_OPTION) {
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Pilih File CSV");
    int userSelection = fileChooser.showOpenDialog(this);
    if (userSelection == JFileChooser.APPROVE_OPTION) { 
        File fileToOpen = fileChooser.getSelectedFile();
    }
    try (BufferedReader reader = new BufferedReader(new
    FileReader(fileToOpen))) {
        String line = reader.readLine(); // Baca header
if (!validateCSVHeader(line)) {
JOptionPane.showMessageDialog(this, "Format header CSV tidak valid. Pastikan header adalah: ID,Nama,Nomor Telepon,Kategori","Kesalahan CSV", JOptionPane.ERROR_MESSAGE);
return;
}
int rowCount = 0;
int errorCount = 0;
int duplicateCount = 0;
StringBuilder errorLog = new StringBuilder("Baris dengan kesalahan:\n");
while ((line = reader.readLine()) != null) {
rowCount++;

String[] data = line.split(",");

if (data.length != 4) {
errorCount++;

errorLog.append("Baris ").append(rowCount +

1).append(": Format kolom tidak sesuai.\n");
continue;
}
String nama = data[1].trim();
String nomorTelepon = data[2].trim();
String kategori = data[3].trim();
if (nama.isEmpty() || nomorTelepon.isEmpty()) {
errorCount++;

errorLog.append("Baris ").append(rowCount +

1).append(": Nama atau Nomor Telepon kosong.\n");
continue;
}
if (!validatePhoneNumber(nomorTelepon)) {
errorCount++;

errorLog.append("Baris ").append(rowCount +

1).append(": Nomor Telepon tidak valid.\n");
continue;
}
try {
if
(controller.isDuplicatePhoneNumber(nomorTelepon, null)) {
duplicateCount++;

errorLog.append("Baris ").append(rowCount +

1).append(": Kontak sudah ada.\n");
continue;
}
} catch (SQLException ex) {
Logger.getLogger(PengelolaanKontakFrame.class.getName()).log(Level.SEVERE
, null, ex);
}
try {
controller.addContact(nama, nomorTelepon,
kategori);
} catch (SQLException ex) {
    errorCount++;
errorLog.append("Baris ").append(rowCount +
1).append(": Gagal menyimpan ke database - ").append(ex.getMessage()).append("\n");
}
}
loadContacts();
if (errorCount > 0 || duplicateCount > 0) {
errorLog.append("\nTotal baris dengan kesalahan: ").append(errorCount).append("\n");
errorLog.append("Total baris duplikat: ").append(duplicateCount).append("\n");
JOptionPane.showMessageDialog(this,
errorLog.toString(), "Kesalahan Impor", JOptionPane.WARNING_MESSAGE);
} else {
JOptionPane.showMessageDialog(this, "Semua data berhasil diimpor.");
}
} catch (IOException ex) {
showError("Gagal membaca file: " + ex.getMessage());
}
}
}
}
private void showCSVGuide() {
String guideMessage = "Format CSV untuk impor data:\n" +
    "- Header wajib: ID, Nama, Nomor Telepon, Kategori\n" +
    "- ID dapat kosong (akan diisi otomatis)\n" +
    "- Nama dan Nomor Telepon wajib diisi\n" +
    "- Contoh isi file CSV:\n" +
    " 1, Andi, 08123456789, Teman\n" +
    " 2, Budi Doremi, 08567890123, Keluarga\n\n" +
    "Pastikan file CSV sesuai format sebelum melakukan impor.";
JOptionPane.showMessageDialog(this, guideMessage, "Panduan Format CSV", JOptionPane.INFORMATION_MESSAGE);
}
private boolean validateCSVHeader(String header) {
return header != null &&
header.trim().equalsIgnoreCase("ID,Nama,Nomor Telepon,Kategori");
}
        
    
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PengelolaanKontakFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PengelolaanKontakFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PengelolaanKontakFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PengelolaanKontakFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PengelolaanKontakFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKontak;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNomorTelepon;
    private javax.swing.JTextField txtPencarian;
    // End of variables declaration//GEN-END:variables
}
