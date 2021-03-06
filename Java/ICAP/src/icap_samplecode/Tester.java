package icap_samplecode;

import java.io.IOException;


public class Tester {
    public  boolean escanearArchivo(String file)
    {
    	boolean result=false;
        try{            
            	ICAP icap = new ICAP("127.0.0.1",1344,"resp");
                try {
                    System.out.print(file + ": ");
                    result = icap.scanFile(file);
                    System.out.println(result? "Clean" : "Infected");
                } catch (ICAPException ex) {
                    System.err.println("Could not scan file " + file + ": " + ex.getMessage());
                } catch (IOException ex) {
                    System.err.println("IO error occurred when scanning file " + file + ": " + ex.getMessage());
                }
            
            
        }
        catch(IOException e){
        	System.out.println("this");
            System.out.println(e.getMessage());
        }
        catch(ICAPException e){
        	System.out.println("these");
            System.out.println(e.getMessage());
        }
        return result;
   }
    
}