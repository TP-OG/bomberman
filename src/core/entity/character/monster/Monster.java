package core.entity.character.MONSTER;

import app.controller.GameController;
import core.entity.character.Character;

public abstract class Monster extends Character{
    public Monster(GameController gameController, float x, float y, int width, int height, int health, int damage,
			float speed) {
                super(gameController, x, y, width, height, health, damage, speed);
                loadCharacterImage();

    }
    
    public void tick()
    {
        //
    }
    
}
