import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;

public class Legendas extends JLabel {

	private static final long serialVersionUID = 1L;
	
	//Variáveis locais
	private int tamanho = 18;
	private Color cor = Color.BLACK;

	//Construtores
	public Legendas (String texto){
		super(texto);
		init();
	}
	
	public Legendas (String texto, Color cor){
		super(texto);
		this.cor = cor;
		init();
	}

	//Método de inicialização
	private void init() {
		this.setHorizontalAlignment(JLabel.LEFT);
		this.setForeground(cor);
		this.setFont(new Font(null, Font.BOLD, tamanho));
		this.setPreferredSize(new Dimension(100,50));
	}
}
