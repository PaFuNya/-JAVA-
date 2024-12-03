







//day8.8
//import java.util.*;
//public class Main {
//    public static void main(String[] args){
//        Scanner ac=new Scanner(System.in);
//        int []bc=new int[3];
//        System.out.println("来看看你数学底子怎么样嘻嘻，看看你还记得不记得三角形的性质");
//        //捕获异常通过try....catch来捕获，只需将需要捕获的步骤放进try....catch结构内即可
//        for (int i=0;i<3;i++){
//            try{//在该结构内将会捕获异常，如果你输入了本不应该的东西，比如说字母，就会让你重新输入哦~
//                System.out.printf("请输入你第"+(i+1)+"个边长哦~OVO");
//                bc[i]=ac.nextInt();
//            }catch(Exception e){//Exception是所有异常的父类，也就是说catch将会捕获所有异常，而e只是一个用来存入错误信息的变量
//                System.out.println("请问你输入了个啥让程序出错了？小心我让你飞起来！：）"+e.getMessage());
//                ac.nextLine();//清除掉错误的输入
//                i--;//让i自减，达到重新输入当前边长的目睹惩罚你重新输入呵呵
//            }
//        }
//        sjxbc(bc[0],bc[1],bc[2]);
//    }
//        public static void sjxbc(int a, int b, int c){
//            if(a+b<=c||a+c<b||b+c<=a){
//                //抛出异常，如果不成立的话，不会吧不会吧真的有人忘了三角形的性质吗
//                throw new IllegalArgumentException(a+","+b+","+c+"哦呀？看来你数学底子不太好呢，三角形两边之和要大于第三边哦");//System.out.println(a+","+b+","+c+",");
//
//            }else{
//                System.out.println("不要小瞧了三角形的羁绊啊！：a=" +a+","+"b="+b+",c="+c);
//            }
//        }
//}



//day8.7测试类
//Circle circle=new Circle(1.0);//生成Circle对象。
//        Random r=new Random();//生成Random对象：Random r = new Random();
//        int ra=r.nextInt(101);//生成随机整数：r.nextInt()
//        Shape shape;
//            if(ra % 2==0){
//                shape=new Square(5);
//                //如果此时为偶数，则将5传递进去
//            }else{
//                shape=new Circle(4);
//                //如果此时为奇数，则将4传递进去
//            }
//            System.out.println("当前随机数为"+ra);//输出当前的随机数
//            System.out.println(shape.toString());//最后输出上面判断的计算的值
//            System.out.println(circle.toString());//调用对象的toString方法，输出对象的描述信息。






