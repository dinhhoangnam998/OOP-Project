package oop.g8.repository.relation.event;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.entity.Event;
import oop.g8.model.relation.event.E2O;
import oop.g8.model.relation.event.E2P;

@Repository
public interface E2OR extends Neo4jRepository<E2O, Long> {
	
	List<Event> findTop20OrderByNeo4jId();

	List<E2O> findByEvent_NameAndOrganization_Name(String name1, String name2);

	List<E2O> findByEvent_NameAndType(String name, String type);
}
