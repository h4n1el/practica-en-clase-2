package utils;
 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
 
import model.Cita;
 
public class ArchivoUtil
{
 
    public static void guardarCita(Cita cita)
    {
        try {
            FileWriter fw = new FileWriter("Cita.txt", true);
            fw.write(cita.getCodigoCita() + "|" +
            cita.getNombrePaciente()+ "|" +
            cita.getCedula() + "|" +
            cita.getTelefono() + "|" +
            cita.getMedico()+ "|" +
            cita.getEspecialidad() + "|" +
            cita.getFechaCita() + "|" +
            cita.getHora()+ "|" +
            cita.getMotivoConsulta() + "|" +
            cita.getEstado() + "\n");
            fw.close();
 
            System.out.println("Cita guardada en el archivo");
 
        } catch (Exception e) {
            System.out.println("error al guardar " + e.getMessage());
 
        }
 
    }
 
    public static ArrayList<Cita> leerListaCita()
    {
        ArrayList<Cita> listaCitas = new ArrayList<>();
 
        try (FileReader fr = new FileReader("Cita.txt");
             BufferedReader bf = new BufferedReader(fr)) {
 
            String lineas;
 
            while ((lineas = bf.readLine()) != null) {
                if (lineas.isBlank()) continue;
 
                // limit = -1 conserva campos vacios al final (ej: telefono sin llenar)
                String[] parte = lineas.split("\\|", -1);
                if (parte.length == 10) {
                    listaCitas.add(new Cita(
                        parte[0], // codigoCita
                        parte[1], // nombrePaciente
                        parte[2], // cedula
                        parte[3], // telefono
                        parte[4], // medico
                        parte[5], // especialidad
                        parte[6], // fechaCita
                        parte[7], // hora
                        parte[8], // motivoConsulta
                        parte[9]  // estado
                    ));
                } else {
                    System.out.println("linea con formato invalido, se omite: " + lineas);
                }
            }
 
        } catch (Exception e) {
            System.out.println("error al leer " + e.getMessage());
        }
 
        return listaCitas;
    }
 
}
 

















      


            
