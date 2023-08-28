package taller3.televisores;

public class Control {
	public TV tv;
	
	public void canalUp() {
		this.tv.canalUp();
	}
	public void canalDown() {
		this.tv.canalDown();
	}
	public void volumenlUp() {
		this.tv.canalDown();
	}
	public void volumenDown() {
		this.tv.canalUp();
	}
	public void setCanal(int canal) {
		this.tv.setCanal(canal);
	}
	public int getCanal() {
		return this.tv.getCanal();
	}
	public void setVolumen(int volumen) {
		this.tv.setVolumen(volumen);
	}
	public int getVolumen() {
		return this.tv.getVolumen();
	}
}
