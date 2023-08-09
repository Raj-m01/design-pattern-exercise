package net.media.training.designpattern.builder;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: path
 * Date: Jul 19, 2011
 * Time: 10:04:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class PeopleDataSource {
    public static String getPeopleXml(List<Person> persons) {
        Builder b=new Builder();
        for(Person person: persons){
            b.addPerson(person);
        }
        return b.getXML();
//        String finalXML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
//        finalXML += "<People number=\"" + persons.size() + "\">";
//        for (Person person : persons) {
//            finalXML += "<Person id=\"" + person.getId() + "\" name=\"" + person.getName() + "\">" +
//                    "<Address><City>" + person.getCity() + "</City><Country>" + person.getCountry() + "</Country></Address>" +
//                    "</Person>";
//        }
//        finalXML += "</People>";
//        return finalXML;
    }
}