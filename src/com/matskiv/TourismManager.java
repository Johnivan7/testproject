package com.matskiv;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;



public class TourismManager {
    public static List<String> listOfTravel = new ArrayList<>();
    public static List<TourPart> listOfTourParts = new ArrayList<>();
    public static List<String> listOfTravelNewCount = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
//    static TourismManager tourist = new TourismManager();

    public static void main(String[] args) {
        while (1 == 1) {
            System.out.println("Write details of your future trip or command");
            String travelInformation = scanner.nextLine();
            finishInformation(travelInformation);
            //          addCountries(travelInformation);
            //          tourPartFromString(travelInformation);
        }

    }

    public static boolean isItTrueInformation(String travelInformation) {
        String[] countOfWords = travelInformation.split(" ");
        if (countOfWords.length == 3) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValidTripsCommand(String travelInformation) {
        if (travelInformation.equals("Count of my trips")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValidCountriesCommand(String travelInformation) {
        if (travelInformation.equals("Count countries of my trips")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValidClearCommand(String travelInformation) {
        if (travelInformation.equals("Restart count")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * this method performs all basic actions of my program.
     * <p>
     * <p>
     * Hi from Ivan
     *
     * @param travelInformation
     */
    public static void finishInformation(String travelInformation) {
        if (isItTrueInformation(travelInformation)) {
            System.out.println("You entered valid information");
            listOfTravel.add(travelInformation);
            addCountries(travelInformation);
            //           tourPartFromString(travelInformation);
        } else if (isValidTripsCommand(travelInformation)) {
            System.out.println("You entered valid command");
            System.out.println("Count of trips is:" + " " + listOfTravel.size());
        } else if (isValidCountriesCommand(travelInformation)) {
            System.out.println("You entered valid command");
            //           System.out.println("Count countries is:"+" "+listOfTravelNewCount.size());
          calculateCountries();
//            System.out.println("Count countries is:"+" "+setOfTravel.size());
        } else if (isValidClearCommand(travelInformation)) {
            listOfTravel.clear();
            listOfTravelNewCount.clear();
            listOfTourParts.clear();
//            setOfTravel.clear();
        } else if (isValidSaveCommand(travelInformation)){
            try {
                saveInformation();
            } catch (JSONException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("You entered wrong information");
        }
    }

    private static void saveInformation() throws JSONException, IOException {
        if (listOfTourParts!=null && !listOfTourParts.isEmpty()){
            JSONArray jsonArray = new JSONArray();
            for(int i =0; i<listOfTourParts.size(); i++){
                TourPart tourPart = listOfTourParts.get(i);
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("country", tourPart.country);
                jsonObject.put("city", tourPart.city);
                jsonObject.put("year", tourPart.year);
                jsonArray.put(jsonObject);
            }
            FileWriter fileWriter=new FileWriter("my_tour_parts");
            //JSONWriter jsonWriter = new JSONWriter(new FileWriter("my_tour_parts"));
            jsonArray.write(fileWriter);
            fileWriter.close();



        }

    }

    private static boolean isValidSaveCommand(String travelInformation) {
        if (travelInformation.equals("Save")) {
            return true;
        } else {
            return false;
        }
    }

    public static class TourPart {
        String country;
        String city;
        int year;

    }

    public static void tourPartFromString(String travelInformation) {
//        TourPart tourPart = new TourPart();
//        String[] words = travelInformation.split(" ");
//        tourPart.country = words[0];
//        setOfTravel.add(words[0]);
//        tourPart.city = words[1];
//        tourPart.year = Integer.parseInt(words[2]);
    }

    public static void addCountries(String travelinformation) {
        TourPart tourPart = new TourPart();
        String[] countries = travelinformation.split(" ");
        tourPart.country = countries[0];
        tourPart.city = countries[1];
        tourPart.year = Integer.parseInt(countries[2]);
        listOfTourParts.add(tourPart);
        listOfTravelNewCount.add(tourPart.country);
        //     for(int i =0; i<listOfTravelNewCount.size();i++);
    }

    public static void calculateCountries() {
        int count = 0;

        for(int i=0; i<listOfTravelNewCount.size();i++){
            if(i == 0){
                count++;
            } else {
                count++;
                for (int j=0; j<i; j++){
                  if(listOfTravelNewCount.get(i).equals(listOfTravelNewCount.get(j))){
                      count--;
                  }
                }
            }

        }
        System.out.println("Count of countries is:"+" "+count);

    }

    public static void calculateCountries2() {
        int count = 0;

        for(int i=0; i<listOfTravel.size();i++){
            if(i == 0){
                count++;
            } else {
                count++;
                for (int j=0; j<i; j++){
                    if(listOfTravel.get(i).split(" ")[0].equals(listOfTravel.get(j).split(" ")[0])){
                        count--;
                    }
                }
            }

        }
        System.out.println("Count of countries is:"+" "+count);

    }

}

