import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
class A extends JFrame implements ActionListener {
public JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
public JTextField tf1;
public JPanel p;
public String v = "";
public String v1 = "0";
public String op = "";
public A() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(400, 400);
p = new JPanel(new FlowLayout());
tf1 = new JTextField(10);
p.add(tf1);
add(p);
setLayout(new GridLayout(0, 3));
b1 = new JButton("1");
b1.addActionListener(this);
add(b1);
b2 = new JButton("2");
b2.addActionListener(this);
add(b2);
b3 = new JButton("3");
b3.addActionListener(this);
add(b3);
b4 = new JButton("4");
b4.addActionListener(this);
add(b4);
b5 = new JButton("5");
b5.addActionListener(this);
add(b5);
b6 = new JButton("6");
b6.addActionListener(this);
add(b6);
b7 = new JButton("7");
b7.addActionListener(this);
add(b7);
b8 = new JButton("8");
b8.addActionListener(this);
add(b8);
b9 = new JButton("9");
b9.addActionListener(this);
add(b9);
b10 = new JButton("0");
b10.addActionListener(this);
add(b10);
b11 = new JButton("+");
b11.addActionListener(this);
add(b11);
b12 = new JButton("-");
b12.addActionListener(this);
add(b12);
b13 = new JButton("*");
b13.addActionListener(this);
add(b13);
b14 = new JButton("/");
b14.addActionListener(this);
add(b14);
b16 = new JButton("%");
b16.addActionListener(this);
add(b16);
b15 = new JButton("=");
b15.addActionListener(this);
add(b15);
setVisible(true);
}
public void actionPerformed(ActionEvent ae) {
String b = ae.getActionCommand();
switch (b) {
case "1": {
v = v + "1";
tf1.setText(v);
}
break;
case "2": {
v = v + "2";
tf1.setText(v);
}
break;
case "3": {
v = v + "3";
tf1.setText(v);
}
break;
case "4":
{
v
=
v
+ "4";
tf1.setText(v); }
break;
case "5":
{
v
=
v
+ "5";
tf1.setText(v); }
break;
case "6":
{
v
=
v
+ "6";
tf1.setText(v); }
break;
case "7":
{
v
=
v
+ "7";
tf1.setText(v); }
break;
case "8":
{
v
=
v
+ "8";
tf1.setText(v); }
break;
case "9":
{
v
=
v
+ "9";
tf1.setText(v); }
break;
case "0":
{
v
=
v
+ "0";
tf1.setText(v); }
break;
case "+":
{
op
= "+";
v1 = tf1.getText(); v = ""; }
break;
case "-":
{
op = "-";
v1 = tf1.getText(); v = ""; }
break;
case "*":
{
op
= "*";
v1
= tf1.getText();
v = "";
}
break;
case "/": {
op = "/";
v1 =tf1.getText();
v = "";
}
break;
case "%": {
op = "%";
v1 = tf1.getText();
v = "";
}
break;
case "=": {
switch (op) {
case "+": {
v = tf1.getText();
if (v.equals("")){
v = "0";
}
long i = Long.parseLong(v1) + Long.parseLong(v);
tf1.setText(String.valueOf(i));
v="";
}
break;
case "-": {
v = tf1.getText();
if (v.equals("")){
v = "0";
}
long i = Long.parseLong(v1) - Long.parseLong(v);
tf1.setText(String.valueOf(i));
v="";
}
break;
case "*": {
v = tf1.getText();
if (v.equals("")){
v = "0";
}
long i = Long.parseLong(v1) * Long.parseLong(v);
tf1.setText(String.valueOf(i));
v="";
}
break;
case "/": {
try {
v = tf1.getText();
if (v.equals("")) {
v = "0";
}
long i = Long.parseLong(v1) / Long.parseLong(v);
tf1.setText(String.valueOf(i));
v="";
} catch (Exception ex) {
JOptionPane.showMessageDialog(this, ex.getMessage());
}
}
break;
case "%": {
try {
v = tf1.getText();
if (v.equals("")){
v = "0";
}
long i = Long.parseLong(v1) % Long.parseLong(v);
tf1.setText(String.valueOf(i));
v="";
} catch (Exception ex) {
JOptionPane.showMessageDialog(this, ex.getMessage());
}
}
break;
}
}
break;
}
}
}
public class Calc {
public static void main(String[] args) {
A a = new A();
}
}