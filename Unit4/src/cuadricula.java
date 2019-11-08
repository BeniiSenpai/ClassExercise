import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Random;
/**
 Nota a mí mismo: 
    para empaquetar: jar cfm ejemplo1.jar Manifest Cuadricula*
    para correr: java -jar ejemplo1.jar
    donde Manifest es un archivo de texto con
    Main-class: Cuadricula
 */
public class cuadricula extends JFrame{
   protected JTextField nFilas;
   protected JTextField nColumnas;
   protected JButton kreator;

   protected JPanel  mostrador;
   public cuadricula(){
    //hay un panel implícito
    getContentPane().setLayout(new GridLayout(2,1));
    setPreferredSize(new Dimension(300,300));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //recibe: orientación, min, max, inicial
    mostrador = new JPanel();
    nFilas = new JTextField();
    nColumnas = new JTextField();
    kreator = new JButton("Crear");

    add(new JPanel(new GridLayout(1,4)){{
        add(nFilas);
        add(new JLabel("X"));
        add(nColumnas);
        add(kreator);
    }});
    add(mostrador);
    kreator.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            mostrador.removeAll();
            try{
                int f=Integer.parseInt(nFilas.getText());
                int c=Integer.parseInt(nColumnas.getText());
                int n=0;
                for(int i=1; i<=f; i++){
                    for (int j=1; j<=c ; j++ ) {
                        final int m=j;
                        mostrador.add(new JLabel(){{
                            setOpaque(true);
                            setPreferredSize(new Dimension(10,10));
                            if(m % 2 == 0)
                                setBackground(Color.RED);
                            else
                                setBackground(Color.BLACK);
                        }});
                    }
                }    
                mostrador.setLayout(new GridLayout(f, c, 20, 20));
            }catch(NumberFormatException nex){
                mostrador.add(new JLabel("sólo números!"));
            }
            mostrador.validate();
            mostrador.repaint();
        }
    });

    pack();
   }
    
   public static void main (String [] args)
    {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new cuadricula().setVisible(true);
            }
        });
    }
}
