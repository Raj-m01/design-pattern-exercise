package net.media.training.designpattern.builder;

public class Builder {

    private StringBuilder builder;
    public Builder() {
        builder = new StringBuilder();
        builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        builder.append("<People>");
    }


    public void addPerson(Person person) {
        builder.append("<Person id=\"").append(person.getId()).append("\" name=\"").append(person.getName()).append("\">");
        builder.append("<Address><City>").append(person.getCity()).append("</City><Country>").append(person.getCountry()).append("</Country></Address>");
        builder.append("</Person>");
    }

    public String getXML(){
        builder.append("</Person>");
        return builder.toString();
    }
}
