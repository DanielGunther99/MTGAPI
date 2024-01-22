package com.dgunther.mtgstore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SealedProduct {

    private Integer cardCount;
    private String category;
    private Object contents;
    private Identifiers identifiers;
    private String name;
    private PurchaseUrls purchaseUrls;
    private String releaseDate;
    private String subtype;
    private String uuid;

}
