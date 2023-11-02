package com.campusdual.exercisespoo.exercise15;

public abstract class Merchandise {

    // Propiedades
    protected String name;
    protected String uniqueId;
    protected String responsibleId;
    protected int zone;
    protected String area;
    protected String shelf;
    protected int quantify;

    // Constructores

    public Merchandise(String name, String uniqueID, String responsibleId) {
        this.name = name;
        this.uniqueId = uniqueID;
        this.responsibleId = responsibleId;
    }

    public Merchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantify) {
        this.name = name;
        this.uniqueId = uniqueId;
        this.responsibleId = responsibleId;
        this.zone = zone;
        this.area = area;
        this.shelf = shelf;
        this.quantify = quantify;
    }

    // Getter y Setter


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getResponsibleId() {
        return this.responsibleId;
    }

    public void setResponsibleId(String responsibleId) {
        this.responsibleId = responsibleId;
    }

    public int getZone() {
        return this.zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getShelf() {
        return this.shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public int getQuantify() {
        return this.quantify;
    }

    public void setQuantify(int quantify) {
        this.quantify = quantify;
    }

    // Otros métodos
    public String getLocation(){
        StringBuilder builder = new StringBuilder();

        builder.append("Z - ");
        builder.append(this.getZone());
        builder.append(" A - ");
        builder.append(this.getArea());
        builder.append(" E - ");
        builder.append(this.getShelf());

        return builder.toString();
    }

    public abstract Object getSpecificData();
}
