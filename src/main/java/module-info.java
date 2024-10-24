module org.example.classroomdef {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.jfr;
    requires java.desktop;
    requires java.logging;


    opens org.example.classroomdef to javafx.fxml;
    exports org.example.classroomdef;
    exports org.example.classroomdef.control;
    exports org.example.classroomdef.model;
    opens org.example.classroomdef.control to javafx.fxml;
    exports org.example.classroomdef.ui;
    opens org.example.classroomdef.ui to javafx.fxml;
}