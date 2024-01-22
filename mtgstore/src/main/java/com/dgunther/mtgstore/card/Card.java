package com.dgunther.mtgstore.card;

import com.dgunther.mtgstore.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {

    private String artist;
    private List<String> artistIds;
    private List<String> availability;
    private List<String> boosterTypes;
    private String borderColor;
    private List<String> colorIdentity;
    private List<String> colors;
    private Integer convertedManaCost;
    private List<String> finishes;
    private String flavorText;
    private List<ForeignData> foreignData;
    private String frameVersion;
    private Boolean hasFoil;
    private Boolean hasNonFoil;
    private Identifiers identifiers;
    private Boolean isStorySpotlight;
    private String language;
    private String layout;
    private Legalities legalities;
    private String manaCost;
    private Integer manaValue;
    private String name;
    private String number;
    private String originalText;
    private String originalType;
    private List<String> printings;
    private PurchaseUrls purchaseUrls;
    private String rarity;
    private String securityStamp;
    private String setCode;
    private SourceProducts sourceProducts;
    private List<String> subtypes;
    private List<String> supertypes;
    private String text;
    private String type;
    private List<String> types;
    private String uuid;
    private List<String> variations;

}
