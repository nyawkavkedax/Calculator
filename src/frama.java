import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class frama extends JFrame implements WindowListener, ActionListener {
    private TextField f  = new TextField();
    private JButton b9 = new JButton("9");
    private JButton b7 = new JButton("7");
    private JButton b8 = new JButton("8");
    private JButton b6 = new JButton("6");
    private JButton b5 = new JButton("5");
    private JButton b4 = new JButton("4");
    private JButton b3 = new JButton("3");
    private JButton b2 = new JButton("2");
    private JButton b1 = new JButton("1");
    private JButton del = new JButton("C");
    private JButton b0 = new JButton("0");
    private JButton sloj = new JButton("+");
    private JButton vicit = new JButton("-");
    private JButton ymnoj = new JButton("x");
    private JButton delit = new JButton("/");
    private JButton ravno = new JButton("=");
    private int a = 0;
    private int b = 0;
    private char z;

    private String text="";

    public frama() {
        Font ex = new Font("Impact",Font.BOLD,60);
        setLayout(null);
        setSize(400, 600);
        setVisible(true);
        setLocation(500,200);
        f.setSize(350,60);
        f.setLocation(25,25);
        f.setVisible(true);
        add(f);
        b8.setFont(ex);
        b8.setSize(75,75);
        b8.setLocation(120,225);
        b8.setVisible(true);
        add(b8);
        b8.addActionListener(this);
        b7.setFont(ex);
        b7.setSize(75,75);
        b7.setLocation(30,225);
        b7.setVisible(true);
        add(b7);
        b7.addActionListener(this);
        del.setFont(ex);
        del.setSize(75,75);
        del.setLocation(300,225);
        del.setVisible(true);
        add(del);
        del.addActionListener(this);
        b6.setFont(ex);
        b6.setSize(75,75);
        b6.setLocation(210,315);
        b6.setVisible(true);
        add(b6);
        b6.addActionListener(this);
        b5.setFont(ex);
        b5.setSize(75,75);
        b5.setLocation(120,315);
        b5.setVisible(true);
        add(b5);
        b5.addActionListener(this);
        b4.setFont(ex);
        b4.setSize(75,75);
        b4.setLocation(30,315);
        b4.setVisible(true);
        add(b4);
        b4.addActionListener(this);
        b3.setFont(ex);
        b3.setSize(75,75);
        b3.setLocation(210,405);
        b3.setVisible(true);
        add(b3);
        b3.addActionListener(this);
        b2.setFont(ex);
        b2.setSize(75,75);
        b2.setLocation(120,405);
        b2.setVisible(true);
        add(b2);
        b2.addActionListener(this);
        b1.setFont(ex);
        b1.setSize(75,75);
        b1.setLocation(30,405);
        b1.setVisible(true);
        add(b1);
        b1.addActionListener(this);
        b0.setFont(ex);
        b0.setSize(75,75);
        b0.setLocation(30,495);
        b0.setVisible(true);
        add(b0);
        b0.addActionListener(this);
        b9.setFont(ex);
        b9.setSize(75,75);
        b9.setLocation(210,225);
        b9.setVisible(true);
        add(b9);
        b9.addActionListener(this);
        sloj.setFont(ex);
        sloj.setSize(75,75);
        sloj.setLocation(300,315);
        sloj.setVisible(true);
        add(sloj);
        sloj.addActionListener(this);
        vicit.setFont(ex);
        vicit.setSize(75,75);
        vicit.setLocation(300,405);
        vicit.setVisible(true);
        add(vicit);
        vicit.addActionListener(this);
        delit.setFont(ex);
        delit.setSize(75,75);
        delit.setLocation(210,495);
        delit.setVisible(true);
        add(delit);
        delit.addActionListener(this);
        ymnoj.setFont(ex);
        ymnoj.setSize(75,75);
        ymnoj.setLocation(120,495);
        ymnoj.setVisible(true);
        add(ymnoj);
        ymnoj.addActionListener(this);
        ravno.setFont(ex);
        ravno.setSize(75,75);
        ravno.setLocation(300,495);
        ravno.setVisible(true);
        add(ravno);
        ravno.addActionListener(this);


    }






    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b7){
            text = text +b7.getText();
            f.setText(text);

        }
        if(e.getSource()==b8){
            text = text + b8.getText();
            f.setText(text);
        }
        if(e.getSource()==del){
            text = "";
            f.setText(text);
        }
        if(e.getSource()==b6){
            text = text +b6.getText();
            f.setText(text);

        }
        if(e.getSource()==b9){
            text = text +b9.getText();
            f.setText(text);

        }
        if(e.getSource()==b5){
            text = text +b5.getText();
            f.setText(text);

        }
        if(e.getSource()==b4){
            text = text +b4.getText();
            f.setText(text);

        }
        if(e.getSource()==b3){
            text = text +b3.getText();
            f.setText(text);

        }
        if(e.getSource()==b2){
            text = text +b2.getText();
            f.setText(text);
        }
        if(e.getSource()==b1){
            text = text +b1.getText();
            f.setText(text);
        }
        if(e.getSource()==b0){
            text = text +b0.getText();
            f.setText(text);

        }
        if(e.getSource()==sloj){
            a = Integer.parseInt(text);
            f.setText(text +sloj.getText());
            text ="";
            z = '+';
        }
        if(e.getSource()==vicit){
            a = Integer.parseInt(text);
            f.setText(text +vicit.getText());
            text ="";
            z = '-';
        }
        if(e.getSource()==delit){
            a = Integer.parseInt(text);
            f.setText(text +delit.getText());
            text ="";
            z = '/';
        }
        if(e.getSource()==ymnoj){
            a = Integer.parseInt(text);
            f.setText(text +ymnoj.getText());
            text ="";
            z = 'x';
        }



        if(e.getSource()==ravno){
            if(z=='+'){
                b =Integer.parseInt(text);
                f.setText(String.valueOf(a+b));
            }
            if(z=='-'){
                b=Integer.parseInt(text);
                f.setText(String.valueOf(a-b));
            }
            if(z=='/'){
                b=Integer.parseInt(text);
                f.setText(String.valueOf(a/b));
            }
            if(z=='x'){
                b=Integer.parseInt(text);
                f.setText(String.valueOf(a*b));
            }

        }



    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}

