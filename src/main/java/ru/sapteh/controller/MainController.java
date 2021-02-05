package ru.sapteh.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.sapteh.dao.DAO;

public class MainController {

        @FXML
        private TableColumn<?, ?> Id;

        @FXML
        private TableColumn<?, ?> FirstName;

        @FXML
        private TableColumn<?, ?> LastName;

        @FXML
        private TableColumn<?, ?> Patronymic;

        @FXML
        private TableColumn<?, ?> Birthday;

        @FXML
        private TableColumn<?, ?> RegistrationDate;

        @FXML
        private TableColumn<?, ?> Email;

        @FXML
        private TableColumn<?, ?> Phone;

        @FXML
        private TableColumn<?, ?> Gender;

        
}

