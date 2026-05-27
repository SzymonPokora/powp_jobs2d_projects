package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.ImmutableCompoundCommandFactory;

public class SelectLoadImmutableRectangleCommandOptionListener extends SelectLoadCommandOptionListener {
    public SelectLoadImmutableRectangleCommandOptionListener() {
        super(() -> ImmutableCompoundCommandFactory.getRectangle(0, 0, 100, 150));
    }
}