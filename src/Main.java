import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        JOptionPane.showMessageDialog(null,"E = "+calcularE(n));
    }

    public static double calcularE(int n){
        double e = 1;
        double fracao = 1;
        for(int i = 1; i <= n; i++){
            fracao /= i;
            e += fracao;
        }
        return e;
    }
}
