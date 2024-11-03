package org.hugo.ejerciciop;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import java.net.URL;
import java.util.ResourceBundle;
import org.hugo.ejercicioo.ProductoLabel;

public class ProductoController implements Initializable {
    @FXML
    private ProductoLabel product1;
    @FXML
    private ProductoLabel product2;
    @FXML
    private ProductoLabel product3;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Producto 1
        product1.setImage(new Image(getClass().getResourceAsStream("/images/pan.png")));
        product1.setNombre("Pan");
        product1.setStock(10);
        // Producto 2
        product2.setImage(new Image(getClass().getResourceAsStream("/images/manzana.png")));
        product2.setNombre("Manzana");
        product2.setStock(200);
        // Producto 3
        product3.setImage(new Image(getClass().getResourceAsStream("/images/leche.png")));
        product3.setNombre("Leche");
        product3.setStock(50);
    }
}