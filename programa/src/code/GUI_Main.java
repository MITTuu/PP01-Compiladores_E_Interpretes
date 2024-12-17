
package code;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class GUI_Main extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Main
     */
    public GUI_Main() {
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

        JPAnalizadorLexico = new javax.swing.JPanel();
        JBCargar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTATextoArea = new javax.swing.JTextArea();
        JBGenerarAnalisis = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTATextoArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPAnalizadorLexico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Analizador Léxico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        JBCargar.setText("Cargar Archivo");
        JBCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCargarActionPerformed(evt);
            }
        });

        JTATextoArea.setColumns(20);
        JTATextoArea.setRows(5);
        jScrollPane1.setViewportView(JTATextoArea);

        JBGenerarAnalisis.setText("Generar Análisis");
        JBGenerarAnalisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGenerarAnalisisActionPerformed(evt);
            }
        });

        JTATextoArea1.setEditable(false);
        JTATextoArea1.setColumns(20);
        JTATextoArea1.setRows(5);
        jScrollPane2.setViewportView(JTATextoArea1);

        jButton1.setText("Guardar Análisis");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPAnalizadorLexicoLayout = new javax.swing.GroupLayout(JPAnalizadorLexico);
        JPAnalizadorLexico.setLayout(JPAnalizadorLexicoLayout);
        JPAnalizadorLexicoLayout.setHorizontalGroup(
            JPAnalizadorLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAnalizadorLexicoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(JPAnalizadorLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCargar))
                .addGap(40, 40, 40)
                .addGroup(JPAnalizadorLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPAnalizadorLexicoLayout.createSequentialGroup()
                        .addComponent(JBGenerarAnalisis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        JPAnalizadorLexicoLayout.setVerticalGroup(
            JPAnalizadorLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAnalizadorLexicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPAnalizadorLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPAnalizadorLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(JBCargar)
                        .addComponent(JBGenerarAnalisis, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPAnalizadorLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPAnalizadorLexico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPAnalizadorLexico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBGenerarAnalisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGenerarAnalisisActionPerformed
        try {
            analizadorLexico();
        } catch (Exception e) {
            Logger.getLogger(GUI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_JBGenerarAnalisisActionPerformed

    private void JBCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCargarActionPerformed
       JFileChooser chooser = new JFileChooser();
       chooser.showOpenDialog(null);
       File archivo = new File(chooser.getSelectedFile().getAbsolutePath());
       
       try {
           String ST = new String(Files.readAllBytes(archivo.toPath()));
           JTATextoArea.setText(ST);
       } catch (FileNotFoundException ex){
            Logger.getLogger(GUI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);           
       } catch (IOException ex) {
            Logger.getLogger(GUI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JBCargarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        guardarEnArchivo(JTATextoArea1.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCargar;
    private javax.swing.JButton JBGenerarAnalisis;
    private javax.swing.JPanel JPAnalizadorLexico;
    private javax.swing.JTextArea JTATextoArea;
    private javax.swing.JTextArea JTATextoArea1;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void analizadorLexico() {
       int contLinea = 1;
       int contColumna = 1;
       int lexemaLength = 0;
       boolean continuaError = false;
        // Obtén el texto de entrada desde txtResultado
        String expr = JTATextoArea.getText(); 
        Lexer lexer = new Lexer(new StringReader(expr));
        LexerCup lexerCup = new LexerCup(new StringReader(expr));
        String resultado = "LINEA " + contLinea + "\t\t\t\t\t\tSIMBOLO \n";

        try {
            while (true) {
                //Tokens token = lexer.yylex();
                Symbol symbol = lexerCup.next_token();
                if (symbol == null) {
                    // Guardar el resultado en un archivo             
                    JTATextoArea1.setText(resultado);
                    return;
                }
                //Registrar longitud de la cadena de caracteres del lexema para calcular la columna
                lexemaLength = symbol.value.toString().length();
                
                //Flag para registrar error solo una vez
                if(continuaError && symbol.sym != sym.Error){
                    continuaError = false;
                }
                switch (symbol.sym) {
                    case sym.Linea:
                        contLinea++;
                        contColumna = 0;
                        resultado += "LINEA " + contLinea + "\n";
                        break;
                    case sym.AperturaBloque:
                        resultado += "Columna " + contColumna + "\t<Apertura de Bloque>\t\t" + symbol.value +   "\n";
                        break;
                    case sym.CierreBloque:
                        resultado += "Columna " + contColumna + "\t<CierreBloque>\t\t\t" + symbol.value +   "\n";
                        break;
                    case sym.Integer:
                        resultado += "Columna " + contColumna + "\t<Integer>\t\t\t" + symbol.value +   "\n";
                        break;
                    case sym.Float:
                        resultado += "Columna " + contColumna + "\t<Float>\t\t\t\t" + symbol.value +  "\n";
                        break;
                    case sym.Bool:
                       resultado += "Columna " + contColumna +"\t<Bool>\t\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Char:
                       resultado += "Columna " + contColumna +"\t<Char>\t\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.String:
                       resultado += "Columna " + contColumna +"\t<String>\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Identificador:
                       resultado += "Columna " + contColumna +"\t<Identificador>\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.CorcheteApertura:
                       resultado += "Columna " + contColumna +"\t<CorcheteApertura>\t\t" + symbol.value +   "\n";
                       break;
                    case sym.CorcheteCierre:
                       resultado += "Columna " + contColumna +"\t<CorcheteCierre>\t\t" + symbol.value +   "\n";
                       break;
                    case sym.SignoAsignacion:
                       resultado += "Columna " + contColumna +"\t<SignoAsignacion>\t\t" + symbol.value +   "\n";
                       break;
                    case sym.ParentesisApertura:
                       resultado += "Columna " + contColumna +"\t<ParentesisApertura>\t\t" + symbol.value +   "\n";
                       break;
                    case sym.ParentesisCierre:
                       resultado += "Columna " + contColumna +"\t<ParentesisApertura>\t\t" + symbol.value +   "\n";
                       break;
                    case sym.LiteralCaracter:
                       resultado += "Columna " + contColumna +"\t<LiteralCaracter>\t\t" + symbol.value +   "\n";
                       break;
                    case sym.LiteralCadena:
                       resultado += "Columna " + contColumna +"\t<LiteralCadena>\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Suma:
                       resultado += "Columna " + contColumna +"\t<Suma>\t\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Resta:
                       resultado += "Columna " + contColumna +"\t<Resta>\t\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Division:
                       resultado += "Columna " + contColumna +"\t<Division>\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Multiplicacion:
                       resultado += "Columna " + contColumna +"\t<Multiplicacion>\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Modulo:
                       resultado += "Columna " + contColumna +"\t<Modulo>\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Potencia:
                       resultado += "Columna " + contColumna +"\t<Potencia>\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Incremento:
                       resultado += "Columna " + contColumna +"\t<Incremento>\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Decremento:
                       resultado += "Columna " + contColumna +"\t<Decremento>\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Negativo:
                       resultado += "Columna " + contColumna +"\t<Negativo>\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Menor:
                       resultado += "Columna " + contColumna +"\t<Menor>\t\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.MenorIgual:
                       resultado += "Columna " + contColumna +"\t<MenorIgual>\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Mayor:
                       resultado += "Columna " + contColumna +"\t<Mayor>\t\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.MayorIgual:
                       resultado += "Columna " + contColumna +"\t<MayorIgual>\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Igual:
                       resultado += "Columna " + contColumna +"\t<Igual>\t\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Diferente:
                       resultado += "Columna " + contColumna +"\t<Diferente>\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Conjuncion:
                       resultado += "Columna " + contColumna +"\t<Conjuncion>\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Disyuncion:
                       resultado += "Columna " + contColumna +"\t<Disyuncion>\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Negacion:
                       resultado += "Columna " + contColumna +"\t<Negacion>\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.If:
                       resultado += "Columna " + contColumna +"\t<If>\t\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Else:
                       resultado += "Columna " + contColumna +"\t<Else>\t\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.While:
                       resultado += "Columna " + contColumna +"\t<While>\t\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.For:
                       resultado += "Columna " + contColumna +"\t<For>\t\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Switch:
                       resultado += "Columna " + contColumna +"\t<Switch>\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Case:
                       resultado += "Columna " + contColumna +"\t<Case>\t\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Default:
                       resultado += "Columna " + contColumna +"\t<Default>\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Break:
                       resultado += "Columna " + contColumna +"\t<Break>\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Return:
                       resultado += "Columna " + contColumna +"\t<Return>\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.DosPuntos:
                       resultado += "Columna " + contColumna +"\t<DosPuntos>\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Print:
                       resultado += "Columna " + contColumna +"\t<Print>\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Read:
                       resultado += "Columna " + contColumna +"\t<Read>\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.OneLineC:
                       resultado += "Columna " + contColumna +"\t<OneLineC>\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.MultipleLineC:
                       resultado += "Columna " + contColumna +"\t<MultipleLineC>\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.FinSentencia:
                       resultado += "Columna " + contColumna +"\t<FinSentencia>\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Main:
                       resultado += "Columna " + contColumna +"\t<Main>\t\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.LiteralEntero:
                       resultado += "Columna " + contColumna +"\t<LiteralEntero>\t\t\t\t" + symbol.value +   "\n";
                       break;   
                    case sym.LiteralFlotante:
                       resultado += "Columna " + contColumna +"\t<LiteralFlotante>\t\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.Coma:
                       resultado += "Columna " + contColumna +"\t<Coma>\t\t\t\t" + symbol.value +   "\n";
                       break;
                    case sym.LiteralBool:
                       resultado += "Columna " + contColumna +"\t<LiteralBool>\t\t\t\t" + symbol.value +   "\n";
                       break;                        
                    case sym.Error:
                        if(continuaError){
                            break;
                        }
                        resultado += "Columna " + contColumna +"\t<ERROR: Símbolo no definido>" + "\n";
                        //Flag para registrar error solo una vez
                        continuaError = true;
                        break;
                    case sym.EspacioEnBlanco:
                        break;
                    case sym.FinDeArchivo:
                        resultado += "  <Fin de archivo>\n";
                        //Devuelve el resultado del texto analizado al alcanzar el fin del archivo
                        JTATextoArea1.setText(resultado);
                        System.out.print(resultado);
                        return;    
                    default:
                        resultado += "Columna " + contColumna + "\tSin Token < " + symbol.value + " >" +   "\n";
                        break;  
                }
                contColumna+= lexemaLength;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error durante el análisis: " + e.getMessage());
        }
    }

    private void guardarEnArchivo(String contenido) {
        //Abre una ventana de dialogo para elegir la ruta donde se guardará el texto analizado léxicamente.
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showSaveDialog(null);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            
           // Verificar si el archivo tiene la extensión .txt
           if (!archivo.getName().toLowerCase().endsWith(".txt")) {
               archivo = new File(archivo.getAbsolutePath() + ".txt");
           }
            
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
                writer.write(contenido);
                JOptionPane.showMessageDialog(null, "Archivo guardado exitosamente en: " + archivo.getPath());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al guardar el archivo: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Guardado cancelado.");
        }
    }
}
