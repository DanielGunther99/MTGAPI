package com.dgunther.mtgstore.set;

import com.dgunther.mtgstore.card.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SetService {
    @Autowired
    private SetRepository setRepository;

    public List<Set> allSets() {
        return setRepository.findAll();
    }

    public Set singleSet(String setCode) {
        return setRepository.findSetByDataCode(setCode);
    }


}
