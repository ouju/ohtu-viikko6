package statistics;

import statistics.matcher.*;

class QueryBuilder {

    Matcher matcher;

    public QueryBuilder hasAtLeast(int value, String category) {
        and(new HasAtLeast(value, category));
        return this;
    }

    public QueryBuilder hasFewerThan(int value, String category) {
        and(new HasFewerThan(value, category));
        return this;
    }

    public QueryBuilder not(Matcher matcher) {
        this.matcher = new Not(matcher);
        return this;
    }

    public QueryBuilder or(Matcher... matchers) {
        matcher = new Or(matchers);
        return this;
    }

    public QueryBuilder playsIn(String team) {
        and(new PlaysIn(team));
        return this;
    }

    public Matcher build() {
        Matcher m = matcher;
        matcher = null;
        return m;
    }
    
    private void and(Matcher m){
        if (this.matcher == null){
            this.matcher = new And(m);
        }
        this.matcher = new And(matcher, m);
    }
}
