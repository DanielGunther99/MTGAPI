package com.dgunther.mtgstore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ForeignData {

    private String flavorText;
    private String language;
    private Integer multiverseId;
    private String name;
    private String text;
    private String type;

}
