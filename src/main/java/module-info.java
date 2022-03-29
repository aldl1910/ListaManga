module es.antoniodominguez.listamanga {
    requires javafx.controls;
    requires java.xml.bind;
    requires jakarta.activation;
    requires java.activation;
    exports es.antoniodominguez.listamanga;
    opens es.antoniodominguez.listamanga to java.xml.bind;
}
