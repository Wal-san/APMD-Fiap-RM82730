import java.awt.Color;

import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public abstract class BordaCaixaTexto {

	public static Border criar() {
		return new LineBorder(Color.GRAY);
	}
}
