/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class Parser {
    List<PartCounter> parts;
    boolean isInComment;

    public Parser() {
        this.parts = new ArrayList<PartCounter>();
        this.isInComment = false;
    }

    public List<PartCounter> getParts() {
        return parts;
    }

    public void setParts(List<PartCounter> parts) {
        this.parts = parts;
    }

    public boolean isIsInComment() {
        return isInComment;
    }

    public void setIsInComment(boolean isInComment) {
        this.isInComment = isInComment;
    }
    
    public void identify(String line){
        
    }
    
    public boolean isClass(String line){
        boolean result = line.contains("class");
        return result;
    }
    
    public boolean isMethod(String line){
        boolean output = false;
        
        return output;
    }
    
    public int countLines(String line){
        int output = 0;
        output += this.countReservedWords(line);
        output += this.countBySemiColon(line);
        output += this.countConditional(line);
        return output;
    }
    
    public int countConditional(String line){
        int position = line.indexOf("&&");
        int count = 0;
        int lenght = line.length();
        while (position != -1) {
            position = line.indexOf("&&", position+1);
            System.out.println(position);
            count ++;
        }
        position = line.indexOf("||");
        while (position != -1) {
            position = line.indexOf("||", position+1);
            count ++;
        }
        return count;
    }
    
    public int countBySemiColon(String line){
        int position = line.indexOf(";");
        int count = 0;
        int lenght = line.length();
        while (position != -1) {
            position = line.indexOf(";", position+1);
            count ++;
        }
        return count;
    }
    
    public String detectString(String line){
        int pos = line.indexOf("\"");
        int end = line.indexOf("\"",pos);
        if(pos != -1 && end != -1){
            line = line.substring(pos, end);
            return line;
        }
        return line;
    }
    
    public String detectComment(String line){
        int pos1 = line.indexOf("//");
        int pos2 = line.indexOf("/*");
        int end = line.indexOf("*/");
        if(pos1 != -1){
            line = line.substring(pos1);
            return line;
        }else if(pos2 != -1){
            isInComment = true;
            if(end != -1 && pos2 < end){
                line = line.substring(pos2,end);
                isInComment = false;
            }else{return "";}
            return line;
        }
        return line;
               
        /*if(line.matches(".*[//]")){
            pos = line.indexOf("//");
            line = line.substring(pos);
        }else if(line.matches(".*[/*].*")){
            isInComment = true;
            pos = line.indexOf("/*");
            
            //line = line.substring(pos);
            if(line.matches("[\w]*[^/$]")){
                isInComment = true;
                return "";
            }else{
                end = line.indexOf("/");
                line = line.substring(pos,end);
                isInComment = false;
            }
        }*/
    }
    
    public int countReservedWords (String line) {
        int count = 0;
        int lenght = line.length();
        int position = line.indexOf("while");
        while (position != -1) {
            position = line.indexOf("while", position+1);
            System.out.println(position);
            count ++;
        }
        position = line.indexOf("if");
        while (position != -1) {
             position = line.indexOf("if", position+1);
            count ++;
        }
        position = line.indexOf("switch");
        while (position != -1) {
            position = line.indexOf("switch", position+1);
            System.out.println(position);
            count ++;
        }
        position = line.indexOf("for");
        while (position != -1) {
            position = line.indexOf("for", position+1);
            count ++;
        }
        return count;
    }
    
  
}
