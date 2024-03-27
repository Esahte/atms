package com.kloneborn;

import com.kloneborn.model.TrainSystem;

public class TrainSystemDemo {
    public static void main(String[] args) {
        TrainSystem ts = new TrainSystem();
        ts.stations.add("Oakwood Junction Station", "rookshire Parkway Depot", "Maplewood Central Station",
                "Riverside Terminal");
        ts.stations.add("Brookshire Parkway Depot", "Oakwood Junction Station", "Maplewood Central Station",
                "Riverside Terminal");
        ts.stations.add("Maplewood Central Station", "Oakwood Junction Station", "Maplewood Central Station",
                "Riverside Terminal", "Brookshire Parkway Depot", "Sunset Valley Transit Hub");
        ts.stations.add("Riverside Terminal", "Maplewood Central Station", "Riverside Terminal");
        ts.stations.add("Meadowbrook Interchange Station", "Maplewood Central Station", "Riverside Terminal");
        ts.stations.add("Sunset Valley Transit Hub", "Maplewood Central Station", "Riverside Terminal");
    }
}
