/*
*Implemente un programa que nos permita agregar 
*La clase ScrapMaterial hereda de las clases 
*ScrapAluminio y ScrapMetal
 */
package scrapmaterial;

interface ScrapAluminio {
   
public default void Reducir() {
System.out.println("Reducir material de Scrap Aluminio");
   }
}
interface ScrapMetal {

    public default void Reducir() {
System.out.println("Reducir material de Scrap Metal ");
   }
}
public class ScrapMaterial implements ScrapAluminio, ScrapMetal{
@Override
public void Reducir() {
//se puede elegir la implementación de una interfaz
//por ejemplo, escogemos que sea VehiculoDiesel
ScrapAluminio.super.Reducir();
}
/*@Override

public void Consumir() {
//se puede elegir la implementación de una interfaz
//por ejemplo, escogemos que sea VehiculoGasolina
VehiculoGasolina.super.Consumir()3;
}*/
public static void main(String[] args) {
        System.out.println("UNIVERDIDAD DE LAS FUERZAS ARMADAS ");
        System.out.println("                ESPE-L            ");
        System.out.println("PROGRAMACION");
        System.out.println("ALUMNO: LENIN ALEXANDER CARRILLO IMBAQUINGO ");
        System.out.println("DOCENTE: ING LUIS GUERRA");
        System.out.println("\n En la Inyección se logr ");
        
ScrapMaterial inyeccion = new ScrapMaterial();
inyeccion.Reducir();
}
}