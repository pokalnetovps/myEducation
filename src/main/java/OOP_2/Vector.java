package OOP_2;
//for OOP_2 L_20
public class Vector {
    public double x;
    public double y;
    public double z;

    Vector(){
        set(Math.random(),Math.random(),Math.random());
    }
    Vector(double x, double y, double z) {
        set(x,y,z);
    }
    public void set(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return Math.sqrt(x*x+y*y+z*z);
    }

    public double scalar(Vector v) {
        return (this.x*v.x+this.y*v.y+this.z*v.z);
    }

    public Vector mult(Vector v) {
        double X = this.y*v.z-this.z*v.y;
        double Y = this.z*v.x-this.x*v.z;
        double Z = this.x*v.y-this.y*v.x;
        return new Vector(X,Y,Z);
    }

    public double angle(Vector v) {
        return this.scalar(v)/(this.length() * v.length());
    }

    public Vector summ(Vector v) {
        return (new Vector((this.x+v.x),(this.y+v.y),(this.z+v.z)));
    }

    public Vector diff(Vector v) {
        return (new Vector((this.x-v.x),(this.y-v.y),(this.z-v.z)));
    }

    @Override
    public String toString(){
        return (String.format("(%f,%f,%f)",x,y,z));
    }
}
