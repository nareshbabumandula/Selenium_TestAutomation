package com.exception.handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

    public void checkedExceptionExample() throws IOException{
        String strFilePath = "./files/data.txt";
        FileReader fr = new FileReader(strFilePath);
        
        int i;
        while((i=fr.read())!=-1) {
        	System.out.println((char)i);
        }
        
        BufferedReader br = new BufferedReader(fr);
        String line;
        
        while((line=br.readLine())!=null) {
        	System.out.println(line);
        }
        
    }

    public void checkedExceptionTryCatchExample() {
        boolean bFlag=false;
    	try {
            // try block
            String strFilePath = "./files/data.txt";
            File file = new File(strFilePath);
            FileInputStream fis = new FileInputStream(file);
            int i = fis.read();
            System.out.println((char)i);
            while((i=fis.read())!=-1){
                System.out.println((char)i);
            }
            bFlag=true;
         }catch(Exception e){
            // catch block
            e.printStackTrace();
            System.out.println("After exception..!");
        }finally {
        	if (bFlag) {
				System.out.println("Successfully read the file");
			} else {
				System.out.println("Failed to read the file");
			}
           
        }

    }

    public static void main(String[] args) throws IOException {
        CheckedException ce = new CheckedException();
        //ce.checkedExceptionExample();
        ce.checkedExceptionTryCatchExample();
    }
}
