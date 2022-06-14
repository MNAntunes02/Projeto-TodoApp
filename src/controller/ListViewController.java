 
package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Projeto;

public class ListViewController implements Initializable {

    //============================================= VARIAVEIS ==============================================

    @FXML
    private ListView<String> listviewid;

    @FXML
    private Label labelid;

    String[] texto = {"Projeto 1","Projeto 2","Projeto 3"};

    @FXML
    private Button createprojectid;

    @FXML
    private CheckBox checkvisid;

    @FXML
    private TableView<Projeto> tableid;
    
    @FXML
    private TableColumn<Projeto, String> name;

    @FXML
    private TableColumn<Projeto, String> description;

    @FXML
    private TableColumn<Projeto, Date> time;

    @FXML
    private TableColumn<Projeto, Boolean> taskcheck;

    //======================================================================================================


    //============================================= EVENTS =================================================

    //Abrir tela("cad-project.fxml") de cadastro de Projeto
    @FXML
    public void handleButtonAction(ActionEvent event){
        try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../cad-project.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();

        stage.setTitle("Cadastro de Projeto");
        stage.setScene(scene);
        stage.show();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Erro ao abrir janela de cadastro");
        }
    }

    //CheckBox controla visibilidade da tabela
    @FXML
    public void handleCheckBoxAction(ActionEvent event){
        try {

            if (checkvisid.isSelected()) {                
                tableid.setVisible(true);                
            } else {                
                tableid.setVisible(false);
            }

            //System.out.println("Executou o try");
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Erro ao visualizar tabela");
        }
    }

    //=======================================================================================================
    

    //String currentTexto;

    // ObservableList<Projeto> list = FXCollections.observableArrayList(
    //     new Projeto("Tarefa1", "description", new Date(), true),
    //     new Projeto("Tarefa2", "description", null, true),
    //     new Projeto("Tarefa3", "description", null, true)
    // );

    ArrayList<Projeto> list = new ArrayList<Projeto>();
    Projeto p1 = new Projeto("nome1",  "descricao1", null, true);
    Projeto p2 = new Projeto("nome2",  "descricao2", null, true);
    Projeto p3 = new Projeto("nome3",  "descricao3", null, true);
    
    

    // public void getAllNames(){
    //     // ArrayList<String> listnames = new ArrayList<String>();
    //     String[] listnames = new String[3];     
    //     list.toArray(listnames);
    //     System.out.print(listnames);
    // }
    




    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        //Iniciar CheckBox como true
        checkvisid.setSelected(true);              

        //Pegar Items do Array "texto"
        listviewid.getItems().addAll(texto);

        //Definindo tipagem para tabela
        name.setCellValueFactory(new PropertyValueFactory<Projeto, String>("name"));
        description.setCellValueFactory(new PropertyValueFactory<Projeto, String>("description"));
        time.setCellValueFactory(new PropertyValueFactory<Projeto, Date>("time"));
        taskcheck.setCellValueFactory(new PropertyValueFactory<Projeto, Boolean>("taskcheck"));

        //Definindo o estilo Checkbox para coluna bollean
        taskcheck.setCellFactory(CheckBoxTableCell.forTableColumn(taskcheck));

        //Setando valores de "list"
        // tableid.setItems(list);
        
        list.add(p1);
        list.add(p2);
        list.add(p3);


        p1.mostrarConteudo();
        p2.mostrarConteudo();
        p3.mostrarConteudo();
        



        /*
        
        listviewid.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            
            @Override
            public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
                
                currentTexto = listviewid.getSelectionModel().getSelectedItem();
                
                labelid.setText(currentTexto);
                
            }
            
        });
        
        */
        
    }
    
}

  