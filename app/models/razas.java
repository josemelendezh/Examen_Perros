package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class razas extends Model{
	public String tipo;
	public String descripcion;
	
	public razas (String tip, String des)
	{
		tipo = tip;
		descripcion = des;
	}

}
