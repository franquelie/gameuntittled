package com.example.gameuntitled.object;

import android.graphics.Canvas;

/**
 * GameObject is an abstract class which is the foundation of all world objects in the game.
 */
public abstract class GameObject {
    protected double positionX = 0;
    protected double positionY = 0;
    protected double velocityX = 0;
    protected double velocityY = 0;
    protected double directionX = 1;
    protected double directionY = 0;

    public GameObject(double positionX, double positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    protected double getPositionX() { return positionX; }
    protected double getPositionY() { return positionY; }

    protected double getDirectionX() { return directionX; }
    protected double getDirectionY() { return directionY; }

    public abstract void draw(Canvas canvas);
    public abstract void update();

    protected static double getDistanceBetweenObjects(GameObject obj1, GameObject obj2) {
        return Math.sqrt(
                Math.pow(obj2.getPositionX() - obj1.getPositionX(), 2) +
                Math.pow(obj2.getPositionY() - obj1.getPositionY(), 2)
        );
    }




}
