package com.mystory;

public class MadLibs {
    /*
    This java program generates a mad libbed story game with filling string with random words.
    Author: Julia
    Date: 26.12.2025
    */
    public static void main(String[] args){

      /*
      String name1 = "Christian";
      String adjective1 = "happy";
      String adjective2 = "wonderful";
      String adjective3 = "loud";
      String verb1 = "speak";
      String noun1 = "student";
      String noun2 = "chocolate";
      String noun3 = "song";
      String noun4 = "meeting";
      String noun5 = "face";
      String noun6 = "Cat";
      String name2 = "Elke";
      int number = 2066;
      String place1 = "Venera";
      */

        String name1 = "Stefan";
        String adjective1 = "sad";
        String adjective2 = "strange";
        String adjective3 = "nice";
        String verb1 = "read";
        String noun1 = "book";
        String noun2 = "marmalade";
        String noun3 = "article";
        String noun4 = "mood";
        String noun5 = "table";
        String noun6 = "balloon";
        String name2 = "Nina";
        int number = 2071;
        String place1 = "Paris";


        //The template for the story
        String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a " +
                adjective2 + " day!' Outside, a bunch of "+noun1+"s were protesting to keep " + noun2 + " in stores. " +
                "They began to " + verb1+" to the rhythm of the " + noun3 + ", which made all the " + noun4 +
                "s very " + adjective3 + ". Concerned, " + name1 + " texted " + name2 + ", who flew " + name1 +
                " to " + place1 + " and dropped " + name1 + " in a puddle of frozen " + noun5 + ". " + name1 +
                " woke up in the year " + number + ", in a world where " + noun6 + "s ruled the world.";

        System.out.println(story);

    }
}