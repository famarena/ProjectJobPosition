package it.cegeka.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="job_position")
public class JobPosition {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "id_candidate")
	private int idPosition;
	@OneToMany(cascade = CascadeType.ALL ,mappedBy = "skill")
	private List<Skill> skills;
	@OneToMany(cascade = CascadeType.ALL ,mappedBy = "interview")
	private List<Interview> interviews;
	@Column(name="sector")
	private Enum Sector;
	@Column(name = "open")
	private boolean open;
	
	public List<Skill> getSkills() {
		return skills;
	}
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	public List<Interview> getInterviews() {
		return interviews;
	}
	public void setInterviews(List<Interview> interviews) {
		this.interviews = interviews;
	}
	public Enum getSector() {
		return Sector;
	}
	public void setSector(Enum sector) {
		Sector = sector;
	}
	public int getIdPosition() {
		return idPosition;
	}
	public void setIdPosition(int idPosition) {
		this.idPosition = idPosition;
	}
	
	
	
	
}
