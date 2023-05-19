package controller;

import br.com.KauanPaulino.ListaInt.Lista_Int;

public class TabelaController {
	Lista_Int[] vtlista = new Lista_Int[5];
	
	public TabelaController() {
		for(int i=0;i<5;i++) {
			vtlista[i]=new Lista_Int();
		}
	}
	
	public void GeraNovaTabela() {
		int[] vt= {12,647,158,136,467,156,600,551,263,414
				,882,945,914,953,629,884,795,194,513,591,847,66,337,979,
				768,53,114,803,90,339,550,574,977,216,99,617,88,142,148
				,227,939,585,338,206,569,708,844};
		int tamanho = vt.length;
		for(int i=0;i<tamanho;i++) {
			int hash=Hash(vt[i]);
			if(vtlista[hash].isEmpty()) {
				vtlista[hash].addFirst(vt[i]);
			}else {
				try {
					vtlista[hash].addLast(vt[i]);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		MostraNovaTabela();
		
	}

	private void MostraNovaTabela() {
		
		for(int i=0;i<5;i++) {
			int tamanho=vtlista[i].size();
			
			for(int x=0;x<tamanho;x++) {
				try {
					int valor = vtlista[i].get(x);
					System.out.print(valor+" |");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println();
		}
	}

	private int Hash(int n) {
		int pos=n%5;
		return pos;
	}

}
