package testfamilia;
public class ObjetoArreglo_Sups {
public static void main ( String args[]) {
    Humano Batman = new Humano ("Bruno Diaz", "castaño", "cafes");
    Humano HombreAraña = new Humano ("Peter Parker", "castaño", "negros");
    Humano SuperMan = new Humano("Clark Kent", "negro", "azules");
    Humano [ ]superHeroes = new Humano [ 4 ];
    superHeroes[ 0 ] = Batman;
    superHeroes[ 1 ] = HombreAraña;
    superHeroes[ 2 ] = SuperMan;
    superHeroes[ 3 ] = new Humano ("Logan", "negro", "cafes");
    for ( int k = 0; k < 4; k++)    
        System.out.println( superHeroes [ k ].perfil() );
 }   
}
