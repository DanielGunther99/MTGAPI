package com.dgunther.mtgstore.set;

import com.dgunther.mtgstore.card.Card;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SetData {

    private Integer baseSetSize;
    private Object booster;
    private List<Card> cards;
    private Integer cardSphereSetId;
    private String code;
    private Boolean isFoilOnly;
    private Boolean isOnlineOnly;
    private String keyRuneCode;
    private List<String> languages;
    private Integer mcmId;
    private Integer mcmIdExtras;
    private String mcmName;
    private String mtgoCode;
    private String name;
    private String releaseDate;
    private List<Object> sealedProduct;
    private Integer tcgplayerGroupId;
    private String tokenSetCode;
    private List<Card> tokens;
    private Integer totalSetSize;
    private Object translations;
    private String type;
}
