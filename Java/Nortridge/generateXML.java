import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class generateXML {
    public static void main(String[] args) throws IOException {   

        String mainXML = "";
        String XML1 = "\t<LOAN UpdateFlag=\"1\" AcctRefno=\"";
        String XML2 = "\">\n\t\t<COMMUNICATION>\n\t\t\t<EMAILADDRESSES>\n\t\t\t\t<EMAILADDRESS Operation=\"REMOVE\" Address=\"statements@firstcommercellc.com" + 
        "\"/>\n\t\t\t</EMAILADDRESSES>\n\t\t</COMMUNICATION>\n\t</LOAN>";
        FileWriter fw = new FileWriter("addEmailToAllLoans.xml");
        
        fw.write("<NLS>\n");

        BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("acctrefno.txt"));
            // read first line
			String line = reader.readLine();
			while (line != null) {
				// System.out.println("line = " + line);
                mainXML = XML1 + line + XML2 + "\n";
                fw.write(mainXML);
                // read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

        fw.write("</NLS>");
        fw.close();
    }
}
