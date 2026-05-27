package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.CompoundCommandFactory;

public class SelectLoadSecretCommandOptionListener extends SelectLoadCommandOptionListener {

    public SelectLoadSecretCommandOptionListener() {
        super(CompoundCommandFactory::createTopSecretCommand);
    }
}