package com.example.gameuntitled;


import android.graphics.Canvas;
import android.view.SurfaceHolder;



class GameLoop extends Thread {
    private Game game;
    private SurfaceHolder surfaceHolder;
    private boolean isRunning = false;

    public GameLoop(Game game, SurfaceHolder surfaceHolder) {
        this.game = game;
        this.surfaceHolder = surfaceHolder;
    }

    public double getAverageUPS() {
        return 0;
    }

    public double getAverageFPS() {
        return 0;
    }

    public void startLoop() {
        isRunning = true;
        start();
    }

    @Override
    public void run() {
        super.run();

        // Game loop
        Canvas canvas;
        while(isRunning) {

            // Try to update and render game
            try {
                canvas = surfaceHolder.lockCanvas();
                game.update();
                game.draw(canvas);
                surfaceHolder.unlockCanvasAndPost(canvas);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }




            // Pause game loop to not exceed target UPS


            // Skip frames to keep up with target UPS


            // Calculate average UPS and FPS



        }
    }
}
