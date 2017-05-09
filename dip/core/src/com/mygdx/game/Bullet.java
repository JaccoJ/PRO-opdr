package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by robin on 9-5-2017.
 */
public class Bullet {

    private Sprite sprite;
    private Texture texture;
    private SpriteBatch batch;

    public Rectangle rect;



    private float lifeTime;
    private float lifeTimer;



    private boolean remove;

    public Bullet(float x, float y, SpriteBatch b){

        batch = b;

        texture = new Texture(Gdx.files.internal("sprites/aap.jpg"));
        sprite = new Sprite(texture, 0, 0, 16, 16);

        rect = new Rectangle(0f, 0f, 16f, 16f);

        rect.x = x;
        rect.y = y+16f;

        float speed = 350;

        lifeTimer = 0;
        lifeTime = 300;
    }
    public boolean shouldRemove(){ return remove;}
    public void update()
    {
        rect.x += 2;

        batch.draw(sprite, rect.getX(),rect.getY());

        lifeTimer++;

        if (lifeTimer > lifeTime)
        {
            remove = true;
        }
    }
}
