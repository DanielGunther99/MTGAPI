package com.dgunther.mtgstore.set;

import com.dgunther.mtgstore.card.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class SetController {
    @Autowired
    private SetService setService;
    @GetMapping("sets")
    public ResponseEntity<List<Set>> getAllSets() {
        return new ResponseEntity<List<Set>>(setService.allSets(), HttpStatus.OK);
    }

    @GetMapping("sets/{code}")
    public ResponseEntity<Set> getSingleSet(@PathVariable String code) {
        return new ResponseEntity<Set>(setService.singleSet(code), HttpStatus.OK);
    }

    @GetMapping("cards/")
    public ResponseEntity<List<Card>> getAllCards() {
        List<Set> allSets = setService.allSets();
        List<Card> allCards = new ArrayList<>();
        for(Set set : allSets) {
            allCards.addAll(set.getData().getCards());
        }
        return new ResponseEntity<List<Card>>(allCards, HttpStatus.OK);
    }

    @GetMapping("cards/{code}")
    public ResponseEntity<List<Card>> getAllCardsBySetCode(@PathVariable String code) {
        Set desiredSet = setService.singleSet(code);
        List<Card> allCards = new ArrayList<>(desiredSet.getData().getCards());
        return new ResponseEntity<List<Card>>(allCards, HttpStatus.OK);
    }

    @GetMapping("card/name/{cardName}")
    public ResponseEntity<Card> getCardByName(@PathVariable String cardName) {
        List<Set> allSets = setService.allSets();
        List<Card> allCards = new ArrayList<>();
        Card desiredCard = new Card();
        for(Set set : allSets) {
            allCards.addAll(set.getData().getCards());
        }
        for(Card card : allCards) {
            if(card.getName().equals(cardName)) {
                desiredCard = card;
            }
        }

        return new ResponseEntity<Card>(desiredCard, HttpStatus.OK);

    }

    @GetMapping("card/id/{cardUUID}")
    public ResponseEntity<Card> getCardByUUID(@PathVariable String cardUUID) {
        List<Set> allSets = setService.allSets();
        List<Card> allCards = new ArrayList<>();
        Card desiredCard = new Card();
        for(Set set : allSets) {
            allCards.addAll(set.getData().getCards());
        }
        for(Card card : allCards) {
            if(card.getUuid().equals(cardUUID)) {
                desiredCard = card;
            }
        }

        return new ResponseEntity<Card>(desiredCard, HttpStatus.OK);

    }


}
