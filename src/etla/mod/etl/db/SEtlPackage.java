/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etla.mod.etl.db;

import java.sql.Connection;
import java.util.Date;

/**
 *
 * @author Sergio Flores
 */
public class SEtlPackage {

    SDbEtlLog EtlLog;
    Connection ConnectionSiie;
    Connection ConnectionAvista;
    Date PeriodStart;
    Date PeriodEnd;
    Date Issue;
    
    public SEtlPackage() {
        EtlLog = null;
        ConnectionSiie = null;
        ConnectionAvista = null;
        PeriodStart = null;
        PeriodEnd = null;
        Issue = null;
    }
}
