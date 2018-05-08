package it.cegeka.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="skill")
public class Skill {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "id_skill")
	private int idSkill;
	@Column(name = "name")
	private String name;
	
	
	public int getIdSkill() {
		return idSkill;
	}
	public void setIdSkill(int idSkill) {
		this.idSkill = idSkill;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
