/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GasCalculator;

import com.google.maps.GeocodingApi;
import com.google.maps.GeoApiContext;
import com.google.maps.model.GeocodingResult;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author Jack Biscupski
 */
public class Path {
    
    // this class if primarily for using the google maps API to get familiar with it
    public static void main(String[] args) throws Exception {
  
    String base = "https://maps.googleapis.com/maps/api/directions/json?";
    String key = "AIzaSyAMkrhIlwb44LS6SA-Vari3Ojcv4R1rfmk";
    
    GeoApiContext context = new GeoApiContext.Builder().apiKey(key).build();
    GeocodingResult[] results = GeocodingApi.geocode(context, "Iowa City, IA 52240").await();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    System.out.println(gson.toJson(results[0].formattedAddress));
    
    }
}
