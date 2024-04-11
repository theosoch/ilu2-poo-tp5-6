/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.EventQueue;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import control.ControlReserverTable;
import control.ControlVisualiserCarnetClientele;
import interface_noyau_fonctionnel.AdaptateurDuNoyauFonctionnel;
import model.CarnetClientele;
import model.Restaurant;
import presentation.FrameReservation;
import utils.ComponentUtil;

public class DialogReservation {

    private FrameReservation frameReservation;
    private AdaptateurDuNoyauFonctionnel adaptateurNF;
    
    //
    
    private LocalDate date = null;
    private String time = null;
    private int peopleCount = -1;
    private int tableIndex = -1;
    
    private int numClient;
    
    //

    public DialogReservation(AdaptateurDuNoyauFonctionnel adaptateurNF) {
        this.adaptateurNF = adaptateurNF;
    }
    
    //

    public void initDialog() {
        frameReservation = new FrameReservation();
        frameReservation.initFrame();
        frameReservation.setDialog(this);
        frameReservation.setVisible(true);
    }

    public void handleDateSelectedEvent(LocalDate date) {
        boolean canEnableTimeChoice = date != null;
        
        if(canEnableTimeChoice) {
            this.date = date;
        }
        
        ComponentUtil.recursiveSetEnable(frameReservation.getTimeChoicePanel(), canEnableTimeChoice);
    }

    public void handleTimeSelectedEvent(String time) {
        boolean canEnablePeopleCountChoice = time.length() > 0;
        
        if(canEnablePeopleCountChoice) {
            this.time = time;
        }
        
        ComponentUtil.recursiveSetEnable(frameReservation.getPeopleCountChoicePanel(), canEnablePeopleCountChoice);
    }

    public void handleNumOfPersonsSelectedEvent(int nbPersons) {
        boolean canEnableTableChoice = nbPersons > 0;
        
        if(canEnableTableChoice) {
            this.peopleCount = nbPersons;
            
            //
            
            if(this.date == null || this.time == null || this.peopleCount < 0) {
                throw new RuntimeException("Previous reservation parameters are invalid (date: `" + this.date + "`, time: `" + this.time + "`).");
            }

            System.out.println(
        		this.date.getDayOfMonth() + " | " + 
				this.date.getMonthValue() + " | " +
				this.peopleCount + " | " +
				this.time
			);
            String[] tableNames = this.adaptateurNF.trouverTableDisponible(this.date.getDayOfMonth(), this.date.getMonthValue(), this.peopleCount, this.time);
            
            for(String tableName : tableNames) {
            	System.out.println(tableName);
            }
            
            this.frameReservation.setTableChoices(tableNames);
        }
        
        ComponentUtil.recursiveSetEnable(frameReservation.getTableChoicePanel(), canEnableTableChoice);
    }

    public void handleTableSelectedEvent(int numTable) {
        boolean canEnableValidateButton = numTable >= 0;
        
        if(canEnableValidateButton) {
            this.tableIndex = numTable;
        }
        
        ComponentUtil.recursiveSetEnable(frameReservation.getValidateButton(), canEnableValidateButton);
    }

    public void handleCancelEvent() {
        this.frameReservation.resetChoices();
    }

    public void handleValidationEvent() {
        StringBuilder validationMessageBuilder = new StringBuilder();
        
        validationMessageBuilder.append("Réservation validée pour le ");
        validationMessageBuilder.append(this.date.getDayOfMonth());
        validationMessageBuilder.append(" ");
        validationMessageBuilder.append(this.date.getMonth().getDisplayName(TextStyle.FULL, Locale.FRANCE));
        validationMessageBuilder.append(" ");
        validationMessageBuilder.append(this.date.getYear());
        validationMessageBuilder.append(" à ");
        validationMessageBuilder.append(this.time);
        validationMessageBuilder.append(" pour ");
        validationMessageBuilder.append(this.peopleCount);
        validationMessageBuilder.append(" personne(s) à la table n° ");
        validationMessageBuilder.append(this.tableIndex +1);
        validationMessageBuilder.append(".");
        
        JOptionPane.showMessageDialog(
            this.frameReservation,
            validationMessageBuilder.toString(),
            "Confirmation de réservation",
            JOptionPane.INFORMATION_MESSAGE
        );
        
        this.frameReservation.resetChoices();
    }
    
    //
    
    public void handleUserConnected(int numClient) {
    	this.numClient = numClient;
    	frameReservation.setVisible(true);
	}
    
    //

    public static void main(String[] args) {
    	CarnetClientele carnetClientele = new CarnetClientele();
    	Restaurant restaurant = new Restaurant();
		restaurant.ajouterTable(2);
		restaurant.ajouterTable(4);
		restaurant.ajouterTable(4);
		restaurant.ajouterTable(4);
		restaurant.ajouterTable(4);
		restaurant.ajouterTable(8);
    	
    	ControlReserverTable controlReserverTable = new ControlReserverTable(restaurant, carnetClientele);
    	ControlVisualiserCarnetClientele controlVisualiserCarnetClientele = new ControlVisualiserCarnetClientele(carnetClientele);
    	AdaptateurDuNoyauFonctionnel adaptateurNF = new AdaptateurDuNoyauFonctionnel(controlReserverTable, controlVisualiserCarnetClientele);
    	
        DialogReservation dialog = new DialogReservation(adaptateurNF);
        
        EventQueue.invokeLater(() -> {
            dialog.initDialog();
        });
    }

}
