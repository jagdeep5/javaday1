/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author macstudent
 */
public class Student {

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSnm() {
        return snm;
    }

    public void setSnm(String snm) {
        this.snm = snm;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    int sid ;
    String snm ;
    float total; 
    public void setData(int sid, String snm, float total)
    {
        this.sid = sid;
        this.snm = snm;
        this.total = total;
    }
    public void getData()
    {
        System.out.println(sid +"  "+snm+" "+total);
        
    }
}
