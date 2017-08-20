/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa2;

/**
 *
 * @author Daniel
 */
public class PartCounter {
    private String name;
    private int lines;
    private int items;

    public PartCounter(String name, int lines, int items) {
        this.name = name;
        this.lines = lines;
        this.items = items;
    }

    public PartCounter() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLines() {
        return lines;
    }

    public void setLines(int lines) {
        this.lines = lines;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }
    
    
}
