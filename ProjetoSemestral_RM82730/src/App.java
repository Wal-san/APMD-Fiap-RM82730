import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
	public static void main(String[] args) {
		
		//Criando a janela
		JFrame frame = new JFrame("Fiap Movies");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 420);//tamanho da janela
		frame.setVisible(true);//mostrando a janela
		
		//Criando os painéis
		JPanel cadastro = new JPanel(new BorderLayout(20, 0));
		JPanel imagem = new JPanel();
		JPanel caracteristicas = new JPanel(new GridLayout(0,1));
		JPanel referencias = new JPanel(new GridLayout(0,1));
		referencias.setPreferredSize(new Dimension(130,400));
		JPanel botoes = new JPanel();
		
		cadastro.add(imagem, BorderLayout.WEST);
		cadastro.add(caracteristicas, BorderLayout.CENTER);
		cadastro.add(referencias, BorderLayout.EAST);
		
		//Criando as abas
		JTabbedPane abas = new JTabbedPane();
		abas.add("Cadastro", cadastro);//adicionando as abas
		abas.add("Lista", new JPanel());//adicionando as abas
		frame.add(abas);//colocando as abas no frame
		
		
		//Criação da imagem do cartaz
		JLabel cartaz = new JLabel(new ImageIcon("src/residentEvilExtinction.jpg"));
		cartaz.setPreferredSize(new Dimension(300, 350));
		imagem.add(cartaz);
		
		//Criação das características
		caracteristicas.add(new Legendas("Título", Color.BLACK));
		CaixaTexto tituloFilme = new CaixaTexto();
		caracteristicas.add(tituloFilme);
		
		caracteristicas.add(new Legendas("Sinopse", Color.BLACK));
		AreaTexto sinopseFilme = new AreaTexto();
		caracteristicas.add(sinopseFilme);
		
		caracteristicas.add(new Legendas("Genero", Color.BLACK));
		String[] genero = {"", "Ação", "Aventura", "Comédia", "Documentário", "Drama", "Suspense", "Terror"};
		JComboBox<String> generoFilme = new JComboBox<String>(genero);
		caracteristicas.add(generoFilme);
		
		JButton botaoSalvar = new JButton("Salvar");
		botoes.add(botaoSalvar);
		JButton botaoCancelar = new JButton("Cancelar");
		botoes.add(botaoCancelar);
		caracteristicas.add(botoes);
		
		
		//Criação das referências
		referencias.add(new Legendas("Onde assistir", Color.BLACK));
		List<String> listaDeCanais = List.of("Netflix", "Prime Video", "Pirate Bay");
		GrupoSelecao canais = new GrupoSelecao(listaDeCanais); 
		referencias.add(canais);
		
		JCheckBox assistido = new JCheckBox("Assistido");
		referencias.add(assistido);
		
		referencias.add(new Legendas("Avaliação", Color.BLACK));
		StarRater classificacao = new StarRater(5);
		referencias.add(classificacao);
		
		//Capturando dados digitados
		classificacao.addStarListener(new StarRater.StarListener() {
			
			@Override
			public void handleSelection(int selection) {
				classificacao.setRating(selection);
			
			}
		});
		botaoSalvar.addActionListener(new Filme(tituloFilme, sinopseFilme, canais, generoFilme, assistido, classificacao));
	}
}
