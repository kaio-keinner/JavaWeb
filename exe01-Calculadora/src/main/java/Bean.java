import javax.faces.bean.ManagedBean;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.event.ActionEvent;

@ManagedBean(name="ct")
@SessionScoped
public class Bean implements Serializable {

    public Bean() {
        setVisor("0");
    }//biulder - construtor
        
    private String visor;
    private double num1;
    private double num2;
    private double res;
    
    private String op;
    
    
    public void btSoma(ActionEvent a){
        setNum1(Double.parseDouble(getVisor()));
        setOp("+");
    }
    
    public void btIgual(ActionEvent a){
        setNum2(Double.parseDouble(getVisor()));
        switch (getOp()) {
            case "+":
                setVisor(String.valueOf(getNum1()+getNum2()));
                
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public void btLimpa(ActionEvent a){
        setVisor("0");
        setNum1(0);
        setNum2(0);
        setRes(res);
        setOp(op);
    }
    
    public void bt07(ActionEvent a){
        if(getVisor().equals("0")|| getOp()== null)
            setVisor("7");
        else if(!getVisor().equals("0") || getOp() == null){
            String prov = getVisor();
            prov+="7";
            setVisor(prov);
        }else if(!getVisor().equals("0") || getOp() != null){
            setVisor("7");
        }
    }
    
     public void bt08(ActionEvent a){
        if(getVisor().equals("0"))
            setVisor("8");
        else{
            String prov = getVisor();
            prov+="8";
            setVisor(prov);
        }
    }
    

    public String getVisor() {
        return visor;
    }

    public void setVisor(String visor) {
        this.visor = visor;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }



    
    
    
}//class
