package de.mayhan.lazer.utils;

import org.bukkit.Location;

public class LocationCalc {
    public static boolean didPlayerMove(Location from, Location to) {
        int resultx = 0;
        int resultz = 0;

        int x1 = from.getBlockX();
        int z1 = from.getBlockZ();

        int x2 = to.getBlockX();
        int z2 = to.getBlockZ();

        // Rechnung 1 Diff: x1/x2
        if (x1 <= x2) {
            resultx = (x2 - x1);
        } else {
            resultx = (x1 - x2);
        }

        //Ergebniss aus X
        if (resultx >= 5){
            return true;
        }


        //Rechnung 2 Diff: z1/z2
        if (z1 <= z2){
            resultz = (z2 - z1);
        } else {
            resultz = (z1 - z2);
        }

        //Ergebnis aus Z
        if (resultz >= 5){
            return true;
        }


        //Falls beide Werte kleiner als 5 sind können sie zusammen immernoch 5 ergeben!
        if (resultx + resultz >= 5){
            return true;
        } else {
            return false;
        }


    }
}
