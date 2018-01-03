/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etla.mod.sms.form;

import etla.mod.SModConsts;
import etla.mod.SModSysConsts;
import etla.mod.cfg.db.SDbConfig;
import etla.mod.etl.db.SDbConfigAvista;
import etla.mod.etl.db.SEtlConsts;
import etla.mod.etl.db.SEtlProcess;
import etla.mod.sms.db.SDbShipment;
import etla.mod.sms.db.SDbShipmentRow;
import etla.mod.sms.db.SRowShipmentRow;
import etla.mod.sms.db.SShippingUtils;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.JButton;
import sa.lib.SLibConsts;
import sa.lib.SLibTimeUtils;
import sa.lib.SLibUtils;
import sa.lib.db.SDbRegistry;
import sa.lib.grid.SGridColumnForm;
import sa.lib.grid.SGridConsts;
import sa.lib.grid.SGridPaneForm;
import sa.lib.grid.SGridRow;
import sa.lib.gui.SGuiClient;
import sa.lib.gui.SGuiConsts;
import sa.lib.gui.SGuiUtils;
import sa.lib.gui.SGuiValidation;
import sa.lib.gui.bean.SBeanForm;

/**
 *
 * @author Daniel López, Sergio Flores
 */
public class SFormShipment extends SBeanForm implements ActionListener{

    private SDbShipment moRegistry;
    private SGridPaneForm moGridAvailableRows;
    private SGridPaneForm moGridSelectedRows;
    private Connection miConnectionAvista;
    private boolean mbRowsShown;
    
