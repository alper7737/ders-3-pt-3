
package javaapplication3;
 import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JButton;


public class JavaApplication3 {
static JButton ref;
    public static void main(String[] args) {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JTabbedPane tp = new JTabbedPane();
    JPanel p = new JPanel();
    ref =new JButton("Sekme ekle");
    p.add(ref);
    tp.addTab("sekme 1", p);
    ActionListener a1 = new ActionListener(){
        int sayaç=2;
        @Override
        public void actionPerformed(ActionEvent ae) {
        
        ref.removeActionListener(this);
        ref=new JButton("sekme ekle");
        ref.addActionListener(this);
        p.add(ref);
        tp .add("sekme"+ sayaç,p);
        sayaç++;
    }
    };
    ref.addActionListener(a1);
    f.add(tp);
    f.setSize(600,400);
    f.setVisible(true);
    }
}
