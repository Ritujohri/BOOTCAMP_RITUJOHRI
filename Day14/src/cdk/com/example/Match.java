package cdk.com.example;

public class Match {
    String country1;
    String country2;
    String matchType;
    int score1;
    int score2;
    String winner;

    public Match(String country1, String country2, String matchType, int score1, int score2, String winner) {
        this.country1 = country1;
        this.country2 = country2;
        this.matchType = matchType;
        this.score1 = score1;
        this.score2 = score2;
        this.winner = winner;
    }

    @Override
    public String toString() {
        return  "country1='" + country1 + '\'' +
                ", country2='" + country2 + '\'' +
                ", matchType='" + matchType + '\'' +
                ", score1=" + score1 +
                ", score2=" + score2 +
                ", winner='" + winner + '\'' ;
    }

    public String getCountry1() {
        return country1;
    }

    public String getCountry2() {
        return country2;
    }

    public String getMatchType() {
        return matchType;
    }

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }

    public String getWinner() {
        return winner;
    }
}
