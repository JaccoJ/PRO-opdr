package com.mygdx.game;

import com.badlogic.gdx.math.Rectangle;

/**
 * Created by robin on 4-5-2017.
 */
public class CollisionHandler {
    private Ground ground;
    private Player player1;

    public Rectangle rect;

    public CollisionHandler(Ground g, Player p1) {
        player1 = p1;
        ground = g;
    }

    public void update() {
        if (player1.bBox_left < ground.bBox_right && player1.bBox_right > ground.bBox_left && player1.bBox_bottom < ground.bBox_top && player1.bBox_top > ground.bBox_bottom) {
            if (player1.bBox_bottom - (player1.rectBottom.y - player1.yPrevious) <= ground.bBox_top) {
                player1.rectBottom.y = ground.bBox_top;
                player1.playsound = true;
                player1.vsp = 0;
                player1.collider = 1;
            } else if (player1.bBox_top - (player1.rectBottom.y - player1.yPrevious) >= ground.bBox_bottom) {
                player1.rectBottom.y = ground.bBox_bottom + player1.rectBottom.getHeight();
                player1.vsp = 0;
                player1.collider = 2;
            } else if (player1.bBox_left - (player1.rectBottom.x - player1.xPrevious) >= ground.bBox_right) {
                player1.rectBottom.x = ground.bBox_right;
                player1.hsp = 0;
                player1.collider = 3;
            } else if (player1.bBox_right - (player1.rectBottom.x - player1.xPrevious) <= ground.bBox_left) {
                player1.rectBottom.x = ground.bBox_left - player1.rectBottom.getWidth();
                player1.hsp = 0;
                player1.collider = 4;
            }
        }
        else
        {
            player1.collider = 0;
        }
    }
}


