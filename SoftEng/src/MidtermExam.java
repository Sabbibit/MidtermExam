import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MidtermExam extends JFrame implements ActionListener{
	
	private JLabel nameL, passwordL, confirmpassL, cityL, genderL, gmailL;
	private JTextField nametf, passwordtf, confirmtf, gmailtextf;
	private JComboBox cityCombo;
	private String cityItem[] = {"*****", "Batangas City", "Quezon City"};
	private JRadioButton female, male;
	private JButton submitb;

	public MidtermExam()
	{
		setTitle ("Registration Form");
		setSize(450, 300);
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		JLabel nameL = new JLabel ("Name:");
		nameL.setBounds(10, 20, 40, 20);
		add(nameL);
		
		JLabel passwordL = new JLabel ("Password: ");
		passwordL.setBounds(10, 50, 100, 20);
		add(passwordL);
		
		JLabel confirmpassL = new JLabel ("Confirm Password:");
		confirmpassL.setBounds(10, 80, 150, 20);
		add(confirmpassL);

		JLabel cityL = new JLabel ("City:");
		cityL.setBounds(10, 110, 40, 20);
		add(cityL);
		
		JLabel genderL = new JLabel ("Gender:");
		genderL.setBounds(10, 140, 80, 20);
		add(genderL);
		
		JLabel gmailL = new JLabel ("Gmail:");
		gmailL.setBounds(10, 170, 40, 20);
		add(gmailL);
		
		JTextField nametf = new JTextField();
		nametf.setBounds(200, 20, 200, 20);
		add(nametf);
		
		JTextField passwordtf = new JTextField();
		passwordtf.setBounds(200, 50, 200, 20);
		add(passwordtf);
		
		JTextField confirmtf = new JTextField();
		confirmtf.setBounds(200, 80, 200, 20);
		add(confirmtf);
		
		JComboBox cityCombo = new JComboBox(cityItem);
		cityCombo.setBounds(200, 110, 200, 20);
		add(cityCombo);
		
		JRadioButton female = new JRadioButton ("Female");
		female.setBounds(200, 140, 80, 20);
		add(female);
		
		JRadioButton male = new JRadioButton ("Male");
		male.setBounds(290, 140, 80, 20);
		add(male);
		
		JTextField gmailtf = new JTextField();
		gmailtf.setBounds(200, 170, 200, 20);
		add(gmailtf);
		
		JButton submitb = new JButton ("Submit");
		submitb.setBounds(170, 210, 80, 30);
		add(submitb);
		submitb.addActionListener(this);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
	public static void main (String [] args)throws FileNotFoundException{
		MidtermExam midterm = new MidtermExam();
		
		Scanner inputFile = new Scanner (new FileReader ("C:\\Users\\user\\Desktop\\midterm"));
		
		


	}
}
