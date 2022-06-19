package com.company.laboratorka5;

public class VectorR3 {

    private double x1;
    private double x2;
    private double y1;
    private double y2;
    private double z1;
    private double z2;

    private double x;
    private double y;
    private double z;

    public VectorR3(){
    }

    public VectorR3(double x1, double x2, double y1, double y2, double z1, double z2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.z1 = z1;
        this.z2 = z2;

        this.x = x2 - x1;
        this.y = y2 - x1;
        this.z = z2 - z1;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double mod(){
        try {
            return Math.sqrt(x * x + y * y + z * z);
        }
        catch (Exception e){
            System.out.println("error");
            return -1;
        }
    }


    public double scalar(VectorR3 v){ //скалярное произведение
        try {
            return this.x * v.x + this.y * v.y + this.z * v.z;
        }
        catch (Exception e){
            System.out.println("error");
            return -1;
        }
    }

    public boolean is_Orthogonal(VectorR3 v){
        return this.scalar(v) == 0;
    }

    public boolean is_Intersect(VectorR3 v){
        // Система уравнений:
        // this.x1 * t + this.x2 * (1 - t) = v.x1 * s + v.x2 * (1 - s)
        // this.y1 * t + this.y2 * (1 - t) = v.y1 * s + v.y2 * (1 - s)
        // Находим t, s, подставляем в:
        // this.z1 * t + this.z2 * (1 - t) = v.z1 * s + v.z2 * (1 - s)
        // Если получилось равенство, то отрезки (вектора) пересекаются
        try {
            double s = ((this.x2 - v.x2) * this.y + (v.y2 - this.y2) * this.x) / (this.x * v.y - this.y * v.x);
            double t = (s * v.x + this.x2 - v.x2) / this.x;
            double eq1 = this.z1 * t + this.z2 * (1 - t);
            double eq2 = v.z1 * s + v.z2 * (1 - s);

            return eq1 == eq2;
        }
        catch (Exception e){
            System.out.println("error");
            return false;
        }
    }

    public void compare(VectorR3 v){
        if (this.mod() > v.mod()){
            System.out.println("Первый больше");
        } else if (v.mod() > this.mod()){
            System.out.println("Второй больше");
        } else {
            System.out.println("Равны");
        }
    }

    @Override
    public String toString() {
        return "VectorR3: " +
                "x1 = " + x1 +
                ", x2 = " + x2 +
                ", y1 = " + y1 +
                ", y2 = " + y2 +
                ", z1 = " + z1 +
                ", z2 = " + z2+
                '.';
    }
}
