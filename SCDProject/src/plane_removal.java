

import java.awt.*;

import javax.swing.*;

public class plane_removal extends JFrame
{
	private JTextField textField,textField_1,textField_2,textField_3,textField_4;

    public static void main(String[] args) {
        new plane_removal();
    }
    
    public plane_removal() 
    {
        initialize();
    }
    
    private void initialize() 
    {
	    setTitle("PLANE EXCISION");
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 801, 472);
		getContentPane().setLayout(null);
			
		JLabel Cancellation = new JLabel("PLANE EXCISION");
		Cancellation.setFont(new Font("Tahoma", Font.PLAIN, 31));
		Cancellation.setBounds(336, 23, 394, 38);
		getContentPane().add(Cancellation);
			
		
//	        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/cancel.png"));
//	        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
//	        ImageIcon i3 = new ImageIcon(i2);
//	        JLabel NewLabel = new JLabel(i3);
//		NewLabel.setBounds(470, 100, 250, 250);
//		add(NewLabel);
		
	JLabel PassengerNo = new JLabel("PLANE REFERENCE NO");
	PassengerNo.setFont(new Font("Tahoma", Font.PLAIN, 17));
	PassengerNo.setBounds(30, 85, 210, 50);
	getContentPane().add(PassengerNo);
		
	JLabel CancellationNo = new JLabel("CANCELLATION NO");
	CancellationNo.setFont(new Font("Tahoma", Font.PLAIN, 17));
	CancellationNo.setBounds(60, 150, 150, 27);
	getContentPane().add(CancellationNo);
		
	JLabel CancellationDate = new JLabel("CANCELLATION DATE");
	CancellationDate.setFont(new Font("Tahoma", Font.PLAIN, 17));
	CancellationDate.setBounds(60, 200, 180, 27);
	getContentPane().add(CancellationDate);
		
	JLabel Ticketid = new JLabel("TIME SPENT ");
	Ticketid.setFont(new Font("Tahoma", Font.PLAIN, 17));
	Ticketid.setBounds(60, 250, 150, 27);
	getContentPane().add(Ticketid);
		
	JLabel Flightcode = new JLabel("REASON FOR EXCISION: ");
	Flightcode.setFont(new Font("Tahoma", Font.PLAIN, 17));
	Flightcode.setBounds(10, 297, 200, 27);
	getContentPane().add(Flightcode);
		
	JButton Cancel = new JButton("EXCISE");
	Cancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        Cancel.setBackground(Color.BLACK);
        Cancel.setForeground(Color.WHITE);
	Cancel.setBounds(412, 338, 150, 30);
	getContentPane().add(Cancel);
		
	textField = new JTextField();
	textField.setBounds(250, 100, 150, 27);
	getContentPane().add(textField);
	
        textField_1 = new JTextField();
	textField_1.setBounds(250, 150, 150, 27);
	getContentPane().add(textField_1);
		
	textField_2 = new JTextField();
	textField_2.setBounds(250, 200, 150, 27);
	getContentPane().add(textField_2);
	
        textField_3 = new JTextField();
	textField_3.setBounds(250, 250, 150, 27);
	getContentPane().add(textField_3);
		
	textField_4 = new JTextField();
	textField_4.setBounds(250, 300, 150, 27);
	getContentPane().add(textField_4);
	
//        Cancel.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent ae){
//		
//                String passenger_no = textField.getText();
//		String cancellation_no = textField_1.getText();
//		String cancellation_date = textField_2.getText();
//		String ticket_id = textField_3.getText();
//		String flight_code = textField_4.getText();
//					
//					
//		try{	
//                    conn c = new conn();
//                    String str = "INSERT INTO cancellation values('"+passenger_no+"', '"+cancellation_no+"', '"+cancellation_date+"', '"+ticket_id+"', '"+flight_code+"')";
//		
//                    c.s.executeUpdate(str);
//                    JOptionPane.showMessageDialog(null,"Ticket Canceled");
//                    setVisible(false);
//						
//		}catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
			
	setSize(860,500);
	setVisible(true);
        setLocation(400,200);
    }
}