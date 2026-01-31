package fip.challenge_2.database_schema.models;



public enum Gender {
    MALE("MALE"),
    FEMALE("FEMALE");


    private final String gender;
    Gender(String gender){
        this.gender = gender;

    };

    public String getGender(){
        return  gender;
    }


}
