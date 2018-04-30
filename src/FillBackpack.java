
public class FillBackpack {
public static void main(String[] args) {
	Backpack ironman = new Backpack();
	Ruler Ruler= new Ruler();
	Pencil Pencil= new Pencil();
	Textbook Textbook= new Textbook();
	
	ironman.putInBackpack(Ruler);
	ironman.putInBackpack(Pencil);
	ironman.putInBackpack(Textbook);
	ironman.goToSchool();
	
}
}
