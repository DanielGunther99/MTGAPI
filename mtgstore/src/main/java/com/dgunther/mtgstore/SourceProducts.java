package com.dgunther.mtgstore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SourceProducts {

    private List<String> foil;
    private List<String> nonfoil;

}
