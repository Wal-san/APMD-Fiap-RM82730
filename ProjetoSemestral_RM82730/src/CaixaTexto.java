import java.awt.Dimension;

import javax.swing.JTextField;

public class CaixaTexto extends JTextField {

	private static final long serialVersionUID = 1L;

	public CaixaTexto (){
		super();
		init();
	}
	
	private void init() {
		this.setPreferredSize(new Dimension(200,30));
		this.setBorder(BordaCaixaTexto.criar());
		
	}
}
