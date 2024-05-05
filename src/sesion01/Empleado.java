package sesion01;

public class Empleado {
    //Que cosa tiene un atributo , nivel_acceso (public , private , protected ) 
    // tipo_dato (int , boolean , String ), nombre_atributo
    // xd Cada trabajador tiene cada dato propio 
    //Atributos
    String codigo,nombre,tipo_seg,area;
    double sueldoBase, horasExtra;
    //Atributos de valor Comun
     private static double porc_afp = 0.11;
     private static double porc_onp = 0.06;
     private static double porc_essalud = 0.03; //Este si es para todos 
     
     //Constructor
     
     public Empleado() {
     }

    public Empleado(String codigo, String nombre, String tipo_sed, String area, double sueldoBase, double horasExtra) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo_seg = tipo_sed;
        this.area = area;
        this.sueldoBase = sueldoBase;
        this.horasExtra = horasExtra;
    }

    public Empleado(String codigo, String nombre, String tipo_seg) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo_seg = tipo_seg;
    }


    
    //Metodos 
    //Minuto 48:30 xd
    public double montoHorasExtra(){
        return sueldoBase*horasExtra/240;  
    }
    
    public double montoSeguro(){
        if(tipo_seg.equalsIgnoreCase("AFP"))
            return sueldoBase*porc_afp;
        if(tipo_seg.equalsIgnoreCase("ONP"))
            return sueldoBase*porc_onp;
        return 0;   
    }
    
    public double montoEsSalud(){
        return sueldoBase*porc_essalud;  
    }
    
    public double montoDescuentoTotal(){
        return montoSeguro() +montoEsSalud();
    }
    
    public double sueldoBruto(){
        return sueldoBase+montoHorasExtra();
    }
    
    public double sueldoNeto(){
        return sueldoBruto()- montoDescuentoTotal();
    }
            
}
