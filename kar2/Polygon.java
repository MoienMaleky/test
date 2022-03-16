/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kar2;

/**
 *
 * @author moin
 */
public class Polygon {
    int Sides;
    double size;
    public Polygon(double size,int Sides){
        if(size >= 0){
        this.size = size;
       }else{this.size = 1;
    }}
    public boolean equals(Polygon a){
        return (size == a.size) && (Sides == a.Sides);
    }
    @Override
    public String toString(){
        String out = "";
        out = "size= " + Sides + " size="+ size;
        return out;
    }
    public double mohit(int a, int b){
        int mo;
        mo = a * b;
        return mo;
    }
    
}
