package oop.g8.model.relation.organization;

import java.util.Date;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import oop.g8.model.entity.Country;
import oop.g8.model.entity.Organization;
@RelationshipEntity
@Data @ToString(callSuper=true, includeFieldNames=true)
@NoArgsConstructor
@AllArgsConstructor
public class O2C {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	private String link;

	private Date date;

	@StartNode
	private Organization organization;

	@EndNode
	private Country country;

	public O2C(String type, String link, Date date, Organization organization, Country country) {
		super();
		this.type = type;
		this.link = link;
		this.date = date;
		this.organization = organization;
		this.country = country;
	}

	
}
