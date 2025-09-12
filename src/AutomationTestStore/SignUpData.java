package AutomationTestStore;

import java.util.Random;

public class SignUpData {
	Random rand=new Random();
  String [] TheFirstNames= {"Mohammad","Shahed","Ahmad","Maram","Ola","Qusai","Hamza"};
  String [] TheLastNames = {"Mazen","Suhail","Khaled","Jamal","Rami","Yahia","Fadi"};
  int RandomEmailNumber= rand.nextInt(9323);
  String domain ="@gmail.com";
  int RandomFirstNameIndex=rand.nextInt(TheFirstNames.length);
  int RandomLastNameIndex=rand.nextInt(TheLastNames.length);
  
  String FirstName=TheFirstNames[RandomFirstNameIndex];
  String LastName= TheLastNames[RandomLastNameIndex];
  String Email= FirstName+LastName+RandomEmailNumber+domain;
  String TheTelephone="+962798648671";
  String TheAddressOne="Amman-Tabarbour";
  int RandomStateSelectIndex=rand.nextInt(1,10);
  String TheZipCode="200785711";
  String loginName=FirstName+LastName+RandomEmailNumber;
  String password= "p@$$word";
  String ExpectedResult ="YOUR ACCOUNT HAS BEEN CREATED!";
  String ExpectedResult2 ="ACCOUNT LOGOUT";
  
  
}
