import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class Filme implements ActionListener {

	private CaixaTexto tituloFilme;
	private AreaTexto sinopseFilme;
	private GrupoSelecao canais;
	private JComboBox generoFilme;
	private JCheckBox assistido;
	private StarRater classificacao;
	
	public Filme(CaixaTexto tituloFilme, AreaTexto sinopseFilme, GrupoSelecao canais, JComboBox generoFilme,
			JCheckBox assistido, StarRater classificacao) {
		this.tituloFilme = tituloFilme;
		this.sinopseFilme = sinopseFilme;
		this.canais = canais;
		this.generoFilme = generoFilme;
		this.assistido = assistido;
		this.classificacao = classificacao;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("T�tulo: "+tituloFilme.getText());
		System.out.println("Sinopse: "+sinopseFilme.getText());
		System.out.println("Dispon�vel: "+ canais.getValorBotao());
		System.out.println("G�nero: "+generoFilme.getSelectedItem());
		System.out.println("Assistido: "+ assistido.isSelected());
		System.out.println("Classifica��o:  "+ classificacao.getRating());

	}

}
