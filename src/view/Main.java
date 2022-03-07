package view;

import javax.swing.JOptionPane;

import controller.RedesController;

public class Main {

    public static void main(String[] args) {
        RedesController redController = new RedesController();

        String os = redController.os();
        int opc = 0;
        while (opc!=9){
            opc=Integer.parseInt(JOptionPane.showInputDialog("insira algum comando\n 1 - IpConfig\n 2 - Ping Test	\n 9 - Finalizar\n "));
            switch (opc) {

                case 1:
                    redController.ipConfig(os);
                    break;
                case 2:
                    redController.pingTest(os);
                    break;
                default: System.out.println("opção invalida");
                    break;
                case 9:System.out.println("operação finalizada");
                    break;
            }

        }
    }
}