import javax.swing.*;

public class GerenciadorDeDificuldade {
    public void executarDificuldade() {
        String[] dificuldades = {"Fácil", "Médio", "Difícil"}; // Array corrigido

        int dificuldadeEscolhida = JOptionPane.showOptionDialog(null,
                "Selecione a dificuldade:",
                "Escolha a Dificuldade",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                dificuldades,
                dificuldades[0]);

        switch (dificuldadeEscolhida) {
            case 0:
                new MinesweeperFacil();
                break;
            case 1:
                System.out.println("Modo Médio selecionado");
                new MinesweeperMedio();
                break;
            case 2:
                System.out.println("Modo Difícil selecionado");
                new MinesweeperDificil();
                break;
            default:
                System.out.println("Nenhuma dificuldade selecionada. Saindo...");

        }
    }
}
