module es.antoniodominguez.listamanga {
    requires javafx.controls;
    requires java.xml.bind;
    requires jakarta.activation;
    requires java.activation;
    requires java.desktop;
    requires java.logging;
    exports es.antoniodominguez.listamanga;
    opens es.antoniodominguez.listamanga to java.xml.bind;
    requires javafx.graphicsEmpty;
}
