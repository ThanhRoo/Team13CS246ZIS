package GUI_TrangChu;

import javax.swing.*;
import java.awt.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class GUI_Trangchu extends javax.swing.JFrame {

    private JComboBox<String> comboBoxFrom;
    private JComboBox<String> comboBoxTo;
    private JSpinner spinnerDay;
    private JSpinner spinnerMonth;
    private JSpinner spinnerYear;
    private JButton btnSearch;
    private JButton btnHistory;
    private JTable tableFlights;

    public GUI_Trangchu() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Hello = new javax.swing.JLabel();
        jLabel_diemdi = new javax.swing.JLabel();
        jLabel_diemden = new javax.swing.JLabel();
        comboDiemden = new javax.swing.JComboBox<>();
        jLabel_FILGHT = new javax.swing.JLabel();
        comboDiemdi = new javax.swing.JComboBox<>();
        jSpinDay = new javax.swing.JSpinner();
        jSpinMonth = new javax.swing.JSpinner();
        jSpinYear = new javax.swing.JSpinner();
        jLabel_Ngaydi = new javax.swing.JLabel();
        jButtonbtnSearch = new javax.swing.JButton();
        jButtonbtnHistory = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));

        jLabel_Hello.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        jLabel_Hello.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Hello.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI_TrangChu/icon/Minion-Hello-icon.png"))); // NOI18N
        jLabel_Hello.setText("Hello, ");

        jLabel_diemdi.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_diemdi.setText("Điểm đến");

        jLabel_diemden.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_diemden.setText("Điểm đi");

        comboDiemden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"DAD", "HAN", "SGN"}));
        comboDiemden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDiemdenActionPerformed(evt);
            }
        });

        jLabel_FILGHT.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel_FILGHT.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FILGHT.setText("FLIGHT");

        comboDiemdi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"DAD", "HAN", "SGN"}));
        comboDiemdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDiemdiActionPerformed(evt);
            }
        });

        jSpinDay.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jSpinMonth.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jSpinYear.setModel(new javax.swing.SpinnerListModel(new String[]{"2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));

        jLabel_Ngaydi.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Ngaydi.setText("Ngày đi");

        jButtonbtnSearch.setText("Tìm chuyến bay");
        jButtonbtnSearch.setMaximumSize(new java.awt.Dimension(138, 30));
        jButtonbtnSearch.setMinimumSize(new java.awt.Dimension(138, 30));
        jButtonbtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbtnSearchActionPerformed(evt);
            }
        });

        jButtonbtnHistory.setText("Lịch sử đặt vé");
        jButtonbtnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbtnHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel_Ngaydi, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jSpinDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jSpinMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jSpinYear, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel_diemden, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(comboDiemdi, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel_diemdi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(comboDiemden, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                                                .addComponent(jLabel_FILGHT, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)
                                                .addComponent(jLabel_Hello, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonbtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonbtnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(187, 187, 187))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(comboDiemdi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel_diemden, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(comboDiemden, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel_diemdi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel_Hello)
                                                .addComponent(jLabel_FILGHT, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jSpinDay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jSpinMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jSpinYear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel_Ngaydi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButtonbtnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                        .addComponent(jButtonbtnHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(57, 57, 57))
        );

        jTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Hãng bay", "Từ", "Đến", "Thời gian đi", "Ngày đi", "Thời gian đến", "Ngày đến", "Giá vé", ""
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButtonbtnSearchActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jButtonbtnHistoryActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void comboDiemdiActionPerformed(java.awt.event.ActionEvent evt) {
        String selectedFrom = (String) comboDiemdi.getSelectedItem();
        System.out.println("Điểm đi đã chọn: " + selectedFrom);
    }

    private void comboDiemdenActionPerformed(java.awt.event.ActionEvent evt) {
        String selectedTo = (String) comboDiemden.getSelectedItem();
        System.out.println("Điểm đến đã chọn: " + selectedTo);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            GUI_Trangchu form = new GUI_Trangchu();
            form.setVisible(true);
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> comboDiemden;
    private javax.swing.JComboBox<String> comboDiemdi;
    private javax.swing.JButton jButtonbtnHistory;
    private javax.swing.JButton jButtonbtnSearch;
    private javax.swing.JLabel jLabel_FILGHT;
    private javax.swing.JLabel jLabel_Hello;
    private javax.swing.JLabel jLabel_Ngaydi;
    private javax.swing.JLabel jLabel_diemden;
    private javax.swing.JLabel jLabel_diemdi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinDay;
    private javax.swing.JSpinner jSpinMonth;
    private javax.swing.JSpinner jSpinYear;
    private javax.swing.JTable jTable;
    // End of variables declaration                   
}
