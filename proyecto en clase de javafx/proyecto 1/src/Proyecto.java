import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class Proyecto {

    
    private final double DOLAR = 59.00;
    private final double EURO = 64.00; 

    @FXML private TextField txtMonto;
    @FXML private ComboBox<String> Moneda;
    @FXML private Label lblResultado;
    @FXML private Button btnConvertir;
    @FXML private Button btnLimpiar;
    @FXML private Label Estado;

    @FXML
    private void handleConvertir(ActionEvent event) {
        ejecutarConversion();
    }

    @FXML
    private void handleLimpiar(ActionEvent event) {
        txtMonto.clear();
        Moneda.getSelectionModel().clearSelection();
        lblResultado.setText("Resultado:");
        Estado.setText("Esperando acción del usuario...");
        Estado.getStyleClass().remove("error");
    }
    
    @FXML
    private void handleKeyPressed(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            ejecutarConversion();
        }
    }


    @FXML
    private void handleMouseEntered(MouseEvent event) {
        if (txtMonto.getText().isEmpty()) {
            Estado.setText("Por favor, ingrese un monto...");
        }
    }

    @FXML
    private void handleMouseExited(MouseEvent event) {
        if (txtMonto.getText().isEmpty()) {
            Estado.setText("Esperando acción del usuario...");
        }
    }

    private void mostrarError(String mensaje) {
        Estado.setText(mensaje);
        if (!Estado.getStyleClass().contains("error")) {
            Estado.getStyleClass().add("error");
        }
        lblResultado.setText("Resultado:");
    } 

    @FXML
    private void ejecutarConversion() {
        String montoStr = txtMonto.getText().trim(); 
        String monedaSeleccionada = Moneda.getValue();

        
        if (montoStr.isEmpty()) {
            mostrarError("Error: El monto está vacío.");
            return; 
        }

        double monto;
        
        try {
            monto = Double.parseDouble(montoStr);
            if (monto < 0) {
                mostrarError("Error: El monto no puede ser negativo.");
                return;
            }
        } catch (NumberFormatException e) {
            mostrarError("Error: El monto ingresado no es válido.");
            return;
        }

        
        if (monedaSeleccionada == null) {
            mostrarError("Error: No se ha seleccionado una moneda.");
            return;
        }

        double resultado = 0;
        String simbolo = "";

        String min = monedaSeleccionada.ToLowerCase();
       
        if (min.contains("Dolar")|| min.contains("dólar")) {
            resultado = monto / DOLAR;
            simbolo = "$";
        } else if (min.contains("Euro")|| min.contains("euro")) {
            resultado = monto / EURO;
            simbolo = "€";
        }

        
        Estado.getStyleClass().remove("error");
        lblResultado.setText("Resultado: " + simbolo + String.format("%.2f", resultado));
        Estado.setText("Conversión realizada correctamente.");
    }
}   
