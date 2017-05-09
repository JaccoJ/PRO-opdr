package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.math.Rectangle;

import java.util.ArrayList;

/**
 * Created by robin on 31-3-2017.
 */
public class Player {
    public Rectangle rectBottom;
    private Sprite sprite;
    private Texture texture;
    public float vsp = 0;
    public float hsp = 0;
    private int move = 0;
    private int right;
    private int left;
    public int collider;
    private float moveSpeed = 5;
    private double grav = -0.3;
    private SpriteBatch batch;
    public float xPrevious;
    public float yPrevious;
    public boolean jumpAble = true;
    public boolean playsound;
    private int jumpSpeed = 4;
    private int jump = 0;
    public float bBox_top;
    public float bBox_bottom;
    public float bBox_left;
    public float bBox_right;

    public TextureAtlas guy;
    private Animation animation;
    private float timePassed = 0;

    private ArrayList<Bullet> bullets;



    public Player(SpriteBatch b, ArrayList<Bullet> bullets)
    {
        this.bullets = bullets;
        batch = b;

        rectBottom = new Rectangle(0f, 0f, 128f, 128f);

        texture = new Texture(Gdx.files.internal("sprites/aap.jpg"));
        sprite = new Sprite(texture, 0, 0, 128, 128);
        this.setPosition(0, 0);

        guy = new TextureAtlas(Gdx.files.internal("sprites/walk.atlas"));
        //Array<Sprite> s = guy.createSprites();
        //System.out.println("inhoud atlas " + s.size);
        animation = new Animation(1/30f, guy.getRegions());
    }


    public void update() {
        Inputs();
        collisionHandeler();
        AddMovement();
        updateHitBox();
    }
    public void update2(){
        Gravity();
        JumpUp();
        for (int i = 0; i < bullets.size(); i++)
        {
            bullets.get(i).update();
            if (bullets.get(i).shouldRemove())
            {
                bullets.remove(i);
                i--;
            }
        }
        batch.draw((TextureRegion) animation.getKeyFrame(timePassed, true), bBox_left, bBox_bottom);
        System.out.println(collider);
        timePassed += Gdx.graphics.getDeltaTime();

        //System.out.println("timepassed" + timePassed);
    }

    private void AddMovement() {
        move = right + left;

        hsp = move * moveSpeed;

        rectBottom.x += hsp;
        rectBottom.y += vsp;

        sprite.setPosition(rectBottom.x, rectBottom.y);
        xPrevious = rectBottom.x;
        yPrevious = rectBottom.y;
    }

    public void setPosition(float x, float y) {
        rectBottom.x = x;
        rectBottom.y = y;
    }

    private void Gravity() {
        if (vsp > -12) {
            vsp += grav;
        }
    }


    private void Inputs() {
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT))
        {
            left = -1;
        } else {
            left = 0;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT))
        {
            right = 1;
        } else {
            right = 0;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.UP))
        {
            jump = 1;
        } else {
            jump = 0;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.SPACE))
        {
            shoot();
        }
    }
    private void JumpUp()
    {
        if  (jumpAble)
        {
            vsp += jump * jumpSpeed;
//            jumpAble = false;
        }
        else
        {
        }
    }
    private void updateHitBox()
    {
        bBox_top = rectBottom.y +  rectBottom.getHeight();
        bBox_bottom = rectBottom.y;
        bBox_left = rectBottom.x;
        bBox_right = rectBottom.x + rectBottom.getWidth();
    }
    private void collisionHandeler()
    {
        if (collider ==0)
        {//none col
            jumpAble = false;
            playsound = false;
        }
        else if (collider == 1)
        {//top
            jumpAble = true;
        }
        else if (collider == 2)
        {//bottom

        }
        else if (collider == 3)
        {//right

        }
        else if (collider == 4)
        {//left

        }
    }
    private void shoot()
    {
        bullets.add(new Bullet(rectBottom.x, rectBottom.y, batch));
    }
}

