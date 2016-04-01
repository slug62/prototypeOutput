package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Accordion;
import javafx.scene.control.TitledPane;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Accordion accord;
    @FXML
    private TitledPane summary;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        accord.setExpandedPane(summary);
    }
}
