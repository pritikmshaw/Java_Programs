public class Room {
    // declearing height n all
    private int height;
    private int width;
    private int breadth;
    
    // using get mutator method to take the value n then returning 
    public int getHeight(){
    return height;
    }
    public int getWidth(){
    return width;
    }
    public int getBreadth(){
    return breadth;
    }

    // using set method to set the value to the particular variable
    public void setHeight(int height){
    this.height=height;
    }
    public void setWidth(int width){
    this.width=width;
    }
    public void setBreadth(int breadth){
    this.breadth=breadth;
    }
    

    // taking volume 
    public int getVolume(){
    int volume=height*width*breadth;
    return volume;
    }
}    