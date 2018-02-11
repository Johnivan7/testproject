package com.matskiv;


import java.util.ArrayList;
import java.util.List;

public class FamilyManager implements InputHandler{
    private List<FamilyMember> familyMembers = new ArrayList<>();
    public FamilyManager(){
        System.out.println("Family manager has been created");
    };

    private void performCommand() {
        System.out.println("Your family count number: "+familyMembers.size());
    }

    private boolean isValidCommand(String temp) {
        if(temp.equals("count_genders")){
          return  true;
        }else{
            return false;
        }
    }

    private boolean isValidInformation(String temp) {
        String[] info = temp.split(" ");
        if(info.length == 4){
            return true;
        }else{
            return  false;
        }
    }

    @Override
    public void handleInput(String temp) {
        if (isValidInformation(temp)){
            System.out.println("You entered valid family member");
            familyMembers.add(familyMemberFromString(temp));
        }else if (isValidCommand(temp)){
            System.out.println("You entered valid command");
            performCommand();
        }else{
            System.out.println("You entered invalid information!");
        }
    }

    private FamilyMember familyMemberFromString(String temp) {
        FamilyMember familyMember = new FamilyMember();
        String[] words = temp.split(" " );
        familyMember.firstName = words[0];
        familyMember.lastName = words[1];
        familyMember.age = Integer.parseInt(words[2]);
        familyMember.gender = words[3].equals("male") ? Gender.male : Gender.female;
        return null;
    }
}
