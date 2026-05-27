package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener extends SelectFigureScriptOptionListener {

    public SelectTestFigureOptionListener(DriverManager driverManager) {
        super(() -> FiguresJoe.figureScript1(driverManager.getCurrentDriver()));
    }
}
