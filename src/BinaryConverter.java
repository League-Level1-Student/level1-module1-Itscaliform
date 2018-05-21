import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class BinaryConverter implements ActionListener{
	
	JPanel panel;

	JFrame frame;

	JButton button;
	TextField text;
	TextField text2;

	
	String convert(String binary) {
        int asciiValue = Integer.parseInt(binary, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    }
	String convertWholeString(String binary) {
		String billy = "";
		for (int i = 0; i < binary.length(); i+=9) {
		billy+=	convert(binary.substring(i,i+8));
		}
		return billy;
		
	}


 public void createUI() {
	
	panel =new JPanel();
	 frame= new JFrame();
	 button = new JButton("convert");
	 text= new TextField(25);
	 text2 = new TextField(25);
	 
	frame.add(panel);

	button.addActionListener(this);
	panel.add(text);
	panel.add(button);
	panel.add(text2);
	frame.setSize(800, 500);
	frame.pack();
	
	
	frame.setVisible(true);
	
 }
 public static void main(String[] args) {
		new BinaryConverter().createUI();
	}



@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
if (e.getSource()==button){
	String bobert=text.getText();
String text= convertWholeString(bobert);
System.out.println(text);
text2.setText(text);
}

}}

