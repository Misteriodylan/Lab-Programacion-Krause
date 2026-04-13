package dylan;

public class Main {

	public static void main(String[] args) {
		Veterinarios vete1=new Veterinarios("1102","Dylan");
		Veterinarios vete2=new Veterinarios("2029","Eric");
		Veterinarios vete3=new Veterinarios("1192","Joey");
		Gatos g1=new Gatos("Romeo","09-07-2008");
		Gatos g2=new Gatos("Luna","12/03/2021");
		Gatos g3=new Gatos("Mia","30/06/2021");
		Gatos g4=new Gatos("Nala","05/02/2023");
		Gatos g5=new Gatos("Coco","11/12/2022");
		Perros p1=new Perros("Max","25/07/2020");
		Perros p2=new Perros("Rocky","14/01/2019");
		Perros p3=new Perros("Toby","19/09/2020");
		Perros p4=new Perros("Bruno","27/08/2018");
		vete1.AgregarAnimales(g1);
		vete1.AgregarAnimales(g2);
		vete1.AgregarAnimales(p1);
		
		vete2.AgregarAnimales(g3);
		vete2.AgregarAnimales(g4);
		vete2.AgregarAnimales(p2);
		
		vete3.AgregarAnimales(g5);
		vete3.AgregarAnimales(p3);
		vete3.AgregarAnimales(p4);
		
		vete1.mostrarAnimales();
		vete2.mostrarAnimales();
		vete3.mostrarAnimales();
	}

}
