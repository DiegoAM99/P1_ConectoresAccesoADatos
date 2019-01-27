/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_conectores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego Álvarez
 */
public class Conectores extends javax.swing.JFrame {
    GestorConexion gc = new GestorConexion();
    PoolConexiones pc = new PoolConexiones();
    /**
     * Creates new form Conectores
     */
    
    public void limpiar_Album(){
        jTextFieldID.setText("");
        jTextFieldAutor.setText("");
        jTextFieldAnnoPublicacion.setText("");
    }
    public void limpiar_Cancion(){
        jTextFieldTitulo.setText("");
        jTextFieldDuracion.setText("");
        jTextFieldLetras.setText("");
        jTextFieldID_album.setText("");
    }
    public Conectores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMostrarAlbum = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jMostrarCanciones = new javax.swing.JButton();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldAutor = new javax.swing.JTextField();
        jTextFieldAnnoPublicacion = new javax.swing.JTextField();
        jButtonAnnadirAlbum = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jTextFieldDuracion = new javax.swing.JTextField();
        jTextFieldLetras = new javax.swing.JTextField();
        jButtonAnnadirCancion = new javax.swing.JButton();
        jButtonModificarAlbum = new javax.swing.JButton();
        jButtonModificarCancion = new javax.swing.JButton();
        jTextFieldID_album = new javax.swing.JTextField();
        jButtonEliminarAlbum = new javax.swing.JButton();
        jButtonEliminarCancion = new javax.swing.JButton();
        jButtonAnnadirColumnaFotos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMostrarAlbum.setText("Mostrar Tabla Album");
        jMostrarAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMostrarAlbumMousePressed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "Autor", "Anno_publicacion"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Titulo", "Duracion", "Letras", "id_album"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jMostrarCanciones.setText("Mostrar Tabla Canciones");
        jMostrarCanciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMostrarCancionesMousePressed(evt);
            }
        });

        jTextFieldID.setText("id");

        jTextFieldAutor.setText("Autor");

        jTextFieldAnnoPublicacion.setText("Anno_publicacion");

        jButtonAnnadirAlbum.setText("Añadir");
        jButtonAnnadirAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonAnnadirAlbumMousePressed(evt);
            }
        });

        jTextFieldTitulo.setText("Titulo");

        jTextFieldDuracion.setText("Duracion");

        jTextFieldLetras.setText("Letra");

        jButtonAnnadirCancion.setText("Añadir");
        jButtonAnnadirCancion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonAnnadirCancionMousePressed(evt);
            }
        });
        jButtonAnnadirCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnadirCancionActionPerformed(evt);
            }
        });

        jButtonModificarAlbum.setText("Modificar");
        jButtonModificarAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonModificarAlbumMousePressed(evt);
            }
        });

        jButtonModificarCancion.setText("Modificar");
        jButtonModificarCancion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonModificarCancionMousePressed(evt);
            }
        });

        jTextFieldID_album.setText("id_album");

        jButtonEliminarAlbum.setText("Eliminar Album");
        jButtonEliminarAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonEliminarAlbumMousePressed(evt);
            }
        });

        jButtonEliminarCancion.setText("Eliminar Cancion");
        jButtonEliminarCancion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonEliminarCancionMousePressed(evt);
            }
        });

        jButtonAnnadirColumnaFotos.setText("Añadir Columna Fotos");
        jButtonAnnadirColumnaFotos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonAnnadirColumnaFotosMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonEliminarCancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jMostrarAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jMostrarCanciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldID)
                    .addComponent(jTextFieldAutor)
                    .addComponent(jTextFieldAnnoPublicacion)
                    .addComponent(jTextFieldTitulo)
                    .addComponent(jTextFieldDuracion)
                    .addComponent(jTextFieldLetras)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAnnadirAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonModificarAlbum))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAnnadirCancion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonModificarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldID_album)
                    .addComponent(jButtonEliminarAlbum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAnnadirColumnaFotos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jMostrarAlbum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAnnoPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAnnadirAlbum)
                            .addComponent(jButtonModificarAlbum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEliminarAlbum)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAnnadirColumnaFotos)
                        .addGap(18, 18, 18)
                        .addComponent(jMostrarCanciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldLetras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldID_album, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAnnadirCancion)
                            .addComponent(jButtonModificarCancion))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEliminarCancion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMostrarAlbumMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMostrarAlbumMousePressed
        ResultSet rs = gc.Mostrar_TablaAlbum();
        DefaultTableModel modelo = new DefaultTableModel();
        jTable1.setModel(modelo);
        
        try{
            modelo.addColumn("id");
            modelo.addColumn("Autor");
            modelo.addColumn("anno_publicacion");
            
            while(rs.next()){
                Object[] obj1 = new Object[3];
                obj1[0] = (rs.getInt(1));
                obj1[1] = (rs.getString(2));
                obj1[2] = (rs.getString(3));
                
                modelo.addRow(obj1);
                obj1 = null;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMostrarAlbumMousePressed

    private void jMostrarCancionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMostrarCancionesMousePressed
        ResultSet rs = gc.Mostrar_TablaCanciones();
        DefaultTableModel modelo = new DefaultTableModel();
        jTable2.setModel(modelo);
        
        try{
            modelo.addColumn("Titulo");
            modelo.addColumn("Duracion");
            modelo.addColumn("Letras");
            modelo.addColumn("id_album");
            
            while(rs.next()){
                Object[] obj2 = new Object[4];
                obj2[0] = (rs.getString(1));
                obj2[1] = (rs.getString(2));
                obj2[2] = (rs.getString(3));
                obj2[3] = (rs.getInt(4));
                modelo.addRow(obj2);
                obj2 = null;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMostrarCancionesMousePressed

    private void jButtonAnnadirAlbumMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAnnadirAlbumMousePressed
//        if (jTextFieldID.getText().equals("") || jTextFieldAutor.getText().equals("") || jTextFieldAnnoPublicacion.getText().equals("")){
//            jLabel1.setText("Campos incompletos."); //Si los campos estan incompletos, saltará un aviso en el jLabel.
//        }
        try{
            gc.conn1.setAutoCommit(false);
            PreparedStatement pst;
            pst = gc.conn1.prepareStatement("INSERT INTO album (id, Autor, anno_publicacion) VALUES(?,?,?)");
            pst.setString(1, jTextFieldID.getText());
            pst.setString(2, jTextFieldAutor.getText());
            pst.setString(3, jTextFieldAnnoPublicacion.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Album Guardado");
            gc.conn1.commit();
        }
    catch(SQLException ex){
            System.out.println("ERROR: al hacer un INSERT");
            try{
                if(gc.conn1!=null)
                    gc.conn1.rollback();
            }catch(SQLException se2){
                se2.printStackTrace();
            }
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Album Duplicado");
    }  
    }//GEN-LAST:event_jButtonAnnadirAlbumMousePressed

    private void jButtonModificarAlbumMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonModificarAlbumMousePressed
        try{
            gc.conn1.setAutoCommit(false);
            PreparedStatement pst;
            pst = gc.conn1.prepareStatement("Update album  SET  Autor =?, anno_publicacion =?  WHERE id=?");
            pst.setString(1, jTextFieldAutor.getText());
            pst.setString(2, jTextFieldAnnoPublicacion.getText());
            pst.setString(3, jTextFieldID.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Album Modificado");
            gc.conn1.commit();
        }
    catch(SQLException ex){
            System.out.println("ERROR: al Modificar");
            try{
                if(gc.conn1!=null)
                    gc.conn1.rollback();
            }catch(SQLException se2){
                se2.printStackTrace();
            }
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Album No Modificado");
    }
    }//GEN-LAST:event_jButtonModificarAlbumMousePressed

    private void jButtonAnnadirCancionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAnnadirCancionMousePressed
        try{
            gc.conn1.setAutoCommit(false);
            PreparedStatement pst;
            pst = gc.conn1.prepareStatement("INSERT INTO cancion(titulo, Duracion, Letras, id_album) VALUES(?,?,?,?)");
            pst.setString(1, jTextFieldTitulo.getText());
            pst.setString(2, jTextFieldDuracion.getText());
            pst.setString(3, jTextFieldLetras.getText());
            pst.setString(4, jTextFieldID_album.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Canción Guardada");
            gc.conn1.commit();
        }
    catch(SQLException ex){
            System.out.println("ERROR: al hacer un INSERT");
            try{
                if(gc.conn1!=null)
                    gc.conn1.rollback();
            }catch(SQLException se2){
                se2.printStackTrace();
            }
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Canción Duplicada");
    }
    }//GEN-LAST:event_jButtonAnnadirCancionMousePressed

    private void jButtonModificarCancionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonModificarCancionMousePressed
        try{
            gc.conn1.setAutoCommit(false);
            PreparedStatement pst;
            pst = gc.conn1.prepareStatement("Update cancion SET titulo=? , Duracion=? , Letras=? WHERE id_album=?");
            pst.setString(1, jTextFieldTitulo.getText());
            pst.setString(2, jTextFieldDuracion.getText());
            pst.setString(3, jTextFieldLetras.getText());
            pst.setString(4, jTextFieldID_album.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cancion Modificada");
            gc.conn1.commit();
        }
    catch(SQLException ex){
            System.out.println("ERROR: al Modificar");
            try{
                if(gc.conn1!=null)
                    gc.conn1.rollback();
            }catch(SQLException se2){
                se2.printStackTrace();
            }
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cancion No Modificada");
    }
    }//GEN-LAST:event_jButtonModificarCancionMousePressed

    private void jButtonAnnadirCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnadirCancionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAnnadirCancionActionPerformed

    private void jButtonEliminarAlbumMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarAlbumMousePressed
      try{
            gc.conn1.setAutoCommit(false);
            PreparedStatement pst;
            pst = gc.conn1.prepareStatement("DELETE FROM album  WHERE id=?");
            pst.setInt(1, Integer.parseInt(jTextFieldID.getText()));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Album Borrado");
            gc.conn1.commit();
        }
    catch(SQLException ex){
            System.out.println("ERROR: al Borrar");
            try{
                if(gc.conn1!=null)
                    gc.conn1.rollback();
            }catch(SQLException se2){
                se2.printStackTrace();
            }
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Album No Eliminado");
    }
    }//GEN-LAST:event_jButtonEliminarAlbumMousePressed

    private void jButtonEliminarCancionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarCancionMousePressed
        try{
            gc.conn1.setAutoCommit(false);
            PreparedStatement pst;
            pst = gc.conn1.prepareStatement("DELETE FROM cancion  WHERE id_album =?");
            pst.setInt(1, Integer.parseInt(jTextFieldID_album.getText()));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cancion Borrada");
            gc.conn1.commit();
        }
    catch(SQLException ex){
            System.out.println("ERROR: al Borrar");
            try{
                if(gc.conn1!=null)
                    gc.conn1.rollback();
            }catch(SQLException se2){
                se2.printStackTrace();
            }
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cancion No Eliminado");
    }
    }//GEN-LAST:event_jButtonEliminarCancionMousePressed

    private void jButtonAnnadirColumnaFotosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAnnadirColumnaFotosMousePressed
        gc.insertar_columnaFotos();
        JOptionPane.showMessageDialog(null, "Se ha insertado la columna de Fotos");//Se inserta pero al darle al mostrar no se muestra en la tabla de la app; pero
        //realmente se puede ver accediendo al PHPMyAdmin
    }//GEN-LAST:event_jButtonAnnadirColumnaFotosMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Conectores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conectores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conectores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conectores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conectores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnadirAlbum;
    private javax.swing.JButton jButtonAnnadirCancion;
    private javax.swing.JButton jButtonAnnadirColumnaFotos;
    private javax.swing.JButton jButtonEliminarAlbum;
    private javax.swing.JButton jButtonEliminarCancion;
    private javax.swing.JButton jButtonModificarAlbum;
    private javax.swing.JButton jButtonModificarCancion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jMostrarAlbum;
    private javax.swing.JButton jMostrarCanciones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextFieldAnnoPublicacion;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldDuracion;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldID_album;
    private javax.swing.JTextField jTextFieldLetras;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables
}
