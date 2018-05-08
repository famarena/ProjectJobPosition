package it.cegeka.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="required_skill")
public class RequiredSkills {
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="skill")
	private Skill skill;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "id_required_skill")
	private int idRequiredSkill;
	@Column(name="min")
	private int min;
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="position")
	private JobPosition position;
	
	
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	public int getIdRequiredSkill() {
		return idRequiredSkill;
	}
	public void setIdRequiredSkill(int idRequiredSkill) {
		this.idRequiredSkill = idRequiredSkill;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public JobPosition getPosition() {
		return position;
	}
	public void setPosition(JobPosition position) {
		this.position = position;
	}

	
	
}
