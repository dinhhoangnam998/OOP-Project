package oop.g8.model.relation.location;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import oop.g8.model.entity.Location;
import oop.g8.model.entity.Time;

@RelationshipEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class L2T {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	@StartNode
	private Location location;

	@EndNode
	private Time time;

	public L2T(String type, Location location, Time time) {
		super();
		this.type = type;
		this.location = location;
		this.time = time;
	}

}