/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;

import kata4.persistence.MailListReader;
import kata4.Model.Mail;
import kata4.Model.Histogram;
import java.util.List;

/**
 *
 * @author gabri
 */
public class Kata4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String fileName =new String("mail.txt");
    List<Mail>mailList= MailListReader.read(fileName);
    Histogram<String>mailHistogram=MailHistogramBuilder.build(mailList);

    HistogramDisplay histogramDisplay=new HistogramDisplay("Histogram",mailHistogram);
    histogramDisplay.execute();
            }
    
}
