import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Programa extends JFrame implements ActionListener {
  Container container = getContentPane();
  
  JLabel userLabel = new JLabel("USERNAME");
  
  JLabel passwordLabel = new JLabel("PASSWORD");
  
  JTextField userTextField = new JTextField();
  
  JPasswordField passwordField = new JPasswordField();
  
  JButton loginButton = new JButton("LOGIN");
  
  JButton resetButton = new JButton("RESET");
  
  JCheckBox showPassword = new JCheckBox("Show Password");
  
  Programa() {
    setLayoutManager();
    setLocationAndSize();
    addComponentsToContainer();
    addActionEvent();
  }
  
  public void setLayoutManager() {
    this.container.setLayout((LayoutManager)null);
  }
  
  public void setLocationAndSize() {
    this.userLabel.setBounds(50, 150, 100, 30);
    this.passwordLabel.setBounds(50, 220, 100, 30);
    this.userTextField.setBounds(150, 150, 150, 30);
    this.passwordField.setBounds(150, 220, 150, 30);
    this.showPassword.setBounds(150, 250, 150, 30);
    this.loginButton.setBounds(50, 300, 100, 30);
    this.resetButton.setBounds(200, 300, 100, 30);
  }
  
  public void addComponentsToContainer() {
    this.container.add(this.userLabel);
    this.container.add(this.passwordLabel);
    this.container.add(this.userTextField);
    this.container.add(this.passwordField);
    this.container.add(this.showPassword);
    this.container.add(this.loginButton);
    this.container.add(this.resetButton);
  }
  
  public void addActionEvent() {
    this.loginButton.addActionListener(this);
    this.resetButton.addActionListener(this);
    this.showPassword.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    if (paramActionEvent.getSource() == this.loginButton) {
      String str1 = this.userTextField.getText();
      String str2 = this.passwordField.getText();
      if (str1.equalsIgnoreCase("rafael") && str2.equalsIgnoreCase("mo201801")) {
        JOptionPane.showMessageDialog(this, "Credenciales validas");
      } else {
        JOptionPane.showMessageDialog(this, "Credenciales invalidas", "error", 0);
      } 
    } 
    if (paramActionEvent.getSource() == this.resetButton) {
      this.userTextField.setText("");
      this.passwordField.setText("");
    } 
    if (paramActionEvent.getSource() == this.showPassword)
      if (this.showPassword.isSelected()) {
        this.passwordField.setEchoChar((char)0);
      } else {
        this.passwordField.setEchoChar('*');
      }  
  }
  
  public static void main(String[] paramArrayOfString) {
    Programa programa = new Programa();
    programa.setTitle("Login Form");
    programa.setBounds(10, 10, 370, 600);
    programa.setDefaultCloseOperation(3);
    programa.setResizable(false);
    programa.setVisible(true);
  }
}
