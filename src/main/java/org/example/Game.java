package org.example;

public class Game {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        SpaceshipFactory<DeathStar> deathStarSpaceshipFactory = new SpaceshipFactory<>(DeathStar.class);

        SpaceShip spaceShip1 = deathStarSpaceshipFactory.createSpaceShip();

        spaceShip1.attack();

    }
}
