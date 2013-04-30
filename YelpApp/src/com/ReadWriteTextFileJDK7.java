package com;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReadWriteTextFileJDK7 
{
	final static String FILE_NAME = "C:\\Users\\fred\\Documents\\SJSU\\CMPE 239\\final project\\YelpData.txt";
	final static String OUTPUT_FILE_NAME = "C:\\Users\\fred\\Documents\\SJSU\\CMPE 239\\final project\\output3.txt";
	final static Charset ENCODING = StandardCharsets.UTF_8;
	
	static List<String> lines = new ArrayList<String>();
	 
  public static void main(String... aArgs) throws IOException
  {
    ReadWriteTextFileJDK7 text = new ReadWriteTextFileJDK7();
    
    //treat as a small file
   // List<String> lines = text.readSmallTextFile(FILE_NAME);
   // log(lines);
  //  lines.add("This is a line added in code.");
   // text.writeSmallTextFile(lines, FILE_NAME);
    
    //treat as a large file - use some buffering
    text.readLargerTextFile(FILE_NAME);
    //lines = Arrays.asList("Down to the Waterline", "Water of Love");
    System.out.println("klasjdflj");
    text.writeLargerTextFile(OUTPUT_FILE_NAME, lines);   
  }

  
  
  //For smaller files
  
  List<String> readSmallTextFile(String aFileName) throws IOException 
  {
    Path path = Paths.get(aFileName);
    return Files.readAllLines(path, ENCODING);
  }
  
  void writeSmallTextFile(List<String> aLines, String aFileName) throws IOException {
    Path path = Paths.get(aFileName);
    Files.write(path, aLines, ENCODING);
  }

  //For larger files
  
  void readLargerTextFile(String aFileName) throws IOException
  {
    Path path = Paths.get(aFileName);
    int i =0;
    try (Scanner scanner =  new Scanner(path, ENCODING.name()))
    {
      while (scanner.hasNextLine())
      {
    	  i++;
        //process each line in some way
       // log(scanner.nextLine());
    	  String s = scanner.nextLine();
    	  if( i > 218215)
    		  lines.add(s);
        
      }      
    }
    catch(Exception e)
    {
    	System.out.println(e.getMessage());
    }
  }
  
  void readLargerTextFileAlternate(String aFileName) throws IOException {
    Path path = Paths.get(aFileName);
    try (BufferedReader reader = Files.newBufferedReader(path, ENCODING)){
      String line = null;
      while ((line = reader.readLine()) != null) {
        //process each line in some way
        log(line);
      }      
    }
  }
  
  void writeLargerTextFile(String aFileName, List<String> aLines) throws IOException {
    Path path = Paths.get(aFileName);
    try (BufferedWriter writer = Files.newBufferedWriter(path, ENCODING)){
      for(String line : aLines){
        writer.write(line);
        writer.newLine();
      }
    }
  }

  private static void log(Object aMsg){
    System.out.println(String.valueOf(aMsg));
  }
  
} 