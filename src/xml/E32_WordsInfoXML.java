package xml;

import nu.xom.Element;

import java.util.Map;

/**
 * Created by Rafal on 02017-05-22.
 */
public class E32_WordsInfoXML {
    static Element getXML(Map.Entry<String,Integer> me){
        Element record = new Element("record");
        Element word = new Element("word");
        word.appendChild(me.getKey());
        Element freq = new Element("frequency");
        freq.appendChild(me.getValue().toString());
        record.appendChild(word);
        record.appendChild(freq);
        return record;
    }
}
