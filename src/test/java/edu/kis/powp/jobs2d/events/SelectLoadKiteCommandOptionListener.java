package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.CompoundCommandFactory;

public class SelectLoadKiteCommandOptionListener extends SelectLoadCommandOptionListener {

    public SelectLoadKiteCommandOptionListener() {
        super(CompoundCommandFactory::createKiteCommand);
    }
}