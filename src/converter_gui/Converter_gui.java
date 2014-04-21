package converter_gui;

/**
 *
 * @author lorenz
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
public class Converter_gui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame_main=new JFrame();
        JPanel panel_main=new JPanel();
        
        String list[]={"binary", "hexadecimal", "decimal"};
        
        final JComboBox from=new JComboBox(list);
        final JComboBox to=new JComboBox(list);
        
        final JTextField field_nbr=new JTextField("number");
        
        JLabel label_from=new JLabel("from");
        JLabel label_to=new JLabel("to");
        
        JButton ok=new JButton("ok");
        
        panel_main.add(ok);
        panel_main.add(field_nbr);
        panel_main.add(from);
        panel_main.add(to);
        panel_main.add(label_from);
        panel_main.add(label_to);
        frame_main.add(panel_main);
        frame_main.setSize(250, 150);
        frame_main.setVisible(true);
        frame_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel_main.setLayout(null);
        ok.setBounds(100, 70, 50, 30);
        field_nbr.setLocation(10, 10);
        label_from.setLocation(70, 10);
        label_to.setLocation(75, 35);
        from.setLocation(110, 5);
        to.setLocation(110, 30);
        ok.setBorder(BorderFactory.createLineBorder(Color.green));
        ok.setText("OK");
        
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                int marker_from=from.getSelectedIndex();
                int marker_to=to.getSelectedIndex();
                if(marker_to==marker_from) {
                    JOptionPane.showMessageDialog(null, "This is useless!");
                }
                else {
                    switch(marker_from) {
                        case 0:
                            switch(marker_to) {
                                case 1:
                                    JOptionPane.showMessageDialog(null, bin.bin_hex(field_nbr.getText()));
                                    break;
                                case 2:
                                    JOptionPane.showMessageDialog(null, bin.bin_dec(field_nbr.getText()));
                                    break;
                            }
                            break;
                        case 1:
                            switch(marker_to) {
                                case 0:
                                    JOptionPane.showMessageDialog(null, hex.hex_bin(field_nbr.getText()));
                                    break;
                                case 2:
                                    JOptionPane.showMessageDialog(null, hex.hex_dec(field_nbr.getText()));
                                    break;
                            }
                            break;
                        case 2:
                            switch(marker_to) {
                                case 1:
                                    JOptionPane.showMessageDialog(null, dec.dec_hex(Integer.parseInt(field_nbr.getText())));
                                    break;
                                case 0:
                                    JOptionPane.showMessageDialog(null, dec.dec_bin(Integer.parseInt(field_nbr.getText())));
                                    break;
                            }
                            break;
                    }
                }
            }
        });      
    }    
}
