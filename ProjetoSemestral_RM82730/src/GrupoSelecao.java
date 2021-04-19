import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GrupoSelecao extends JPanel {

	private static final long serialVersionUID = 1L;
	
	//Variáveis locais
	private List<String> opcoes;
	private ButtonGroup grupo = new ButtonGroup();
	private String valorBotao;

	public String getValorBotao() {
		return valorBotao;
	}

	//Construtor
	public GrupoSelecao(List<String> opcoes) {
		this.opcoes = opcoes;
		init();
	}
	
	//Inicializador
	private void init() {
		opcoes.forEach(opcao -> {
			JRadioButton botao = new JRadioButton(opcao);
			botao.setPreferredSize(new Dimension(110,15));
			botao.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					valorBotao=opcao;
				}
			});
	  		grupo.add(botao);
	  		this.add(botao);
		});
	}
}
