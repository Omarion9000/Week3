module org.example.week3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.week3 to javafx.fxml;
    exports org.example.week3;
}