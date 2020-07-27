package com.example.myapplication;


import java.util.regex.Pattern;

public class checkLogin {

    Pattern pDigit = Pattern.compile("^.*[0-9]+.*$");
    Pattern pAnpha = Pattern.compile("^.*[a-z]+.*$");
    Pattern pAnpha1 = Pattern.compile("^.*[A-Z]+.*$");
    Pattern pAnpha2 = Pattern.compile("^.*[!@#$%^&*]+.*$");
    public boolean check(String a){
      if(pDigit.matcher(a).find() && pAnpha.matcher(a).find() && pAnpha1.matcher(a).find()
      && pAnpha2.matcher(a).find()
      )
      {
          return true;
      }
      else return false;
    }


}
