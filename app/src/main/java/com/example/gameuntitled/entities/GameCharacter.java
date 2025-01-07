package com.example.gameuntitled.entities;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;


import com.example.gameuntitled.MainActivity;
import com.example.gameuntitled.R;

public enum GameCharacter {

    PLAYER(R.drawable.player_spritesheet);

    private Bitmap spriteSheet;

    GameCharacter(int resId) {
        spriteSheet = BitmapFactory.decodeResource(MainActivity.getGameContext().getResources(), resId);
    }

    public Bitmap getSpriteSheet() {
        return spriteSheet;
    }
}
