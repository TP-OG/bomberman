package core.state;

import java.awt.Graphics;

import app.controller.GameController;
import app.controller.MapController;
import app.controller.CharacterController;

public class GameState extends State
{
    private MapController mapController;

    private CharacterController characterController;

    public GameState(GameController gameController, CharacterController charactersController)
    {
        super(gameController);
        this.mapController = new MapController(gameController);
        this.characterController = charactersController;
        this.init();
    }

    public void init()
    {   characterController.create(
            CharacterController.builder
                .setType("Kirito")
                .setGame(gameController)
                .setX(250)
                .setY(250)
                .build());
        characterController.create(
            CharacterController.builder
                .setType("Cat")
                .setGame(gameController)
                .setX(300)
                .setY(300)
                .build());
        
        mapController.load("map01");
    }

    public void tick()
    {
        characterController.getPlayer().tick();
        characterController.getCharacters().get(1).tick();
        mapController.getMap().tick();
        

        // make the camera record the player
        gameController.getCameraService().focusOn(characterController.getPlayer());
    }

    public void render(Graphics graphics)
    {
        characterController.getCharacters().get(1).render(graphics);
        mapController.getMap().render(graphics);
        characterController.getPlayer().render(graphics);
        
    }
}
