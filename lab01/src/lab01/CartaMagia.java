package lab01;

public class CartaMagia {
	private String nome;
	private int ID, dano, custoMana;
	private boolean area;
	
	public CartaMagia(int id, String nome, int dano, int mana, boolean area) {
		this.ID = id;
		this.nome = nome;
		this.dano = dano;
		this.custoMana = mana;
		this.area = area;
	}
	
	public int getID() {
		return this.ID;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getDano() {
		return this.dano;
	}
	
	public int getCustoMana() {
		return this.custoMana;
	}
	
	public boolean getArea() {
		return this.area;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDano(int dano) {
		this.dano = dano;
	}
	
	public void setCustoMana(int custoMana) {
		this.custoMana = custoMana;
	}
	
	public void setArea(boolean area) {
		this.area = area;
	}
	
	@Override
		public String toString() {
		String out = String.format("%s (ID: %o)\nDano = %o\nCusto de Mana = %o\nArea = %b",
				getNome(),
				getID(),
				getDano(),
				getCustoMana(),
				getArea());
		return out;
	}
	
}
