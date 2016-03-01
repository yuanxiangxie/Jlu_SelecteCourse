package MyGUI;

import MyUIMS.UIMS;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


class DialogMessage
{
	private JFrame Frame;
	private JDialog Dialog;
	private String Message;
	final int Dialog_Width = Toolkit.getDefaultToolkit().getScreenSize().width / 4;
	final int Dialog_Height = Toolkit.getDefaultToolkit().getScreenSize().height / 7;
	
	public DialogMessage(JFrame Frame, String Message, boolean Model)
	{
		this.Frame = Frame;
		this.Message = Message;
		Dialog = new JDialog(Frame, "Warning", Model);
	}
	
	private void buildDialog_Center()
	{
		
		JPanel Panel = new JPanel();
		JLabel Label = new JLabel(Message, JLabel.CENTER);
		Panel.add(Label);
		JLabel Blank = new JLabel(" ");
		Dialog.add(Blank, BorderLayout.NORTH);
		Dialog.add(Panel);
	}
	
	private void buildDialog_Bottom()
	{
		JPanel Panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JButton Button = new JButton("OK");
		Button.setBackground( new Color(244, 244, 244));
		Button.addActionListener( new AbstractAction()
		{
			public void actionPerformed(ActionEvent e)
			{
				Dialog.dispose();
			}
		});
		
		Panel.add(Button);
		Dialog.add(Panel, BorderLayout.SOUTH);
	}
	
	public void showDialog()
	{
		buildDialog_Center();
		buildDialog_Bottom();
		Dialog.setSize(Dialog_Width, Dialog_Height);
		Dialog.setLocationRelativeTo(Frame);
		Dialog.setResizable(false);
		Dialog.setVisible(true);
		Dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}
}


interface Parameter
{
	final int Frame_Width = Toolkit.getDefaultToolkit().getScreenSize().width / 2;
	final int Frame_Height = Toolkit.getDefaultToolkit().getScreenSize().height / 2;
	
	final int Frame_X = Toolkit.getDefaultToolkit().getScreenSize().width / 4;
	final int Frame_Y = Toolkit.getDefaultToolkit().getScreenSize().height / 4;
	
	
	
	final String LoginFrame_Title = "吉大uims抢课程序";
	final String LoginFrame_Font_Name = "TimesRoman";
	final int LoginFrame_Font_Number = 32;
	
	final int LoginFrame_TextField_Length = 20;   // The first login frame's name and password text field length
	
	
	
	final String SelectedFrame_Title = "请输入吉大uims中的课程编码";
	final String SelectedFrame_Font_Name = "TimesRoman";
	final int SelectedFrame_Font_Number = 25;
	
	final String SelectedFrame_Label_Name = "CourseID:";
	
	final int SelectedFrame_TextField_Length = 20;
	
}
public class MyFrame implements Parameter
{
	private JFrame loginFrame, selectedFrame;
	private JTextField Name_TextField;
	private JPasswordField Passwd_TextField;
	private JTextField[] CourseID_TextField;
	
	private UIMS Uims;
	
	public MyFrame()
	{
		loginFrame = new JFrame();
		selectedFrame = new JFrame();
		
		CourseID_TextField = new JTextField[3];
	}
	
	private void build_loginFrame_Top()
	{
		JPanel loginPanel_Top = new JPanel();
		Font font = new Font(LoginFrame_Font_Name, Font.BOLD, LoginFrame_Font_Number);
		JLabel label = new JLabel(LoginFrame_Title, JLabel.CENTER);
		label.setFont(font);
		loginPanel_Top.setLayout( new BorderLayout());
		loginPanel_Top.add( new JLabel(" "), BorderLayout.NORTH);
		loginPanel_Top.add( new JLabel(" "));
		loginPanel_Top.add(label, BorderLayout.SOUTH);
		loginFrame.add(loginPanel_Top, BorderLayout.NORTH);
	}
	
