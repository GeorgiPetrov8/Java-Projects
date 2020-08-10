package PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int numberOfBadges;
    private List<OldPokemon> collectionOfPokemon;

    public Trainer(String name) {
        this.name = name;
        this.numberOfBadges = 0;
        this.collectionOfPokemon = new ArrayList<>();
    }
    public List<OldPokemon> getCollectionOfPokemon() {
        return this.collectionOfPokemon;
    }
    public int GetNumberOfBadges() {
        return this.numberOfBadges;
    }
    public String getName() {
        return this.name;
    }
    public void setNumberOfBadges(int numberOfBadges) {
        this.numberOfBadges = numberOfBadges;
    }

}
