module es.ieslosmontecillos.tableviewcss {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.tableviewcss to javafx.fxml;
    exports es.ieslosmontecillos.tableviewcss;
}