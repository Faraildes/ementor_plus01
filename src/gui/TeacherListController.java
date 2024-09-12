package gui;

import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Teacher;

public class TeacherListController implements Initializable {
	
	@FXML
	private TableView<Teacher>  tableViewTeacher;
	
	@FXML
	private TableColumn<Teacher, Integer> tableColunmId;
	
	@FXML
	private TableColumn<Teacher, String> tableColunmName;
	
	@FXML
	private TableColumn<Teacher, String> tableColunmCpf;
	@FXML
	private TableColumn<Teacher, String> tableColunmPhone;
	
	@FXML
	private TableColumn<Teacher, Date> tableColunmAdmissionDate;
	
	@FXML
	private TableColumn<Teacher, Double> tableColunmSalary;
	
	@FXML
	private TableColumn<Teacher, Boolean> tableColunmChief;
	
	@FXML
	private TableColumn<Teacher, Boolean> tableColunmChiefCoordinator;
	
	@FXML
	private Button btNew;
	
	@FXML
	public void onbtNewAction() {
		System.out.println("onbtNewAction");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	} 

	private void initializeNodes() {
		tableColunmId.setCellValueFactory(new PropertyValueFactory<>("id"));
		tableColunmName.setCellValueFactory(new PropertyValueFactory<>("name"));
		tableColunmCpf.setCellValueFactory(new PropertyValueFactory<>("cpf"));
		tableColunmPhone.setCellValueFactory(new PropertyValueFactory<>("phone"));
		tableColunmAdmissionDate.setCellValueFactory(new PropertyValueFactory<>("admissionDate"));
		tableColunmSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
		tableColunmChief.setCellValueFactory(new PropertyValueFactory<>("chief"));
		tableColunmChiefCoordinator.setCellValueFactory(new PropertyValueFactory<>("chiefCordinator"));
		
		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewTeacher.prefHeightProperty().bind(stage.heightProperty());
	}
}
