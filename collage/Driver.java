// creating a driver class 

public class Driver {
    public static void main(String[] args){
    Room r=new Room(); // creating a object name room with a name r 
    
    // giving the default value of h,w,b
    r.setHeight(5);
    r.setWidth(10);
    r.setBreadth(15);
    
    // volume 
    int vol = r.getVolume();
    System.out.println("Volume is : " + vol);
    
    }
    }
    
    
    
    
    