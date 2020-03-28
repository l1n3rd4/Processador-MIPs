package arquivo;

import java.io.*;

public class GravarArquivo {

	private BufferedWriter saida;

	public void abrirArquivo(String nomeArquivo, String caminho) {

		try {
			saida = new BufferedWriter(new FileWriter(caminho + nomeArquivo));
		} catch (FileNotFoundException excecao) {
			System.out.println("Arquivo nÃ£o encontrado");
		} catch (IOException excecao) {
			System.out.println("Erro na abertura do arquivo de escrita: " + excecao);
		}
	}

	public void fecharArquivo() {

		try {
			saida.close();
		} catch (IOException excecao) {
			System.out.println("Erro no fechamento do arquivo de escrita: " + excecao);
		}
	}

	public void escrever(String textoEntrada) {

		try {
			saida.write(textoEntrada);
			saida.newLine();
		} catch (IOException excecao) {
			System.out.println("Erro de entrada/saÃ­da " + excecao);
		}
	}
}