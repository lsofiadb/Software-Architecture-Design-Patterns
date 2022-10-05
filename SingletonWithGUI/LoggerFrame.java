import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;

public class LoggerFrame extends JFrame {
	  public static final String newline = "\n";
	  public static final String LOG_MESSAGE = "LOG MESSAGE";

	  public static final String EXIT = "Exit";
	  public static final String FILE = "ON";
	  public static final String CONSOLE = "OFF";

	  private JComboBox cmbOutputTypes;

	  private JTextField txtMessage;

	  private JLabel lblMessage;
	  private JLabel lblOutputType;
	  private JLabel lblResult;
	  private JLabel lblResultValue;

	  public LoggerFrame() {
	    super(" Singleton Pattern - Example ");
		
	    cmbOutputTypes = new JComboBox();
	    cmbOutputTypes.addItem(LoggerFrame.FILE);
	    cmbOutputTypes.addItem(LoggerFrame.CONSOLE);
	    lblOutputType = new JLabel("Output Type:");
	    txtMessage = new JTextField(60);
	    lblMessage = new JLabel("Write the message(60 characters max.):    ");
	    lblResultValue = new JLabel(" Please click on LOG MESSAGE button to register");


	    //Create the LogMessage button
	    JButton LogMessageButton =
	      new JButton(LoggerFrame.LOG_MESSAGE);
		LogMessageButton.setBorder(BorderFactory.createBevelBorder(0));  
		LogMessageButton.setBackground(Color.white);
		LogMessageButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		LogMessageButton.setPreferredSize(new Dimension(110, 35));
		
	    LogMessageButton.setMnemonic(KeyEvent.VK_V);
	    JButton exitButton = new JButton(LoggerFrame.EXIT);
		exitButton.setBorder(BorderFactory.createBevelBorder(0));
		exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		exitButton.setBackground(Color.red);
		exitButton.setForeground(Color.black);
		exitButton.setPreferredSize(new Dimension(110, 35));
		exitButton.setFont(new Font("Times New Roman",1,16));

	    exitButton.setMnemonic(KeyEvent.VK_X);
	    ButtonHandler objButtonHandler = new ButtonHandler(this);


	    LogMessageButton.addActionListener(objButtonHandler);
	    exitButton.addActionListener(new ButtonHandler());

	    //For layout purposes, put the buttons in a separate panel
	    JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(new Color(197, 249, 221));
	    //****************************************************
	    GridBagLayout gridbag = new GridBagLayout();
	    buttonPanel.setLayout(gridbag);
	    GridBagConstraints gbc = new GridBagConstraints();
	    gbc.anchor = GridBagConstraints.WEST;

	    buttonPanel.add(lblOutputType);
	    buttonPanel.add(cmbOutputTypes);
	    buttonPanel.add(lblMessage);
	    buttonPanel.add(txtMessage);
	    buttonPanel.add(lblResultValue);

	    buttonPanel.add(LogMessageButton);
	    buttonPanel.add(exitButton);

	    gbc.insets.top = 5;
	    gbc.insets.bottom = 5;
	    gbc.insets.left = 5;
	    gbc.insets.right = 5;

	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    gbc.gridx = 0;
	    gbc.gridy = 5;
	    gridbag.setConstraints(lblOutputType, gbc);
	    gbc.gridx = 1;
	    gbc.gridy = 5;
	    gridbag.setConstraints(cmbOutputTypes, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 6;
	    gbc.gridx = 0;
	    gbc.gridy = 8;
	    gbc.gridx = 1;
	    gbc.gridy = 8;
	    gridbag.setConstraints(lblResultValue, gbc);
	    gbc.insets.left = 2;
	    gbc.insets.right = 2;
	    gbc.insets.top = 40;
	    gbc.anchor = GridBagConstraints.EAST;
	    gbc.gridx = 0;
	    gbc.gridy = 10;
	    gridbag.setConstraints(LogMessageButton, gbc);
	    gbc.anchor = GridBagConstraints.WEST;
	    gbc.gridx = 1;
	    gbc.gridy = 10;
	    gridbag.setConstraints(exitButton, gbc);

	    //****************************************************

	    //Add the buttons to the frame
	    
	    Container contentPane = getContentPane();

	    contentPane.add(buttonPanel, BorderLayout.CENTER);
	    try {
	      SwingUtilities.updateComponentTreeUI(
	        LoggerFrame.this);
	    } catch (Exception ex) {
	      System.out.println(ex);
	    }


	  }
	  public String getMessage() {
	    return txtMessage.getText();
	  }
	  public String getOutputType() {
	    return (String) cmbOutputTypes.getSelectedItem();
	  }
	  public void setResultDisplay(String msg) {
	    lblResultValue.setText(msg);
	  }


  public static void main(String[] args) {
	  JFrame frame = new LoggerFrame();
	    frame.addWindowListener(new WindowAdapter() {
	          public void windowClosing(WindowEvent e) {
	            System.exit(0);
	          }
	        }
	                           );
	    frame.setSize(1050, 550);
	    frame.setVisible(true);
	  }

	} 
class ButtonHandler implements ActionListener {
	  LoggerFrame objLoggerFrame;
	  public void actionPerformed(ActionEvent e) {
	    String Result = null;
	    if (e.getActionCommand().equals(LoggerFrame.EXIT)) {
	      System.exit(1);
	    }
	    if (e.getActionCommand().equals(LoggerFrame.LOG_MESSAGE)) {
	      //get input values
	      String message = objLoggerFrame.getMessage();
	      String outputType = objLoggerFrame.getOutputType();
	      if (outputType=="ON") {
	    	  Logger logger=FileLogger.getFileLogger();
	    	  logger.log(message);
	          Result = " Message registered successfully to file";

	        } else {
	          Logger logger= ConsoleLogger.getConsoleLogger();
	          logger.log(message);
	        	Result = 
	            "Message wrote succesfully to console ";

	        }
	      objLoggerFrame.setResultDisplay(
	        Result);
	    }
	  }

	  public ButtonHandler() {
	  }
	  public ButtonHandler(LoggerFrame inobjLoggerFrame) {
	    objLoggerFrame = inobjLoggerFrame;
	  }

	} // End of class ButtonHandler

