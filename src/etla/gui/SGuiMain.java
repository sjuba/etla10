package etla.gui;

import etla.mod.SModConsts;
import etla.mod.SModModuleCfg;
import etla.mod.SModModuleEtl;
import etla.mod.SModUtils;
import etla.mod.cfg.db.SDbConfig;
import etla.mod.cfg.db.SDbUser;
import etla.mod.cfg.db.SDbUserGui;
import etla.mod.etl.form.SDialogEtl;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import sa.gui.util.SUtilConfigXml;
import sa.gui.util.SUtilConsts;
import sa.gui.util.SUtilLoginDlg;
import sa.gui.util.SUtilPasswordDlg;
import sa.lib.SLibConsts;
import sa.lib.SLibUtils;
import sa.lib.db.SDbConsts;
import sa.lib.db.SDbDatabase;
import sa.lib.db.SDbDatabaseMonitor;
import sa.lib.grid.SGridPaneView;
import sa.lib.gui.SGuiClient;
import sa.lib.gui.SGuiConsts;
import sa.lib.gui.SGuiDatePicker;
import sa.lib.gui.SGuiDateRangePicker;
import sa.lib.gui.SGuiSession;
import sa.lib.gui.SGuiSessionCustom;
import sa.lib.gui.SGuiUserGui;
import sa.lib.gui.SGuiUtils;
import sa.lib.gui.SGuiYearMonthPicker;
import sa.lib.gui.SGuiYearPicker;
import sa.lib.gui.bean.SBeanDialogReport;
import sa.lib.gui.bean.SBeanForm;
import sa.lib.gui.bean.SBeanFormDialog;
import sa.lib.gui.bean.SBeanFormProcess;
import sa.lib.gui.bean.SBeanOptionPicker;
import sa.lib.img.DImgConsts;
import sa.lib.xml.SXmlUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergio Flores
 */
public class SGuiMain extends JFrame implements SGuiClient, ActionListener {

    public static final String APP_NAME = "SIIE ETL Avista 1.0";
    public static final String APP_RELEASE = "SIIE ETL Avista 1.0 002.07";
    public static final String APP_COPYRIGHT = "© Software Aplicado SA de CV. Todos los derechos reservados.";
    public static final String APP_PROVIDER = "www.swaplicado.com.mx";
    
    private int mnTerminal;
    private boolean mbFirstActivation;
    private boolean mbLoggedIn;
    private SGuiSession moSession;
    private SUtilConfigXml moConfigXml;
    private SDbDatabase moSysDatabase;
    private SDbDatabaseMonitor moSysDatabaseMonitor;
    private Statement miSysStatement;
    private String msCompany;

    private SGuiDatePicker moDatePicker;
    private SGuiDateRangePicker moDateRangePicker;
    private SGuiYearPicker moYearPicker;
    private SGuiYearMonthPicker moYearMonthPicker;
    private JFileChooser moFileChooser;
    private ImageIcon moIcon;
    private ImageIcon moIconCloseActive;
    private ImageIcon moIconCloseInactive;
    private ImageIcon moIconCloseBright;
    private ImageIcon moIconCloseDark;
    
