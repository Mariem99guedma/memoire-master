package com.amazonbestsellingbooks.amazonbestsellingbooks.service;

import org.springframework.stereotype.Service;

@Service
public class BiographyService {



    public String lookForAutoBiographyBookName(String name){
        String returnString = "auto biography : " + name + ", here.";
        return returnString;
    }

    public String lookForFamousBiographyBookName(String name){
        String returnString = "famous biography : "+name+", here.";
        return returnString;
    }
}
