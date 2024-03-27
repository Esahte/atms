package com.kloneborn.model;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TrainSystem {
    public final StationObjects stations;
    public final SegmentObjects segments;
    public final TrainObjects trains;
    public final RouteObjects routes;

    public TrainSystem() {
        this.stations = new StationObjects();
        this.segments = new SegmentObjects();
        this.trains = new TrainObjects();
        this.routes = new RouteObjects();
    }

    public class StationObjects {
        private final Set<Station> stations;
        private final Map<String, Station> lookup = new HashMap<>();

        public StationObjects() {
            this.stations = new HashSet<>();
        }

        public StationObjects(Collection<? extends Station> objects) {
            this.stations = new HashSet<>(objects);
        }

        public StationObjects(Station... objects) {
            this.stations = new HashSet<>(Set.of(objects));
        }

        public boolean add(String station, String... tracksTo) {
            return false;
        }

        public boolean remove(String station) {
            return false;
        }

        public boolean open(String station) {
            return false;
        }

        public boolean close(String station) {
            return false;
        }

        public Station get(String station) {
            return null;
        }

        public Set<Station> all() {
            return Collections.unmodifiableSet(stations);
        }
    }

    public class SegmentObjects {
        private final Set<Segment> segment;
        private final Map<String, Segment> lookup = new HashMap<>();

        public SegmentObjects() {
            this.segment = new HashSet<>();
        }

        public SegmentObjects(Collection<? extends Segment> objects) {
            this.segment = new HashSet<>(objects);
        }

        public SegmentObjects(Segment... objects) {
            this.segment = new HashSet<>(Set.of(objects));
        }

        public boolean add(String stationFrom, String stationTo) {
            return false;
        }

        public boolean remove(String segment) {
            return false;
        }

        public boolean open(String station) {
            return false;
        }

        public boolean close(String station) {
            return false;
        }

        public Segment get(String s1, String s2) {
            return null;
        }

        public Set<Segment> all() {
            return Collections.unmodifiableSet(segment);
        }
    }

    public class TrainObjects {

    }

    public class RouteObjects {

    }
}