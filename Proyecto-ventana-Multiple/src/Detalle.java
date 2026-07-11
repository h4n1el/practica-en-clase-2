import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Detalle
{
    @FXML
    private Label Nombre;

    @FXML
    private Label Carrera;

    @FXML
    private Label Matricula;

    public void setEstudiante(Estudiante estudiante)
    {
        Nombre.setText("Nombre: " + estudiante.getNombre());
        Matricula.setText("Matricula: " + estudiante.getMatricula());
        Carrera.setText("Carrera: " + estudiante.getCarrera());
    }

    @FXML
    private void cerrarVentana()
    {
        Stage estado = (Stage) Nombre.getScene().getWindow();
        estado.close();
    }
}