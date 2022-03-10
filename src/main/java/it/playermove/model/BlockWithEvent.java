/**
 * 
 */
package it.playermove.model;

import it.playermove.common.Point;
import it.playermove.control.EventService;

public class BlockWithEvent extends Block {
    
    private String dialog;
    private GameObject eventObject;
    
    public BlockWithEvent(final Point position, final String dialog, final GameObject eventObject) {
        this(position, dialog);
        this.eventObject = eventObject;
    }
    
    public BlockWithEvent(final Point position, final String dialog) {
        super(position);
        this.dialog = dialog;
    }
    
    public void execute(final EventService service) {
        service.print(this.dialog);
        if(this.eventObject != null) {
            service.addToBackpack(this.eventObject);
        }
    }

}
