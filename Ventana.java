  import java.awt.*;
  import javax.swing.*;
 public class Ventana extends JFrame{
  public Ventana(){
     JFrame j= new JFrame("LOGIN");
     j.setSize(400,300);
     j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
     JPanel panel = new JPanel();
     j.add(panel);
   
    j.setVisible(true);
}//
public void componentes (JPanel panel){
    panel.setLayout(null);
   
    JLabel User= new JLabel("Usuario");
    User.setBounds(10,10,70,10);
    panel.add(User);
    //////
    JTextField us = new JTextField();
    us.setBounds(80,10,50,10);
    panel.add(us);
    ////
    JLabel Pass= new JLabel("PassWord");
    Pass.setBounds(10,30,70,10);
    panel.add(Pass);
   ////
    JTextField Passw = new JTextField ();
    Passw.setBounds(80,30,50,10);
    panel.add(Passw);
   ////
  JButton btnOk = new JButton ("Ok");   

   btnOk.setBounds(40,50,50,20);
    panel.add(btnOk);
   ////  
  JButton cancel = new JButton ("cancel");
  cancel.setBounds(90,50 ,50,20);
   panel.add(cancel); 

}
 public static void main(String []args){
  Ventana v= new Ventana();
}//main 
 
}//class
