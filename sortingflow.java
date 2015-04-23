import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class sortingflow implements ActionListener{
	private JButton button1;
	private JFrame frame;
	private JPanel panel;
	private JTextField [] textfield = new JTextField[10];
	private JLabel label;
	private JLabel output;
	private JLabel output1;
	private JLabel output2;
	private JLabel output3;
	private JLabel output4;
	private JLabel output5;
	private JLabel output6;
	private JLabel output7;
	private JLabel output8;
	private JLabel output9;
	
	public sortingflow(){
	frame = new JFrame("Sorting 10 numbers");
	frame.setVisible(true);
	frame.setSize(400, 200);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	panel = new JPanel();
	panel.setBackground(Color.pink);
	label = new JLabel();
	label.setText("Enter 10 numbers");
	label.setForeground(Color.BLACK);
	output = new JLabel();
	output.setText("");
	output1 = new JLabel();
	output1.setText("");
	output2 = new JLabel();
	output2.setText("");
	output3 = new JLabel();
	output3.setText("");
	output4 = new JLabel();
	output4.setText("");
	output5 = new JLabel();
	output5.setText("");
	output6 = new JLabel();
	output6.setText("");
	output7 = new JLabel();
	output7.setText("");
	output8 = new JLabel();
	output8.setText("");
	output9 = new JLabel();
	output9.setText("");
	
	
	textfield[0] = new JTextField(3);
	textfield[1] = new JTextField(3);
	textfield[2] = new JTextField(3);
	textfield[3] = new JTextField(3);
	textfield[4] = new JTextField(3);
	textfield[5] = new JTextField(3);
	textfield[6] = new JTextField(3);
	textfield[7] = new JTextField(3);
	textfield[8] = new JTextField(3);
	textfield[9] = new JTextField(3);
	
	button1 = new JButton("Sort the numbers");
	button1.addActionListener(this);
	
	panel.add(label);
	panel.setLayout(new FlowLayout());
	panel.add(textfield[0]);
	panel.add(textfield[1]);
	panel.add(textfield[2]);
	panel.add(textfield[3]);
	panel.add(textfield[4]);
	panel.add(textfield[5]);
	panel.add(textfield[6]);
	panel.add(textfield[7]);
	panel.add(textfield[8]);
	panel.add(textfield[9]);
	frame.add(panel);
	panel.add(button1);
	panel.add(output);
	panel.add(output1);
	panel.add(output2);
	panel.add(output3);
	panel.add(output4);
	panel.add(output5);
	panel.add(output6);
	panel.add(output7);
	panel.add(output8);
	panel.add(output9);
	
}

	public void actionPerformed(ActionEvent arg0) {
		double numb0 = Double.parseDouble(textfield[0].getText());
		double numb1 = Double.parseDouble(textfield[1].getText());
		double numb2 = Double.parseDouble(textfield[2].getText());
		double numb3 = Double.parseDouble(textfield[3].getText());
		double numb4 = Double.parseDouble(textfield[4].getText());
		double numb5 = Double.parseDouble(textfield[5].getText());
		double numb6 = Double.parseDouble(textfield[6].getText());
		double numb7 = Double.parseDouble(textfield[7].getText());
		double numb8 = Double.parseDouble(textfield[8].getText());
		double numb9 = Double.parseDouble(textfield[9].getText());
		
		double list[] = {numb0,numb1,numb2,numb3,numb4,numb5,numb6,numb7,
				numb8,numb9};
		for(int i=0; i<list.length; i++)
			for(int j=0; j<list.length; j++)
			if(list[i]<list[j])
				swap(list,i,j);
		double [] unsortedList = list;
		double [] sortedList =  (unsortedList);
		for(int i=0; i<sortedList.length; i++)
		output.setText(String.valueOf(sortedList[0]));
		output1.setText(String.valueOf(sortedList[1]));
		output2.setText(String.valueOf(sortedList[2]));
		output3.setText(String.valueOf(sortedList[3]));
		output4.setText(String.valueOf(sortedList[4]));
		output5.setText(String.valueOf(sortedList[5]));
		output6.setText(String.valueOf(sortedList[6]));
		output7.setText(String.valueOf(sortedList[7]));
		output8.setText(String.valueOf(sortedList[8]));
		output9.setText(String.valueOf(sortedList[9]));
		
		}
		

	private static void swap(double[] list, int i, int j) {
		// TODO Auto-generated method stub
		double temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
	
	
}
	