package controller;
 
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Cita;
import utils.ArchivoUtil;
 
public class Principal
{
    @FXML
    private TableView<Cita> TablaCita;
 
    @FXML
    private TableColumn<Cita, String> colCodigo;
 
    @FXML
    private TableColumn<Cita, String> colPaciente;
 
    @FXML
    private TableColumn<Cita, String> colCedula;
 
    @FXML
    private TableColumn<Cita, String> colTelefono;
 
    @FXML
    private TableColumn<Cita, String> colMedico;
 
    @FXML
    private TableColumn<Cita, String> colEspecialidad;
 
    @FXML
    private TableColumn<Cita, String> colFecha;
 
    @FXML
    private TableColumn<Cita, String> colHora;
 
    @FXML
    private TableColumn<Cita, String> colMotivo;
 
    @FXML
    private TableColumn<Cita, String> colEstado;
 
    @FXML
    private Button btnCancelar;
 
    @FXML
    private Button btnCargar;
 
    @FXML
    private Button btnGuardar;
 
    @FXML
    private Button btnLimpiar;
 
    @FXML
    private Button btnRegistrar;
 
    @FXML
    private TextField txtCodigo;
 
    @FXML
    private TextArea txtMotivo;
 
    @FXML
    private TextField txtNombrePaciente;
 
    @FXML
    private TextField txtCedula;
 
    @FXML
    private TextField txtTelefono;
 
    @FXML
    private TextField txtHora;
 
    @FXML
    private DatePicker dpFecha;
 
    @FXML
    private ComboBox<String> cmbEspecialidad;
 
    @FXML
    private ComboBox<String> cmbEstado;
 
    @FXML
    private ComboBox<String> cmbMedico;

    @FXML
    private ObservableList<Cita> lista = FXCollections.observableArrayList()
 
    @FXML
    public void initialize()
    {
        cmbEstado.getItems().addAll("Programada", "Atendida", "Cancelada");
        cmbEspecialidad.getItems().addAll("Cirujano", "nefrologo", "oncologo");
        cmbMedico.getItems().addAll("Saul", "Delcio", "elvert gomez torba");
 
        colCodigo.setCellValueFactory(new PropertyValueFactory<>("codigoCita"));
        colPaciente.setCellValueFactory(new PropertyValueFactory<>("nombrePaciente"));
        colCedula.setCellValueFactory(new PropertyValueFactory<>("cedula"));
        colTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        colMedico.setCellValueFactory(new PropertyValueFactory<>("medico"));
        colEspecialidad.setCellValueFactory(new PropertyValueFactory<>("especialidad"));
        colFecha.setCellValueFactory(new PropertyValueFactory<>("fechaCita"));
        colHora.setCellValueFactory(new PropertyValueFactory<>("hora"));
        colMotivo.setCellValueFactory(new PropertyValueFactory<>("motivoConsulta"));
        colEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));
 
        cargarConsulta();
    }
 
    @FXML
    public void cargarConsulta()
    {
       lista.clear();
       lista.addAll(Archivo.leerListaCita);
       TablaCita.add(lista);
    }
 
    @FXML
    public void RegistrarPaciente()
    {
        guardarCita();
    }
 
    @FXML
    public void limpiarCampos()
    {
        txtCodigo.clear();
        txtMotivo.clear();
        txtNombrePaciente.clear();
        txtCedula.clear();
        txtTelefono.clear();
        txtHora.clear();
        dpFecha.setValue(null);
        cmbMedico.setValue(null);
        cmbEspecialidad.setValue(null);
        cmbEstado.setValue(null);
    }
 
    @FXML
    public void guardarCita()
    {
        String codigo = safe(txtCodigo.getText());
        String nombre = safe(txtNombrePaciente.getText());
        String cedula = safe(txtCedula.getText());
        String telefono = safe(txtTelefono.getText());
        String medico = safe(cmbMedico.getValue());
        String especialidad = safe(cmbEspecialidad.getValue());
        String fecha = (dpFecha.getValue() != null) ? dpFecha.getValue().toString() : "";
        String hora = safe(txtHora.getText());
        String motivo = safe(txtMotivo.getText());
        String estado = safe(cmbEstado.getValue());
 
        if (codigo.isEmpty() || motivo.isEmpty() || nombre.isEmpty()) {
            System.out.println("error no pueden estar vacios los campos");
        } else {
            Cita cita = new Cita(codigo, nombre, cedula, telefono, medico,
                                  especialidad, fecha, hora, motivo, estado);
            ArchivoUtil.guardarCita(cita);
            System.out.println("Cita guardada correctamente");
            limpiarCampos();
            cargarConsulta();
        }
    }
 
   
    private String safe(String valor)
    {
        return (valor == null) ? "" : valor;
    }
 
    @FXML
    public void cancelarCita()
    {
        limpiarCampos();
        Stage stage = (Stage) btnCancelar.getScene().getWindow();
        stage.close();
    }
}














