module com.bayarkhuu.visual {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.prefs;
    requires jakarta.xml.bind;
    requires java.sql;

    exports com.bayarkhuu.visual.labs.lab1;
    exports com.bayarkhuu.visual.labs.lab2;
    exports com.bayarkhuu.visual.labs.lab3;
    exports com.bayarkhuu.visual.labs.lab4;
    exports com.bayarkhuu.visual.labs.lab5;
    exports com.bayarkhuu.visual.labs.lab6;
    exports com.bayarkhuu.visual.labs.lab7;
    exports com.bayarkhuu.visual.labs.lab8;
    exports com.bayarkhuu.visual.labs.lab9;
    exports com.bayarkhuu.visual.home.home2;
    exports com.bayarkhuu.visual.home.home4;
    exports com.bayarkhuu.visual.home.home5;
    exports com.bayarkhuu.visual.home.home6;
    exports com.bayarkhuu.visual.home.home7;
    exports com.bayarkhuu.visual.exam.yawts;
    opens com.bayarkhuu.visual.labs.lab1 to javafx.fxml;
    opens com.bayarkhuu.visual.labs.lab4 to javafx.fxml;
    opens com.bayarkhuu.visual.labs.lab5 to javafx.fxml;
    opens com.bayarkhuu.visual.labs.lab6 to javafx.fxml;
    opens com.bayarkhuu.visual.labs.lab7 to javafx.fxml;
    opens com.bayarkhuu.visual.labs.lab8 to javafx.fxml;
    opens com.bayarkhuu.visual.labs.lab9 to javafx.fxml, jakarta.xml.bind;
    opens com.bayarkhuu.visual.home.home4 to javafx.fxml;
    opens com.bayarkhuu.visual.home.home5 to javafx.fxml;
    opens com.bayarkhuu.visual.home.home6 to javafx.fxml;
    opens com.bayarkhuu.visual.exam.yawts to javafx.fxml;
}