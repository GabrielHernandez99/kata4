/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4.persistence;

import kata4.Model.Mail;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabri
 */
public class MailListReader {

    public static List<Mail> read(String fileName) {
        List<Mail>list =new ArrayList<>();
        try{
        BufferedReader read=new BufferedReader(new FileReader(new File(fileName)));
        while(true){
            String line=read.readLine();
            if(line==null) break;
            if(Mail.isMail(line)){
                list.add(new Mail(line));
            }
        }
        }catch(FileNotFoundException ex){
            System.out.println("Error");
        }catch(IOException ex1){
            System.out.println("Error1");
        }
        
        return list;
        }
        
    }
