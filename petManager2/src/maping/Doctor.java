package maping;
// Generated 23/06/2023, 12:39:52 p. m. by Hibernate Tools 4.3.1



/**
 * Doctor generated by hbm2java
 */
public class Doctor  implements java.io.Serializable {


     private String docCode;
     private Veterinary veterinary;
     private String docName;
     private String docLicencia;

    public Doctor() {
    }

    public Doctor(String docCode, Veterinary veterinary, String docName, String docLicencia) {
       this.docCode = docCode;
       this.veterinary = veterinary;
       this.docName = docName;
       this.docLicencia = docLicencia;
    }
   
    public String getDocCode() {
        return this.docCode;
    }
    
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }
    public Veterinary getVeterinary() {
        return this.veterinary;
    }
    
    public void setVeterinary(Veterinary veterinary) {
        this.veterinary = veterinary;
    }
    public String getDocName() {
        return this.docName;
    }
    
    public void setDocName(String docName) {
        this.docName = docName;
    }
    public String getDocLicencia() {
        return this.docLicencia;
    }
    
    public void setDocLicencia(String docLicencia) {
        this.docLicencia = docLicencia;
    }




}

