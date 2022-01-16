import java.io.FileWriter;
import java.io.IOException;

public class generateXML {
    public static void main(String[] args) throws IOException {
        int cifnum = 100;
        int companyNum = 0000;
        String XML1 = "\t<CIF CIFNumber=\"";
        String XML2 = "\" CIFPortfolioName=\"DEALER\" Entity=\"ORGANIZATION\" CompanyName=\"2K DEALERS ";
        String XML3 = "\"/>";
        String XML = "";
        FileWriter fw = new FileWriter("2kk.xml");
        
        fw.write("<NLS>\n");
        for (int i = 0; i < 2000; i++) {
            XML = XML1 + String.valueOf(cifnum) + XML2 + String.valueOf(companyNum) + XML3 + "\n";
            fw.write(XML);
            cifnum++;
            companyNum++;
        }
        fw.write("</NLS>");
        fw.close();
    }
}
