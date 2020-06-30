package Test;
//测试是否能上传到 GitHub
public class Liscoer {
    public static void main(String[] args){
        //新建一只猫
        Cat c = new Cat();
        c.name = "小花猫";
        c.color = "红色";
        c.age = 3;

        System.out.println("有一只小猫叫："+c.name+" 颜色是 "+c.color+" 它已经 "+c.age+" 了");
    }
}
