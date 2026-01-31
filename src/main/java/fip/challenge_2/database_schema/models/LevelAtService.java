package fip.challenge_2.database_schema.models;

public enum LevelAtService {
    seniorStaff("seniorStaff"),
    juniorStaff("juniorStaff"),
    assistantPersonnel("assistantPersonnel");

    private final  String level;
    LevelAtService(String level) {
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

}
