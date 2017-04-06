package LDE;


public class Lista<T extends Comparable<T>> {
	private No head = null, tail = null;
	private int size=0;

	//Adicionando pela Cabeca
	public void addH(T iten) {
		No novo = new No(iten);

		if(isEmpty()){
			head=novo;
			tail=novo;
		} else {
			head.setAnt(novo);
			novo.setPro(head);
			head = novo;
		}
	}

	//Remove na Cabeca
	public Object remH(){
		if(isEmpty()) return null;

		No aux = head;
		if(head.getPro()!=null){
			head=head.getPro();
			head.getAnt().setPro(null);
			head.setAnt(null);
		}else {
			head=null;
			tail=null;
		}
		return aux.getItem();
	}

	//Insere na Cauda
	public void addT(T iten) {
		No novo = new No(iten);

		if(isEmpty()){
			head=novo;
			tail=novo;
		} else {
			novo.setAnt(tail);
			tail.setPro(novo);
			tail = novo;
		}
	}

	//Remove na Cauda
	public Object remT(){
		if(isEmpty()) return null;

		No aux = tail;
		if(tail.getAnt()!=null){
			tail=tail.getAnt();
			tail.getPro().setAnt(null);
			tail.setAnt(null);
		}else {
			head=null;
			tail=null;
		}
		return aux.getItem();	
	}


	//Inssere em ordem alfabetica 
	public void insere(T iten){

		No item = new No(iten);
		No aux= head;
		No comparaHead=head;
		No comparaTail=tail;


		if(head == null){
			head = item;
			tail = item;
		}

		else if(comparaHead.isMenorHead(item))            
			this.addH(iten);

		else if(comparaTail.isMaiorTail(item))
			this.addT(iten);

		else {
			No noIterador = head.getPro();

			while(noIterador.isMenor(item)) 
				noIterador = noIterador.getPro();

			No nodoAnterior = noIterador.getAnt();
			item.setAnt(nodoAnterior);
			item.setPro(noIterador);           
			noIterador.setAnt(item);  
			nodoAnterior.setPro(item);


		}
	}

	public void print(){
		No aux = head;
		while(aux!=null){
			System.out.println("Nome: "+aux.getItem());
			aux=aux.getPro();

		}
	}


	//Verifica se a lista está vazia
	private boolean isEmpty() {
		return head == null;
	}


}