	private void build_loginFrame_Center()
	{
		JPanel loginPanel_Center = new JPanel();
		Name_TextField = new JTextField(LoginFrame_TextField_Length);
		Passwd_TextField = new JPasswordField(LoginFrame_TextField_Length);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		loginPanel_Center.setLayout(gridBagLayout);
		
		gridBagConstraints.insets = new Insets(25, 0, 25, 0);
		
		JLabel NameLabel = new JLabel("UserName: ");
		JLabel PasswdLabel = new JLabel("Password: ");
		
		gridBagConstraints.fill = GridBagConstraints.NONE;
		gridBagConstraints.gridx = 1; gridBagConstraints.gridy = 1;
		gridBagConstraints.gridwidth = 1; gridBagConstraints.gridheight = 1;
		gridBagLayout.setConstraints(NameLabel, gridBagConstraints);
		loginPanel_Center.add(NameLabel);
		
		gridBagConstraints.gridy = 2;
		gridBagLayout.setConstraints(PasswdLabel, gridBagConstraints);
		loginPanel_Center.add(PasswdLabel);

		gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraints.gridx = 3; gridBagConstraints.gridy = 1;
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER; gridBagConstraints.gridheight = 1;
		gridBagLayout.setConstraints(Name_TextField, gridBagConstraints);
		loginPanel_Center.add(Name_TextField);
		
		gridBagConstraints.gridy = 2;
		gridBagLayout.setConstraints(Passwd_TextField, gridBagConstraints);
		loginPanel_Center.add(Passwd_TextField);
		
		loginFrame.add(loginPanel_Center);
	}
	
	private void build_loginFrame_Bottom()
	{
		JPanel loginPanel_Bottom = new JPanel();
		final JButton loginButton = new JButton("Login");
		final JButton cancelButton = new JButton("Cancel");
	
		loginButton.setBackground( new Color(244, 244, 244));
		cancelButton.setBackground( new Color(244, 244, 244));
		
		loginButton.addActionListener( new AbstractAction()
		{
			public void actionPerformed(ActionEvent e)
			{
				Uims = new UIMS(get_loginName(), get_loginPasswd());
				if(Uims.loginUims())
				{
					set_Show_LoginFrame(false);
					show_SelectedFrame();
				}
				else
				{
					// This I do not using JOptionPane is that I don't like the color of it's button
					//JOptionPane.showMessageDialog(loginFrame, "Your UserName or Password is Wrong!");
					DialogMessage Dialog = new DialogMessage(loginFrame, "Your UserName or Password is Wrong!", true);
					Dialog.showDialog();
				}
			}
		});
		cancelButton.addActionListener( new AbstractAction()
		{
			public void actionPerformed(ActionEvent e)
			{
				destroy_LoginFrame();
			}
		});
		loginPanel_Bottom.setLayout( new FlowLayout(FlowLayout.CENTER, 20, 30));
		loginPanel_Bottom.add(loginButton);
		loginPanel_Bottom.add(cancelButton);
		
		loginFrame.add(loginPanel_Bottom, BorderLayout.SOUTH);
	}
	
	private void destroy_LoginFrame()
	{
		loginFrame.dispose();
	}
	
