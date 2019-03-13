package co.simplon.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDao extends Dao<Customer> {

	@Override
	public Customer find(int id) {	
		// Renvoi un objet Client si on trouve dans la table 							
		//T_Customer une occurrence à partir de l’identifiant d'un client, null sinon 						
	}

	@Override
	public boolean create(Customer obj) {
		// Crée une occurrence dans la table T_Customer
		// Renvoi vrai si c’est bon, faux sinon
	}

	@Override
	public boolean update(Customer obj) {
		// Met à jour une occurrence de la table T_Customer
		// Renvoi vrai si c’est bon, faux sinon 		
	}

	@Override
	public boolean delete(Customer obj) { 
		// Supprime une occurrence de la table T_Customer
		// Renvoi vrai si c’est bon, faux sinon 		
	}
}
