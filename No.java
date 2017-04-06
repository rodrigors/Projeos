package LDE;


public class No<T extends Comparable<T>> {
	private No pro, ant;
	private T item;// comparaHead, comparaTail;
	//LDE lde = new LDE();
	
	
	public No(T iten) {
		this.item=iten;
		pro= null;
		ant=null;
	}
	
	public No() {
		// TODO Auto-generated constructor stub
	}

	public boolean isMenor(No<T> obj){
		return this.item.compareTo(obj.item)<=0;
	}
	
	public boolean isMaiorTail(No<T> obj){
		return this.item.compareTo(obj.item)<=0;
	}
	
	public boolean isMenorHead(No<T> obj){
		return this.item.compareTo(obj.item)>=0;
	}
	
	@Override
	public String toString(){
		return String.format("%s", this.item);
	}

	public No getAnt() {
		return ant;
	}

	public void setAnt(No ant) {
		this.ant = ant;
	}

	public No getPro() {
		return pro;
	}

	public void setPro(No pro) {
		this.pro = pro;
	}

	public Object getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
}
