package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.function.Supplier;

import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.features.CommandsFeature;

public class SelectLoadCommandOptionListener implements ActionListener {

    private final Supplier<? extends DriverCommand> commandSupplier;

    public SelectLoadCommandOptionListener(Supplier<? extends DriverCommand> commandSupplier) {
        this.commandSupplier = Objects.requireNonNull(commandSupplier, "commandSupplier");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CommandsFeature.getDriverCommandManager().setCurrentCommand(commandSupplier.get());
    }
}