////day9.3
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args){
//        Scanner ac=new Scanner(System.in);
//
//        System.out.println("请输入你你要计算的正方形边长");
//        double sq=ac.nextDouble();
//        System.out.println("请输入矩形的长");
//        double lent=ac.nextDouble();
//        System.out.println("请输入矩形的宽");
//        double wid=ac.nextDouble();
//            sa[] shap=new sa[2];//保存着sa类的数组
//            shap[0]=new sqa(sq);//保存正方形对象
//            shap[1]=new rla(lent,wid);//保存矩形对象
//        //数组 shap 中存放的是类型为 sa 的对象（sa 是一个抽象类，而 sqa 和 rla 是它的子类）
//            for(sa shape:shap){
////shape 是 for-each 循环中的临时变量，用于依次访问数组中的每个元素。每次循环，shape 指向数组中的一个对象：
////第一次：shape 指向 shap[0]，也就是 sqa 的对象。
////第二次：shape 指向 shap[1]，也就是 rla 的对象。
//                System.out.println(shape.getSan());
//                System.out.println(shape.getArea());
//            }
//    }
//}
////day9.2
//public class Main {
//    public static void main(String[] args) {
////        Scanner ac=new Scanner(System.in);
////        int []a=new int[];
////        System.out.println("请输入你要计算多少个员工的名字");
////        System.out.println("请输入第一个员工的编号，名字，和请假天数");
////        for(int i=0;i<0;i++){
////            a[i]=ac.nextInt();
////        }
////   }
//        Emp emp = new Emp("001", "我是员工", 3);
//        Mang mang = new Mang("002", "我是经理", 4);
//        Ds ds = new Ds("003", "我是董——事——长！", 6);
//        //这里搞半天才发现自己的打印信信息方法忘了加了呃呃呃呃我就说怎么没有输出呵呵
//        emp.ygx();
//        mang.ygx();
//        ds.ygx();
//    }
//}






//day6.4
//public class Main{
//    public  static void main(String[] arga){
//      sti ac=new sti("wow","aaa",1000.00);
//      ac.in(200);
//      System.out.println(ac.getBh());
//      System.out.println(ac.getMoney());
//      System.out.println(ac.getName());
//      System.out.println(ac.getZs());
//      System.out.println(ac.asd());
//    }
//}
//





//day6.2主函数代码
//public class Main {
//    public static void main(String[] args) {
//        cpx a = new cpx(1, 2);
//        cpx b = new cpx(3, 4);
//        cpx c = cpx.add(a, b);
//        System.out.println( c);
//        cpx d = cpx.sub(a, b);
//        System.out.println( d);
//        cpx e = cpx.mul(a, b);
//        System.out.println(e);
//        c.add(a);
//        System.out.println(c);
//        c.sub(a);
//        System.out.println( c);
//        c.mul(a);
//        System.out.println( c);
//    }
//}





//    //day6.1主函数
//    public static void main(String[] args) {
//        lei lei1 =new lei();
//        System.out.println("square:"+ lei1.wow());
//        lei1.setSide(5.0);
//        System.out.println(lei1.wow());
//        lei1.setSide(-3.0);
//        System.out.println(lei1.wow());
//        lei lei2 =new lei(4.0);
//        System.out.println(lei2.wow());
//        lei2.setSide(10.0);
//        System.out.println(lei2.wow());
//        }
//    }




////day5.5递归函数：（本题，课堂上已完成框架）
////本题要求实现Ackermenn函数的计算，其函数定义如下：
////WP:主函数过程给了直接写进去，要写的是计算过程的函数,而且有视频教程，跟着视频做就好了
//Scanner scan=new Scanner(System.in);
//long m=scan.nextInt();
//long n=scan.nextInt();
//        if(m<0 ||n <0){
//        System.out.println("您输入的数字小于0了请重新输入:(");
//            return;
//                    }
//                    System.out.println(wow(m,n));
//
//        }
//public static long wow(long m,long n){
//    if(m ==0)
//        return n +1;
//    else if (n ==0 && m >0)
//        return wow(m -1,1);
//    else
//        return wow(m -1,wow(m, n -1));
//    //循环和递归的区别是
//    //循环：直接在同一个地方反复执行代码，直到满足条件。
//    //递归：每次调用自己，就好像在新的地方“重新开始”，直到达到停止条件。
//    //递归通过“调用栈”来记录每次调用的状态，一旦满足条件，它会逐层返回并计算结果。
//}


////day5.4递归：幂级数
////本题要求实现一个函数，计算下列简单交错幂级数的部分和：
////函数接口定义：double fn( double x, int n );
////其中题目保证传入的n是正整数，并且输入输出都在双精度范围内。函数fn
//// 应返回上述级数的部分和。建议尝试用递归实现。
//
//
////WP:EZ题目，利用math.pow递归即可解决；
//Scanner ac=new Scanner(System.in);
//        System.out.println("请输入x和n，其中n必须为正整数哦:D");
//double x=ac.nextDouble();
//int n=ac.nextInt();
//double wo=wow(x,n);
//            System.out.printf("算出来啦！%.2f\n",wo);
//    }
//public static double wow(double x,int n){
//// OK让我们来到递归函数这边上面都是基操哈
//    //首先我们要知道什么叫递归函数，递归就像像照镜子一样：
//    // 镜子里有一个人，镜子里的人又拿着一个镜子，里面又有一个人，巴拉巴拉无限下去
//    // 但最终总会有终点。所以阶乘就是类似于递归函数的一个特性
//    //但是我们要给他一个明确的终止条件，让他停下来，否则就会无限循环下去
//    //从这题来看，x的次方就是n所以当我们的n=1的时候就是x的时候我们停止下来;
//    if(n==1){
//        return x;
//    }
//    double l=Math.pow(-1,n-1)*Math.pow(x,n);//最末尾的(-1)^(n-1) * x^n
//    //接下来我们要做的就是无限的累加n-1项，直到n=1的时候停止累加
//    return l+wow(x,n-1);
//}
//
//}



////day5.3本题要求实现一个计算m~n（m<n）之间所有整数的和的简单函数。
////函数接口定义：int sum( int m, int n );
////其中m和n是用户传入的参数，保证有m<n。函数返回的是m~n之间所有整数的和。
////自己完成主函数，及函数调用。
////输入样例：-5 8
////输出样例：sum = 21
//public static void main(String[] args) {
//    //WP:EZ题目，跟之前的阶乘区别差不多，只不过把*改成+就好,只不过这里需要用到另一个函数所以需要定义一个新的函数接口定义
//    Scanner ac=new Scanner(System.in);
//    int []c=new int[2];
//    System.out.println("请输入m<n的规则OVO");
//    for(int i=0;i<2;i++){
//        c[i]=ac.nextInt();
//    }
//    if(c[0]>c[1] ){
//        System.out.println("你输入的数字不满足m<n的规则哦，请重新输入");
//        return;
//    }
//    int wo=wow(c[0],c[1]);
//    System.out.println(wo);此时wo就等于已经计算好的c
//}
////新建一个方法，用来处理大部分计算，使main更简洁
//public static int wow(int a,int b){
//    int c=0;
//    for(int i=a;i<=b;i++){//起始数字为a=i从i位开始，然到b，c递加i就达到了-5-8之间所有的整数相加
//        c+=i;
//        //System.out.println(c);
//    }
//    return c;//将计算好的c值返回
//}









//day5.2鞍点：二维数组
//        //一个矩阵元素的“鞍点”是指该位置上的元素值在该行上最大、在该列上最小。
//        //本题要求编写程序，求一个给定的n阶方阵的鞍点。
//        //输入第一行给出一个正整数n（1≤n ≤6）。随后n行，每行给出n个整数，其间以空格分隔。
//        //输出在一行中按照“行下标 列下标”（下标从0开始）的格式输出鞍点的位置。
//        // 如果鞍点不存在，则输出“NONE”。题目保证给出的矩阵至多存在一个鞍点。
//            //1.行上的最大值：在该元素所在的行中，它是这一行的最大值。
//            //2.列上的最小值：在该元素所在的列上，它是这一列的最小值。
//        Scanner ac=new Scanner(System.in);
//        System.out.println("请输入一个正整数在[1,6]之间");
//            int n=ac.nextInt();
//                if(n<1 ||n >6){
//                    System.out.println("请输入[1,6]之间的正整数O.o");
//                    return;
//                }
//                System.out.println("您输入了"+n+"，将输输出"+n+"行"+n+"个数字！OVO");
//            int [][]c=new int[n][n];
//                for(int i=0;i<n;i++){
//                    for(int j=0;j<n;j++){
//                        c[i][j]=ac.nextInt();//第一个循环用来往数组里面输入东西
//                    }
//                }
//                int bo=0;//跟下面的if衔接来判断是否有多余的值
//                boolean yz=false;//模仿者哨兵知道吧，被狼刀了就直接报警，性质一样
//                    for(int i=0;i<n;i++){//套两层循环的意义在于遍历行和列
//                        int m=c[i][0];//假设这行的这个第一个数字是最大值然后后面一个一个比较过去
//                        int b=0;//用来记录当前最大值的列号
//                            for(int j=1;j<n;j++){
//                                if(c[i][j]>m){//如果发现比m大的数
//                                    m=c[i][j];//然后就把数字重新赋到m啦
//                                    b=j;//此时用b来记录下j当时的数字即数组的索引
//                                }
//                            }
//                            yz=true;//这个时候假设这个最大值可能是鞍点，之后做后续的判断
//                            for (int k=0;k<n;k++){//上面遍历列，这里遍历行
//                                if(k==i) continue;//因为当前行已经检查过了，所以此时k=i的话就直接跳过，避免重复检查
//                                if(c[k][b]<m){//如果该列中有值比最大值小
//                                    yz=false;//给他标记为不是鞍点，所以就不是啦
//                                    break;//然后就退出啦
//                                }
//                            }
//                            if(yz){
//                                System.out.println(i+" "+b);//如果yz为true，即哨兵活了下来那就是侦探团胜利
//                                bo++;//如果找到了则记录有多少个数量
//                                break;//找到后直接退出
//                            }
//                    }
//                    if(bo==0){//如果没有的话就提示什么都没有
//                        System.out.println("什么都没有哦XD");
//                    }
//有视频案例跟着做就能明白



//day4.6本题要求编写程序，找出给定的n个数中的最大值及其对应的最小下标（下标从0开始）。
//输入格式:
//输入在第一行中给出一个正整数n（1＜n≤10）。第二行输入n个整数，用空格分开。
//输出格式:
//在一行中输出最大值及最大值的最小下标，中间用一个空格分开。

       //注释:下标（也称索引）是指数组或列表中元素的位置编号，用来标识和访问特定元素。
       // 通常，数组的下标从 0 开始，也就是说，数组的第一个元素的下标为 0，第二个元素的下标为 1
       //所以这题考察的就是输入几个数字，然后如果数组中有相同的数字，就看他们的数组索引（即下表）是几并且将这个最大值输出出来，比如说
       //a[0]=10,a[1]=10,a[2]=5,a[3]=6,在这4个索引（即下标中）a[0]和a[1]相比，0<1所以 0就是10的最小下标
//       Scanner ac=new Scanner(System.in);
//        int n =ac.nextInt();
//        int []a=new int[n];
//            for(int i=0;i<n-1;i++){
//                a[i]=ac.nextInt();
//            }
//            //max 最大值，index
//       int max=a[0],index=0;
//            for(int i=1;i<n;i++){
//                if(a[i]>max){//如果当前的元素更大，那么更新最大值和下标
//                    //不写等于防止下标错乱，要的是最小下标
//                        max=a[i];
//                        index=i;
//                }
//            }
//            System.out.println(max+" "+index);
//    }
//}


//day4.5上三角矩阵指主对角线以下的元素都为0的矩阵；主对角线为从矩阵的左上角至右下角的连线。
////本题要求编写程序，判断一个给定的方阵是否上三角矩阵。
////输入第一行给出一个正整数T，为待测矩阵的个数。接下来给出T个矩阵的信息：每个矩阵信息的第一行给出一个不超过10的正整数n。随后n行，每行给出n个整数，其间以空格分隔。
////每个矩阵的判断结果占一行。如果输入的矩阵是上三角矩阵，输出“YES”，否则输出“NO”。
//       Scanner a=new Scanner(System.in);//创建用户输入对象
//       int s=a.nextInt();
//       //接下来我们遍历数组，这是数组项目必须要的，一定要遍历数 组哦
//       for(int i=0;i<s;i++){
//           int c=a.nextInt();//读取当前矩阵的大小有多大（nxn的矩阵）
//           //接下来我们要创建二维数组啦！
//           int[][]w=new int[c][c];//创建二维数组
////然后我们遍历二维数组
//           for(int k=0;k<c;k++){//遍历二维数组的每一行
//               for(int l=0;l<c;l++){//遍历二维数组的每一列
//            w[k][l]=a.nextInt();//存储矩阵中的每个元素
//               }
//           }
//           boolean h=true;
//           //设置一个布尔变量方便后续检查是否正确
//           for(int k=1;k<c;k++){//遍历对角线的元素i>j的元素
//               //从第二行卡死hi遍历，因为第一行的主对角线以下没有元素
//               for(int l=0;l<i;l++){//在遍历j从0到i-1
//                   if(w[k][l]!=0){//如果主对角线以下元素不为0
//                       h=false;//如果为了0则设为false
//                       break;//退出循环
//                   }
//               }
//               if(!h){//根据上面的循环来看如果循环得出的最终结果h为否，则直接退出大循环
//                   break;
//               }
//           }
//           if(h){
//               System.out.println("YES");//终于到了喜闻乐见的输出结果了，鬼知道我到这一步用了多久....
//           }else{
//               System.out.println("NO");
//           }
//       }



//day4.4英文辅音字母是除A、E、I、O、U以外的字母。本题要求编写程序，统计给定字符串中大写辅音字母的个数。
//输入格式：
//输入在一行中给出一个不超过80个字符、并以回车结束的字符串。
//输出格式：
//输出在一行中给出字符串中大写辅音字母的个数。
//输入样例：
//Plain TextHELLO World!
//输出样例：
//4
//    Scanner ac=new Scanner(System.in);
//               System.out.println("输入你要鉴定的字符串");
//               String s=ac.nextLine(); // 获取输入字符串
//               int w = 0;
//
//               // 遍历字符串里的每一个字符哦，后面可以方便调用
//               for (int i=0;i<s.length();i++) {
//                   char b=s.charAt(i); // 这里的char获取当前字符
//       判断b是否为大写字母，大写字母在ASCII中是从A-Z的，所以前面&&这个是用来确定是否是大写字母的
//       !利用感叹号来排除掉AEIOU的这几个字母，以此来判断其他的就是元音字母
//                   if (b>='A'&&b<='Z'&&b!='A'&&b!='E'&&b!='I'&&b!='O'&&b!='U')
//       字符串跟元音字母进行比较
//                       {
//                       w++;
//                   }
//               }
//               System.out.println(w);





//day4,3给定两个整型数组，本题要求找出不是两者共有的元素。（这题做完发现做反了，但是代码结构和逻辑是差不多的）
//输入格式:
//输入分别在两行中给出两个整型数组，每行先给出正整数N（≤20），随后是N个整数，其间以空格分隔。
//输出格式:
//在一行中按照数字给出的顺序输出不是两数组共有的元素，数字间以空格分隔，但行末不得有多余的空格。题目保证至少存在一个这样的数字。同一数字不重复输出。
//        Scanner ac=new Scanner(System.in);
//        StringBuilder w=new StringBuilder();//引用之前学会的StringBuilder追加字符串中最后的拼接可以免去很多步骤
//       System.out.println("请输入你要输入几个数字必须<=20");
//        int l=ac.nextInt();
//                int []c=new int[l];
//                int []b=new int[l];
//                System.out.println("请输入你要判断的第一组数字");
//            for(int i=0;i<l;i++){
//                c[i]=ac.nextInt();
//            }
//                System.out.println("请输入你要判断的第二组数字");
//            for(int i=0;i<l;i++){
//                b[i]=ac.nextInt();
//            }
//            boolean s=false;
//                for(int i=0;i<l;i++){
//                    if(c[i]==b[i]){
//                        w.append(c[i]).append(" ");//将数组c[i]相同的以字符加入到w变量中
//                    s=true;
//                    }
//                }
//                if(s){
//                    System.out.println("相同的数字有" +"，"+ w.toString());//打印已经拼接起来的字符串
//                }else{
//                    System.out.println("你输入的两组数字中并没有相同的");
//                }




//day4.2
//      System.out.println("请输入你要输入几个数字");
//      Scanner ac=new Scanner(System.in);
//         int n=ac.nextInt();
//         int []a=new int[n];
//            System.out.println("请输入" +n+"个数字");
//         for(int i=0;i<n;i++){//循环确定用户输入多少个数字
//            a[i]=ac.nextInt();
//         }
//      //int []a={10,8,1,2};
//      System.out.println("倒着输出啦");
//         for(int i=a.length-1;i>=0;i--){
//            //很好理解，i--就是从大到小往下减，4，3，2，1.又因为数组的索引是a[0]=10,a[1]=8以此类推
//            //那这样下去就是从末尾a[4]=2开始显示就实现了倒序排序
//            int c=a[i];
//               System.out.println(c);



//day3.10猜数字游戏是令游戏机随机产生一个100以内的正整数，用户输入一个数对其进行猜测，
// 需要你编写程序自动对其与随机产生的被猜数进行比较，并提示大了（“Too big”），
// 还是小了（“Too small”），相等表示猜到了。如果猜到，则结束程序。程序还要求统计猜的次数，
// 如果1次猜出该数，提示“Bingo!”；如果3次以内猜到该数，则提示“Lucky You!”；
// 如果超过3次但是在N（>3）次以内（包括第N次）猜到该数，则提示“Good Guess!”；
// 如果超过N次都没有猜到，则提示“Game Over”，并结束程序。如果在到达N次之前，
// 用户输入了一个负数，也输出“Game Over”，并结束程序。
//Scanner ac = new Scanner(System.in);
//int[] a = new int[2];
//Random bo = new Random();
//int c = bo.nextInt(101);
////          观察c的随机数是多少，调试用
////   System.out.println(c);
//
//               System.out.println("请输入你的猜测的数字和猜测的次数");
//               for(int i=0;i<=1;i++){
//a[i] = ac.nextInt();//套两次循环输入猜测的数字和猜测的次数
//               }
//boolean woow = false; // 给woow赋值为false，以便后面进行判断
//               for (int i=1; i<=a[1];i++) {
//        System.out.println("第 " + i + " 次猜咯");
//int l = ac.nextInt(); //将我们的猜测给到l
//                   if(c>l) {
//        System.out.println("小了啦");
//                   }else if(c<l) {
//        System.out.println("太大了啦");
//                   }else{
//woow = true; // 猜对了
//        if(i==1) {
//        System.out.println("真厉害！一次就猜中了！");//套两个判断是1次猜中还是好几次才猜中的
//                       }else{
//                               System.out.println("真厉害，猜中了欸！");
//                       }break; //如果猜中了就退出哦
//
//                               }
//                               }
//                               if(!woow) {
//        System.out.println("结束了哦，这都猜不中");
//               }





//什么?你在找day3.9?往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是往右边看就是，很抱歉我懒得写嘻嘻






//day3.8皮球从某给定高度自由落下，触地后反弹到原高度的一半，再落下，再反弹，……，如此反复。问皮球在第n次落地时，在空中一共经过多少距离？第n次反弹的高度是多少？
//在一行中顺序输出皮球第n次落地时在空中经过的距离、以及第n次反弹的高度，其间以一个空格分隔，保留一位小数。题目保证计算结果不超过双精度范围。
//Scanner ac = new Scanner(System.in);
//int s=0;
//int[] a = new int[2];
//       for (int i=0; i<2; i++) {
//a[i] = ac.nextInt();
//       }
//               if (a[0]<0 || a[1]<0) {
//        System.out.println("你输错数字啦！不能是负数哦！");
//           return;
//                   }
//double wow=a[0];
//s=(int)wow;
//       for (int i=1; i<=a[1]; i++) {
//s += 2*(wow/Math.pow(2, i));
//        }
//double asd= wow/Math.pow(2,a[1]);
//       System.out.printf("%.1f %.1f%n",(double)s,asd);
//
//        }
//
//        }







//       day3.7本题要求两个给定正整数的最大公约数和最小公倍数。
//       输入在一行中给出两个正整数M和N（≤1000）。
//       在一行中顺序输出M和N的最大公约数和最小公倍数，两数字间以1空格分隔。
//            Scanner ac=new Scanner(System.in);
//                int []a=new int[2];
//                    for(int i=0 ;i<=1 ;i++){
//                        a[i]=ac.nextInt();
//                    }
//                    if(a[0]<0||a[1]<0 || a[1]>=1000 ||a[0]>=1000){
//                            System.out.println("您输入的数字不管用请换一个");
//                    }
//                        int c=a[0],b=a[1];
//                            while(b!=0){ //控制b不等于0，
//                                // 这样的条件可以保证循环一直循环下去，一个一个去计算我们最后得到的公约数
//                                // 如b=0了就会停止循环
//                                int s=b;//先将原始的b值存到s中
//                                b=c % b; //用c/b求他们的余数用%号，将得出来的余数存到b里面
//                                c=s;//然后再将s中的数存到c中，之后再用重新被赋值的c/b得余数新的余数直到b=0时就是我们要的公约数
//                                //如果c=48,b=18,那么第一次循环中，s=b=18，然后b=c%b=48/18=12，此时的b=12
//                                //然后执行c=s=18，注意：此时，c=18,b=12,s=12,然后第二次循环就是
//                                //b=18/12=6 ,但是因为s已经被赋予了=12的值，然后s又给c赋值，所以
//                                //c=12,b=6,b=6,循环下去就是这样
//                                //最后得出c=6，而此时的b已经被除尽了，最后得出最大公约数为6
//                            }
//                                    //然后将最大公约数给到另一个变量固定住
//                                int boy=c;
//                                    //计算最小公倍数可以用公式，及输入的数字相乘除于刚刚的公约数就是最小公倍数
//                                    int over=(a[0]*a[1])/boy;
//                                    System.out.println(boy+" "+over);






//day3.6 给定两个均不超过9的正整数a和n，要求编写程序求（n个a）之和。
//输入在一行中给出不超过9的正整数a和n。
//在一行中按照“s = 对应的和”的格式输出。
//      Scanner ac=new Scanner(System.in);
//      int []c=new int[2];
//      StringBuilder s=new StringBuilder();
//      int b=0;
//      //学习查阅可知，StringBulider在java中是允许追加到后方的值的
//       //比如说一开始的字符串是wow，使用了StringBuilider后在给他赋值字符串music，就会变成wowmusic
//       //和普通的int和double等不一样，他们是固定的，比如说在定义一个全局变量s=0
//       //那他就只等于0，在for中的那个s只不过是临时存储的（简称局部变量），并没有真正赋值到全局变量s中
//            for(int i=0;i<2;i++){
//               c[i]= ac.nextInt();
//            }
//               if(c[1]<0 || c[0]<0 ||c[1]>9 ||c[0] >9){
//                  System.out.println("你输的其中一个数字大于了9或者不是正数！请你检查后再次输入！");
//               }else if(c[1]>=0 && c[1]<9 ||c[0]>=0 && c[0] <9){
//                  for(int i=1;i<=c[1];i++){
//                      b+=c[0]; //累加自身，并且循环几次看c[1]，3次就是2，4，6，分别追加到s变量中
//                      s.append(b);
//                      //将b+的数值变成字符串追加到s中
//                  }
//
//      }System.out.println("s = " + s);//输出就好咯嘻嘻







//day3.5,本题要求编写程序，打印一个高度为n的、由“*”组成的正菱形图案。
//输入在一行中给出一个正的奇数n。
//输出由n行星号“*”组成的菱形，如样例所示。每个星号后跟一个空格。
//            Scanner ac=new Scanner(System.in);
//            System.out.print("请输入一个正的奇数n：");
//            int n=ac.nextInt();
//            int wow=n/2;
//            for (int i=0;i<=wow;i++) {//比如说你输入一个3.....哎，算了
//               for (int j =0;j<wow-i;j++) {
//                  System.out.print(" ");/ /输出空格哦，哎呀没动力了。。。。
//               }
//               for (int j=0;j<2*i+1;j++) {
//                  System.out.print("* ");
//               }
//               System.out.println();
//            }
//
//            for (int i=wow-1;i>=0;i--) {
//               for (int j= 0;j<wow-i;j++) {
//                  System.out.print(" ");
//               }
//               for (int j=0;j<2*i+1; j++) {
//                  System.out.print("* ");
//               }
//               System.out.println();
//            }



////day3.4,本题都是基础知识，数学层面理解一下就好了，注意要求不能超过长整型整数范围得单独设置一个if控制输出
//// 输入一个非负整数n，生成一张3的乘方表，输出的值。可调用幂函数计算3的乘方。
////按照幂的递增顺序输出n+1行，每行格式为“pow(3,i) = 3的i次幂的值”
//// 。题目保证输出数据不超过长整型整数的范围。
//      Scanner ac = new Scanner(System.in);
//      System.out.println("请输入一个非负整数n");
//      int n = ac.nextInt();
//       if (n < 0) {
//         System.out.println("你输的数字属于负数！请输入非负整数！");
//      } else if (n >= 100) {
//         System.out.println("你输的值的阶乘已经溢出了！");
//      } else if (n >= 10) {
//         for (int i = 0; i <= n; i++) {
//            System.out.println("pow(" + n + "," + i + ") = " + (long) Math.pow(n, i));
//         }
//      } else {
//         for (int i = 0; i <= n; i++) {
//            System.out.println("pow(" + n + "," + i + ") = " + (int) Math.pow(n, i));
//         }
//      }









//day3.3，本题全靠逻辑，不写注释，自行理解，循环套循环，if套if
// 本题要求根据某城市普通出租车收费标准编写程序进行车费计算。具体标准如下：
//
//起步里程为3公里，起步费10元；
//
//超起步里程后10公里内，每公里2元；
//
//超过10公里以上的部分加收50%的回空补贴费，即每公里3元；
//
//营运过程中，因路阻及乘客要求临时停车的，按每5分钟2元计收（不足5分钟则不收费）。
//      Scanner ac = new Scanner(System.in);
//      double[] a = new double[2];
//      int q = 3;
//      int b = 10;
//      int s = 0;
//      int m = 0;
//      int dl = 0;
//
//      System.out.println("输入行驶里程（单位为公里，精确到小数点后1位）与等待时间（整数，单位为分钟）");
//      for (int i = 0; i < 2; i++) {
//         a[i] = ac.nextDouble();
//         System.out.println(a[i]);
//      }
//
//      if (a[0] <= q ) {
//         if (a[1] > 5) {
//            for (int i = 1; i <= a[1] / 5; i++) {
//               dl += 2;
//            }
//
//         System.out.println("您应付的车费为" + (b + dl) + "元");
//         }else if(a[1]<=5){
//            System.out.println("您应付的车费为10元");
//         }
//      }
//
//
//      if (a[0] > q && a[0] < 10) {
//         if (a[1] > 5) {
//            for (int i = 1; i <= a[0] - q; i++) {
//               s += 2;
//            }
//            for (int k = 1; k <= a[1] / 5; k++) {
//               dl += 2;
//            }
//            System.out.println("您应付的车费为" + (b + dl + s) + "元");
//         } else if (a[1] <= 5) {
//            System.out.println("您应付的车费应该为" + (b + s));
//         }
//      }
//
//      if (a[0] > b) {
//         if (a[1] > 5) {
//            for (int i= 1; i <= a[1] / 5; i++) {
//               dl += 2;
//            }
//            for (int i = 1; i <= a[0] - b; i++) {
//               m += 3;
//            }
//            for (int i = 1; i <= a[0] - q; i++) {
//               s += 2;
//            }
//            System.out.println("您应付的车费为" + (b + dl + m + s) + "元");
//            System.out.println( b + ","+dl + ","+m +","+s);
//
//         } else {
//
//            System.out.println("你应付的车费为" + (m + b + s));
//         }
//      }
//   }









//day3,2.按照规定，在高速公路上行使的机动车，达到或超出本车道限速的10%则处200元罚款；
// 若达到或超出50%，就要吊销驾驶证。请编写程序根据车速和限速自动判别对该机动车的处理。
//      Scanner ac=new Scanner(System.in);
//         double []as=new double[2];
//         System.out.println("请输入需要测试的车速和限速规则");
//         for(int i=0;i<2;i++) {
//            as[i]=ac.nextDouble();
//               System.out.println(as[i]);
//               }
//         double csl=((double) as[0]-as[1])/as[1]*100; //我们要算的是超速了多少
//                                                      // 用两者相减在/车速就是超速的小数，然后在*100换成%
//         double wow=as[1]*1.1;           //算的是<10也就是稍微超速的情况下，也算是正常的
//      if(as[0]<wow){ //将微微超速的情况和车速进行对比~~
//         System.out.println("你的车速正常" );
//      }else if(as[0]<=as[1]*1.5){  //1.5就是表示限速的150%，也就是超速50%。
//                                 // 如果车速超过 车速（as[0] * 1.5，就意味着车速超过限速的50%。
//                                 //这里的意思就是车速超过限速的10%但不超过限速的50%然后输出罚款
//         System.out.printf("开这么快是想去遇见另一个世界的新娘吗，奖励罚款200%.0f",csl);
//      }else{//这里就是超过50%然后输出吊销驾驶证啦~行车不规范亲人两行泪~~~
//         System.out.printf("恭喜你的驾驶证没啦！开的小米SU7么这么快%.0f",csl);
//      }
//
//}










//10.已知函数可以展开为幂级数。现给定一个实数，要求利用此幂级数部分和求的近似值，求和一直继续到最后一项的绝对值小于0.00001。

//        System.out.println("请输入一个实数x,x∈[0.5]");
//            Scanner ac=new Scanner(System.in);
//                double x=ac.nextDouble();
//                    if (x>5 ||x<0){
//                        System.out.println("你的数字不在[0,5]范围内!请重新输入!");
//                        return;
//                    }
//                double b=1;
//                double c=1;
//                int n=1;
//
//                    while(Math.abs(b)>=0.00001){
//                        b*=x/n;
//                        c+=b;
//                        n++;
//                        //跟第9题是一样的，用2*=4^1/1!
//                        //然后此时的b=4,接着循环下去第二次循环时n=2,然后
//                        //4*=4/2!,这里*4其实就是相当于4^2/2!了，以此类推下去
//                        //8*=4/3!,相当于4^3/3!
//                        //以此类推下去直到b”不大于“0.000001的时候就会停止
//                        //注意如果是<的话会导致在b<0.000001的时候才会开始执行后面的计算，这样显然不可以哦~~~
//                    }
//                    System.out.printf("近似值为:%.4f",c);
//











//9. (简答题)
//自然常数 e 可以用级数 来近似计算。本题要求对给定的非负整数 n，求该级数的前n+1 项和。
//
//输入格式:
//        System.out.println("请输入<=1000的非负整数");
//        Scanner ac = new Scanner(System.in);
//        int n = ac.nextInt();
////        double []a=new double[n];好像用不到数组?
//        double e =1;
//        double pr=1;
//
//        if (n < 0 || n > 1000) {
//            System.out.println("错误的数字!请输入<=1000的非负整数!");
//            return;//结束程序
//        }
//
//            for (int i = 1; i <= n; i++) {
//                pr*=i;//可以理解为pr=pr*i,那么pr=1*i
                        //以此类推，第二次循环的时候pr=pr*i=1*2,那是不是就是2!
                        //第三次循环pr=pr*i=2*3，那是不是就等于3!
                        //第四次循环pr=pr*i=6*4,是不是也等于4!
                        //以此类推呗小笨蛋，直到你输入的数字>n就会停止运算
                        //然后在循环将1.0去处于第一次循环和第二次循环在累加到e里面，即e=e+1.0/pr
                        //和上面的累乘是一样的
                        //然后不就成功啦
//                e+=1.0/pr;
//            }
//        System.out.printf("该值的近似为%.8f",e);
//    }
//
//}


















//7.输入10个字符，统计其中英文字母、空格或回车、数字字符和其他字符的个数。
//
//输入格式:
//
//输入为10个字符。最后一个回车表示输入结束，不算在内。
//    Scanner ac=new Scanner(System.in);
//        int o=10;
//        int letter=0;
//        int blank=0;
//        int digit=0;
//        int other=0;
//        System.out.println("请输入10个字符：");
//            for(int i=0;i<o;i++) {
//                char ch = ac.next().charAt(0);
//                //笔记：charAt会提取第一个字符并存入到ch中
//                // 这句话的意思就是将输入的文本提取一个字符到CH变量中
//                if (Character.isLetter(ch)) {
//                    //isLetter判断是否为字母，下面就是如果是字母的话e++
//                    letter++;
//                } else if (Character.isDigit(ch)) {
//                    //isDigit判断是否为数字，是的话digit++
//                    digit++;
//                } else if (Character.isWhitespace(ch)) {
//                    //isWhitespace判断是否为空格或回车
//                    blank++;
//                } else {
//                    //如果是其他的就other++
//                    other++;
//                }
//            }
//        System.out.printf("letter=%d,blank=%d,digit=%d,other=%d\n",letter,blank,digit,other);








//给定平面上任意三个点的坐标   ，检验它们能否构成三角形。
//
//输入格式:
//输入在一行中顺序给出六个范围内的数字，即三个点的坐标
// 。
//
//输出格式:
//若这3个点不能构成三角形，则在一行中输出“Impossible”；
// 若可以，则在一行中输出该三角形的周长和面积，格式为“L = 周长, A = 面积”，输出到小数点后2位。
//        Scanner x=new Scanner(System.in);
//            double[] zb=new double[6];
//        System.out.println("请输入三个点的坐标 (x1, y1, x2, y2, x3, y3):");
//            for(int i=0;i<6;i++){
//                zb[i]=x.nextDouble();
//            }
//            double a=Math.sqrt(Math.pow(zb[2]-zb[0],2)+Math.pow(zb[3]-zb[1],2));
//            double b=Math.sqrt(Math.pow(zb[4]-zb[2],2)+Math.pow(zb[5]-zb[3],2));
//            double c=Math.sqrt(Math.pow(zb[0]-zb[4],2)+Math.pow(zb[1]-zb[5],2));
//                double zc=a+b+c;
//                double wow=zc/2;
//                double mj=Math.sqrt(wow*(wow-a)*(wow-b)*(wow-c));
//                        //这里查了百度，因为三角形面积那条公式放在这里面来是确定不了底边和高的，以此了解到了海伦公式
//                        // 即，S=根号下sx(s-a)x(s-b)x(s-c)可以用来求任意知道三边的三角形的面积
//                if(mj==0){
//                    System.out.println("这三个点位不能组成三角形！请重新输入!");
//                }else{
//                    System.out.printf("周长是=%.2f,面积是=%.2f\n",zc,mj);
//                }
//








        //6. (简答题)
        //本题要求编写程序，计算学生们的平均成绩，并统计及格（成绩不低于60分）的人数。题目保证输入与输出均在整型范围内。
        //
        //输入格式:
        //输入在第一行中给出非负整数N，即学生人数。第二行给出N个非负整数，即这N位学生的成绩，其间以空格分隔。
//        System.out.println("请输入学生的总人数");
//        Scanner woo=new Scanner(System.in);
//        int a=woo.nextInt();
//        int s=0;
//        int p=0;
//        double o=0;
//            if(a<=0){
//                System.out.println("请输入正确的数字!!!");
//            }
//                System.out.println("请输入"+a+"个学生们的成绩");
//
//        int[]cj= new int[a];
//            //笔记:套循环达到输入多个学生的成绩并且存入数组
//                for(int i=0;i<a;i++){//有多少学生就循环输入几次
//                    while(true){
//                        cj[i]=woo.nextInt(); //i=1时，输入的成绩会存入到cj[1]中，循环五次一共存入5次记录cj[2].....
//                             if(cj[i]<0 || cj[i]>100){
//                                System.out.println("请输入第"+i+"个学生的正确成绩!!!");
//                              }else{
//                              break;
//                                  }
//                                }
//                                    s+=cj[i];//将成绩全部累加起来留到下面用来求平均数,可以输出看看和对不对
//
//                              if(cj[i]>=60) {
//                                  p=p+1;//统计及格的人数
//                              }
//
//        }
//                o=s;
//        System.out.println("及格人数有"+p+"位");
//        System.out.printf(a+"个同学的平均成绩为%.2f",o/a);










//  4.      System.out.println("为了提倡居民节约用电，某省电力公司执行“阶梯电价”，" +
//                "安装一户一表的居民用户电价分为两个“阶梯”：月用电量50千瓦时（含50千瓦时）" +
//                "以内的，电价为0.53元/千瓦时；" +
//                "超过50千瓦时的，超出部分的用电量，电价上调0.05元/千瓦时。请编写程序计算电费。");
//                        Scanner an=new Scanner(System.in);
//                            int cost=an.nextInt();
//                            double c=0.53;
//                            double l=0.05;
//                            int k=50;
//                            int sum=0;
//                            if(cost<=k && cost>0){
//                                System.out.printf("原电费值="+cost+"\n经计算后应付电费值%.2f",cost*c);
//                            }else if (cost>k){
//                                int o=cost;
//                                o-=k;
//                                sum+=cost-k;
//                                System.out.printf("原电费值="+cost+"\n经计算后应付电费值%.2f",sum*(l+c)+o*c);
//                            }else if(cost<0){
//                                System.out.println("InvalidValue!,错误的值!,请输入大于0的整数");
//                            }
//        }






//   5.     System.out.println("本题要求编写程序，计算序列1!+2!+3!+⋯的前N项之和,请输入你要计算的前N项之和");
//            Scanner an=new Scanner(System.in);
//                int a=an.nextInt();
//                int c=1;
//                int sum=0;
//                    for(int i=1;i<=a;i++){
//                        c*=i;
//                        sum+=c;
//
//                    }
//        System.out.println("前"+a+"项之和为"+sum);









//   3.     System.out.println("x>=0.5时将输出x的0.5次方，<0时将计算(x+1)^2+2x+1/x的值，请输入你要计算的x");
//        Scanner ac=new Scanner(System.in);
//        var x = ac.nextDouble();//next后面可以是next(Double\Int\float.....)
//        //笔记：var会自动根据输入的数字进行数据类型判断,本质上只是省略了定义数据类型的代码
//            if(x>=0){
//                var re=Math.pow(x,0.5);
//                System.out.printf("f("+x+")=%.2f",re);
//                //笔记：%.2f必须与printf搭配使用，因为printf是格式化本文输出函数，
//                //其中%表示是一个格式说明符的开始，.2表示保留两位小数,f表示格式化为浮点数（float/double）
//            }
//            else if (x<0){
//                var re=(Math.sqrt(x+1)+2*x+1/x);
//                System.out.printf("f("+x+")=%.2f",re);
//        }









//  2.      System.out.println("计算序列1-1/4+1/7-1/10+.....的前N项之和,请输入你要计算的前N项");
//            Scanner an=new Scanner(System.in);
//                int a=an.nextInt();
//                double c=0.0;
//                int s=1;
//                    for(int i=1;i<=a;i++){
//                        double l=s*(1.0/(3*i-2));
//                        c+=l;
//                        s*=-1;
//        }
//        System.out.println("和为"+a+s);







// //输出相邻两个数的和列表，直到和超过100。
//    System.out.println("输出相邻两个数的和列表，直到和超过100。");
//        int a=1;
//        int c=2;
//        int wow;
//            do {
//                wow = a + c;
//                System.out.println(a + "+" + c + "=" + wow);
//                a=c;
//                c++;
//            }while(wow<=100);










//输出2000~3000之间的所有闰年
//        System.out.println("输出2000~3000之间的所有闰年");
//                for(int i=2000;i<=3000;i++){
//                    if((i%4==0 )||(i%400==0)){
//                        System.out.println(i);
//                    }
//                }






//求出1~100的奇数和、偶数和，并输出
//            System.out.println("输出1~100的奇数和、偶数和并输出");
//            int a=0;
//            int p=0;
//                for(int i=1;i<=100;i+=2){
//                    a=a+i;
//                }
//        System.out.println(a);
//                for(int i=2;i<=100;i+=2){
//                    p+=i;
//                }
//        System.out.println(p);







//生成倒三角形
//        System.out.println("请输入你需要多少行倒三角形");
//        Scanner an=new Scanner(System.in);
//                int c=an.nextInt();
//                    for(int i=0;i<c;i++){
//                        for(int s=0;s<i;s++){
//                                System.out.print("");
//                        for(int k=0;k<(c-i);k++){
//                                System.out.print("*");
//                            }
//                        System.out.println("");
//                        }
//                    }











//计算华氏温度F对应的摄氏温度。计算公式：C=5×(F−32)/9，式中：C表示摄氏温度，F表示华氏温度，输出数据要求为整型。
//        Scanner an=new Scanner(System.in);
//        System.out.println("请输入需要转换读书的华氏度");
//            int c=an.nextInt();
//            int HSD=c;
//            int a=5*(HSD-32)/9;
//                System.out.println(HSD + "多少度数" +","+a + "多少度数");





//选择结构if..else..的练习：
//
//已知坐标点(x,y),判断其所在的象限
//        Scanner an=new Scanner(System.in);
//        System.out.println("请输入你要判断的数字象限x=,y=");
//            int c=an.nextInt();
//            int b=an.nextInt();
//                if(c>0 && b>0) {
//                    System.out.println("x,y为属于第一象限");
//                }else if(c<0 && b>0){
//                    System.out.println("x,y为第二象限");
//
//                }else if(c<0 && b<0){
//                    System.out.println("x,y为第三象限");
//                }else {
//                    System.out.println("x,y为第四象限");
//                }








//1. (简答题)
//选择结构if..else..的练习：
//
//输入两个数,比较两者大小，输出时大的数在前
//        Scanner in=new Scanner(System.in);
//            int c=in.nextInt();
//            int a=in.nextInt();
//                if(c>a) {System.out.println(c+"大于"+a);
//                } else {System.out.println(a+"大于"+c);
//
//                }


//        int a = 98576; //声明a的值为98576
//        int s=1;         //同上
//        for(int i =0;i<3;i++){ //for{初始条件；循环检测条件；循环后更新计数器){}
//            s*=10;                          //s+=a % 10;
//            a/=s;                            //a=a/10;
//            System.out.println(a);
//        }




