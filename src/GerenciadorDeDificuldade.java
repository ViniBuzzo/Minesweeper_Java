import javax.swing.*;

public class GerenciadorDeDificuldade {
    public void executarDificuldade() {
        String[] dificuldades = {"Fácil", "Médio", "Difícil", "IMPOSSÍVEL"}; // Array corrigido

        int dificuldadeEscolhida = JOptionPane.showOptionDialog(null,
                "Selecione a dificuldade:",
                "Escolha a Dificuldade",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                dificuldades,
                dificuldades[0]);

        if (dificuldadeEscolhida != JOptionPane.CLOSED_OPTION) {
            // Fecha a janela atual antes de iniciar uma nova dificuldade
            if (MinesweeperFacil.currentFrame != null) {
                MinesweeperFacil.currentFrame.dispose();
            }
            if (MinesweeperMedio.currentFrame != null) {
                MinesweeperMedio.currentFrame.dispose();
            }
            if (MinesweeperDificil.currentFrame != null) {
                MinesweeperDificil.currentFrame.dispose();
            }
            if (MinesweeperImpossivel.currentFrame != null) {
                MinesweeperImpossivel.currentFrame.dispose();
            }


            switch (dificuldadeEscolhida) {
                case 0:
                    new MinesweeperFacil();
                    break;
                case 1:
                    new MinesweeperMedio();
                    break;
                case 2:
                    new MinesweeperDificil();
                    break;
                case 3:
                    new MinesweeperImpossivel();
                    break;
                default:
                    System.out.println("Nenhuma dificuldade selecionada. Saindo...");

            }
        }
    }
}
