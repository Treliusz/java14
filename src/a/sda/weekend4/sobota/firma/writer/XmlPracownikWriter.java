package a.sda.weekend4.sobota.firma.writer;

import a.sda.weekend4.sobota.firma.Pracownik;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class XmlPracownikWriter implements PracownikWriter {
    public String path;

    public XmlPracownikWriter(String path) {
        this.path = path;
    }

    @Override
    public void write(Pracownik[] pracownicy) {
        //todo implement this
        Pracownik pierwszyPracownik = new Pracownik("Jan", "Kowalski", 2000, "email", 2 );

        try {
            JAXBContext context = JAXBContext.newInstance(Pracownik.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(pierwszyPracownik, new File(path));

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
