/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etla.mod.etl.form;

import etla.mod.SModConsts;
import etla.mod.etl.db.SDbCustomer;
import etla.mod.etl.db.SEtlConsts;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import sa.lib.SLibConsts;
import sa.lib.SLibUtils;
import sa.lib.db.SDbRegistry;
import sa.lib.gui.SGuiClient;
import sa.lib.gui.SGuiConsts;
import sa.lib.gui.SGuiUtils;
import sa.lib.gui.SGuiValidation;
import sa.lib.gui.bean.SBeanForm;

/**
 *
 * @author Sergio Flores
 */
public class SFormCustomer extends SBeanForm implements ActionListener {
    
    private SDbCustomer moRegistry;
    
    /**
     * Creates new form SFormGroup
     * @param client
     * @param title
     */
    public SFormCustomer(SGuiClient client, String title) {
        setFormSettings(client, SGuiConsts.BEAN_FORM_EDIT, SModConsts.AU_CUS, SLibConsts.UNDEFINED, title);
        initComponents();
        initComponentsCustom();
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jlCode = new javax.swing.JLabel();
        jtfCode = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jlName = new javax.swing.JLabel();
        jtfName = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jlSrcRequiredCurrency = new javax.swing.JLabel();
        moKeySrcRequiredCurrency = new sa.lib.gui.bean.SBeanFieldKey();
        jPanel11 = new javax.swing.JPanel();
        jlSrcRequiredUnitOfMeasure = new javax.swing.JLabel();
        moKeySrcRequiredUnitOfMeasure = new sa.lib.gui.bean.SBeanFieldKey();
        jPanel12 = new javax.swing.JPanel();
        jlDesCustomerId = new javax.swing.JLabel();
        moIntDesCustomerId = new sa.lib.gui.bean.SBeanFieldInteger();
        jbEditDesCustomerId = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jlDesRequiredPayMethod = new javax.swing.JLabel();
        moKeyDesRequiredPayMethod = new sa.lib.gui.bean.SBeanFieldKey();
        jPanel14 = new javax.swing.JPanel();
        jlPayAccount = new javax.swing.JLabel();
        moTextPayAccount = new sa.lib.gui.bean.SBeanFieldText();
        jbSetUndefined = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del registro:"));
        jPanel1.setLayout(new java.awt.BorderLayout(0, 5));

        jPanel2.setLayout(new java.awt.GridLayout(7, 1, 0, 5));

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlCode.setText("Código:");
        jlCode.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel3.add(jlCode);

        jtfCode.setEditable(false);
        jtfCode.setFocusable(false);
        jtfCode.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel3.add(jtfCode);

        jPanel2.add(jPanel3);

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlName.setText("Nombre:*");
        jlName.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel4.add(jlName);

        jtfName.setEditable(false);
        jtfName.setFocusable(false);
        jtfName.setPreferredSize(new java.awt.Dimension(300, 23));
        jPanel4.add(jtfName);

        jPanel2.add(jPanel4);

        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlSrcRequiredCurrency.setText("Moneda requerida:");
        jlSrcRequiredCurrency.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel6.add(jlSrcRequiredCurrency);

        moKeySrcRequiredCurrency.setPreferredSize(new java.awt.Dimension(300, 23));
        jPanel6.add(moKeySrcRequiredCurrency);

        jPanel2.add(jPanel6);

        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlSrcRequiredUnitOfMeasure.setText("Unidad requerida:");
        jlSrcRequiredUnitOfMeasure.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel11.add(jlSrcRequiredUnitOfMeasure);

        moKeySrcRequiredUnitOfMeasure.setPreferredSize(new java.awt.Dimension(300, 23));
        jPanel11.add(moKeySrcRequiredUnitOfMeasure);

        jPanel2.add(jPanel11);

        jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlDesCustomerId.setText("ID SIIE:*");
        jlDesCustomerId.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel12.add(jlDesCustomerId);
        jPanel12.add(moIntDesCustomerId);

        jbEditDesCustomerId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sa/lib/img/cmd_std_edit.gif"))); // NOI18N
        jbEditDesCustomerId.setToolTipText("Modificar");
        jbEditDesCustomerId.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel12.add(jbEditDesCustomerId);

        jPanel2.add(jPanel12);

        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlDesRequiredPayMethod.setText("Método pago:");
        jlDesRequiredPayMethod.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel13.add(jlDesRequiredPayMethod);

        moKeyDesRequiredPayMethod.setPreferredSize(new java.awt.Dimension(200, 23));
        jPanel13.add(moKeyDesRequiredPayMethod);

        jPanel2.add(jPanel13);

        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlPayAccount.setText("No. cuenta:*");
        jlPayAccount.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel14.add(jlPayAccount);

        moTextPayAccount.setPreferredSize(new java.awt.Dimension(200, 23));
        jPanel14.add(moTextPayAccount);

        jbSetUndefined.setText("No identificado");
        jbSetUndefined.setMargin(new java.awt.Insets(2, 0, 2, 0));
        jbSetUndefined.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel14.add(jbSetUndefined);

        jPanel2.add(jPanel14);

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel5.setLayout(new java.awt.BorderLayout(5, 0));
        jPanel1.add(jPanel5, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jbEditDesCustomerId;
    private javax.swing.JButton jbSetUndefined;
    private javax.swing.JLabel jlCode;
    private javax.swing.JLabel jlDesCustomerId;
    private javax.swing.JLabel jlDesRequiredPayMethod;
    private javax.swing.JLabel jlName;
    private javax.swing.JLabel jlPayAccount;
    private javax.swing.JLabel jlSrcRequiredCurrency;
    private javax.swing.JLabel jlSrcRequiredUnitOfMeasure;
    private javax.swing.JTextField jtfCode;
    private javax.swing.JTextField jtfName;
    private sa.lib.gui.bean.SBeanFieldInteger moIntDesCustomerId;
    private sa.lib.gui.bean.SBeanFieldKey moKeyDesRequiredPayMethod;
    private sa.lib.gui.bean.SBeanFieldKey moKeySrcRequiredCurrency;
    private sa.lib.gui.bean.SBeanFieldKey moKeySrcRequiredUnitOfMeasure;
    private sa.lib.gui.bean.SBeanFieldText moTextPayAccount;
    // End of variables declaration//GEN-END:variables

    /*
     * Private methods
     */
    
    private void initComponentsCustom() {
        SGuiUtils.setWindowBounds(this, 480, 300);
        
        moKeySrcRequiredCurrency.setKeySettings(miClient, SGuiUtils.getLabelName(jlSrcRequiredCurrency), false);
        moKeySrcRequiredUnitOfMeasure.setKeySettings(miClient, SGuiUtils.getLabelName(jlSrcRequiredUnitOfMeasure), false);
        moIntDesCustomerId.setIntegerSettings(SGuiUtils.getLabelName(jlDesCustomerId), SGuiConsts.GUI_TYPE_INT_RAW, true);
        moKeyDesRequiredPayMethod.setKeySettings(miClient, SGuiUtils.getLabelName(jlDesRequiredPayMethod), false);
        moTextPayAccount.setTextSettings(SGuiUtils.getLabelName(jlPayAccount), 25);
        
        moFields.addField(moKeySrcRequiredCurrency);
        moFields.addField(moKeySrcRequiredUnitOfMeasure);
        moFields.addField(moIntDesCustomerId);
        moFields.addField(moKeyDesRequiredPayMethod);
        moFields.addField(moTextPayAccount);
        
        moFields.setFormButton(jbSave);
    }
    
    private void enableEditDesCustomerId(boolean enable) {
        moIntDesCustomerId.setEditable(enable);
        jbEditDesCustomerId.setEnabled(!enable);
    }
    
    private void actionEditDesCustomerId() {
        enableEditDesCustomerId(true);
        moIntDesCustomerId.requestFocus();
    }
    
    private void actionSetUndefined() {
        moTextPayAccount.setValue(SEtlConsts.SIIE_PAY_ACC_UNDEF);
        moTextPayAccount.requestFocus();
    }

    /*
     * Public methods
     */
    
    /*
     * Overriden methods
     */
    
    @Override
    public void addAllListeners() {
        jbEditDesCustomerId.addActionListener(this);
        jbSetUndefined.addActionListener(this);
    }

    @Override
    public void removeAllListeners() {
        jbEditDesCustomerId.removeActionListener(this);
        jbSetUndefined.removeActionListener(this);
    }

    @Override
    public void reloadCatalogues() {
        miClient.getSession().populateCatalogue(moKeySrcRequiredCurrency, SModConsts.AS_CUR, SLibConsts.UNDEFINED, null);
        miClient.getSession().populateCatalogue(moKeySrcRequiredUnitOfMeasure, SModConsts.AS_UOM, SLibConsts.UNDEFINED, null);
        miClient.getSession().populateCatalogue(moKeyDesRequiredPayMethod, SModConsts.AS_PAY_MET, SLibConsts.UNDEFINED, null);
    }

    @Override
    public void setRegistry(SDbRegistry registry) throws Exception {
        moRegistry = (SDbCustomer) registry;

        mnFormResult = SLibConsts.UNDEFINED;
        mbFirstActivation = true;

        removeAllListeners();
        reloadCatalogues();

        if (moRegistry.isRegistryNew()) {
            jtfRegistryKey.setText("");
        }
        else {
            jtfRegistryKey.setText(SLibUtils.textKey(moRegistry.getPrimaryKey()));
        }

        jtfCode.setText(moRegistry.getCode());
        jtfCode.setCaretPosition(0);
        jtfName.setText(moRegistry.getName());
        jtfName.setCaretPosition(0);
        moKeySrcRequiredCurrency.setValue(new int[] { moRegistry.getFkSrcRequiredCurrencyId_n() });
        moKeySrcRequiredUnitOfMeasure.setValue(new int[] { moRegistry.getFkSrcRequiredUnitOfMeasureId_n()});
        moIntDesCustomerId.setValue(moRegistry.getDesCustomerId());
        moKeyDesRequiredPayMethod.setValue(new int[] { moRegistry.getFkDesRequiredPayMethodId_n()});
        moTextPayAccount.setValue(moRegistry.getPayAccount());

        setFormEditable(true);
        
        enableEditDesCustomerId(false);
        
        if (moRegistry.isRegistryNew()) {
        }
        else {
        }
        
        addAllListeners();
    }

    @Override
    public SDbCustomer getRegistry() throws Exception {
        SDbCustomer registry = moRegistry.clone();

        if (registry.isRegistryNew()) {}

        registry.setDesCustomerId(moIntDesCustomerId.getValue());
        registry.setPayAccount(moTextPayAccount.getValue());
        registry.setSrcRequiredCurrencyFk_n(moKeySrcRequiredCurrency.getSelectedIndex() <= 0 ? SLibConsts.UNDEFINED : (Integer) moKeySrcRequiredCurrency.getSelectedItem().getComplement());
        registry.setSrcRequiredUnitOfMeasureFk_n(moKeySrcRequiredUnitOfMeasure.getSelectedIndex() <= 0 ? "" : (String) moKeySrcRequiredUnitOfMeasure.getSelectedItem().getComplement());
        registry.setFkSrcRequiredCurrencyId_n(moKeySrcRequiredCurrency.getSelectedIndex() <= 0 ? SLibConsts.UNDEFINED : moKeySrcRequiredCurrency.getValue()[0]);
        registry.setFkSrcRequiredUnitOfMeasureId_n(moKeySrcRequiredUnitOfMeasure.getSelectedIndex() <= 0 ? SLibConsts.UNDEFINED : moKeySrcRequiredUnitOfMeasure.getValue()[0]);
        registry.setFkDesRequiredPayMethodId_n(moKeyDesRequiredPayMethod.getSelectedIndex() <= 0 ? SLibConsts.UNDEFINED : moKeyDesRequiredPayMethod.getValue()[0]);

        return registry;
    }

    @Override
    public SGuiValidation validateForm() {
        SGuiValidation validation = moFields.validateFields();
        
        return validation;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();
            
            if (button == jbEditDesCustomerId) {
                actionEditDesCustomerId();
            }
            else if (button == jbSetUndefined) {
                actionSetUndefined();
            }
        }
    }
}
