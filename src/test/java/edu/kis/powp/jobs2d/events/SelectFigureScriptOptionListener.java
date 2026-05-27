package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class SelectFigureScriptOptionListener implements ActionListener {

    private final Runnable scriptRunner;

    public SelectFigureScriptOptionListener(Runnable scriptRunner) {
        this.scriptRunner = Objects.requireNonNull(scriptRunner, "scriptRunner");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        scriptRunner.run();
    }
}
