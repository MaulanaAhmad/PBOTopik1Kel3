/*
 Bismillah semoga codingku lancar. Amin
 */
package tugas.besar.pbo.tampilan;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import tugas.besar.pbo.data;

public class Tampildata extends javax.swing.JFrame {
    ArrayList<data> RT1kel1 = new ArrayList<>();
    ArrayList<data> RT2kel1 = new ArrayList<>();
    ArrayList<data> RT3kel1 = new ArrayList<>();
    ArrayList<data> RT4kel1 = new ArrayList<>();
    ArrayList<data> RT1kel2 = new ArrayList<>();
    ArrayList<data> RT2kel2 = new ArrayList<>();
    ArrayList<data> RT3kel2 = new ArrayList<>();
    ArrayList<data> RT4kel2 = new ArrayList<>();
DefaultTableModel dm;
    /**
     * Creates new form Tampildata
     */
    public Tampildata() {
        setTitle("Program e-KTP");
        initComponents();
        BuatKolom();
    }
    private void BuatKolom(){
      dm=(DefaultTableModel) jTable2.getModel();
      dm.addColumn("Nama");
      dm.addColumn("NIK");
      dm.addColumn("Tempat, Tanggal Lahir");
      dm.addColumn("Alamat");
      dm.addColumn("JenisKelamin");
      dm.addColumn("RT/RW");
      dm.addColumn("Kelurahan");
      dm.addColumn("Desa");
      dm.addColumn("Kecamatan");
      dm.addColumn("Agama");
      dm.addColumn("Status");
      dm.addColumn("Pekerjaan");
      dm.addColumn("Kewarganegaraan");
      
    
    
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        textNIK = new javax.swing.JTextField();
        textNama = new javax.swing.JTextField();
        textTTL = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtKecamatan = new javax.swing.JTextField();
        txtPekerjaan = new javax.swing.JTextField();
        txtKewarganegaraan = new javax.swing.JTextField();
        txtAgama = new javax.swing.JComboBox<>();
        txtStatus = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        textJkl = new javax.swing.JComboBox<>();
        KelurahanDua = new javax.swing.JRadioButton();
        KelurahanSatu = new javax.swing.JRadioButton();
        rt1 = new javax.swing.JRadioButton();
        rt2 = new javax.swing.JRadioButton();
        rt3 = new javax.swing.JRadioButton();
        rt4 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        tampildata = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sortBjt = new javax.swing.JRadioButton();
        sortBjb = new javax.swing.JRadioButton();
        sortRt1 = new javax.swing.JRadioButton();
        sortRt3 = new javax.swing.JRadioButton();
        sortRt2 = new javax.swing.JRadioButton();
        sortRt4 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 153));

        jPanel3.setBackground(new java.awt.Color(51, 255, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("NIK");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("TTL");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Alamat");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Jenis Kelamin");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("RT/RW");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Kecamatan");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Kel/Desa");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Agama");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Status Perkawinan");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Pekerjaan");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Kewarganegaraan");

        txtAgama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAgama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Kristen", "Katolik", "Hindu", "Budha", "Lain-lain" }));
        txtAgama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgamaActionPerformed(evt);
            }
        });

        txtStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Belum Kawin", "Kawin", "Bercerai" }));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Form Warga e - KTP");
        jLabel14.setToolTipText("");

        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        textJkl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textJkl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));

        KelurahanDua.setText("Kelurahan Dua");
        KelurahanDua.setToolTipText("");

        KelurahanSatu.setText("Kelurahan Satu");

        rt1.setText("Rt. 01");

        rt2.setText("Rt. 02");

        rt3.setText("Rt. 03");

        rt4.setText("Rt. 04");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)))
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(66, 66, 66)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(textNIK, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(jLabel14)))
                    .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgama, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textJkl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(rt1)
                            .addGap(10, 10, 10)
                            .addComponent(rt2)
                            .addGap(18, 18, 18)
                            .addComponent(rt3)
                            .addGap(18, 18, 18)
                            .addComponent(rt4))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(KelurahanSatu)
                            .addGap(18, 18, 18)
                            .addComponent(KelurahanDua))
                        .addComponent(textTTL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                        .addComponent(txtAlamat, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtKecamatan, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPekerjaan, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtKewarganegaraan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(370, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(372, 372, 372))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textNIK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(textTTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textJkl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rt1)
                            .addComponent(rt3)
                            .addComponent(rt4)
                            .addComponent(rt2))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(KelurahanSatu)
                            .addComponent(KelurahanDua))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtKecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtPekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtKewarganegaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Input Data", jPanel3);

        jPanel1.setBackground(new java.awt.Color(51, 255, 102));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        tampildata.setText("Tampilkan data");
        tampildata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampildataActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Kelurahan");

        sortBjt.setText("Kelurahan Satu");

        sortBjb.setText("Kelurahan Dua");

        sortRt1.setText("Rt. 1");

        sortRt3.setText("Rt. 3");

        sortRt2.setText("Rt. 2");

        sortRt4.setText("Rt. 4");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Rt");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(116, 116, 116)
                        .addComponent(jLabel15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sortBjt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sortBjb))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(sortRt1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sortRt3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sortRt2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sortRt4)))
                        .addGap(79, 79, 79)
                        .addComponent(tampildata)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel15))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sortBjt)
                            .addComponent(sortRt3)
                            .addComponent(sortRt1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sortRt4)
                            .addComponent(sortBjb)
                            .addComponent(sortRt2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(tampildata)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tampilkan Data", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAgamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgamaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      data data = new data();
      data.setNIK(textNIK.getText());
      data.setNama(textNama.getText());
      data.setTTL(textTTL.getText());
      data.setJkl((String)textJkl.getSelectedItem());
      data.setAlamat(txtAlamat.getText());
      data.setKecamatan(txtKecamatan.getText());
      data.setAgama((String) txtAgama.getSelectedItem());
      data.setStatus((String)txtStatus.getSelectedItem());
      data.setPekerjaan(txtPekerjaan.getText());
      data.setKewarganegaraan(txtKewarganegaraan.getText());
      if(KelurahanSatu.isSelected()){
          if(rt1.isSelected()){
              data.setDesa("Kelurahan Satu");
              data.setRt("1");
          RT1kel1.add(data);
          }
          if(rt2.isSelected()){
              data.setDesa("Kelurahan Satu");
              data.setRt("2");
          RT2kel1.add(data);
          }
          if(rt3.isSelected()){
              data.setDesa("Kelurahan Satu");
              data.setRt("3");
          RT3kel1.add(data);
          }
          if(rt4.isSelected()){
              data.setDesa("Kelurahan Satu");
              data.setRt("4");
          RT4kel1.add(data);
          }
      }
      if(KelurahanDua.isSelected()){
          if(rt1.isSelected()){
              data.setDesa("Kelurahan Dua");
              data.setRt("1");
          RT1kel2.add(data);
          }
          if(rt2.isSelected()){
              data.setDesa("Kelurahan Dua");
              data.setRt("2");
          RT2kel2.add(data);
          }
          if(rt3.isSelected()){
              data.setDesa("Kelurahan Dua");
              data.setRt("3");
          RT3kel2.add(data);
          }
          if(rt4.isSelected()){
              data.setDesa("Kelurahan Dua");
              data.setRt("4");
          RT4kel2.add(data);
          }
      }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void datakolom(String k_nama, String k_nik, String k_alamat, String k_ttl, String k_jkl, String k_rt, String k_desa, String k_kecamatan,String k_agama, String k_status, String k_pekerjaan, String k_kewarganegaraan){
        String[] rowData={k_nama, k_nik ,k_alamat,k_ttl,k_jkl,k_rt,
            k_desa,k_kecamatan, k_status,  k_pekerjaan,  k_kewarganegaraan};
        dm.addRow(rowData);}
    private void tampildataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampildataActionPerformed
      if(sortBjt.isSelected()){
            if(sortRt1.isSelected()){
            for (data isi :RT1kel1){
            datakolom(isi.getNama(), isi.getNIK(),isi.getTTL(), isi.getAlamat(), isi.getJkl(), isi.getRt(), isi.getDesa(), isi.getKecamatan(), isi.getAgama(),isi.getStatus(),isi.getPekerjaan(), isi.getKewarganegaraan());
            }
            if(sortRt2.isSelected()){
            for (data isi :RT2kel1){
            datakolom(isi.getNama(), isi.getNIK(),isi.getTTL(), isi.getAlamat(), isi.getJkl(), isi.getRt(), isi.getDesa(), isi.getKecamatan(), isi.getAgama(),isi.getStatus(),isi.getPekerjaan(), isi.getKewarganegaraan());
            }
            if(sortRt3.isSelected()){
            for (data isi :RT3kel1){
            datakolom(isi.getNama(), isi.getNIK(),isi.getTTL(), isi.getAlamat(), isi.getJkl(), isi.getRt(), isi.getDesa(), isi.getKecamatan(), isi.getAgama(),isi.getStatus(),isi.getPekerjaan(), isi.getKewarganegaraan());
            }
            if(sortRt4.isSelected()){
            for (data isi :RT4kel1){
            datakolom(isi.getNama(), isi.getNIK(),isi.getTTL(), isi.getAlamat(), isi.getJkl(), isi.getRt(), isi.getDesa(), isi.getKecamatan(), isi.getAgama(),isi.getStatus(),isi.getPekerjaan(), isi.getKewarganegaraan());
            }
            }
            }  
        
    }//GEN-LAST:event_tampildataActionPerformed
            }}}
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
            java.util.logging.Logger.getLogger(Tampildata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tampildata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tampildata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tampildata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tampildata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton KelurahanDua;
    private javax.swing.JRadioButton KelurahanSatu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JRadioButton rt1;
    private javax.swing.JRadioButton rt2;
    private javax.swing.JRadioButton rt3;
    private javax.swing.JRadioButton rt4;
    private javax.swing.JRadioButton sortBjb;
    private javax.swing.JRadioButton sortBjt;
    private javax.swing.JRadioButton sortRt1;
    private javax.swing.JRadioButton sortRt2;
    private javax.swing.JRadioButton sortRt3;
    private javax.swing.JRadioButton sortRt4;
    private javax.swing.JButton tampildata;
    private javax.swing.JComboBox<String> textJkl;
    private javax.swing.JTextField textNIK;
    private javax.swing.JTextField textNama;
    private javax.swing.JTextField textTTL;
    private javax.swing.JComboBox<String> txtAgama;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtKecamatan;
    private javax.swing.JTextField txtKewarganegaraan;
    private javax.swing.JTextField txtPekerjaan;
    private javax.swing.JComboBox<String> txtStatus;
    // End of variables declaration//GEN-END:variables
}
