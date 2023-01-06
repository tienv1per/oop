module GUIProject {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.desktop;
	opens application to javafx.graphics, javafx.fxml;
}
