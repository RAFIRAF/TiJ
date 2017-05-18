package xml;

import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Serializer;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Rafal on 02017-05-18.
 */
class E31Person {
    private String first, last, address;
    public E31Person(String first, String last, String addres) {
        this.first = first;
        this.last = last;
        this.address=addres;
    }
    // Produce an XML Element from this Person object:
    public Element getXML() {
        Element person = new Element("person");
        Element firstName = new Element("first");
        firstName.appendChild(first);
        Element lastName = new Element("last");
        lastName.appendChild(last);
        Element addressEl = new Element("address");
        addressEl.appendChild(address);
        person.appendChild(firstName);
        person.appendChild(lastName);
        person.appendChild(addressEl);
        return person;
    }
    // Constructor to restore a Person from an XML Element:
    public E31Person(Element person) {
        first= person.getFirstChildElement("first").getValue();
        last = person.getFirstChildElement("last").getValue();
        address=person.getFirstChildElement("address").getValue();
    }
    public String toString() { return first + " " + last +" " + address; }
    // Make it human-readable:
    public static void
    format(OutputStream os, Document doc) throws Exception {
        Serializer serializer= new Serializer(os,"ISO-8859-1");
        serializer.setIndent(4);
        serializer.setMaxLength(60);
        serializer.write(doc);
        serializer.flush();
    }
    public static void main(String[] args) throws Exception {
        List<E31Person> people = Arrays.asList(
                new E31Person("Dr. Bunsen", "Honeydew", "Kowala 31, Bytom, PL"),
                new E31Person("Gonzo", "The Great","Kowala 32, Bytom, PL"),
                new E31Person("Phillip J.", "Fry","Kowala 33, Bytom, PL"));
        System.out.println(people);
        Element root = new Element("people");
        for(E31Person p : people)
            root.appendChild(p.getXML());
        Document doc = new Document(root);
        format(System.out, doc);
        format(new BufferedOutputStream(new FileOutputStream(
                "src/xml/E31People.xml")), doc); // craetes the file
    }
}

public class E31 {

}