	private void set_Show_LoginFrame(boolean flag)
	{
		loginFrame.setSize(Frame_Width, Frame_Height);
		loginFrame.setLocation(Frame_X, Frame_Y);
		loginFrame.setResizable(false);
		loginFrame.setVisible(flag);
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void show_LoginFrame()
	{	
		build_loginFrame_Top();
		build_loginFrame_Center();
		build_loginFrame_Bottom();
		set_Show_LoginFrame(true);
	}
	
	private void build_SelectedFrame_Top()
	{
		JPanel selectedPanel_Top = new JPanel(new BorderLayout());
		final JButton backButton = new JButton("Back");
		backButton.setBackground( new Color(244, 244, 244));
		backButton.addActionListener( new AbstractAction()
		{
			public void actionPerformed(ActionEvent e)
			{
			    destroy_SelectedFrame();
				set_Show_LoginFrame(true);
			}
		});
		selectedPanel_Top.setLayout( new FlowLayout(FlowLayout.LEFT, 10, 10));
		selectedPanel_Top.add(backButton);
		selectedFrame.add(selectedPanel_Top, BorderLayout.NORTH);
	}
	
	private void build_SelectedFrame_Center()
	{
		JPanel selectedPanel_Center = new JPanel();
		
		for(int i=0; i<3; ++i)
			CourseID_TextField[i] = new JTextField(SelectedFrame_TextField_Length);
		
		Font font = new Font(SelectedFrame_Font_Name, Font.BOLD, SelectedFrame_Font_Number);
		JLabel label = new JLabel(SelectedFrame_Title, JLabel.CENTER);
		label.setFont(font);
		
		JLabel[] courseLabel = new JLabel[3];
		for(int i=0; i<3; ++i)
			courseLabel[i] = new JLabel("CourseID: ");
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		GridBagLayout gridBagLayout = new GridBagLayout();
		selectedPanel_Center.setLayout(gridBagLayout);
		
		gridBagConstraints.insets = new Insets(0, 0, 20, 0);
		gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraints.gridx = 0; gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER; gridBagConstraints.gridheight = 1;
		gridBagLayout.setConstraints(label, gridBagConstraints);
		selectedPanel_Center.add(label);
		
		gridBagConstraints.insets = new Insets(16, 0, 16, 0);
		gridBagConstraints.fill = GridBagConstraints.NONE;
		gridBagConstraints.gridx = 0; gridBagConstraints.gridy = 2; 
		gridBagConstraints.gridwidth = 1;
		gridBagLayout.setConstraints(courseLabel[0], gridBagConstraints);
		selectedPanel_Center.add(courseLabel[0]);
		
		gridBagConstraints.gridy = 3;
		gridBagLayout.setConstraints(courseLabel[1], gridBagConstraints);
		selectedPanel_Center.add(courseLabel[1]);
		
		gridBagConstraints.gridy = 4;
		gridBagLayout.setConstraints(courseLabel[2], gridBagConstraints);
		selectedPanel_Center.add(courseLabel[2]);
		
		gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraints.gridx = 2; gridBagConstraints.gridy = 2; 
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagLayout.setConstraints(CourseID_TextField[0], gridBagConstraints);
		selectedPanel_Center.add(CourseID_TextField[0]);
		
		gridBagConstraints.gridy = 3;
		gridBagLayout.setConstraints(CourseID_TextField[1], gridBagConstraints);
		selectedPanel_Center.add(CourseID_TextField[1]);
		
		gridBagConstraints.gridy = 4;
		gridBagLayout.setConstraints(CourseID_TextField[2], gridBagConstraints);
		selectedPanel_Center.add(CourseID_TextField[2]);
		
		selectedFrame.add(selectedPanel_Center);
	}
	
	private void build_SelectedFrame_Bottom()
	{
		JPanel selectedPanel_Bottom = new JPanel();
		final JButton startButton = new JButton("Start");
		startButton.setBackground( new Color(244, 244, 244));
		startButton.addActionListener( new AbstractAction()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(startButton.getText().equals("Start"))
				{
					startButton.setText("Wait");
				}
				else if(startButton.getText().equals("Wait"))
				{
					startButton.setText("Start");
				}
				else
				{
					System.out.println("Something error !");
				}
			}
		});
		
		selectedPanel_Bottom.setLayout( new FlowLayout(FlowLayout.CENTER, 10, 20));
		selectedPanel_Bottom.add(startButton);
		
		selectedFrame.add(selectedPanel_Bottom, BorderLayout.SOUTH);
		
	}
	
	private void destroy_SelectedFrame()
	{
		selectedFrame.dispose();
	}
	
	private void set_Show_SelectedFrame(boolean flag)
	{
		selectedFrame.setSize(Frame_Width, Frame_Height);
		selectedFrame.setLocation(Frame_X, Frame_Y);
		selectedFrame.setResizable(false);
		selectedFrame.setVisible(flag);
		selectedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void show_SelectedFrame()
	{	
		build_SelectedFrame_Top();
		build_SelectedFrame_Center();
		build_SelectedFrame_Bottom();
		set_Show_SelectedFrame(true);
	}

	public String get_loginName()
	{
		return Name_TextField.getText();
	}
	
	public String get_loginPasswd()
	{
		return Passwd_TextField.getText();
	}
	
	public void set_loginPasswd(String password)
	{
		Passwd_TextField.setText(password);
	}
	
	public String get_CourseID_First()
	{
		return CourseID_TextField[0].getText();
	}
	
	public String get_CourseID_Second()
	{
		return CourseID_TextField[1].getText();
	}
	
	public String get_CourseID_Third()
	{
		return CourseID_TextField[2].getText();
	}
}
