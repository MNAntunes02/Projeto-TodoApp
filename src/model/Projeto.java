package model;

import java.util.Date;

public class Projeto {
    
    private String name;
    private String description;
    private Date time;
    private Boolean taskcheck;
    
    public Projeto(String name, String description, Date time, Boolean taskcheck) {
        this.name = name;
        this.description = description;
        this.time = time;
        this.taskcheck = taskcheck;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }
    public Boolean getTaskcheck() {
        return taskcheck;
    }
    public void setTaskcheck(Boolean taskcheck) {
        this.taskcheck = taskcheck;
    }
    public void mostrarConteudo(){
        System.out.println("=================");
        System.out.println(this.getName());
        System.out.println(this.getDescription());
        System.out.println(this.getTime());
        System.out.println(this.getTaskcheck());
        System.out.println("=================");
    }

}
