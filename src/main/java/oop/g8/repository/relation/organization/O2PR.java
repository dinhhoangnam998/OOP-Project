package oop.g8.repository.relation.organization;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import oop.g8.model.relation.organization.O2P;

@Repository
public interface O2PR extends Neo4jRepository<O2P, Long> {

}
