/**
 * 
 */
package it.playermove;

import java.util.LinkedList;
import java.util.List;

import it.playermove.graphics.Scene;
import it.playermove.graphics.SwingScene;
import it.playermove.model.GameEvent;

public class BaseController {
    
    private static final long PERIOD = 20;
    private Scene view;
    private final List<GameEvent> eventQueue;
    
    public BaseController() {
        this.eventQueue = new LinkedList<>();
    }

    public final void initGame() {
        //this.gameState = new GameState(this);
        //this.controller = new InputControllerImpl();
       this.view = new SwingScene(/*this.gameState, this.controller*/);
    }
    
    public void mainLoop() {
        final long currentTime = System.currentTimeMillis();
        this.processInput();
        this.updateGame();
        this.render();
        this.waitNextFrame(currentTime);
    }
    
    private void processInput() {
        // TODO Auto-generated method stub
        
    }

    private void updateGame() {
        this.eventQueue.stream().forEach(ev->{
            //TODO
        });
    }
    
    private void render() {
        this.view.render();
    }

    private void waitNextFrame(final long current) {
        final long dt = System.currentTimeMillis() - current;
        if (dt < PERIOD) {
            try {
                Thread.sleep(PERIOD - dt);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
