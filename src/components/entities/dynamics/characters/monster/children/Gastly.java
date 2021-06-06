package components.entities.dynamics.characters.monster.children;

import asset.Asset;
import components.actions.attack.AttackAction;
import components.actions.attack.collision.CollisionExplosion;
import components.actions.drop.DropAcction;
import components.entities.dynamics.characters.monster.Monster;
import components.entities.statics.explosions.Explosion;
import components.entities.statics.explosions.children.ExplosionD;

public class Gastly extends Monster{
    
    private int range;

    private Explosion explosion;

    public Gastly(float x, float y) {
        super(x, y);
    }

    @Override
    protected void initializeActions() {
        super.initializeActions();

        this.drop = new DropAcction(this);

        this.attack = new AttackAction(this);
        this.attack = new CollisionExplosion(this.attack, this.explosion, this.range);
    }

    @Override
    protected void setEntityParameters() {
        super.setEntityParameters();

        this.life = 9999;
        this.health = 9999;
        this.range = 2;
        this.speed = 4.0f;
        this.explosion = new ExplosionD();
        this.explosion.setTargets(new String[] { "Player", "Block", });
    }

    @Override
    protected void loadAllFrames() {
        super.loadAllFrames();

        this.upFrames.add(Asset.get("gastly").crop(338, 292, 81, 78));
        this.upFrames.add(Asset.get("gastly").crop(227, 292, 81, 78));
        this.upFrames.add(Asset.get("gastly").crop(117, 292, 81, 78));
        this.upFrames.add(Asset.get("gastly").crop(9, 292, 81, 78));
        this.upFrames.add(Asset.get("gastly").crop(335, 399, 81, 78));
        this.upFrames.add(Asset.get("gastly").crop(228, 399, 81, 78));
        this.upFrames.add(Asset.get("gastly").crop(120, 399, 81, 78));
        this.upFrames.add(Asset.get("gastly").crop(10, 399, 81, 78));
        this.upFrames.add(Asset.get("gastly").crop(336, 486, 81, 78));
        this.upFrames.add(Asset.get("gastly").crop(226, 486, 81, 78));
        this.upFrames.add(Asset.get("gastly").crop(116, 486, 81, 78));
        this.upFrames.add(Asset.get("gastly").crop(11, 486, 81, 78));

        this.downFrames.add(Asset.get("gastly").crop(20, 5, 81, 78));
        this.downFrames.add(Asset.get("gastly").crop(129, 5, 81, 78));
        this.downFrames.add(Asset.get("gastly").crop(239, 5, 81, 78));
        this.downFrames.add(Asset.get("gastly").crop(345, 5, 81, 78));
        this.downFrames.add(Asset.get("gastly").crop(18, 112, 81, 78));
        this.downFrames.add(Asset.get("gastly").crop(127, 112, 81, 78));
        this.downFrames.add(Asset.get("gastly").crop(236, 112, 81, 78));
        this.downFrames.add(Asset.get("gastly").crop(347, 112, 81, 78));
        this.downFrames.add(Asset.get("gastly").crop(18, 199, 81, 78));
        this.downFrames.add(Asset.get("gastly").crop(125, 199, 81, 78));
        this.downFrames.add(Asset.get("gastly").crop(236, 199, 81, 78));
        this.downFrames.add(Asset.get("gastly").crop(343, 199, 81, 78));
        
        this.leftFrames.add(Asset.get("gastly").crop(338, 292, 81, 78));
        this.leftFrames.add(Asset.get("gastly").crop(227, 292, 81, 78));
        this.leftFrames.add(Asset.get("gastly").crop(117, 292, 81, 78));
        this.leftFrames.add(Asset.get("gastly").crop(9, 292, 81, 78));
        this.leftFrames.add(Asset.get("gastly").crop(335, 399, 81, 78));
        this.leftFrames.add(Asset.get("gastly").crop(228, 399, 81, 78));
        this.leftFrames.add(Asset.get("gastly").crop(120, 399, 81, 78));
        this.leftFrames.add(Asset.get("gastly").crop(10, 399, 81, 78));
        this.leftFrames.add(Asset.get("gastly").crop(336, 486, 81, 78));
        this.leftFrames.add(Asset.get("gastly").crop(226, 486, 81, 78));
        this.leftFrames.add(Asset.get("gastly").crop(116, 486, 81, 78));
        this.leftFrames.add(Asset.get("gastly").crop(11, 486, 81, 78));

        this.rightFrames.add(Asset.get("gastly").crop(20, 5, 81, 78));
        this.rightFrames.add(Asset.get("gastly").crop(129, 5, 81, 78));
        this.rightFrames.add(Asset.get("gastly").crop(239, 5, 81, 78));
        this.rightFrames.add(Asset.get("gastly").crop(345, 5, 81, 78));
        this.rightFrames.add(Asset.get("gastly").crop(18, 112, 81, 78));
        this.rightFrames.add(Asset.get("gastly").crop(127, 112, 81, 78));
        this.rightFrames.add(Asset.get("gastly").crop(236, 112, 81, 78));
        this.rightFrames.add(Asset.get("gastly").crop(347, 112, 81, 78));
        this.rightFrames.add(Asset.get("gastly").crop(18, 199, 81, 78));
        this.rightFrames.add(Asset.get("gastly").crop(125, 199, 81, 78));
        this.rightFrames.add(Asset.get("gastly").crop(236, 199, 81, 78));
        this.rightFrames.add(Asset.get("gastly").crop(343, 199, 81, 78));

        this.standFrames.add(Asset.get("gastly").crop(20, 5, 81, 78));

    }

    @Override
    public void tick() {
        super.tick();

        this.attack.attack();
    }

}