    /**
     * Creates new form SMainForm
     */
    public SGuiMain() {
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

        jTabbedPane = new javax.swing.JTabbedPane();
        jPanelStatus = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jtfSystemDate = new javax.swing.JTextField();
        jtfWorkingDate = new javax.swing.JTextField();
        jbWorkingDate = new javax.swing.JButton();
        jtfUser = new javax.swing.JTextField();
        jtfUserTs = new javax.swing.JTextField();
        jlAppRelease = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlAppLogo = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jmFile = new javax.swing.JMenu();
        jmiFileWorkingDate = new javax.swing.JMenuItem();
        jmiFileUserPassword = new javax.swing.JMenuItem();
        jsFile1 = new javax.swing.JPopupMenu.Separator();
        jmiFileCloseViewsAll = new javax.swing.JMenuItem();
        jmiFileCloseViewsOther = new javax.swing.JMenuItem();
        jsFile2 = new javax.swing.JPopupMenu.Separator();
        jmiFileCloseSession = new javax.swing.JMenuItem();
        jsFile3 = new javax.swing.JPopupMenu.Separator();
        jmiFileExit = new javax.swing.JMenuItem();
        jmCfg = new javax.swing.JMenu();
        jmiCfgUser = new javax.swing.JMenuItem();
        jmEtl = new javax.swing.JMenu();
        jmiEtlExchangeRate = new javax.swing.JMenuItem();
        jmiEtlEtl = new javax.swing.JMenuItem();
        jsEtl1 = new javax.swing.JPopupMenu.Separator();
        jmiEtlInvoice = new javax.swing.JMenuItem();
        jsEtl2 = new javax.swing.JPopupMenu.Separator();
        jmiEtlItem = new javax.swing.JMenuItem();
        jmiEtlCustomer = new javax.swing.JMenuItem();
        jmiEtlSalesAgent = new javax.swing.JMenuItem();
        jmHelp = new javax.swing.JMenu();
        jmiHelpHelp = new javax.swing.JMenuItem();
        jsHelp1 = new javax.swing.JPopupMenu.Separator();
        jmiHelpAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().add(jTabbedPane, java.awt.BorderLayout.CENTER);

        jPanelStatus.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(java.awt.Color.black);
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 2));

        jtfSystemDate.setEditable(false);
        jtfSystemDate.setForeground(java.awt.Color.white);
        jtfSystemDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfSystemDate.setText("00/00/0000");
        jtfSystemDate.setToolTipText("Fecha de sistema");
        jtfSystemDate.setFocusable(false);
        jtfSystemDate.setOpaque(false);
        jtfSystemDate.setPreferredSize(new java.awt.Dimension(65, 20));
        jPanel1.add(jtfSystemDate);

        jtfWorkingDate.setEditable(false);
        jtfWorkingDate.setForeground(java.awt.Color.white);
        jtfWorkingDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfWorkingDate.setText("00/00/0000");
        jtfWorkingDate.setToolTipText("Fecha de trabajo");
        jtfWorkingDate.setFocusable(false);
        jtfWorkingDate.setOpaque(false);
        jtfWorkingDate.setPreferredSize(new java.awt.Dimension(65, 20));
        jPanel1.add(jtfWorkingDate);

        jbWorkingDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/etla/gui/img/gui_date.gif"))); // NOI18N
        jbWorkingDate.setToolTipText("Cambiar fecha de trabajo");
        jbWorkingDate.setContentAreaFilled(false);
        jbWorkingDate.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel1.add(jbWorkingDate);

        jtfUser.setEditable(false);
        jtfUser.setForeground(java.awt.Color.white);
        jtfUser.setText("TEXT");
        jtfUser.setToolTipText("Usuario");
        jtfUser.setFocusable(false);
        jtfUser.setOpaque(false);
        jtfUser.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(jtfUser);

        jtfUserTs.setEditable(false);
        jtfUserTs.setForeground(java.awt.Color.white);
        jtfUserTs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfUserTs.setText("00/00/0000 00.00.00 +0000");
        jtfUserTs.setToolTipText("Marca de tiempo de acceso");
        jtfUserTs.setFocusable(false);
        jtfUserTs.setOpaque(false);
        jtfUserTs.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel1.add(jtfUserTs);

        jlAppRelease.setForeground(new java.awt.Color(0, 153, 153));
        jlAppRelease.setText("RELEASE");
        jlAppRelease.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel1.add(jlAppRelease);

        jPanelStatus.add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel2.setBackground(java.awt.Color.black);
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 2));

        jlAppLogo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlAppLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/etla/gui/img/swap_logo_9.jpg"))); // NOI18N
        jlAppLogo.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel2.add(jlAppLogo);

        jPanelStatus.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanelStatus, java.awt.BorderLayout.SOUTH);

        jmFile.setText("Archivo");

        jmiFileWorkingDate.setText("Cambiar fecha de trabajo...");
        jmFile.add(jmiFileWorkingDate);

        jmiFileUserPassword.setText("Cambiar contraseña...");
        jmFile.add(jmiFileUserPassword);
        jmFile.add(jsFile1);

        jmiFileCloseViewsAll.setText("Cerrar todas las vistas");
        jmFile.add(jmiFileCloseViewsAll);

        jmiFileCloseViewsOther.setText("Cerrar las otras vistas");
        jmFile.add(jmiFileCloseViewsOther);
        jmFile.add(jsFile2);

        jmiFileCloseSession.setText("Cerrar sesión de usuario");
        jmFile.add(jmiFileCloseSession);
        jmFile.add(jsFile3);

        jmiFileExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jmiFileExit.setText("Salir");
        jmFile.add(jmiFileExit);

        jMenuBar.add(jmFile);

        jmCfg.setText("Configuración");

        jmiCfgUser.setText("Usuarios");
        jmCfg.add(jmiCfgUser);

        jMenuBar.add(jmCfg);

        jmEtl.setText("Exportación");

        jmiEtlExchangeRate.setText("Tipos de cambio");
        jmEtl.add(jmiEtlExchangeRate);

        jmiEtlEtl.setText("Exportación a SIIE...");
        jmEtl.add(jmiEtlEtl);
        jmEtl.add(jsEtl1);

        jmiEtlInvoice.setText("Facturas");
        jmEtl.add(jmiEtlInvoice);
        jmEtl.add(jsEtl2);

        jmiEtlItem.setText("Ítems");
        jmEtl.add(jmiEtlItem);

        jmiEtlCustomer.setText("Clientes");
        jmEtl.add(jmiEtlCustomer);

        jmiEtlSalesAgent.setText("Agentes ventas");
        jmEtl.add(jmiEtlSalesAgent);

        jMenuBar.add(jmEtl);

        jmHelp.setText("Ayuda");

        jmiHelpHelp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jmiHelpHelp.setText("Ayuda");
        jmiHelpHelp.setEnabled(false);
        jmHelp.add(jmiHelpHelp);
        jmHelp.add(jsHelp1);

        jmiHelpAbout.setText("Acerca de...");
        jmHelp.add(jmiHelpAbout);

        jMenuBar.add(jmHelp);

        setJMenuBar(jMenuBar);

        setBounds(0, 0, 1016, 639);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        windowActivated();
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        windowClosing();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        boolean lookAndfeelSet = false;
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc="Look and feel setting code (optional)">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            /*
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                System.out.println(info.getName());
            }
            
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                //if ("Metal".equals(info.getName())) {
                if ("Nimbus".equals(info.getName())) {
                //if ("CDE/Motif".equals(info.getName())) {
                //if ("Windows".equals(info.getName())) {
                //if ("Windows Classic".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    lookAndfeelSet = true;
                    break;
                }
            }
            */
            if (!lookAndfeelSet) {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            }
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SGuiMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SGuiMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SGuiMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SGuiMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SGuiMain().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelStatus;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JButton jbWorkingDate;
    private javax.swing.JLabel jlAppLogo;
    private javax.swing.JLabel jlAppRelease;
    private javax.swing.JMenu jmCfg;
    private javax.swing.JMenu jmEtl;
    private javax.swing.JMenu jmFile;
    private javax.swing.JMenu jmHelp;
    private javax.swing.JMenuItem jmiCfgUser;
    private javax.swing.JMenuItem jmiEtlCustomer;
    private javax.swing.JMenuItem jmiEtlEtl;
    private javax.swing.JMenuItem jmiEtlExchangeRate;
    private javax.swing.JMenuItem jmiEtlInvoice;
    private javax.swing.JMenuItem jmiEtlItem;
    private javax.swing.JMenuItem jmiEtlSalesAgent;
    private javax.swing.JMenuItem jmiFileCloseSession;
    private javax.swing.JMenuItem jmiFileCloseViewsAll;
    private javax.swing.JMenuItem jmiFileCloseViewsOther;
    private javax.swing.JMenuItem jmiFileExit;
    private javax.swing.JMenuItem jmiFileUserPassword;
    private javax.swing.JMenuItem jmiFileWorkingDate;
    private javax.swing.JMenuItem jmiHelpAbout;
    private javax.swing.JMenuItem jmiHelpHelp;
    private javax.swing.JPopupMenu.Separator jsEtl1;
    private javax.swing.JPopupMenu.Separator jsEtl2;
    private javax.swing.JPopupMenu.Separator jsFile1;
    private javax.swing.JPopupMenu.Separator jsFile2;
    private javax.swing.JPopupMenu.Separator jsFile3;
    private javax.swing.JPopupMenu.Separator jsHelp1;
    private javax.swing.JTextField jtfSystemDate;
    private javax.swing.JTextField jtfUser;
    private javax.swing.JTextField jtfUserTs;
    private javax.swing.JTextField jtfWorkingDate;
    // End of variables declaration//GEN-END:variables

    private void initComponentsCustom() {
        int result = SLibConsts.UNDEFINED;
        String xml = "";
        TimeZone zone = null;

        mbFirstActivation = true;

        setExtendedState(Frame.MAXIMIZED_BOTH);

        SBeanForm.OwnerFrame = this;
        SBeanFormDialog.OwnerFrame = this;
        SBeanFormProcess.OwnerFrame = this;
        SBeanOptionPicker.OwnerFrame = this;
        SBeanDialogReport.OwnerFrame = this;

        logout();

        try {
            xml = SXmlUtils.readXml(SUtilConsts.FILE_NAME_CFG);
            moConfigXml = new SUtilConfigXml();
            moConfigXml.processXml(xml);

            zone = SLibUtils.createTimeZone(TimeZone.getDefault(), TimeZone.getTimeZone((String) moConfigXml.getAttribute(SUtilConfigXml.ATT_TIME_ZONE).getValue()));
            SLibUtils.restoreDateFormats(zone);
            TimeZone.setDefault(zone);

            moSysDatabase = new SDbDatabase(SDbConsts.DBMS_MYSQL);
            result = moSysDatabase.connect(
                    (String) moConfigXml.getAttribute(SUtilConfigXml.ATT_DB_HOST).getValue(),
                    (String) moConfigXml.getAttribute(SUtilConfigXml.ATT_DB_PORT).getValue(),
                    (String) moConfigXml.getAttribute(SUtilConfigXml.ATT_DB_NAME).getValue(),
                    (String) moConfigXml.getAttribute(SUtilConfigXml.ATT_USR_NAME).getValue(),
                    (String) moConfigXml.getAttribute(SUtilConfigXml.ATT_USR_PSWD).getValue());

            if (result != SDbConsts.CONNECTION_OK) {
                throw new Exception(SDbConsts.ERR_MSG_DB_CONNECTION);
            }
            else {
                moSysDatabaseMonitor = new SDbDatabaseMonitor(moSysDatabase);
                moSysDatabaseMonitor.startThread();

                miSysStatement = moSysDatabase.getConnection().createStatement();
            }

            mnTerminal = SLibUtils.parseInt((String) moConfigXml.getAttribute(SUtilConfigXml.ATT_TERMINAL).getValue());

            moDatePicker = new SGuiDatePicker(this, SGuiConsts.DATE_PICKER_DATE);
            moDateRangePicker = new SGuiDateRangePicker(this);
            moYearPicker = new SGuiYearPicker(this);
            moYearMonthPicker = new SGuiYearMonthPicker(this);
            moFileChooser = new JFileChooser();
            moIcon = new ImageIcon(getClass().getResource("/etla/gui/img/swap_icon.png"));
            moIconCloseActive = new ImageIcon(getClass().getResource("/sa/lib/img/gui_close.png"));
            moIconCloseInactive = new ImageIcon(getClass().getResource("/sa/lib/img/gui_close_ina.png"));
            moIconCloseBright = new ImageIcon(getClass().getResource("/sa/lib/img/gui_close_bri.png"));
            moIconCloseDark = new ImageIcon(getClass().getResource("/sa/lib/img/gui_close_dar.png"));

            setIconImage(moIcon.getImage());
            jlAppRelease.setText(APP_RELEASE);
            jlAppLogo.setToolTipText(APP_COPYRIGHT);
        }
        catch (Exception e) {
            SLibUtils.showException(this, e);
            actionFileExit();
        }

        jbWorkingDate.addActionListener(this);

        jmiFileWorkingDate.addActionListener(this);
        jmiFileUserPassword.addActionListener(this);
        jmiFileCloseViewsAll.addActionListener(this);
        jmiFileCloseViewsOther.addActionListener(this);
        jmiFileCloseSession.addActionListener(this);
        jmiFileExit.addActionListener(this);
        
        jmiCfgUser.addActionListener(this);
        
        jmiEtlExchangeRate.addActionListener(this);
        jmiEtlEtl.addActionListener(this);
        jmiEtlInvoice.addActionListener(this);
        jmiEtlItem.addActionListener(this);
        jmiEtlCustomer.addActionListener(this);
        jmiEtlSalesAgent.addActionListener(this);
        
        jmiHelpHelp.addActionListener(this);
        jmiHelpAbout.addActionListener(this);
    }

    private void windowActivated() {
        if (mbFirstActivation){
            mbFirstActivation = false;
            login();
        }
    }

    private void windowClosing() {
        if (mbLoggedIn) {
            logout();
        }
    }

    private void renderMenues(JMenu[] menues) {
        
    }

    private void renderClientSession(SGuiSessionCustom clientSession) {

    }

    private void logout() {
        renderMenues(null);
        actionFileCloseViewAll();

        mbLoggedIn = false;
        moSession = null;

        msCompany = "";
        setTitle(APP_NAME);

        jtfUserTs.setText("");
        jtfSystemDate.setText("");
        jtfUser.setText("");
        jtfWorkingDate.setText("");
        renderClientSession(null);

        jmFile.setEnabled(false);
        jmCfg.setEnabled(false);
        jmEtl.setEnabled(false);
        jmHelp.setEnabled(false);
        jmiCfgUser.setEnabled(false);
        jmiFileWorkingDate.setEnabled(false);
        jbWorkingDate.setEnabled(false);
    }

    private void login() {
        String sql = "";
        ResultSet resultSet;
        Date date;
        SDbUser user;
        SDbConfig config = null;
        SUtilLoginDlg loginDlg = new SUtilLoginDlg(this, "id_com", "com", false);

        loginDlg.setVisible(true);

        if (loginDlg.getFormResult() != SGuiConsts.FORM_RESULT_OK) {
            actionFileExit();
        }
        else {
            try {
                SGuiUtils.setCursorWait(this);

                // Get system date:

                sql = "SELECT NOW() ";
                resultSet = miSysStatement.executeQuery(sql);
                if (!resultSet.next()) {
                    throw new Exception (SUtilConsts.ERR_MSG_SYS_DATE);
                }
                else {
                    date = resultSet.getTimestamp(1);
                }

                mbLoggedIn = true;
                moSession = new SGuiSession(this);
                moSession.setSystemDate(date);
                moSession.setCurrentDate(date);
                moSession.setUserTs(date);
                moSession.setDatabase(loginDlg.getDatabase());
                
                sql = "SET GLOBAL max_allowed_packet = 1024 * 1024 * 16 ";  // 16 MB
                moSession.getStatement().execute(sql);

                user = new SDbUser();
                user.read(moSession, loginDlg.getUserKey());

                config = new SDbConfig();
                config.read(moSession, new int[] { SUtilConsts.BPR_CO_ID });

                moSession.setConfigSystem(config);
                moSession.setConfigCompany(null);
                moSession.setConfigBranch(null);
                moSession.setUser(user);
                moSession.setModuleUtils(new SModUtils());
                moSession.getModules().add(new SModModuleCfg(this));
                moSession.getModules().add(new SModModuleEtl(this));

                //user.computeAccess(moSession);    // not implemented yet!
                moSession.setSessionCustom(user.createSessionCustom(this, mnTerminal));

                msCompany = loginDlg.getCompany();
                setTitle(APP_NAME + " - " + msCompany);

                jtfSystemDate.setText(SLibUtils.DateFormatDate.format(moSession.getSystemDate()));
                jtfWorkingDate.setText(SLibUtils.DateFormatDate.format(moSession.getCurrentDate()));
                jtfUser.setText(user.getName());
                jtfUserTs.setText(SLibUtils.DateFormatDatetimeTimeZone.format(moSession.getUserTs()));

                jmFile.setEnabled(true);
                jmCfg.setEnabled(user.isAdministrator());
                jmEtl.setEnabled(true);
                jmHelp.setEnabled(true);
                jmiCfgUser.setEnabled(user.isSupervisor());
                jmiFileWorkingDate.setEnabled(true);
                jbWorkingDate.setEnabled(jmiFileWorkingDate.isEnabled());

                //renderClientSession((SGuiMainSessionCustom) moSession.getSessionCustom());
                if (!user.isSupervisor()) {
                    /*
                    moSession.showView(SModConsts.PX_WRK, SLibConsts.UNDEFINED, null);
                    moSession.showView(SModConsts.P_TSK, SModSysConsts.CS_ST_PND, null);
                    moSession.showView(SModConsts.P_TSK, SModSysConsts.CS_ST_PRC, null);
                    jTabbedPane.setSelectedIndex(0);
                    */
                }

                SGuiUtils.setCursorDefault(this);
            }
            catch(SQLException e) {
                SGuiUtils.setCursorDefault(this);
                SLibUtils.showException(this, e);
                actionFileExit();
            }
            catch(Exception e) {
                SGuiUtils.setCursorDefault(this);
                SLibUtils.showException(this, e);
                actionFileExit();
            }
        }
    }

    public void actionToggleViewModule(int type, int subtype) {
        renderMenues(moSession.getModule(type, subtype).getMenus());
    }

    public void actionFileWorkingDate() {
        moDatePicker.resetPicker();
        moDatePicker.setOption(moSession.getCurrentDate());
        moDatePicker.setVisible(true);

        if (moDatePicker.getPickerResult() == SGuiConsts.FORM_RESULT_OK) {
            moSession.setCurrentDate(moDatePicker.getOption());
            jtfWorkingDate.setText(SLibUtils.DateFormatDate.format(moSession.getCurrentDate()));
        }
    }

    public void actionFileUserPassword() {
        new SUtilPasswordDlg(this).setVisible(true);
    }

    public void actionFileCloseViewAll() {
        try {
            SGuiUtils.setCursorWait(this);

            for (int i = 0; i < jTabbedPane.getTabCount(); i++) {
                ((SGridPaneView) jTabbedPane.getComponentAt(i)).paneViewClosed();
            }

            jTabbedPane.removeAll();
        }
        catch(Exception e) {
            SLibUtils.showException(this, e);
        }
        finally {
            SGuiUtils.setCursorDefault(this);
        }
    }

    public void actionFileCloseViewOther() {
        int i = 0;
        int index = jTabbedPane.getSelectedIndex();

        try {
            SGuiUtils.setCursorWait(this);

            for (i = jTabbedPane.getTabCount() - 1; i > index; i--) {
                ((SGridPaneView) jTabbedPane.getComponentAt(i)).paneViewClosed();  // this preserves view user settings
                jTabbedPane.removeTabAt(i);
            }

            for (i = 0; i < index; i++) {
                ((SGridPaneView) jTabbedPane.getComponentAt(0)).paneViewClosed();  // this preserves view user settings
                jTabbedPane.removeTabAt(0);
            }
        }
        catch (Exception e) {
            SLibUtils.showException(this, e);
        }
        finally {
            SGuiUtils.setCursorDefault(this);
        }
    }

    public void actionFileCloseSession() {
        logout();
        login();
    }

    private void actionFileExit() {
        logout();
        System.exit(0);
    }

    private void actionEtlEtl() {
        SDialogEtl dialog = new SDialogEtl(this, "Exportación a SIIE");
        dialog.initForm();
        dialog.setVisible(true);
    }

    public void actionHelpHelp() {

    }

    public void actionHelpAbout() {
        new SDlgHelpAbout(this).setVisible(true);
    }
    
    @Override
    public JFrame getFrame() {
        return this;
    }

    @Override
    public JTabbedPane getTabbedPane() {
        return jTabbedPane;
    }

    @Override
    public SGuiSession getSession() {
        return moSession;
    }

    @Override
    public SDbDatabase getSysDatabase() {
        return moSysDatabase;
    }

    @Override
    public Statement getSysStatement() {
        return miSysStatement;
    }

    @Override
    public SGuiDatePicker getDatePicker() {
        return moDatePicker;
    }

    @Override
    public SGuiDateRangePicker getDateRangePicker() {
        return moDateRangePicker;
    }

    @Override
    public SGuiYearPicker getYearPicker() {
        return moYearPicker;
    }

    @Override
    public SGuiYearMonthPicker getYearMonthPicker() {
        return moYearMonthPicker;
    }

    @Override
    public JFileChooser getFileChooser() {
        return moFileChooser;
    }

    @Override
    public ImageIcon getImageIcon(int icon) {
        ImageIcon imageIcon = null;

        switch(icon) {
            case DImgConsts.ICO_GUI_CLOSE:
                imageIcon = moIconCloseActive;
                break;
            case DImgConsts.ICO_GUI_CLOSE_INA:
                imageIcon = moIconCloseInactive;
                break;
            case DImgConsts.ICO_GUI_CLOSE_BRI:
                imageIcon = moIconCloseBright;
                break;
            case DImgConsts.ICO_GUI_CLOSE_DAR:
                imageIcon = moIconCloseDark;
                break;
            default:
                showMsgBoxError(SLibConsts.ERR_MSG_OPTION_UNKNOWN);
        }

        return imageIcon;
    }

    @Override
    public SGuiUserGui readUserGui(int[] key) {
        SDbUserGui userGui = new SDbUserGui();

        try {
            userGui.read(moSession, key);
        }
        catch (SQLException e) {
            userGui = null;
            SLibUtils.printException(this, e);
        }
        catch (Exception e) {
            userGui = null;
            SLibUtils.printException(this, e);
        }

        return userGui;
    }

    @Override
    public SGuiUserGui saveUserGui(int[] key, String gui) {
        SDbUserGui userGui = (SDbUserGui) readUserGui(key);

        if (userGui == null) {
            userGui = new SDbUserGui();
            userGui.setPrimaryKey(key);
        }

        try {
            userGui.setGui(gui);
            userGui.save(moSession);
        }
        catch (SQLException e) {
            userGui = null;
            SLibUtils.printException(this, e);
        }
        catch (Exception e) {
            userGui = null;
            SLibUtils.printException(this, e);
        }

        return userGui;
    }

    @Override
    public HashMap<String, Object> createReportParams() {
        HashMap<String, Object> params = new HashMap<String, Object>();

        params.put("sAppName", APP_NAME);
        params.put("sAppRelease", APP_RELEASE);
        params.put("sAppCopyright", APP_COPYRIGHT);
        params.put("sAppProvider", APP_PROVIDER);
        params.put("sCompany", msCompany);
        params.put("sUser", moSession.getUser().getName());
        params.put("oFormatDate", SLibUtils.DateFormatDate);
        params.put("oFormatDatetime", SLibUtils.DateFormatDatetime);

        return params;
    }

    @Override
    public String getTableCompany() {
        return SModConsts.TablesMap.get(SModConsts.SU_COM);
    }

    @Override
    public String getTableUser() {
        return SModConsts.TablesMap.get(SModConsts.CU_USR);
    }

    @Override
    public String getAppName() {
        return APP_NAME;
    }

    @Override
    public String getAppRelease() {
        return APP_RELEASE;
    }

    @Override
    public String getAppCopyright() {
        return APP_COPYRIGHT;
    }

    @Override
    public String getAppProvider() {
        return APP_PROVIDER;
    }

    @Override
    public void showMsgBoxError(String msg) {
        JOptionPane.showMessageDialog(this, msg, SGuiConsts.MSG_BOX_ERROR, JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public void showMsgBoxWarning(String msg) {
        JOptionPane.showMessageDialog(this, msg, SGuiConsts.MSG_BOX_WARNING, JOptionPane.WARNING_MESSAGE);
    }

    @Override
    public void showMsgBoxInformation(String msg) {
        JOptionPane.showMessageDialog(this, msg, SGuiConsts.MSG_BOX_INFORMATION, JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public int showMsgBoxConfirm(String msg) {
        return JOptionPane.showConfirmDialog(this, msg, SGuiConsts.MSG_BOX_CONFIRM, JOptionPane.YES_NO_OPTION);
    }

    @Override
    public void finalize() throws Throwable {
        super.finalize();

        if (moSysDatabaseMonitor != null && moSysDatabaseMonitor.isAlive()) {
            moSysDatabaseMonitor.stopThread();
        }

        System.out.println(this.getClass().getName() + ".finalize() called!");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();

            if (button == jbWorkingDate) {
                actionFileWorkingDate();
            }
        }
        else if (e.getSource() instanceof JMenuItem) {
            JMenuItem menuItem = (JMenuItem) e.getSource();

            if (menuItem == jmiFileWorkingDate) {
                actionFileWorkingDate();
            }
            else if (menuItem == jmiFileUserPassword) {
                actionFileUserPassword();
            }
            else if (menuItem == jmiFileCloseViewsAll) {
                actionFileCloseViewAll();
            }
            else if (menuItem == jmiFileCloseViewsOther) {
                actionFileCloseViewOther();
            }
            else if (menuItem == jmiFileCloseSession) {
                actionFileCloseSession();
            }
            else if (menuItem == jmiFileExit) {
                actionFileExit();
            }
            else if (menuItem == jmiCfgUser) {
                moSession.showView(SModConsts.CU_USR, SLibConsts.UNDEFINED, null);
            }
            else if (menuItem == jmiEtlExchangeRate) {
                moSession.showView(SModConsts.A_EXR, SLibConsts.UNDEFINED, null);
            }
            else if (menuItem == jmiEtlEtl) {
                actionEtlEtl();
            }
            else if (menuItem == jmiEtlInvoice) {
                moSession.showView(SModConsts.A_INV, SLibConsts.UNDEFINED, null);
            }
            else if (menuItem == jmiEtlItem) {
                moSession.showView(SModConsts.AU_ITM, SLibConsts.UNDEFINED, null);
            }
            else if (menuItem == jmiEtlCustomer) {
                moSession.showView(SModConsts.AU_CUS, SLibConsts.UNDEFINED, null);
            }
            else if (menuItem == jmiEtlSalesAgent) {
                moSession.showView(SModConsts.AU_SAL_AGT, SLibConsts.UNDEFINED, null);
            }
            else if (menuItem == jmiHelpHelp) {
                actionHelpHelp();
            }
            else if (menuItem == jmiHelpAbout) {
                actionHelpAbout();
            }
        }
    }

    @Override
    public void computeSessionSettings() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void preserveSessionSettings() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
