package org.entitees;

import java.io.Serializable;

import javax.persistence.*;


@Entity

public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int idClient;
	
	private static final long serialVersionUID = 1L;

	public Client() {
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	
	
   
}
