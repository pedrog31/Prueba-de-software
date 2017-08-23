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
    
    public void identify(String line) {
        String aux = "";
        aux = detectComment(line);
        
        if (!parts.isEmpty() && !line.equals(aux)) {
            parts.get(parts.size() - 1).addLines(1);
        } else {
            line = detectString(aux);
            aux = getClass(line);
            if (!aux.equals(line)) {
                parts.add(new PartCounter(aux, 1, 0));
            } else if (isMethod(line)) {
                parts.get(parts.size() - 1).addItem();
                parts.get(parts.size() - 1).addLines(1);
            } else {
                parts.get(parts.size() - 1).addLines(countLines(line));
            }
        }
        
    }
    
    public String getClass(String line) {
        int posicionInicial = line.indexOf("class ");
        if (posicionInicial == -1) {
            return line;
        }
        int posicionFinal = line.indexOf(" ", posicionInicial + 6);
        return line.substring(posicionInicial + 6, posicionFinal);
    }
    
    public boolean isMethod(String line) {
        if(line.matches("^( |\\t)*" //Spaces or tabs at the start of the line
                + "((public|private|protected){1} {1}){0,1}" //Access modifiers
                + "[a-zA-Z]+ {1}" //Type of return
                + "[a-zA-Z]+" //Name of method
                + "[(]{1}"  //Open parenthesis for params 
                + "([a-zA-Z]+ {1}[a-zA-Z]+([,]{1} {1}[a-zA-Z]+ {1}[a-zA-Z]+)*)*" //params
                + "[)]{1} {1}"  //Close parenthesis
                + "[{]{1}$")) { //end of the line
            return true;
        } else {
            return false;
        }
    }
    
    public int countLines(String line) {
        int output = 0;
        output += this.countReservedWords(line);
        output += this.countBySemiColon(line);
        output += this.countConditional(line);
        return output;
    }
    
    public int countConditional(String line) {
        int position = line.indexOf("&&");
        int count = 0;
        int lenght = line.length();
        while (position != -1) {
            position = line.indexOf("&&", position+1);
            count ++;
        }
        position = line.indexOf("||");
        while (position != -1) {
            position = line.indexOf("||", position+1);
            count ++;
        }
        return count;
    }
    
    public int countBySemiColon(String line) {
        int position = line.indexOf(";");
        int count = 0;
        int lenght = line.length();
        while (position != -1) {
            position = line.indexOf(";", position+1);
            count ++;
        }
        return count;
    }
    
    public String detectString(String line) {
        int pos = line.indexOf("\"");
        int end = line.indexOf("\"",pos+1);
        if(pos != -1 && end != -1) {
            line = line.substring(0, pos)+line.substring(end+1, line.length());
            return line;
        }
        return line;
    }
    
    public String detectComment(String line) {
        int pos1 = line.indexOf("//");
        int pos2 = line.indexOf("/*");
        int end = line.indexOf("*/");
        if(pos1 != -1) {
            line = line.substring(0,pos1);
            return line;
        }else if(pos2 != -1) {
            isInComment = true;
            if(end != -1 && pos2 < end) {
                line = line.substring(0,pos2)+line.substring(end+2,line.length());
                isInComment = false;
            }else{return "";}
            return line;
        }
        return line;
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
