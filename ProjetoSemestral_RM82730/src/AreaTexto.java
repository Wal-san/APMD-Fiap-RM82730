import java.awt.Component;

import javax.swing.JTextArea;

public class AreaTexto extends JTextArea {

	private static final long serialVersionUID = 1L;

	private int linhas = 10;
	private int colunas = 15;
	
	public AreaTexto() {
		super();
		init();
	}

	private void init() {
		this.setRows(linhas);
		this.setColumns(colunas);
		this.setBorder(BordaCaixaTexto.criar());
	}
}
