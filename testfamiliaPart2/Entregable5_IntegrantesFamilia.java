package testfamilia;
public class Entregable5_IntegrantesFamilia {
    public static void main ( String args[]) {
    Humano Papá = new Humano ("Roberto Lopez", "lacio", "cafes");
    Humano Mamá = new Humano ("Cristina Ortiz", "castaño", "negros");
    Humano Hijo = new Humano("Abel Lopez", "lacio", "cafes");
    Humano [ ]MiFamilia = new Humano [ 4 ];
    MiFamilia[ 0 ] = Papá;
    MiFamilia[ 1 ] = Mamá;
    MiFamilia[ 2 ] = Hijo;
    MiFamilia[ 3 ] = new Humano ("Brenda Lopez", "castaño", "negros");
    for ( int k = 0; k < 4; k++)    
        System.out.println( MiFamilia [ k ].perfil() );
    
 }

}
