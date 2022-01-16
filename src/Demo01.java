public class Demo01 {
    public static void main(String[] args) {
        People p = new Stu();
        p.eat();
//        p.study();
        //调用特有的方法
        Stu s = (Stu)p;
        s.study();
        //((Stu) p).study();
    }
}


class People{
    public void eat(){
        System.out.println("吃饭");
    }
}
class Stu extends People{
    @Override
    public void eat(){
        System.out.println("吃水煮肉片");
    }
    public void study(){
        System.out.println("好好学习");
    }
}
class Teachers extends People{
    @Override
    public void eat(){
        System.out.println("吃樱桃");
    }
    public void teach(){
        System.out.println("认真授课");
    }
}
