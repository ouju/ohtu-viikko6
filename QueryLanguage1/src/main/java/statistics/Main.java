package statistics;

import statistics.matcher.*;

public class Main {

    public static void main(String[] args) {
        Statistics stats = new Statistics(new PlayerReaderImpl("http://nhlstatistics.herokuapp.com/players.txt"));

        QueryBuilder query = new QueryBuilder();
        Matcher m = query.or(
                        query.playsIn("PHI")
                             .hasAtLeast(10, "goals")
                             .hasFewerThan(35, "assists").build(),

                        query.playsIn("EDM")
                             .hasAtLeast(1, "points").build()
                       ).build();
        
        for (Player player : stats.matches(m)) {
            System.out.println( player );
        }
    }
}
