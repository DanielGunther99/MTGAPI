package com.dgunther.mtgstore.set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sets")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Set {

    @Id
    private ObjectId id;
    private SetMeta meta;
    private SetData data;

}
