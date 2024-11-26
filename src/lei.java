class Emp{
    //protected是介于Private和public之间的访问符，仅限于子类继承和同一个包内的可以访问
    protected String id;
    protected String name;
    protected double mo=2000;
    protected int qj;
    //构造函数
    public Emp(String id,String name ,int qj){
        this.id=id;
        this.name=name;
        this.qj=qj;
    }
    //计算基本工资为多少
    public double jb(){
        if(qj<5){
           return mo*0.75;
        }else{//返回计算好的基本工资,跟之前的题目一样，else if之后还需要return所以直接果断else
           return mo*0.5;
        }
    }
    //接下来我们定义一个方法来算经理的工资，具体的逻辑运算交给后面的子类去处理
    public double man(){
        return man();
    }
    //打印员工信息
    public void ygx(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(qj);
        System.out.println(mo);
        System.out.println(man());

    }
}
//然后我们创建一个子类去继承父类的所有属性用extends来继承，格式为：//class "新类名" extends "父类名"
class Mang extends Emp{
    public Mang(String id,String name,int qj){
        super(id,name,qj);
    }


}

////day6.4
//class sti{
//    private final String bh;//编号
//    private final String name;//名称
//    private double money;//价格
//    private int  zs;
//    //接下来我们构造函数啦！
//    public sti(){
//        this.bh=" ";
//        this.name="";
//        this.money=0.0;
//        this.zs=0;
//    }
//    //定义带参数的构造函数
//    public sti(String bh,String name,double money){
//        this.bh=bh;
//        this.name=name;
//        this.money=money;
//        this.zs=0;//这里注意根据题目要求我们给库存设置为0
//    }
//    //然后我们设置这个系统的价格，太极限了现在16分，5分钟打完交掉呵呵
//    public void setMoney(double money){
//        if(money>0){
//            this.money=money;
//        }else{
//            System.out.println("数字太小啦");
//        }
//    }
//    public void in(int am){
//        if(am>0){
//            this.zs+=zs;
//        }else{
//            System.out.println("必须为正值");
//        }
//    }
//    public String getBh(){
//        return bh;
//    }
//    public String getName(){
//        return name;
//    }
//    public double getMoney(){
//        return money;
//    }
//    public int getZs(){
//        return zs;
//    }
//    public double asd(){
//        return zs * money;
//    }
//}








////day6.2，cpx类
// class cpx{
//        private double real;
//        private double image;
//                //创建一个cpx的方法
//                public cpx(double real,double image){
//                    this.real=real;
//                    this.image=image;
//        }
//                //不带参数的构造方法即没有返回值
//                public cpx () {
//                    this(0,0);
//                }
//                //设置属性的方法
//                public void setReal(double real){
//                    this.real=real;
//                }
//                public void setimage(double image){
//                    this.image=image;
//                }
//                //修改属性的方法
//                public double getReal(){
//                    return real;
//                }
//                public double getimage(){
//                    return image;
//                }
//                public String toString(){
//                    if(image==0){
//                        return real+"";
//                    }else if (image>0){
//                        return real+"+"+image +"i";
//                    }else
//                        return(real+"-"+Math.abs(image)+"i");
//                }
//          public static cpx add(cpx a,cpx b){
//                    double r=a.getReal()+b.getReal();
//                    double i=a.getimage()+b.getimage();
//                    return new cpx(r,i);
//          }
//          public static cpx sub(cpx a, cpx b){
//                    double r=a.getReal()-b.getReal();
//                    double i=a.getimage()-b.getimage();
//                    return new cpx(r,i);
//          }
//          public static cpx mul(cpx a ,cpx b){
//                    double r=a.getReal()*b.getReal()-a.getimage()*b.getimage();
//                    double i=a.getReal()*b.getimage()+a.getimage()*b.getReal();
//                    return new cpx(r,i);
//          }
//          //加减乘三运算的定义，对当前对象执行加减乘操作
//            public void add(cpx a){
//                    real=real+a.getReal();
//                    image=image+a.getimage();
//            }
//            public void sub(cpx a){
//                    real-=a.getReal();
//                    image-=a.getimage();
//            }
//            public void mul(cpx a){
//                    double r=real*a.getReal()-image*a.getimage();
//                    double i=real*a.getimage()+image*a.getReal();
//                    real=r;
//                    image=i;
//            }
//    }









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
