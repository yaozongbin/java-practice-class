public class Example4_2 {
    public static void main(String[] args) {
        XiyoujiRenwu zhubajie = null, sunwukong = null;

        zhubajie = new XiyoujiRenwu();
        sunwukong = new XiyoujiRenwu();

        zhubajie.name = PersonName.猪八戒;
        zhubajie.height = 1.823f;
        zhubajie.weight = 86f;
        zhubajie.head = "猪头";
        sunwukong.name = PersonName.孙悟空;
        sunwukong.height = 1.623f;
        sunwukong.weight = 1000f;
        sunwukong.head = "猴头";

        System.out.println(zhubajie.name + "的身高" + zhubajie.height);
        System.out.println(zhubajie.name + "的体重" + zhubajie.weight);
        System.out.println(zhubajie.name + "的头" + zhubajie.head);
        System.out.println(sunwukong.name + "的身高" + sunwukong.height);
        System.out.println(sunwukong.name + "的体重" + sunwukong.weight);
        System.out.println(sunwukong.name + "的头" + sunwukong.head);

        zhubajie.speak(zhubajie.name + "我想脱单");
        System.out.println(zhubajie.name + "现在的头：" + zhubajie.head);
        System.out.println(zhubajie.name + "现在的体重：" + zhubajie.height);

        sunwukong.speak(sunwukong.name + "我重" + sunwukong.weight + "公斤，想骗猪八戒背我");
        System.out.println(sunwukong.name + "现在的头：" + sunwukong.head);
    }
}
