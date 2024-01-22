package com.dgunther.mtgstore.set;

import com.dgunther.mtgstore.card.Card;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SetRepository extends MongoRepository<Set, ObjectId> {

    Set findSetByDataCode(String code);

}
