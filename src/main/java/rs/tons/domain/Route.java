package rs.tons.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Route {

    private final Integer occurrences;
    private final List<RouteLeg> routeLegs;

    private Route(Integer occurrences, List<RouteLeg> routeLegs) {
        this.occurrences = occurrences;
        this.routeLegs = routeLegs;
    }

    public Integer getOccurrences() {
        return occurrences;
    }

    public List<RouteLeg> getRouteLegs() {
        return routeLegs;
    }

    public static Route create(Integer occurred, List<RouteLeg> routeLegs) {
        return new Route(occurred, routeLegs);
    }

    @Override
    public String toString() {
        return "Occurrences: " + occurrences
                + " route: "
                + routeLegs.stream().map(RouteLeg::toString).collect(Collectors.joining(" -> "));
    }
}
