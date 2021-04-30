package ar.com.xeven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        for(Cliente cliente: ClienteDAO.getClientes())
            System.out.println(cliente);

        Cliente nuevoCliente = new Cliente("sabri","ceo","discord","3838383","sabri@discord.com");

        ClienteDAO.guardarCliente(nuevoCliente);


    }
}
