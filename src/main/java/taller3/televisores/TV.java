package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal;
	private int precio;
	public boolean estado;
	private int volumen;
	private Control control;
	public static int numTV = 0;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.volumen=1;
		this.precio=500;
		numTV++;	
	}
	public void turnOn() {
		if (this.estado = false) {
			this.estado = true;
		}
	}
	public void turnOff() {
		if (this.estado = true) {
			this.estado = false;	
		}
	}	
	public void canalUp() {
		if(canal < 120 && estado == true) {
			this.canal ++;	
		}
	}
	public void canalDown() {
		if(canal > 1 && estado== true ) {
			this.canal --;
		}
	}
	public void volumenUp() {
		if( volumen < 7 && estado == true) {
			this.volumen ++;
		}
	}
	public void volumenDown() {
		if(volumen > 0 && estado==true) {
			this.volumen --;
		}
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;		
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if(canal >= 1 && canal < 120 && estado == true) {
			this.canal = canal;
		}	
	}
	public int getPrecio() {
		return precio;	
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getVolumen() {
		return volumen;	
	}
	public void setVolumen(int volumen) {
		if(volumen >= 0 && volumen < 7 && estado == true) {
			this.volumen = volumen;
		}	
	}
	public Control getControl() {
		return control;
	}	
	public void setControl(Control control) {
		this.control = control;
	}
	public boolean getEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public static void setNumTV(int num) {
		numTV = num;
	}
	public static int getNumTV() {
		return numTV;
	}

}
	
