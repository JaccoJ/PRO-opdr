package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by robin on 20-4-2017.
 */
public class Ground {
    public Rectangle rectBottom;
    private Sprite sprite;
    private Texture texture;
    private SpriteBatch batch;
    public float bBox_top;
    public float bBox_bottom;
    public float bBox_left;
    public float bBox_right;
    public Ground(SpriteBatch b)
    {

        batch = b;

        rectBottom = new Rectangle(0f, 0f, 512f, 64f);

        texture = new Texture(Gdx.files.internal("sprites/aap.jpg"));
        sprite = new Sprite(texture, 0, 0, 512, 64);
        bBox_top = rectBottom.y + rectBottom.getHeight();
        bBox_bottom = rectBottom.y;
        bBox_left = rectBottom.x;
        bBox_right = rectBottom.x + rectBottom.getWidth();
    }

    public void setPosition(float x, float y)
    {
        rectBottom.x = x;
        rectBottom.y = y;
    }

    public void update()
    {
        batch.draw(sprite, sprite.getX(),sprite.getY());
        sprite.setPosition(rectBottom.x, rectBottom.y);
        updateHitBox();
//        System.out.println("ground "+ bBox_top);
    }
    private void updateHitBox()
    {
        bBox_top = rectBottom.y +  rectBottom.getHeight();
        bBox_bottom = rectBottom.y;
        bBox_left = rectBottom.x;
        bBox_right = rectBottom.x + rectBottom.getWidth();
    }
}
