 class cpx{
        private double real;
        private double image;
                //创建一个cpx的方法
                public cpx(double real,double image){
                    this.real=real;
                    this.image=image;
        }
                //不带参数的构造方法即没有返回值
                public cpx () {
                    this(0,0);
                }
                //设置属性的方法
                public void setReal(double real){
                    this.real=real;
                }
                public void setimage(double image){
                    this.image=image;
                }
                //修改属性的方法
                public double getReal(){
                    return real;
                }
                public double getimage(){
                    return image;
                }
                public String toString(){
                    if(image==0){
                        return real+"";
                    }else if (image>0){
                        return real+"+"+image +"i";
                    }else
                        return(real+"-"+Math.abs(image)+"i");
                }
          public static cpx add(cpx a,cpx b){
                    double r=a.getReal()+b.getReal();
                    double i=a.getimage()+b.getimage();
                    return new cpx(r,i);
          }
          public static cpx sub(cpx a, cpx b){
                    double r=a.getReal()-b.getReal();
                    double i=a.getimage()-b.getimage();
                    return new cpx(r,i);
          }
          public static cpx mul(cpx a ,cpx b){
                    double r=a.getReal()*b.getReal()-a.getimage()*b.getimage();
                    double i=a.getReal()*b.getimage()+a.getimage()*b.getReal();
                    return new cpx(r,i);
          }
          //加减乘三运算的定义，对当前对象执行加减乘操作
            public void add(cpx a){
                    real=real+a.getReal();
                    image=image+a.getimage();
            }
            public void sub(cpx a){
                    real-=a.getReal();
                    image-=a.getimage();
            }
            public void mul(cpx a){
                    double r=real*a.getReal()-image*a.getimage();
                    double i=real*a.getimage()+image*a.getReal();
                    real=r;
                    image=i;
            }
    }


































//day6.3类方法代码
//public class lei {
//    private double side;
//    public lei() {
//        this.side = 1.0;
//    }
//    public void setSide(double side) {
//        if (side < 0.0) {
//            this.side = 1.0;
//        } else {
//            this.side = side;
//        }
//    }
//    public double getSide() {
//        return this.side;
//    }
//    public lei(double side) {
//        setSide(side);
//    }
//    public double wo() {
//        return side * side;
//    }
//    public String wow() {
//        return "Side: " + side + ", Area: " + wo();
//    }
//}
