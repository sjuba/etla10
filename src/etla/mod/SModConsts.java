/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package etla.mod;

import java.util.HashMap;

/**
 *
 * @author Sergio Flores
 */
public abstract class SModConsts {

    public static final int MOD_CFG = 110000;
    public static final int MOD_ETL = 210000;
    public static final int MOD_SMS = 220000;
    
    public static final int SR_SHIPT = 2240001;

    public static final int SU_SYS = 110001;
    public static final int SU_COM = 110002;
    
    public static final int CS_USR_TP = 111011;

    public static final int CU_USR = 112011;

    public static final int C_CFG = 113001;
    public static final int C_USR_GUI = 113101;

    public static final int AS_CUR = 211011;
    public static final int AS_UOM = 211021;
    public static final int AS_PAY_MET = 211111;

    public static final int AU_SAL_AGT = 212016;
    public static final int AU_CUS = 212021;
    public static final int AU_ITM = 212031;

    public static final int A_CFG = 213001;
    public static final int A_INV = 213051;
    public static final int A_INV_ROW = 213056;
    public static final int A_EXR = 213061;
    public static final int A_ETL_LOG = 213501;
    
    public static final int AX_ETL = 215001;
    
    public static final int SS_SHIPT_ST = 221011;
    public static final int SS_WEB_ROLE = 221101;
    public static final int SS_WM_TICKET_TP = 221211;
    public static final int SS_WM_LINK_ST = 221221;
    
    public static final int SU_SHIPT_TP = 222011;
    public static final int SU_CARGO_TP = 222012;
    public static final int SU_HANDG_TP = 222021;
    public static final int SU_VEHIC_TP = 222031;
    public static final int SU_COMMENT = 222041;
    public static final int SU_SHIPPER = 222051;
    public static final int SU_DESTIN = 222061;
    public static final int SU_WM_ITEM = 222201;
    
    public static final int S_CFG = 223001;
    public static final int S_SHIPT = 223011;
    public static final int S_SHIPT_ROW = 223016;
    public static final int S_EVIDENCE = 223021;
    public static final int S_ERP_DOC = 223201;
    public static final int SU_WM_TICKET = 223211;
    public static final int SU_WM_TICKET_LINK = 223221;

    public static final HashMap<Integer, String> TablesMap = new HashMap<>();

    static {
        TablesMap.put(SU_SYS, "su_sys");
        TablesMap.put(SU_COM, "su_com");

        TablesMap.put(CS_USR_TP, "cs_usr_tp");

        TablesMap.put(CU_USR, "cu_usr");

        TablesMap.put(C_CFG, "c_cfg");
        TablesMap.put(C_USR_GUI, "c_usr_gui");

        TablesMap.put(AS_CUR, "as_cur");
        TablesMap.put(AS_UOM, "as_uom");
        TablesMap.put(AS_PAY_MET, "as_pay_met");

        TablesMap.put(AU_SAL_AGT, "au_sal_agt");
        TablesMap.put(AU_CUS, "au_cus");
        TablesMap.put(AU_ITM, "au_itm");

        TablesMap.put(A_CFG, "a_cfg");
        TablesMap.put(A_INV, "a_inv");
        TablesMap.put(A_INV_ROW, "a_inv_row");
        TablesMap.put(A_EXR, "a_exr");
        TablesMap.put(A_ETL_LOG, "a_etl_log");
        
        TablesMap.put(SS_SHIPT_ST, "ss_shipt_st");
        TablesMap.put(SS_WEB_ROLE, "ss_web_role");
        TablesMap.put(SS_WM_TICKET_TP, "ss_wm_ticket_tp");
        TablesMap.put(SS_WM_LINK_ST, "ss_wm_link_st");

        TablesMap.put(SU_SHIPT_TP, "su_shipt_tp");
        TablesMap.put(SU_CARGO_TP, "su_cargo_tp");
        TablesMap.put(SU_HANDG_TP, "su_handg_tp");
        TablesMap.put(SU_VEHIC_TP, "su_vehic_tp");
        TablesMap.put(SU_COMMENT, "su_comment");
        TablesMap.put(SU_SHIPPER, "su_shipper");
        TablesMap.put(SU_DESTIN, "su_destin");
        TablesMap.put(SU_WM_ITEM, "su_wm_item");

        TablesMap.put(S_CFG, "s_cfg");
        TablesMap.put(S_SHIPT, "s_shipt");
        TablesMap.put(S_SHIPT_ROW, "s_shipt_row");
        TablesMap.put(S_EVIDENCE, "s_evidence");
        TablesMap.put(S_ERP_DOC, "s_erp_doc");
        TablesMap.put(SU_WM_TICKET, "su_wm_ticket");
        TablesMap.put(SU_WM_TICKET_LINK, "su_wm_ticket_link");
    }
}
