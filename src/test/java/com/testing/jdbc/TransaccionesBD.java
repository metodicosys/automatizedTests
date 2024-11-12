/*
 * package com.testing.jdbc;
 * 
 * import java.sql.Connection; import java.sql.PreparedStatement; import
 * java.sql.ResultSet; import java.sql.SQLException;
 * 
 * import com.testing.base.ConexionBD;
 * 
 * public class TransaccionesBD {
 * 
 * PreparedStatement ps = null; Connection con; ResultSet rs; String query;
 * String formato;
 * 
 * public TransaccionesBD(String formato) { super(); this.formato = formato; }
 * 
 * public TransaccionesBD() { // TODO Auto-generated constructor stub }
 * 
 * public void asignarOrdenAFuncionario() { con = ConexionBD.conectar();
 * switch(formato) { case "DGM007": case "DGM070": case "DGM071": query =
 * "BEGIN\r\n" +
 * "   vcsrc.proceso_orden.asigna_usuario_extranet(numero_documento => 'EXTD0001', orden => 2018000282);\r\n"
 * + "   COMMIT;\r\n" + "END;"; break; default: query = "BEGIN\r\n" +
 * "   VCSRC.proceso_suce.asigna_usuario_extranet(numero_documento => 'EXTD0001', suce => 2018000045);\r\n"
 * + "   COMMIT;\r\n" + "END;"; break; }
 * 
 * try { ps = con.prepareStatement(query); ps.executeUpdate();
 * }catch(SQLException e) { e.printStackTrace(); }
 * 
 * }
 * 
 * public void buscarCPB(int nroOrden) { con = ConexionBD.conectar(); query =
 * "SELECT Z.CDA AS CPB,\r\n" + "  Z.MONTO,\r\n" + "  Z.TRANSMITIDO,\r\n" +
 * "  Z.FECHA_PAGO\r\n" + "  FROM VCOBJ.TASA Z\r\n" + "  WHERE Z.TASA_ID IN\r\n"
 * + "  (SELECT P.TASA_ID\r\n" + "  FROM VCOBJ.TASA_TRANSMISION p\r\n" +
 * "  WHERE P.VC_ID IN\r\n" + "     (SELECT MAX(t.vc_id)\r\n" +
 * "     FROM vcobj.transmision t\r\n" +
 * "     INNER JOIN vcobj.tce_transmision f\r\n" +
 * "     ON t.vc_id =f.vc_id\r\n" + "     INNER JOIN vcobj.tce g\r\n" +
 * "     ON f.tce_id=g.tce_id\r\n" +
 * "     WHERE --g.suce_id in (select k.suce_id from vcobj.suce k where  k.suce=2017003757               )))--or\r\n"
 * +
 * "       g.orden_id IN   (SELECT u.orden_id FROM vcobj.orden u WHERE u.orden = ? )))"
 * ;
 * 
 * try { ps = con.prepareStatement(query); ps.setInt(1, nroOrden); rs =
 * ps.executeQuery();
 * 
 * if(rs.next()) { int monto = rs.getInt(1); int cpb = rs.getInt(2); monto =
 * monto +cpb; } }catch(SQLException e) { e.printStackTrace(); } }
 * 
 * public void ejecutarPagoCPB() { con = ConexionBD.conectar(); query =
 * "DECLARE\r\n" + "    VSUCE       VCOBJ.SUCE.SUCE_ID%TYPE;\r\n" +
 * "    VVC_ID      VCOBJ.TRANSMISION.VC_ID%TYPE;\r\n" + "BEGIN\r\n" +
 * "   vcsrc.proceso_qa.PP_recepcion_pago_cda (cda              => '848186700244286100',\r\n"
 * + "                                          monto_pagado      => 315,\r\n" +
 * "                                          fecha_pago        => sysdate,\r\n"
 * + "                                          banco             => '001',\r\n"
 * + "                                          tipo_pago         => 1,\r\n" +
 * "                                          suce              => VSUCE,\r\n" +
 * "                                          vc_id             => VVC_ID);\r\n"
 * + "    dbms_output.put_line('VSUCE '||VSUCE);\r\n" +
 * "    dbms_output.put_line('VVC_ID '||VVC_ID);\r\n" + "    commit;\r\n" +
 * "END;";
 * 
 * try { ps = con.prepareStatement(query); ps.setInt(1, 1); ps.setInt(2, 1); rs
 * = ps.executeQuery();
 * 
 * 
 * }catch(SQLException e) { e.printStackTrace(); } }
 * 
 * public void indicarEstadoCPB() { con = ConexionBD.conectar(); query =
 * "SELECT * FROM VCOBJ.TASA WHERE CDA  IN ('848186700244286100')";
 * 
 * try { ps = con.prepareStatement(query); }catch(SQLException e) {
 * e.printStackTrace(); } } }
 */