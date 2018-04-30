
public class runner {

public static void main(String[] args) {
	Smurf handySmurf= new Smurf("handy");
	Smurf PapaSmurf= new Smurf("Papa");
	Smurf Smurfette= new Smurf("Smurfette");
	handySmurf.eat();
	System.out.println(handySmurf.getName());

	System.out.println(PapaSmurf.getName());
	System.out.println(PapaSmurf.getHatColor());
	System.out.println(PapaSmurf.isGirlOrBoy());

	System.out.println(Smurfette.getName());
	System.out.println(Smurfette.getHatColor());
	System.out.println(Smurfette.isGirlOrBoy());
}

}
