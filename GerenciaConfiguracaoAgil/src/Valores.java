public class Valores implements ValoresITF {

	int arrayValores[] = new int[10];

	@Override
	public boolean ins(int v) {
		if (arrayValores.length > 10 || v <= 0) {
			return false;
		}
		
		for (int i = 0; i < arrayValores.length; i++) {
			if (arrayValores[i] == 0) {
				arrayValores[i] = v;
				return true;
			}
		}

		return false;
	}

	@Override
	public int del(int i) {

		boolean listaVazia = true;
		for (int j : arrayValores) {
			if (j > 0) {
				listaVazia = false;
				break;
			}
		}

		int valor = 0;
		if (i >= 0 && i <= 9) {
			valor = arrayValores[i];
			arrayValores[i] = 0;
		}
		

		return !listaVazia ? valor : -1;
	}

	@Override
	public int size() {
		int cont = 0;
		for (int i = 0; i < arrayValores.length; i++) {
			if (arrayValores[i] != 0) {
				cont = cont + 1;
			}
		}
		return cont;
	}

}
