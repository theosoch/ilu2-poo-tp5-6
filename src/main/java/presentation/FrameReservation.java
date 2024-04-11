/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;
import dialog.DialogReservation;
import java.awt.Component;
import java.awt.event.ItemEvent;
import java.time.LocalDate;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.ListModel;

@SuppressWarnings("serial")
public class FrameReservation extends javax.swing.JFrame {

    private DialogReservation dialog;

    public FrameReservation() {
    }

    public void initFrame() {
        initComponents();
    }

    public void setDialog(DialogReservation dialog) {
        this.dialog = dialog;
    }

    // /!\ /!\ /!\ ATTENTION /!\ /!\ /!\
    // ce code est auto généré et ne doit PAS être modifié
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateTimePanel = new javax.swing.JPanel();
        dateChoicePanel = new javax.swing.JPanel();
        dateChoiceLabel = new javax.swing.JLabel();
        datePicker = new com.github.lgooddatepicker.components.DatePicker();
        datePicker.addDateChangeListener(new DateChangeListener(){
            public void dateChanged(DateChangeEvent dateEvent) {
                datePickerDateChanged(dateEvent);
            }
        });
        timeChoicePanel = new javax.swing.JPanel();
        timeChoiceLabel = new javax.swing.JLabel();
        timeChoiceComboBox = new javax.swing.JComboBox<>();
        nbPersonsPanel = new javax.swing.JPanel();
        peopleCountChoicePanel = new javax.swing.JPanel();
        peopleCountChoiceComboBox = new javax.swing.JComboBox<>();
        peopleCountChoiceLabel = new javax.swing.JLabel();
        pickTablePanel = new javax.swing.JPanel();
        tableChoicePanel = new javax.swing.JPanel();
        tablesImage = new javax.swing.JLabel();
        tableChoiceLabel = new javax.swing.JLabel();
        tableChoiceListScrollPane = new javax.swing.JScrollPane();
        tableChoiceList = new javax.swing.JList<>();
        validateButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Réservez une table");

        dateTimePanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        dateChoiceLabel.setText("1. Choisissez la date");

