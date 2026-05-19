import java.util.Scanner; 
import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
       Scanner boton = new Scanner(System.in);

        System.out.println("ingresa la cantidad de pacientes: ");
        int cantidad = boton.nextInt();
        boton.nextLine();

       Paciente[] pa = new Paciente[cantidad];

        
        RegistrarPacientes(pa, cantidad, boton);

        
        Mostrar(pa, cantidad);

        CalcularImc(pa,cantidad);
       

    }
    public static void RegistrarPacientes(Paciente pa[], int cantidad, Scanner boton )
    {
        for(int i = 0; i < cantidad; i++)
        {
            pa[i] = new Paciente();

            System.out.println("ingresa el nombre: ");
            pa[i].setNombre(boton.nextLine());

            System.out.println("ingresa el peso: ");
            pa[i].setPeso(boton.nextDouble());
            
            boton.nextLine();
            System.out.println("ingresa la altura: ");
            pa[i].setAltura(boton.nextDouble());
            boton.nextLine();

        }
    }
    public static void Mostrar(Paciente pa[], int cantidad)
    {
        System.out.println("=== Lista de Paciente ====");
        
        for(int i = 0; i < cantidad; i++)
            {
                if(pa[i] != null){
                System.out.println("paciente " + (i + 1));
                System.out.println("Nombre: " + pa[i].getNombre());
                System.out.println("peso: " + pa[i].getPeso() + "Kg");
                System.out.println("Altura: " + pa[i].getAltura());
                }
            }
    }
    public static void CalcularImc(Paciente pa[], int cantidad)
    {
        for(int i = 0; i < cantidad; i++)
        {
            double peso = pa[i].getPeso();
            double altura = pa[i].getAltura();

            double Imc = peso / (altura * altura);

            String texto = " ";
            if(Imc > 18.5)
            {
                texto = " bajo peso";
            }else if(Imc > 18.5 && Imc > 24.9)
            {
                texto = " peso normal";
            }else if(Imc > 24.9 && Imc > 29.9)
            {
                texto = " subido de peso";
            }else 
            {
                texto = " estas obeso";
            }

            System.out.println("=== Indice De Masa Corporar ===");
            System.out.println("tu paciente es: " + pa[i].getNombre() );
            System.out.println("tu indice de masa corporar es: "+ Imc);
            System.out.println("tu condicion es: " + texto);

        }

    }
}