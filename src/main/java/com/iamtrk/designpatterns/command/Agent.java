package com.iamtrk.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

public class Agent {

    private List<Command> commands = new ArrayList<>();

    public void placeCommand(Command command) {
        commands.add(command);
        command.execute();
    }
}
