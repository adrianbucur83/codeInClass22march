package org.example;

public class SpaceshipFactory<T extends SpaceShip> {

    private final Class<T> shiptype;

    public SpaceshipFactory(Class<T> shiptype) {
        this.shiptype = shiptype;
    }

    public SpaceShip createSpaceShip() throws InstantiationException, IllegalAccessException {
        return shiptype.newInstance();
    }


}