        javax.swing.GroupLayout dateChoicePanelLayout = new javax.swing.GroupLayout(dateChoicePanel);
        dateChoicePanel.setLayout(dateChoicePanelLayout);
        dateChoicePanelLayout.setHorizontalGroup(
            dateChoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dateChoiceLabel)
            .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dateChoicePanelLayout.setVerticalGroup(
            dateChoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateChoicePanelLayout.createSequentialGroup()
                .addComponent(dateChoiceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        datePicker.getAccessibleContext().setAccessibleName("");
        datePicker.getAccessibleContext().setAccessibleDescription("");

        timeChoiceLabel.setText("2. Choisissez l'heure");

        timeChoiceComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                timeChoiceComboBoxItemStateChanged(evt);
            }
        });
        timeChoiceComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                timeChoiceComboBoxPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout timeChoicePanelLayout = new javax.swing.GroupLayout(timeChoicePanel);
        timeChoicePanel.setLayout(timeChoicePanelLayout);
        timeChoicePanelLayout.setHorizontalGroup(
            timeChoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(timeChoiceLabel)
            .addComponent(timeChoiceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        timeChoicePanelLayout.setVerticalGroup(
            timeChoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timeChoicePanelLayout.createSequentialGroup()
                .addComponent(timeChoiceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeChoiceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        timeChoiceLabel.setEnabled(false);
        timeChoiceComboBox.setEnabled(false);

        // Adding the empty item (default case)
        timeChoiceComboBox.addItem("");
        timeChoiceComboBox.setSelectedIndex(0);

        timeChoiceComboBox.addItem("11h30");
        timeChoiceComboBox.addItem("12h00");
        timeChoiceComboBox.addItem("12h30");
        timeChoiceComboBox.addItem("13h00");
        timeChoiceComboBox.addItem("13h30");

        javax.swing.GroupLayout dateTimePanelLayout = new javax.swing.GroupLayout(dateTimePanel);
        dateTimePanel.setLayout(dateTimePanelLayout);
        dateTimePanelLayout.setHorizontalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(dateChoicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(timeChoicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        dateTimePanelLayout.setVerticalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChoicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeChoicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        nbPersonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        peopleCountChoiceComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                peopleCountChoiceComboBoxItemStateChanged(evt);
            }
        });
        peopleCountChoiceComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peopleCountChoiceComboBoxActionPerformed(evt);
            }
        });
        peopleCountChoiceComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                peopleCountChoiceComboBoxPropertyChange(evt);
            }
        });

        peopleCountChoiceLabel.setText("3. Indiquez le nombre de personnes");

        javax.swing.GroupLayout peopleCountChoicePanelLayout = new javax.swing.GroupLayout(peopleCountChoicePanel);
        peopleCountChoicePanel.setLayout(peopleCountChoicePanelLayout);
        peopleCountChoicePanelLayout.setHorizontalGroup(
            peopleCountChoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(peopleCountChoiceLabel)
            .addComponent(peopleCountChoiceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        peopleCountChoicePanelLayout.setVerticalGroup(
            peopleCountChoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(peopleCountChoicePanelLayout.createSequentialGroup()
                .addComponent(peopleCountChoiceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(peopleCountChoiceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        peopleCountChoiceComboBox.setEnabled(false);

        javax.swing.DefaultComboBoxModel<String> peopleCountChoiceComboBoxModel = new javax.swing.DefaultComboBoxModel<>();
        peopleCountChoiceComboBox.setModel(peopleCountChoiceComboBoxModel);

        peopleCountChoiceComboBoxModel.addElement("");

        int maxPeopleCount = 8;
        for(int i = 0; i < maxPeopleCount; i++) {
            peopleCountChoiceComboBoxModel.addElement((i+1) + " personne(s)");
        }
        peopleCountChoiceLabel.setEnabled(false);

        javax.swing.GroupLayout nbPersonsPanelLayout = new javax.swing.GroupLayout(nbPersonsPanel);
        nbPersonsPanel.setLayout(nbPersonsPanelLayout);
        nbPersonsPanelLayout.setHorizontalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(peopleCountChoicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nbPersonsPanelLayout.setVerticalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(peopleCountChoicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pickTablePanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        tablesImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Plan_tables.jpg"))); // NOI18N

        tableChoiceLabel.setText("4. Choisissez votre table");

        tableChoiceList.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tableChoiceListPropertyChange(evt);
            }
        });
        tableChoiceList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                tableChoiceListValueChanged(evt);
            }
        });
        tableChoiceListScrollPane.setViewportView(tableChoiceList);
        //

        tableChoiceList.setEnabled(false);

        javax.swing.DefaultListModel tableChoiceListModel = new javax.swing.DefaultListModel();
        tableChoiceList.setModel(tableChoiceListModel);

        javax.swing.GroupLayout tableChoicePanelLayout = new javax.swing.GroupLayout(tableChoicePanel);
        tableChoicePanel.setLayout(tableChoicePanelLayout);
        tableChoicePanelLayout.setHorizontalGroup(
            tableChoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableChoicePanelLayout.createSequentialGroup()
                .addGroup(tableChoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tableChoicePanelLayout.createSequentialGroup()
                        .addComponent(tablesImage, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tableChoiceListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tableChoiceLabel))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        tableChoicePanelLayout.setVerticalGroup(
            tableChoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableChoicePanelLayout.createSequentialGroup()
                .addComponent(tableChoiceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(tablesImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tableChoiceListScrollPane)
        );

        tablesImage.setEnabled(false);
        tableChoiceLabel.setEnabled(false);

        javax.swing.GroupLayout pickTablePanelLayout = new javax.swing.GroupLayout(pickTablePanel);
        pickTablePanel.setLayout(pickTablePanelLayout);
        pickTablePanelLayout.setHorizontalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tableChoicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pickTablePanelLayout.setVerticalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tableChoicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        validateButton.setText("Valider");
        validateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                validateButtonMouseReleased(evt);
            }
        });
        validateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Annuler");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cancelButtonMouseReleased(evt);
            }
        });
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nbPersonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pickTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateTimePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(validateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(dateTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nbPersonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pickTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(validateButton))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        validateButton.setEnabled(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timeChoiceComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_timeChoiceComboBoxItemStateChanged
        if(this.dialog != null) {
            if(evt.getStateChange() == ItemEvent.SELECTED && this.timeChoiceComboBox.isEnabled()) {
                String time = (String) this.timeChoiceComboBox.getSelectedItem();
                this.dialog.handleTimeSelectedEvent(time);
            }
        }
    }//GEN-LAST:event_timeChoiceComboBoxItemStateChanged

    private void peopleCountChoiceComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_peopleCountChoiceComboBoxItemStateChanged
        if(this.dialog != null) {
            if(evt.getStateChange() == ItemEvent.SELECTED && this.peopleCountChoiceComboBox.isEnabled()) {
                int nbPersons = this.peopleCountChoiceComboBox.getSelectedIndex();
                this.dialog.handleNumOfPersonsSelectedEvent(nbPersons);
            }
        }
    }//GEN-LAST:event_peopleCountChoiceComboBoxItemStateChanged

    private void timeChoiceComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_timeChoiceComboBoxPropertyChange
        if(this.dialog != null && evt.getPropertyName().equals("enabled")) {
            String time;
                    
            if(this.timeChoiceComboBox.isEnabled()) {
                time = (String) this.timeChoiceComboBox.getSelectedItem();
            }
            else {
                time = (String) this.timeChoiceComboBox.getItemAt(0);
            }
            
            this.dialog.handleTimeSelectedEvent(time);
        }
    }//GEN-LAST:event_timeChoiceComboBoxPropertyChange

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void validateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_validateButtonActionPerformed

    private void tableChoiceListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_tableChoiceListValueChanged
        if(this.dialog != null) {
            int numTable = this.tableChoiceList.getSelectedIndex();
            this.dialog.handleTableSelectedEvent(numTable);
        }
    }//GEN-LAST:event_tableChoiceListValueChanged

    private void peopleCountChoiceComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_peopleCountChoiceComboBoxPropertyChange
        if(this.dialog != null && evt.getPropertyName().equals("enabled")) {
            int nbPersons;
                    
            if(this.peopleCountChoiceComboBox.isEnabled()) {
                nbPersons = this.peopleCountChoiceComboBox.getSelectedIndex();
            }
            else {
                nbPersons = 0;
            }
            
            this.dialog.handleNumOfPersonsSelectedEvent(nbPersons);
        }
    }//GEN-LAST:event_peopleCountChoiceComboBoxPropertyChange

    private void tableChoiceListPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tableChoiceListPropertyChange
        if(this.dialog != null && evt.getPropertyName().equals("enabled")) {
            int numTable;
                    
            if(this.peopleCountChoiceComboBox.isEnabled()) {
                numTable = this.tableChoiceList.getSelectedIndex();
            }
            else {
                numTable = -1;
            }
            
            this.dialog.handleTableSelectedEvent(numTable);
        }
    }//GEN-LAST:event_tableChoiceListPropertyChange

    private void cancelButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseReleased
        if(this.dialog != null) {
            this.dialog.handleCancelEvent();
        }
    }//GEN-LAST:event_cancelButtonMouseReleased

    private void validateButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validateButtonMouseReleased
        if(this.dialog != null) {
            this.dialog.handleValidationEvent();
        }
    }//GEN-LAST:event_validateButtonMouseReleased

    private void peopleCountChoiceComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peopleCountChoiceComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_peopleCountChoiceComboBoxActionPerformed

    public void datePickerDateChanged(DateChangeEvent dateEvent) {
        if(this.dialog != null) {
            LocalDate date = dateEvent.getNewDate();
            this.dialog.handleDateSelectedEvent(date);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel dateChoiceLabel;
    private javax.swing.JPanel dateChoicePanel;
    private com.github.lgooddatepicker.components.DatePicker datePicker;
    private javax.swing.JPanel dateTimePanel;
    private javax.swing.JPanel nbPersonsPanel;
    private javax.swing.JComboBox<String> peopleCountChoiceComboBox;
    private javax.swing.JLabel peopleCountChoiceLabel;
    private javax.swing.JPanel peopleCountChoicePanel;
    private javax.swing.JPanel pickTablePanel;
    private javax.swing.JLabel tableChoiceLabel;
    private javax.swing.JList<String> tableChoiceList;
    private javax.swing.JScrollPane tableChoiceListScrollPane;
    private javax.swing.JPanel tableChoicePanel;
    private javax.swing.JLabel tablesImage;
    private javax.swing.JComboBox<String> timeChoiceComboBox;
    private javax.swing.JLabel timeChoiceLabel;
    private javax.swing.JPanel timeChoicePanel;
    private javax.swing.JButton validateButton;
    // End of variables declaration//GEN-END:variables

    //
    
    public JPanel getDateChoicePanel() {
        return this.dateChoicePanel;
    }
    
    public JPanel getTimeChoicePanel() {
        return this.timeChoicePanel;
    }
    
    public JPanel getPeopleCountChoicePanel() {
        return this.peopleCountChoicePanel;
    }
    
    public JPanel getTableChoicePanel() {
        return this.tableChoicePanel;
    }
    
    public JButton getValidateButton() {
        return this.validateButton;
    }
    
    public JButton getCancelButton() {
        return this.cancelButton;
    }
    
    //
    
    public void setTableChoices(String[] tableNames) {
        DefaultListModel<String> tableListModel = (DefaultListModel<String>) this.tableChoiceList.getModel();
        tableListModel.clear();
        
        for(String tableName : tableNames) {
            tableListModel.addElement(tableName);
        }
    }
    
    // work-in-progress
    public void resetChoices() {
        this.datePicker.setDate(null);
        this.timeChoiceComboBox.setSelectedIndex(0);
        this.peopleCountChoiceComboBox.setSelectedIndex(0);
    }
    
}
