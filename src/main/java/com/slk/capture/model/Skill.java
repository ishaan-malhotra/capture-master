package com.slk.capture.model;

import java.util.List;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Skill {

	@GraphId
	private Long graphId;

	@Property(name = "skillId")
	private String skillId;

	@Property(name = "skillName")
	private String skillName;

	@Property(name = "skillDescription")
	private String skillDescription;

	@Property(name = "skillType")
	private String skillType;

	@Relationship(type = "SKILLTOPROFILE", direction = Relationship.OUTGOING)
	private List<Profile> profile;

	public Skill() {
		// TODO Auto-generated constructor stub
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getSkillDescription() {
		return skillDescription;
	}

	public void setSkillDescription(String skillDescription) {
		this.skillDescription = skillDescription;
	}

	public String getSkillType() {
		return skillType;
	}

	public void setSkillType(String skillType) {
		this.skillType = skillType;
	}

}
