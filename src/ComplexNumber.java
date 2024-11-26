public class ComplexNumber {
    private double real;
    private double image;
    //构造方法
    public ComplexNumber(double real, double image){
        this.real=real;
        this.image=image;
    }
    //不带参数的构造方法
    public ComplexNumber(){
        this(0,0);
    }
    //修改属性的方法
    public void setReal(double real){
        this.real=real;
    }
    public void setImage(double image) {
        this.image = image;
    }
    //读取属性的方法
    public double getImage() {
        return image;
    }
    public double getReal() {
        return real;
    }
    public String toString(){
        if (image == 0)
            return real + "";
        else if(image>0)
            return real+"+"+ image +"i";
        else
            return(real +"-"+ Math.abs(image)+"i");
    }
    //加、减、乘三运算的定义，返回一个新的复数，当前复数不改变
    public static day6.homework.ComplexNumber add(day6.homework.ComplexNumber a, day6.homework.ComplexNumber b){
        double r=a.getReal()+b.getReal();
        double i=a.getImage()+b.getImage();
        return new day6.homework.ComplexNumber(i,i);
    }
    public static day6.homework.ComplexNumber substract1(day6.homework.ComplexNumber a, day6.homework.ComplexNumber b){
        double r=a.getReal()-b.getReal();
        double i=a.getImage()-b.getImage();
        return new day6.homework.ComplexNumber(r,i);
    }
    public static day6.homework.ComplexNumber substract(day6.homework.ComplexNumber a, day6.homework.ComplexNumber b){
        double r=a.getReal()*b.getReal()-a.getImage()*b.getImage();
        double i=a.getReal()*b.getImage()+a.getImage()*b.getReal();
        return new day6.homework.ComplexNumber(r,i);
    }



    //加、减、乘三运算的定义，对当前对象执行加、减、乘操作
    public void add(day6.homework.ComplexNumber a){
        real = real +a.getReal();
        image = image + a.getImage();
    }
    public void substract(day6.homework.ComplexNumber a){
        real -= a.getReal();
        image -= a.getImage();
    }
    public void multiply(day6.homework.ComplexNumber a){
        double r =real* a.getReal() - image * a.getImage();
        double i =real* a.getImage() + image * a.getReal();
        real =r;
        image =i;
    }
}
