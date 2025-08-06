import javax.swing.*;

class maior{
  public static void main(String args[]){
    int a,b;
    a = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 1° número"));
    b = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 2° número"));
    JOptionPane.showMessageDialog(null,"O maior dentre os 2 é: "+devmaior(a,b));
  }
  public static int devmaior(int a, int b){
    a=(a>b)?a:b;
    return a;
  }
}