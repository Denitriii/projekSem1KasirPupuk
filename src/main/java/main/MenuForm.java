/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import static java.awt.AWTEventMulticaster.add;
import java.awt.Dimension;
import java.awt.MenuItem;
import javax.swing.Icon;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class MenuForm extends javax.swing.JPanel {
private ArrayList<MenuForm> subMenu = new ArrayList();
private ActionListener act;
    /**
     * Creates new form MenuForm
     */
    public MenuForm(Icon icon, boolean sbm,Icon iconSub,String namaMenu, ActoinListener act, MenuForm... subMenu ) {
        initComponents();
        lb_icon.setIcon(icon);
        lb_namaMenu.setText(namaMenu);
        lb_iconSub.setIcon(icon);
        lb_iconSub.setVisible(sbm);
        
        if(act != null){
            this.act = (ActionListener) act;
        }
        this.setSize(new Dimension(Integer.MAX_VALUE, 45));
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 45));
        this.setMinimumSize(new Dimension(Integer.MAX_VALUE, 45));
        for(int i = 0;i < subMenu.length;i++){
            this.subMenu.add(subMenu[i]);
            subMenu[i].setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_namaMenu = new javax.swing.JLabel();
        lb_iconSub = new javax.swing.JLabel();
        lb_icon = new javax.swing.JLabel();

        lb_namaMenu.setText("nama menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(lb_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_iconSub, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_namaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_namaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_iconSub, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb_icon;
    private javax.swing.JLabel lb_iconSub;
    private javax.swing.JLabel lb_namaMenu;
    // End of variables declaration//GEN-END:variables

        /**
         * @return the subMenu
         */
        public ArrayList<MenuForm> getSubMenu() {
            return subMenu;
        }

    private static class ActoinListener {

        public ActoinListener() {
        }
    }
    }
