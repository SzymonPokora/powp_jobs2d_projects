package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigure2OptionListener extends SelectFigureScriptOptionListener {

    public SelectTestFigure2OptionListener(DriverManager driverManager) {
        super(() -> FiguresJoe.figureScript2(driverManager.getCurrentDriver()));
    }
}