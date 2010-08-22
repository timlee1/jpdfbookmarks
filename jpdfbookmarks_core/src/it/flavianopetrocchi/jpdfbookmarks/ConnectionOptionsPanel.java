/*
 * ConnectionOptionsPanel.java
 *
 * Copyright (c) 2010 Flaviano Petrocchi <flavianopetrocchi at gmail.com>.
 * All rights reserved.
 *
 * This file is part of JPdfBookmarks.
 *
 * JPdfBookmarks is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JPdfBookmarks is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with JPdfBookmarks.  If not, see <http://www.gnu.org/licenses/>.
 */
package it.flavianopetrocchi.jpdfbookmarks;

import it.flavianopetrocchi.utilities.Ut;
import javax.swing.ButtonGroup;

public class ConnectionOptionsPanel extends javax.swing.JPanel {

    Prefs userPrefs;
    ButtonGroup proxyTypeGroup = new ButtonGroup();

    /** Creates new form ConnectionOptionsPanel */
    public ConnectionOptionsPanel(Prefs userPrefs) {
        this.userPrefs = userPrefs;
        initComponents();
        proxyTypeGroup.add(radioHttp);
        proxyTypeGroup.add(radioSocks);
        checkUseProxy.setSelected(userPrefs.getUseProxy());
        Ut.enableComponents(checkUseProxy.isSelected(), radioHttp, radioSocks,
                txtProxyAddress, portSpinner, lblProxyAddress, lblPort);
        String proxyType = userPrefs.getProxyType();
        if (proxyType.equals("SOCKS")) {
            radioSocks.setSelected(true);
        } else {
            radioHttp.setSelected(true);
        }
        txtProxyAddress.setText(userPrefs.getProxyAddress());
        portSpinner.setValue(userPrefs.getProxyPort());
        checkUpdatesOnStart.setSelected(userPrefs.getCheckUpdatesOnStart());
        checkConfirmWebAccess.setSelected(userPrefs.getNeverAskWebAccess());
    }

    public boolean checkUpdatesOnStart() {
        return checkUpdatesOnStart.isSelected();
    }

    public boolean neverAskWebAccess() {
        return checkConfirmWebAccess.isSelected();
    }

    public boolean useProxy() {
        return checkUseProxy.isSelected();
    }

    public String getProxyType() {
        if (radioSocks.isSelected()) {
            return "SOCKS";
        } else {
            return "HTTP";
        }
    }

    public String getProxyAddress() {
        return txtProxyAddress.getText().trim();
    }

    public int getProxyPort() {
        return (Integer) portSpinner.getValue();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkUpdatesOnStart = new javax.swing.JCheckBox();
        proxyPanel = new javax.swing.JPanel();
        checkUseProxy = new javax.swing.JCheckBox();
        lblProxyAddress = new javax.swing.JLabel();
        txtProxyAddress = new javax.swing.JTextField();
        lblPort = new javax.swing.JLabel();
        portSpinner = new javax.swing.JSpinner();
        radioSocks = new javax.swing.JRadioButton();
        radioHttp = new javax.swing.JRadioButton();
        checkConfirmWebAccess = new javax.swing.JCheckBox();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("it/flavianopetrocchi/jpdfbookmarks/locales/localizedText"); // NOI18N
        checkUpdatesOnStart.setText(bundle.getString("CHECK_UPDATES_ON_START")); // NOI18N

        proxyPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("PROXY_SETTINGS"))); // NOI18N

        checkUseProxy.setText(bundle.getString("USE_PROXY")); // NOI18N
        checkUseProxy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkUseProxyActionPerformed(evt);
            }
        });

        lblProxyAddress.setText(bundle.getString("PROXY_ADDRESS")); // NOI18N

        lblPort.setText(bundle.getString("PROXY_PORT")); // NOI18N

        portSpinner.setModel(new javax.swing.SpinnerNumberModel(80, 0, 65535, 1));

        radioSocks.setText("SOCKS");

        radioHttp.setText("HTTP");

        javax.swing.GroupLayout proxyPanelLayout = new javax.swing.GroupLayout(proxyPanel);
        proxyPanel.setLayout(proxyPanelLayout);
        proxyPanelLayout.setHorizontalGroup(
            proxyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proxyPanelLayout.createSequentialGroup()
                .addGroup(proxyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(proxyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(checkUseProxy))
                    .addGroup(proxyPanelLayout.createSequentialGroup()
                        .addComponent(lblProxyAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(proxyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(proxyPanelLayout.createSequentialGroup()
                                .addComponent(radioHttp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioSocks))
                            .addGroup(proxyPanelLayout.createSequentialGroup()
                                .addComponent(txtProxyAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPort)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(portSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        proxyPanelLayout.setVerticalGroup(
            proxyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proxyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkUseProxy)
                .addGap(18, 18, 18)
                .addGroup(proxyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioHttp)
                    .addComponent(radioSocks))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(proxyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProxyAddress)
                    .addComponent(txtProxyAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPort)
                    .addComponent(portSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        checkConfirmWebAccess.setText(bundle.getString("CONFIRM_WEB_ACCESS")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkConfirmWebAccess)
                    .addComponent(checkUpdatesOnStart)
                    .addComponent(proxyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(proxyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkUpdatesOnStart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkConfirmWebAccess)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

	private void checkUseProxyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkUseProxyActionPerformed
            Ut.enableComponents(checkUseProxy.isSelected(), radioHttp, radioSocks,
                    txtProxyAddress, portSpinner, lblProxyAddress, lblPort);
	}//GEN-LAST:event_checkUseProxyActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkConfirmWebAccess;
    private javax.swing.JCheckBox checkUpdatesOnStart;
    private javax.swing.JCheckBox checkUseProxy;
    private javax.swing.JLabel lblPort;
    private javax.swing.JLabel lblProxyAddress;
    private javax.swing.JSpinner portSpinner;
    private javax.swing.JPanel proxyPanel;
    private javax.swing.JRadioButton radioHttp;
    private javax.swing.JRadioButton radioSocks;
    private javax.swing.JTextField txtProxyAddress;
    // End of variables declaration//GEN-END:variables
}
