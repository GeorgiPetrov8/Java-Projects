package PokemonTrainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Trainer> trainersList = new LinkedHashMap<>();

        String input = bf.readLine();
        while (!input.equals("Tournament")) {
            String[] tokens = input.split("\\s+");

            String trainerName = tokens[0];
            Trainer trainer = new Trainer(trainerName);

            String pokemonName = tokens[1];
            String element = tokens[2];
            int health = Integer.parseInt(tokens[3]);
            OldPokemon pokemon = new OldPokemon(pokemonName,element,health);

            trainersList.putIfAbsent(trainerName, trainer);
            trainersList.get(trainerName).getCollectionOfPokemon().add(pokemon);

            input = bf.readLine();
        }

        String inputElement = bf.readLine();
        while (!inputElement.equals("End")) {

            if (inputElement.equals("Fire")) {
                for (Trainer trainer : trainersList.values()) {
                    if (trainer.getCollectionOfPokemon().size() > 0) {
                        checkForPokemon(trainer, inputElement);
                    }
                }
            } else if (inputElement.equals("Water")) {
                for (Trainer trainer : trainersList.values()) {
                    if (trainer.getCollectionOfPokemon().size() > 0) {
                        checkForPokemon(trainer, inputElement);
                    }
                }

            } else if (inputElement.equals("Electricity")) {
                for (Trainer trainer : trainersList.values()) {
                    if (trainer.getCollectionOfPokemon().size() > 0) {
                        checkForPokemon(trainer, inputElement);
                    }
                }
            }

            inputElement = bf.readLine();
        }

        for (Trainer trainer : trainersList.values()) {
            trainer.getCollectionOfPokemon().removeIf(pokemon -> pokemon.getHealth() <= 0);
        }

        trainersList.entrySet().stream()
                .sorted((e1,e2) -> Integer.compare(e2.getValue().GetNumberOfBadges(),e1.getValue().GetNumberOfBadges()))
                .forEach(e -> System.out.printf("%s %d %d%n",e.getValue().getName(),e.getValue().GetNumberOfBadges(),
                e.getValue().getCollectionOfPokemon().size()));

    }

    public static void checkForPokemon(Trainer trainer, String inputElement) {
        for (OldPokemon pokemon : trainer.getCollectionOfPokemon()) {
            if (pokemon.getElement().equals(inputElement)) {
                trainer.setNumberOfBadges(trainer.GetNumberOfBadges() + 1);
                break;
            } else {
               pokemon.setHealth(pokemon.getHealth() - 10);

            }
        }
    }
}
