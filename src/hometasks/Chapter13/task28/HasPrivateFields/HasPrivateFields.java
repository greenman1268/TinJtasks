package hometasks.Chapter13.task28.HasPrivateFields;

/**
 * Created by Admin on 10.03.2016.
 */
public class HasPrivateFields {
    public String Public = "Public String";
    private String Private = "Private String";
    protected String Protected = "Protected String";
    String Package = "Package String";

    public void PublicM(){ System.out.println("invoke Method PublicM "+Public);}
    public void ProtectedM(){ System.out.println("invoke Method ProtectedM "+Protected);}
    public void PackageM(){ System.out.println("invoke Method PackageM "+Package);}
 }
