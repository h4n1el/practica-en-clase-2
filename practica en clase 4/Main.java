import java.io.File;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
public class Main
{
    public static void main(String[] args)
    {
        Scanner boton = new Scanner(System.in);
        int op;
        do{
            System.out.println("ingresa la opcion");
            op = boton.nextInt();
            
            System.out.println("=== Menu ===");
            System.out.println("1. Registrar");
            System.out.println("2. Mostrar");
            System.out.println("3. Salir");

            
            switch(op)
            {
                case 1:
                    RegistrarEstudiante();
                    break;
                case 2:
                    MostrarEstudiante();
                    break;
                case 3:
                    System.out.println("aqui sales pa");
                    break;
                default:
                    System.out.println("aqui salimos apa");        
            }
        }while(op != 3);

    }
    
    public static void RegistrarEstudiante()
       {

        try{

        Scanner boton = new Scanner(System.in);
        FileWriter re = new FileWriter("estudiante.txt", true);
        BufferedWriter b = new BufferedWriter(re);

        
        

        System.out.println("ingresa el nombre del estudiante: ");
        String nombre = boton.nextLine();
        System.out.println("ingesa la matricula del estudiante: ");
        String matricula = boton.nextLine();
        System.out.println("ingresa la edad del estudiante: ");
        int edad = boton.nextInt();
        boton.nextLine();

        b.write(nombre +","+ matricula +"," + edad);
        b.newLine();
        b.close();
        
        
        System.out.println("=== registro de estudiantes ===");
        System.out.println("nombre: " + nombre);
        System.out.println("matricula: "+ matricula);
        System.out.println("edad: " + edad);

        

        }catch(Exception e)
        {
            System.out.println("el archivo no funciona");
        }
       }
       public static void MostrarEstudiante()
       {

        try{
         Scanner boton = new Scanner(System.in);
         FileReader re = new FileReader("estudiante.txt");
         BufferedReader b = new BufferedReader(re);
         String lineas;

         while((lineas=b.readLine()) != null)
         {
            System.out.println(lineas);
         }
         re.close();

        }catch(Exception e)
        {
            System.out.println("no se puede mostrar");
        }
       }
}