    /**
     * Creates new form SFormShipmentOrder
     * @param client
     * @param title
     */
    public SFormShipment(SGuiClient client, String title) {
        setFormSettings(client, SGuiConsts.BEAN_FORM_EDIT, SModConsts.S_SHIPT, SLibConsts.UNDEFINED, title);
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

        jpHeader = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jlNumber = new javax.swing.JLabel();
        jtfNumber = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jlDate = new javax.swing.JLabel();
        moDateDate = new sa.lib.gui.bean.SBeanFieldDate();
        jPanel9 = new javax.swing.JPanel();
        jlShipmentType = new javax.swing.JLabel();
        moKeyShipmentType = new sa.lib.gui.bean.SBeanFieldKey();
        jPanel10 = new javax.swing.JPanel();
        jlCargoType = new javax.swing.JLabel();
        moKeyCargoType = new sa.lib.gui.bean.SBeanFieldKey();
        jPanel11 = new javax.swing.JPanel();
        jlHandlingType = new javax.swing.JLabel();
        moKeyHandlingType = new sa.lib.gui.bean.SBeanFieldKey();
        jPanel6 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jlShipper = new javax.swing.JLabel();
        moKeyShipper = new sa.lib.gui.bean.SBeanFieldKey();
        jPanel16 = new javax.swing.JPanel();
        jlVehicleType = new javax.swing.JLabel();
        moKeyVehicleType = new sa.lib.gui.bean.SBeanFieldKey();
        jPanel17 = new javax.swing.JPanel();
        jlVehiclePlate = new javax.swing.JLabel();
        moTextVehiclePlate = new sa.lib.gui.bean.SBeanFieldText();
        jPanel14 = new javax.swing.JPanel();
        jlDriverName = new javax.swing.JLabel();
        moTextDriverName = new sa.lib.gui.bean.SBeanFieldText();
        jPanel15 = new javax.swing.JPanel();
        jlDriverPhone = new javax.swing.JLabel();
        moTextDriverPhone = new sa.lib.gui.bean.SBeanFieldText();
        jpBody = new javax.swing.JPanel();
        jpRows = new javax.swing.JPanel();
        jpFilterControls = new javax.swing.JPanel();
        jlDateRows = new javax.swing.JLabel();
        moDateRows = new sa.lib.gui.bean.SBeanFieldDate();
        jbShowRows = new javax.swing.JButton();
        jbClearRows = new javax.swing.JButton();
        jpRowControls = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jlDummy01 = new javax.swing.JLabel();
        jbRowAdd = new javax.swing.JButton();
        jbRowRemove = new javax.swing.JButton();
        jpAvailableRows = new javax.swing.JPanel();
        jpSelectedRows = new javax.swing.JPanel();
        jpFooter = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        moKeyComment = new sa.lib.gui.bean.SBeanFieldKey();
        jbAddComment = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jspComments = new javax.swing.JScrollPane();
        jtaComments = new javax.swing.JTextArea();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jlTotalM2 = new javax.swing.JLabel();
        jtfTotalM2 = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jlEstatus = new javax.swing.JLabel();
        jtfEstatus = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jckReleaseOnSave = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jpHeader.setLayout(new java.awt.GridLayout(1, 2));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del registro:"));
        jPanel5.setLayout(new java.awt.GridLayout(5, 1, 0, 5));

        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlNumber.setText("Folio:");
        jlNumber.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel7.add(jlNumber);

        jtfNumber.setEditable(false);
        jtfNumber.setText("0");
        jtfNumber.setFocusable(false);
        jtfNumber.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel7.add(jtfNumber);

        jPanel5.add(jPanel7);

        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlDate.setText("Fecha:*");
        jlDate.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel8.add(jlDate);
        jPanel8.add(moDateDate);

        jPanel5.add(jPanel8);

        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlShipmentType.setText("Tipo embarque:*");
        jlShipmentType.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel9.add(jlShipmentType);

        moKeyShipmentType.setPreferredSize(new java.awt.Dimension(250, 23));
        jPanel9.add(moKeyShipmentType);

        jPanel5.add(jPanel9);

        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlCargoType.setText("Tipo carga:*");
        jlCargoType.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel10.add(jlCargoType);

        moKeyCargoType.setPreferredSize(new java.awt.Dimension(250, 23));
        jPanel10.add(moKeyCargoType);

        jPanel5.add(jPanel10);

        jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlHandlingType.setText("Tipo maniobra:*");
        jlHandlingType.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel11.add(jlHandlingType);

        moKeyHandlingType.setPreferredSize(new java.awt.Dimension(250, 23));
        jPanel11.add(moKeyHandlingType);

        jPanel5.add(jPanel11);

        jpHeader.add(jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del transportista:"));
        jPanel6.setLayout(new java.awt.GridLayout(5, 1, 0, 5));

        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlShipper.setText("Transportista:*");
        jlShipper.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel13.add(jlShipper);

        moKeyShipper.setPreferredSize(new java.awt.Dimension(250, 23));
        jPanel13.add(moKeyShipper);

        jPanel6.add(jPanel13);

        jPanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlVehicleType.setText("Tipo vehículo:*");
        jlVehicleType.setPreferredSize(new java.awt.Dimension(100, 23));
        jlVehicleType.setRequestFocusEnabled(false);
        jPanel16.add(jlVehicleType);

        moKeyVehicleType.setPreferredSize(new java.awt.Dimension(250, 23));
        jPanel16.add(moKeyVehicleType);

        jPanel6.add(jPanel16);

        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlVehiclePlate.setText("Placas vehículo:*");
        jlVehiclePlate.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel17.add(jlVehiclePlate);

        moTextVehiclePlate.setPreferredSize(new java.awt.Dimension(150, 23));
        jPanel17.add(moTextVehiclePlate);

        jPanel6.add(jPanel17);

        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlDriverName.setText("Nombre chofer:*");
        jlDriverName.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel14.add(jlDriverName);

        moTextDriverName.setPreferredSize(new java.awt.Dimension(250, 23));
        jPanel14.add(moTextDriverName);

        jPanel6.add(jPanel14);

        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlDriverPhone.setText("Teléfono chofer:*");
        jlDriverPhone.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel15.add(jlDriverPhone);

        moTextDriverPhone.setPreferredSize(new java.awt.Dimension(250, 23));
        jPanel15.add(moTextDriverPhone);

        jPanel6.add(jPanel15);

        jpHeader.add(jPanel6);

        getContentPane().add(jpHeader, java.awt.BorderLayout.NORTH);

        jpBody.setLayout(new java.awt.BorderLayout());

        jpRows.setBorder(javax.swing.BorderFactory.createTitledBorder("Remisiones:"));
        jpRows.setLayout(new java.awt.BorderLayout(5, 5));

        jpFilterControls.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jlDateRows.setText("Fecha remisiones:");
        jlDateRows.setPreferredSize(new java.awt.Dimension(100, 23));
        jpFilterControls.add(jlDateRows);
        jpFilterControls.add(moDateRows);

        jbShowRows.setText("Mostrar");
        jbShowRows.setPreferredSize(new java.awt.Dimension(75, 23));
        jpFilterControls.add(jbShowRows);

        jbClearRows.setText("Limpiar");
        jbClearRows.setPreferredSize(new java.awt.Dimension(75, 23));
        jpFilterControls.add(jbClearRows);

        jpRows.add(jpFilterControls, java.awt.BorderLayout.NORTH);

        jpRowControls.setLayout(new java.awt.BorderLayout());

        jPanel12.setLayout(new java.awt.GridLayout(4, 1, 0, 5));
        jPanel12.add(jlDummy01);

        jbRowAdd.setText(">");
        jbRowAdd.setToolTipText("Agregar remisión");
        jbRowAdd.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel12.add(jbRowAdd);

        jbRowRemove.setText("<");
        jbRowRemove.setToolTipText("Remover remisón");
        jbRowRemove.setPreferredSize(new java.awt.Dimension(75, 23));
        jPanel12.add(jbRowRemove);

        jpRowControls.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jpRows.add(jpRowControls, java.awt.BorderLayout.CENTER);

        jpAvailableRows.setBorder(javax.swing.BorderFactory.createTitledBorder("Remisiones disponibles:"));
        jpAvailableRows.setPreferredSize(new java.awt.Dimension(475, 23));
        jpAvailableRows.setLayout(new java.awt.BorderLayout());
        jpRows.add(jpAvailableRows, java.awt.BorderLayout.WEST);

        jpSelectedRows.setBorder(javax.swing.BorderFactory.createTitledBorder("Remisiones disponibles:"));
        jpSelectedRows.setPreferredSize(new java.awt.Dimension(475, 23));
        jpSelectedRows.setLayout(new java.awt.BorderLayout());
        jpRows.add(jpSelectedRows, java.awt.BorderLayout.EAST);

        jpBody.add(jpRows, java.awt.BorderLayout.CENTER);

        jpFooter.setLayout(new java.awt.GridLayout(1, 2));

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Observaciones:"));
        jPanel20.setLayout(new java.awt.BorderLayout(0, 5));

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        moKeyComment.setToolTipText("Comentario");
        moKeyComment.setPreferredSize(new java.awt.Dimension(350, 23));
        jPanel1.add(moKeyComment);

        jbAddComment.setText("+");
        jbAddComment.setToolTipText("Agregar comentario");
        jbAddComment.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jbAddComment.setPreferredSize(new java.awt.Dimension(23, 23));
        jPanel1.add(jbAddComment);

        jPanel20.add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        jspComments.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jspComments.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jspComments.setPreferredSize(new java.awt.Dimension(378, 75));
        jspComments.setRequestFocusEnabled(false);

        jtaComments.setColumns(20);
        jtaComments.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jtaComments.setRows(5);
        jspComments.setViewportView(jtaComments);

        jPanel2.add(jspComments);

        jPanel20.add(jPanel2, java.awt.BorderLayout.CENTER);

        jpFooter.add(jPanel20);

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales:"));
        jPanel21.setLayout(new java.awt.BorderLayout());

        jPanel22.setLayout(new java.awt.GridLayout(3, 1, 0, 5));

        jPanel23.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 0));

