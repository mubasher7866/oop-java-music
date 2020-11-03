package com.company;

public class Band extends Instruments {

    public Band() {


        MessageCenter.DebugMessage("Band is Playing music");
    }

    public Band(String manufacturer, String playerName) {

        MessageCenter.DebugMessage("Creating a Band with manufacturer and player name");

        setManufacturer(manufacturer);
        setPlayerName(playerName);
    }
}