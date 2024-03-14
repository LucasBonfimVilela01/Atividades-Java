import java.util.Date;

class Funcionário extends Object{
    public String Nome;
    public int Nasc;
    public double Salário;
public Funcionário(String n, int na, double s){    
    Nome = n;
    Nasc = na;
    Salário = s;
}
public void Informar_Salário(){
    System.out.println(
            "O salário de: "+Nome+" \n"
            + "É de: R$"+Salário);
}
public void CalcularIdade(){
     Date d=new Date();  
     int year=d.getYear();  
     int currentYear=year+1900;  
    System.out.println("A idade do funcionário é: "+(currentYear-Nasc));
}
}
