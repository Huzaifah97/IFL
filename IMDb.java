package imdb;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import java.util.Scanner;
class IMDb2{
void front(){
System.out.println("Internet Movie Database");
System.out.println("1) Hollwood");
System.out.println("2) Bollwood");
System.out.println("3) Lollwood");
System.out.println("Press 1 for Hollywood , 2 for Bollywood , 3 for Lollywood");
Scanner x = new Scanner(System.in);
String inp;
String inc = new String("1");
String ina = new String("2");
String ink = new String("3");
inp = x.nextLine();
}

void Hollywood(){
System.out.println("1) Kingsman");
System.out.println("2) Baby driver");
System.out.println("3) Fast 8");
}
void Bollywood(){
System.out.println("1) Holiday");
System.out.println("2) Race 2");
System.out.println("3) Dangal");
}
void Lollywood(){
System.out.println("1) Verna");
System.out.println("2) Maalik");
System.out.println("3) War");
}}
public class IMDb {


    public static void main(String[] args) {
        
       JFrame myFrame = new JFrame ("IMDb"); //Creates the JFrame otpeca
       JPanel panel = new JPanel();
panel.setBackground(Color.lightGray);
myFrame.getContentPane().add(panel);
JTextField textField1=new JTextField("IMDb");
textField1.setPreferredSize(new Dimension (100, 40));
panel.add(textField1);
JTextField textField=new JTextField();
textField.setPreferredSize(new Dimension (300, 25));
panel.add(textField);
JButton button = new JButton("Search");
panel.add(button);
myFrame.setSize (1400, 700); //width/height in pixels
myFrame.setLocationRelativeTo(null);//it sed to auil, centers in she niadle ct thecreen
myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //states whar happ
myFrame.setVisible(true); //eFvame i dplayed untll Leframe.setvasl

IMDb2 obj = new IMDb2();
obj.front();
Scanner x = new Scanner(System.in);
String inp;
String inc = new String("1");
String ina = new String("2");
String ink = new String("3");
inp = x.nextLine();

if(inp==inc)
{
obj.Hollywood();
}
else if(inp==ina)
{
obj.Bollywood();
}
else if(inp==ink)
{
obj.Lollywood();
}    
}}