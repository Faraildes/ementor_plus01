package gui;

import java.net.URL;
import java.sql.Date;
import java.util.List;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Teacher;
import model.services.TeacherService;

public class TeacherListController implements Initializable { 
	
	private TeacherService service;
	
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
	private TableColumn<Teacher, String> tableColunmChief;
	
	@FXML
	private TableColumn<Teacher, String> tableColunmCoordinator;
	
	@FXML
	private Button btNew;
	
	private ObservableList<Teacher> obsList;
	
	@FXML
	public void onbtNewAction() {
		System.out.println("onbtNewAction");
	}
	
	public void setTeacherService(TeacherService service) {
		this.service = service;
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
		tableColunmCoordinator.setCellValueFactory(new PropertyValueFactory<>("coordinator"));
		
		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewTeacher.prefHeightProperty().bind(stage.heightProperty());
	}
	
	public void updateTableView() {
		if (service == null)
			throw new IllegalStateException("Service was null!");
	
	List<Teacher> list = service.findAll();
	obsList = FXCollections.observableArrayList(list);
	tableViewTeacher.setItems(obsList);
	}
}
