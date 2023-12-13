package Sep23;
//import java.io.*;
//import java.util.*;
//import javafx.util.Pair;
//
///*
//We are working on a new online game, and as part of the game, we are writing a script editor. We would like to implement some basic auto-complete functionality. As a starting step, we would like to determine how many functions match a given search string.
//
//A function matches the given search string if all of the characters in the search string appear in order (but not necessarily consecutively) in the function. For example, consider the function "replacefirst" and the following search strings:
//
//replacefirst    Search String:
//^^^             "rep" matches
//^      ^        "rf" matches
//       ^ ^      "fr" matches
//                "fre" does NOT match. There is an f and r in order, but no e after them
//
//Write a function that takes in a list of strings representing function names, and a search string, and returns how many strings in the list match the search string.
//
//All Test Cases:
//autocomplete(functions, "li")   => 6
//autocomplete(functions, "rep")  => 3
//autocomplete(functions, "cize") => 1
//autocomplete(functions, "ssh")  => 1
//autocomplete(functions, "sp")   => 3
//autocomplete(functions, "fre")  => 0
//
//Complexity Variables:
//n: The number of functions
//
//
//*/
//
//public class Solution {
//    public static void main(String[] argv) {
//    
//        String[] functions = {"blank", "capitalize", "endswith", "escape", "includes", "indexof", "join", "lastindexof", "lowercase", "requotereplacement", "replace", "replacefirst", "reverse", "split", "splitlines", "startswith", "trim", "trimnewline", "triml", "trimr", "uppercase"};
//  //returnCount(functions,"li");
//  System.out.println(returnCount(functions,"li"));
//  } // end of main 
//  
//  public static int returnCount(String[] input,String searchString)
//  {
//    char[] searchArr = searchString.toCharArray();
//    int inputLength = input.length;
//    ArrayList<Integer> list= new ArrayList<Integer>();
//    String test = "";
//    for(int i=0; i<searchArr.length;i++)
//    {
//      for(int j=0; j<inputLength;j++)
//      {
//        //System.out.println(input[j]);
//        test = input[j];
//        for(int k=0; k < test.length();k++)
//        {
//          if(input[j].charAt(k)==searchArr[i])
//           {
//            list.add(k);
//            temp=true;
//            break;
//            
//          }
//          
//        }
//      }
//    }
//    if(searchArr.length!=list.size())
//    {
//      return 0;
//    }
//    
//    
//    
//    int count=0;
//    boolean temp=false;
//    for(int i=0; i<searchArr.length;i++)
//    {
//      for(int j=0; j<inputLength;j++)
//      {
//        //System.out.println(input[j]);
//        test = input[j];
//        for(int k=0; k < test.length();k++)
//        {
//          if(temp)
//          {
//            k=list.get(list.size()-1);
//          }
//          if(input[j].charAt(k)==searchArr[i])
//           {
//            list.add(k);
//            temp=true;
//            break;
//            
//          }
//       }
//      }
//      ArrayList<Integer> listbefore = list;
//      list.Collections.sort(sortedList);
//      if(list.equals(sortedList))
//      {
//        count++;
//      }
//    }
//    
//    return count;
//  } 
//  
//  
//}
//
//
