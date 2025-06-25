import java.util.Scanner;

public class Dados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade = 1;

        System.out.print("Digite a quantidade de dados (ou pressione Enter para 1): ");
        String entrada = scanner.nextLine();
        if (!entrada.isEmpty()) {
            try {
                quantidade = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Usando 1 dado.");
            }
        }

        int[] resultados = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            resultados[i] = (int)(Math.random() * 6) + 1;
        }

        desenharDados(resultados);
        scanner.close();
    }

    public static void desenharDados(int[] dados) {
        String[][] faces = {
            { // 1
                "+-------+",
                "|       |",
                "|   *   |",
                "|       |",
                "+-------+"
            },
            { // 2
                "+-------+",
                "| *     |",
                "|       |",
                "|     * |",
                "+-------+"
            },
            { // 3
                "+-------+",
                "| *     |",
                "|   *   |",
                "|     * |",
                "+-------+"
            },
            { // 4
                "+-------+",
                "| *   * |",
                "|       |",
                "| *   * |",
                "+-------+"
            },
            { // 5
                "+-------+",
                "| *   * |",
                "|   *   |",
                "| *   * |",
                "+-------+"
            },
            { // 6
                "+-------+",
                "| *   * |",
                "| *   * |",
                "| *   * |",
                "+-------+"
            }
        };

        for (int linha = 0; linha < 5; linha++) {
            for (int dado : dados) {
                System.out.print(faces[dado - 1][linha] + "   ");
            }
            System.out.println();
        }
    }
}
