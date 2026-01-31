package fip.challenge_2.database_schema.models;




public enum AcademicRank {
    MSC("MSC"),
    PHD("PHD"),
    PROF("PROF");

    private final String rank;

    AcademicRank(String rank) {
        this.rank = rank;

    }

    public String getRank() {
        return rank;
    }

}
