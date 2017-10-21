package org.usfirst.frc.team4456.modules;

import org.usfirst.frc.team4456.lib.Module;

public class Drivetrain extends Module {

    boolean stopped;

    @Override
    public void init() {
        stopped = false;
    }

    @Override
    public void main() {

    }

    @Override
    public void stop() {
        stopped = true;
    }

    @Override
    public void writeToSmartDashboard() {

    }
}
