package oop.g8.model.relation.event;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import oop.g8.model.entity.Entity;
import oop.g8.model.entity.Event;
import oop.g8.model.entity.Source;
import oop.g8.model.entity.Time;

@RelationshipEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class E2T {
	@Id
	@GeneratedValue
	private Long neo4jId;

	private String type;

	@StartNode
	private Event event;

	@EndNode
	private Time time;

	public E2T(String type, Event event, Time time) {
		super();
		this.type = type;
		this.event = event;
		this.time = time;
	}

}