        jlTotalM2.setText("Total m²:");
        jlTotalM2.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel23.add(jlTotalM2);

        jtfTotalM2.setEditable(false);
        jtfTotalM2.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtfTotalM2.setText("0");
        jtfTotalM2.setFocusable(false);
        jtfTotalM2.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel23.add(jtfTotalM2);

        jPanel22.add(jPanel23);

        jPanel24.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 0));

        jlEstatus.setText("Estatus embarque:");
        jlEstatus.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel24.add(jlEstatus);

        jtfEstatus.setEditable(false);
        jtfEstatus.setFocusable(false);
        jtfEstatus.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel24.add(jtfEstatus);

        jPanel22.add(jPanel24);

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 0));

        jckReleaseOnSave.setText("Liberar al guardar");
        jckReleaseOnSave.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jckReleaseOnSave.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jckReleaseOnSave.setPreferredSize(new java.awt.Dimension(200, 23));
        jPanel3.add(jckReleaseOnSave);

        jPanel22.add(jPanel3);

        jPanel21.add(jPanel22, java.awt.BorderLayout.NORTH);

        jpFooter.add(jPanel21);

        jpBody.add(jpFooter, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jpBody, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbAddComment;
    private javax.swing.JButton jbClearRows;
    private javax.swing.JButton jbRowAdd;
    private javax.swing.JButton jbRowRemove;
    private javax.swing.JButton jbShowRows;
    private javax.swing.JCheckBox jckReleaseOnSave;
    private javax.swing.JLabel jlCargoType;
    private javax.swing.JLabel jlDate;
    private javax.swing.JLabel jlDateRows;
    private javax.swing.JLabel jlDriverName;
    private javax.swing.JLabel jlDriverPhone;
    private javax.swing.JLabel jlDummy01;
    private javax.swing.JLabel jlEstatus;
    private javax.swing.JLabel jlHandlingType;
    private javax.swing.JLabel jlNumber;
    private javax.swing.JLabel jlShipmentType;
    private javax.swing.JLabel jlShipper;
    private javax.swing.JLabel jlTotalM2;
    private javax.swing.JLabel jlVehiclePlate;
    private javax.swing.JLabel jlVehicleType;
    private javax.swing.JPanel jpAvailableRows;
    private javax.swing.JPanel jpBody;
    private javax.swing.JPanel jpFilterControls;
    private javax.swing.JPanel jpFooter;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpRowControls;
    private javax.swing.JPanel jpRows;
    private javax.swing.JPanel jpSelectedRows;
    private javax.swing.JScrollPane jspComments;
    private javax.swing.JTextArea jtaComments;
    private javax.swing.JTextField jtfEstatus;
    private javax.swing.JTextField jtfNumber;
    private javax.swing.JTextField jtfTotalM2;
    private sa.lib.gui.bean.SBeanFieldDate moDateDate;
    private sa.lib.gui.bean.SBeanFieldDate moDateRows;
    private sa.lib.gui.bean.SBeanFieldKey moKeyCargoType;
    private sa.lib.gui.bean.SBeanFieldKey moKeyComment;
    private sa.lib.gui.bean.SBeanFieldKey moKeyHandlingType;
    private sa.lib.gui.bean.SBeanFieldKey moKeyShipmentType;
    private sa.lib.gui.bean.SBeanFieldKey moKeyShipper;
    private sa.lib.gui.bean.SBeanFieldKey moKeyVehicleType;
    private sa.lib.gui.bean.SBeanFieldText moTextDriverName;
    private sa.lib.gui.bean.SBeanFieldText moTextDriverPhone;
    private sa.lib.gui.bean.SBeanFieldText moTextVehiclePlate;
    // End of variables declaration//GEN-END:variables

    /* 
    *Private methods
    */
    
    private void initComponentsCustom() {
        SGuiUtils.setWindowBounds(this, 1024, 640);
        
        moDateDate.setDateSettings(miClient, SGuiUtils.getLabelName(jlDate), true);
        moKeyShipmentType.setKeySettings(miClient, SGuiUtils.getLabelName(jlShipmentType), true);
        moKeyCargoType.setKeySettings(miClient, SGuiUtils.getLabelName(jlCargoType), true);
        moKeyHandlingType.setKeySettings(miClient, SGuiUtils.getLabelName(jlHandlingType), true);
        moKeyShipper.setKeySettings(miClient, SGuiUtils.getLabelName(jlShipper), true);
        moKeyVehicleType.setKeySettings(miClient, SGuiUtils.getLabelName(jlVehicleType), true);
        moTextVehiclePlate.setTextSettings(SGuiUtils.getLabelName(jlVehiclePlate), 25);
        moTextDriverName.setTextSettings(SGuiUtils.getLabelName(jlDriverName), 50);
        moTextDriverPhone.setTextSettings(SGuiUtils.getLabelName(jlDriverPhone), 50);
        moDateRows.setDateSettings(miClient, SGuiUtils.getLabelName(jlDateRows), false);
        moDateRows.setNextButton(jbShowRows);
        moKeyComment.setKeySettings(miClient, SGuiUtils.getLabelName(moKeyComment.getToolTipText()), false);
        
        moFields.addField(moDateDate);
        moFields.addField(moKeyShipmentType);
        moFields.addField(moKeyCargoType);
        moFields.addField(moKeyHandlingType);
        moFields.addField(moKeyShipper);
        moFields.addField(moKeyVehicleType);
        moFields.addField(moTextVehiclePlate);
        moFields.addField(moTextDriverName);
        moFields.addField(moTextDriverPhone);
        moFields.addField(moDateRows);
        moFields.addField(moKeyComment);
        
        moFields.setFormButton(jbSave);
        
        moGridAvailableRows = new SGridPaneForm(miClient, SModConsts.S_SHIPT_ROW, SLibConsts.UNDEFINED, "Remisiones disponibles", null) {
            @Override
            public void initGrid() {
                setRowButtonsEnabled(false);
            }

            @Override
            public ArrayList<SGridColumnForm> createGridColumns() {
                int col = 0;
                ArrayList<SGridColumnForm> gridColumnsForm = new ArrayList<>();
                SGridColumnForm[] columns = new SGridColumnForm[7];

                columns[col++] = new SGridColumnForm(SGridConsts.COL_TYPE_INT_RAW, "Remisión", 60);
                columns[col++] = new SGridColumnForm(SGridConsts.COL_TYPE_TEXT_CODE_CAT, "Invoice");
                columns[col++] = new SGridColumnForm(SGridConsts.COL_TYPE_DATE, "Fecha invoice");
                columns[col++] = new SGridColumnForm(SGridConsts.COL_TYPE_TEXT_NAME_BPR_S, "Cliente");
                columns[col++] = new SGridColumnForm(SGridConsts.COL_TYPE_TEXT_NAME_CAT_S, "Destino");
                columns[col++] = new SGridColumnForm(SGridConsts.COL_TYPE_DEC_QTY, "m²");
                columns[col++] = new SGridColumnForm(SGridConsts.COL_TYPE_DEC_QTY, "kg");

                gridColumnsForm.addAll(Arrays.asList((SGridColumnForm[]) columns));

                return gridColumnsForm;
            }
            
            @Override
            public void actionMouseClicked() {
                actionPerformedAddRow();
            }
        };
        
        moGridAvailableRows.setForm(null);
        moGridAvailableRows.setPaneFormOwner(null);
        jpAvailableRows.add(moGridAvailableRows, BorderLayout.CENTER);
        
        moGridSelectedRows = new SGridPaneForm(miClient, SModConsts.S_SHIPT_ROW, SLibConsts.UNDEFINED, "Remisiones seleccionadas", null) {
            @Override
            public void initGrid() {
                setRowButtonsEnabled(false, false, false);
            }
            
            @Override
            public ArrayList<SGridColumnForm> createGridColumns() {
                int col = 0;
                ArrayList<SGridColumnForm> gridColumnsForm = new ArrayList<>();
                SGridColumnForm[] columns = new SGridColumnForm[7];

                columns[col++] = new SGridColumnForm(SGridConsts.COL_TYPE_INT_RAW, "Remisión", 60);
                columns[col++] = new SGridColumnForm(SGridConsts.COL_TYPE_TEXT_CODE_CAT, "Invoice");
                columns[col++] = new SGridColumnForm(SGridConsts.COL_TYPE_DATE, "Fecha invoice");
                columns[col++] = new SGridColumnForm(SGridConsts.COL_TYPE_TEXT_NAME_BPR_S, "Cliente");
                columns[col++] = new SGridColumnForm(SGridConsts.COL_TYPE_TEXT_NAME_CAT_S, "Destino");
                columns[col++] = new SGridColumnForm(SGridConsts.COL_TYPE_DEC_QTY, "m²");
                columns[col++] = new SGridColumnForm(SGridConsts.COL_TYPE_DEC_QTY, "kg");

                gridColumnsForm.addAll(Arrays.asList((SGridColumnForm[]) columns));

                return gridColumnsForm;            
            }
            
            @Override
            public void actionMouseClicked() {
                actionPerformedRemoveRow();
            }
        };
        
        moGridSelectedRows.setForm(null);
        moGridSelectedRows.setPaneFormOwner(null);
        jpSelectedRows.add(moGridSelectedRows, BorderLayout.CENTER);
        
        mvFormGrids.add(moGridAvailableRows);
        mvFormGrids.add(moGridSelectedRows);
    }
    
    private void computeTotals() {
        double totalM2 = 0;
        
        for (int i = 0; i < moGridSelectedRows.getTable().getRowCount(); i++) { 
            totalM2 += ((SRowShipmentRow) moGridSelectedRows.getGridRow(i)).getShipmentRow().getMeters2();
        }
                
        jtfTotalM2.setText(SLibUtils.getDecimalFormatQuantity().format(totalM2));
        jtfTotalM2.setCaretPosition(0);
    }
    
    private void checkRowToAdd(final SDbShipmentRow shipmentRow) throws Exception {
        // validate customer:
        if (shipmentRow.getFkCustomerId() == SLibConsts.UNDEFINED) {
            throw new Exception("La remisión no tiene un cliente identificado.");
        }
        if (shipmentRow.getInvoiceIdYear() == SLibConsts.UNDEFINED || shipmentRow.getInvoiceIdDoc() == SLibConsts.UNDEFINED) {
            throw new Exception("La remisión no está facturada.");
        }
    }
    
    private void actionPerformedShowRows() {
        if (jbShowRows.isEnabled()) {
            if (moDateRows.getValue() == null) {
                miClient.showMsgBoxWarning(SGuiConsts.ERR_MSG_FIELD_REQ + "'" + SGuiUtils.getLabelName(jlDateRows) + "'.");
                moDateRows.requestFocus();
            }
            else {
                try {
                    moGridAvailableRows.populateGrid(new Vector<>(SShippingUtils.obtainAvailableRows(miClient.getSession(), miConnectionAvista, moDateRows.getValue())));
                    
                    if (moGridSelectedRows.getTable().getRowCount() > 0) {
                        for (int i = 0; i < moGridAvailableRows.getTable().getRowCount(); i++) {
                            if (rowIsSelected(((SRowShipmentRow) moGridAvailableRows.getGridRow(i)).getShipmentRow().getDeliveryId())) {
                                moGridAvailableRows.removeGridRow(i);
                                moGridAvailableRows.renderGridRows();
                                i--; //Because the size of the Grid decrements 1 in size every time a row its removed
                            }
                        }
                    }
                    
                    mbRowsShown = true;
                    
                    moDateRows.setEditable(false);
                    jbShowRows.setEnabled(false);
                    jbClearRows.setEnabled(true);
                    
                    jbClearRows.requestFocus();
                }
                catch (Exception e) {
                    SLibUtils.showException(this, e);
                }
            }
        }
    }
    
    private boolean rowIsSelected(String deliveryId) {
        boolean isSelected = false;
        
        for (int j = 0; j < moGridSelectedRows.getTable().getRowCount(); j++) {
            if (( (SRowShipmentRow) moGridSelectedRows.getGridRow(j)).getShipmentRow().getDeliveryId().equalsIgnoreCase(deliveryId)) {
                isSelected = true;
                break;
            }
        }
        
        return isSelected;
    }
    
    private void actionPerformedClearRows() {
        if (jbClearRows.isEnabled()) {
            moGridAvailableRows.clearGridRows();
            
            mbRowsShown = false;
            
            moDateRows.setEditable(true);
            jbShowRows.setEnabled(true);
            jbClearRows.setEnabled(false);
            
            moDateRows.requestFocus();
        }
    }
    
    private void actionPerformedAddRow() {       
        if (moGridAvailableRows.getSelectedGridRow() == null) {
            miClient.showMsgBoxWarning(SGridConsts.MSG_SELECT_ROW);
            moGridAvailableRows.getTable().requestFocus();
        }
        else {            
            try {
                checkRowToAdd(((SRowShipmentRow) moGridAvailableRows.getSelectedGridRow()).getShipmentRow());
                
                // identify row to be added:
                int index = moGridAvailableRows.getTable().getSelectedRow();
                
                // add current row into selected rows:
                moGridSelectedRows.addGridRow(moGridAvailableRows.getSelectedGridRow());
                moGridSelectedRows.renderGridRows(); 
                //moGridSelectedRows.setSelectedGridRow(moGridSelectedRows.getModel().getRowCount() - 1);
                computeTotals();
                
                // remove current row from available rows:
                moGridAvailableRows.removeGridRow(index);
                moGridAvailableRows.renderGridRows();
                moGridAvailableRows.setSelectedGridRow(index < moGridAvailableRows.getModel().getRowCount() ? index : moGridAvailableRows.getModel().getRowCount() - 1);
            }
            catch(Exception e) {
                SLibUtils.showException(this, e);
            }
        }
    }
    
    private void actionPerformedRemoveRow() {        
        if (moGridSelectedRows.getSelectedGridRow() == null) {
            miClient.showMsgBoxWarning(SGridConsts.MSG_SELECT_ROW);
        } 
        else {            
            try{
                // identify row to be removed:
                int index = moGridSelectedRows.getTable().getSelectedRow();
                
                // check if row to be removed should be returned to available rows:
                if (mbRowsShown && SLibTimeUtils.isSameDate(((SRowShipmentRow) moGridSelectedRows.getSelectedGridRow()).getShipmentRow().getDeliveryDate(), moDateRows.getValue())) {
                    moGridAvailableRows.addGridRow(moGridSelectedRows.getSelectedGridRow());
                    moGridAvailableRows.renderGridRows();
                    //moGridAvailableRows.setSelectedGridRow(moGridAvailableRows.getModel().getRowCount() - 1);
                }
                
                moGridSelectedRows.removeGridRow(index);
                moGridSelectedRows.renderGridRows();
                moGridSelectedRows.setSelectedGridRow(index < moGridSelectedRows.getModel().getRowCount() ? index : moGridSelectedRows.getModel().getRowCount() - 1);
                computeTotals();
            }
            catch (Exception e) {
                SLibUtils.showException(this, e);
            }
        }
    }
    
    private void actionPerformedAddComment() {
        if (moKeyComment.getSelectedIndex() <= 0) {
            miClient.showMsgBoxWarning(SGuiConsts.ERR_MSG_FIELD_REQ + "'" + moKeyComment.getToolTipText() + "'.");
            moKeyComment.requestFocus();
        }
        else {
            jtaComments.append((jtaComments.getText().isEmpty() ? "" : "\n") + moKeyComment.getSelectedItem().getItem());
        }
    }      
    /*
     * Public methods
     */
    
    /*
     * Overriden methods
     */
    
    @Override
    public void addAllListeners() {
        jbShowRows.addActionListener(this);
        jbClearRows.addActionListener(this);
        jbRowAdd.addActionListener(this);
        jbRowRemove.addActionListener(this);
        jbAddComment.addActionListener(this);
    }

    @Override
    public void removeAllListeners() {
        jbShowRows.removeActionListener(this);
        jbClearRows.removeActionListener(this);
        jbRowAdd.removeActionListener(this);
        jbRowRemove.removeActionListener(this);
        jbAddComment.removeActionListener(this);
    }

    @Override
    public void reloadCatalogues() {
        miClient.getSession().populateCatalogue(moKeyShipmentType, SModConsts.SU_SHIPT_TP, SLibConsts.UNDEFINED, null);
        miClient.getSession().populateCatalogue(moKeyCargoType, SModConsts.SU_CARGO_TP, SLibConsts.UNDEFINED, null);
        miClient.getSession().populateCatalogue(moKeyHandlingType, SModConsts.SU_HANDG_TP, SLibConsts.UNDEFINED, null);
        miClient.getSession().populateCatalogue(moKeyShipper, SModConsts.SU_SHIPPER, SLibConsts.UNDEFINED, null);
        miClient.getSession().populateCatalogue(moKeyVehicleType, SModConsts.SU_VEHIC_TP, SLibConsts.UNDEFINED, null);
        miClient.getSession().populateCatalogue(moKeyComment, SModConsts.SU_COMMENT, SLibConsts.UNDEFINED, null);
    }

    @Override
    public void setRegistry(SDbRegistry registry) throws Exception {
        moRegistry = (SDbShipment) registry;
        
        mnFormResult = SLibConsts.UNDEFINED;
        mbFirstActivation = true;

        removeAllListeners();
        reloadCatalogues();
        
        if (moRegistry.isRegistryNew()) {
            moRegistry.setShiptmentDate(miClient.getSession().getCurrentDate());
            jtfRegistryKey.setText("");
        }
        else {
            jtfEstatus.setText(miClient.getSession().readField(SModConsts.SS_SHIPT_ST, new int[] {moRegistry.getFkShipmentStatusId()} , SDbRegistry.FIELD_NAME).toString());
            jtfEstatus.setCaretPosition(0);
            jtfRegistryKey.setText(SLibUtils.textKey(moRegistry.getPrimaryKey()));
        }
        
        jtfNumber.setText("" + moRegistry.getNumber());
        moDateDate.setValue(moRegistry.getShiptmentDate());
        moKeyShipmentType.setValue(new int[] { moRegistry.getFkShipmentTypeId()} );
        moKeyCargoType.setValue(new int[]{ moRegistry.getFkCargoTypeId() });
        moKeyHandlingType.setValue(new int[] { moRegistry.getFkHandlingTypeId() });
        moKeyShipper.setValue(new int[] { moRegistry.getFkShipperId() });
        moKeyVehicleType.setValue(new int[] { moRegistry.getFkVehicleTypeId() });
        moTextVehiclePlate.setValue(moRegistry.getVehiclePlate());
        moTextDriverName.setValue(moRegistry.getDriverName());
        moTextDriverPhone.setValue(moRegistry.getDriverPhone());
        jtaComments.setText(moRegistry.getComments());
        jtaComments.setCaretPosition(0);
        jtfTotalM2.setText(SLibUtils.getDecimalFormatQuantity().format(moRegistry.getMeters2()));
        jtfTotalM2.setCaretPosition(0);
        
        moGridAvailableRows.populateGrid(new Vector<>());
        moGridSelectedRows.populateGrid(new Vector<>());
        
        Vector<SGridRow> selectedRows = new Vector<>();
        for (SDbShipmentRow shipmentRow : moRegistry.getChildRows()) {
            selectedRows.add(new SRowShipmentRow(shipmentRow));
        }
        
        moGridSelectedRows.populateGrid(selectedRows);
        
        setFormEditable(true);
        
        if (moRegistry.getFkShipmentStatusId() != SModSysConsts.SS_SHIPT_ST_REL_TO) {
            jbSave.setEnabled(false);   // shipment can only be modified if its status is "to be released"
        }
        
        if (moRegistry.isRegistryNew()) {
            jbSave.setEnabled(true);
        }
        else {
        }
        
        moDateRows.setValue(miClient.getSession().getCurrentDate());
        actionPerformedClearRows();
        jckReleaseOnSave.setSelected(true);
        
        try {
            SDbConfigAvista configAvista = ((SDbConfig) miClient.getSession().getConfigSystem()).getRegConfigAvista();
            miConnectionAvista = SEtlProcess.createConnection(
                    SEtlConsts.DB_SQL_SERVER, 
                    configAvista.getAvistaHost(), 
                    configAvista.getAvistaPort(), 
                    configAvista.getAvistaName(), 
                    configAvista.getAvistaUser(), 
                    configAvista.getAvistaPassword());
        }
        catch (Exception e) {
            SLibUtils.showException(this, e);
        }
        
        addAllListeners();
    }

    @Override
    public SDbRegistry getRegistry() throws Exception {
        SDbShipment registry = moRegistry.clone();

        if (registry.isRegistryNew()) {}

        //registry.setNumber(...);
        registry.setShiptmentDate(moDateDate.getValue());
        registry.setDriverName(moTextDriverName.getText());
        registry.setDriverPhone(moTextDriverPhone.getText());
        registry.setVehiclePlate(moTextVehiclePlate.getText());
        //registry.setWebKey(...);
        registry.setMeters2(SLibUtils.parseDouble(jtfTotalM2.getText()));
        registry.setComments(jtaComments.getText());
        //registry.setAnnulled(...);
        //registry.setDeleted(...);
        //registry.setSystem(...);
        registry.setFkShipmentStatusId(jckReleaseOnSave.isSelected() ? SModSysConsts.SS_SHIPT_ST_REL : SModSysConsts.SS_SHIPT_ST_REL_TO);
        registry.setFkShipmentTypeId(moKeyShipmentType.getValue()[0]);
        registry.setFkCargoTypeId(moKeyCargoType.getValue()[0]);
        registry.setFkHandlingTypeId(moKeyHandlingType.getValue()[0]);
        registry.setFkVehicleTypeId(moKeyVehicleType.getValue()[0]);
        registry.setFkShipperId(moKeyShipper.getValue()[0]);
        
        registry.getChildRows().clear();
        for (int i = 0; i < moGridSelectedRows.getTable().getRowCount(); i++) {
            registry.getChildRows().add(((SRowShipmentRow) moGridSelectedRows.getGridRow(i)).getShipmentRow());
        }

        return registry;
    }

    @Override
    public SGuiValidation validateForm() {
        SGuiValidation validation = moFields.validateFields();
        
        return validation;
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        try {
            if (evt.getSource() instanceof JButton) {
                JButton button = (JButton) evt.getSource();

                if (button == jbShowRows) {
                    actionPerformedShowRows();
                }
                else if (button == jbClearRows) {
                    actionPerformedClearRows();
                }
                else if (button == jbRowAdd) {
                    actionPerformedAddRow();
                }
                else if (button == jbRowRemove) {
                    actionPerformedRemoveRow();
                }
                else if (button == jbAddComment) {
                    actionPerformedAddComment();
                }
            }
        } 
        catch(Exception e) {
            SLibUtils.showException(this, e);
        }
    }
}